package be.effectlife.cslogging.services;

import be.effectlife.cslogging.models.WebCharacter;
import be.effectlife.cslogging.processors.*;
import be.effectlife.cslogging.processors.spells.*;
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

    @Autowired
    private CantripProcessor cantripProcessor;

    @Autowired
    private Spell1Processor spell1Processor;
    @Autowired
    private Spell2Processor spell2Processor;
    @Autowired
    private Spell3Processor spell3Processor;
    @Autowired
    private Spell4Processor spell4Processor;
    @Autowired
    private Spell5Processor spell5Processor;
    @Autowired
    private Spell6Processor spell6Processor;
    @Autowired
    private Spell7Processor spell7Processor;
    @Autowired
    private Spell8Processor spell8Processor;
    @Autowired
    private Spell9Processor spell9Processor;

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
        processors.add(cantripProcessor);
        processors.add(spell1Processor);
        processors.add(spell2Processor);
        processors.add(spell3Processor);
        processors.add(spell4Processor);
        processors.add(spell5Processor);
        processors.add(spell6Processor);
        processors.add(spell7Processor);
        processors.add(spell8Processor);
        processors.add(spell9Processor);
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
