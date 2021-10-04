package be.effectlife.cslogging.services;

import be.effectlife.cslogging.models.WebCharacter;
import be.effectlife.cslogging.processors.*;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class CharacterService {
    private static final Logger LOG = LoggerFactory.getLogger(CharacterService.class);
    private static final Map<String, WebCharacter> characterCache = new HashMap<>();
    private List<Processor> processors = new ArrayList<>();

    @Autowired
    private StatsProcessor statsProcessor;

    @Autowired
    private SkillsProcessor skillsProcessor;

    @Autowired
    private BasicsProcessor basicsProcessor;

    @Autowired
    private AttackProcessor attackProcessor;

    @Autowired
    private ProficienciesProcessor proficienciesProcessor;

    @Autowired
    private ClassResourceProcessor classResourceProcessor;

    @Autowired
    private DamageModProcessor damageModProcessor;

    @Autowired
    private InventoryProcessor inventoryProcessor;
    @Autowired
    private ToolProcessor toolProcessor;
    @Autowired
    private TraitsProcessor traitsProcessor;
    @PostConstruct
    public void listify() {
        processors.add(statsProcessor);
        processors.add(skillsProcessor);
        processors.add(basicsProcessor);
        processors.add(attackProcessor);
        processors.add(proficienciesProcessor);
        processors.add(classResourceProcessor);
        processors.add(damageModProcessor);
        processors.add(inventoryProcessor);
        processors.add(toolProcessor);
        processors.add(traitsProcessor);

    }

    public List<WebCharacter> getAllCharacters() {
        return new ArrayList<>(characterCache.values());
    }

    public void processCharacters(List<Map<String, Object>> characters) {
        for (Map<String, Object> characterData : characters) {
            characterCache.put(characterData.get("id").toString(), processCharacterData(characterData));
        }
    }

    private WebCharacter processCharacterData(Map<String, Object> characterData) {
        WebCharacter webCharacter = new WebCharacter();
        webCharacter.setId(String.valueOf(characterData.get("id")));
        webCharacter.setName(String.valueOf(characterData.get("name")));
        for (Processor processor : processors) {
            processor.process(webCharacter, characterData);
        }
        return webCharacter;
    }

    public WebCharacter get(String characterId) {
        return characterCache.get(characterId);
    }

    public List<String> getAllIds() {
        return characterCache.values().stream().map(WebCharacter::getId).collect(Collectors.toList());
    }
}
