package be.effectlife.cslogging.services;

import be.effectlife.cslogging.models.WebCharacter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CharacterService {
    private static final Logger LOG = LoggerFactory.getLogger(CharacterService.class);
    private static final Map<String, WebCharacter>
    public List<String> getAllCharacters(){

    }

    public void processCharacters(List<Map<String, Object>> characters){
        for (Map<String, Object> characterData : characters) {
            processCharacterData(characterData);
        }
    }

    private void processCharacterData(Map<String, Object> characterData) {

    }
}
