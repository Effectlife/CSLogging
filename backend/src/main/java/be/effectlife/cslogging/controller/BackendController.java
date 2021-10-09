package be.effectlife.cslogging.controller;

import be.effectlife.cslogging.models.WebCharacter;
import be.effectlife.cslogging.services.CharacterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/api")
@CrossOrigin(origins = "https://app.roll20.net")
public class BackendController {
    private static final Logger LOG = LoggerFactory.getLogger(BackendController.class);

    public static final String HELLO_TEXT = "Hello from Spring Boot Backend!";

    @Autowired
    private CharacterService characterService;

    @ResponseBody
    @GetMapping(path = "/hello")
    public String sayHello() {
        LOG.info("GET called on /hello resource");
        return HELLO_TEXT;
    }

    @ResponseBody
    @PostMapping(path = "/csl")
    public String csl(@RequestBody Map<Object, Object> csLoggingDTO) {
        characterService.processCharacters((List<Map<String, Object>>) csLoggingDTO.get("characters"));
        LOG.info("Received new Update");
        return "{}";
    }

    @ResponseBody
    @GetMapping(path = "/getCharacter")
    public ResponseEntity<?> getCharacter(@RequestParam String characterId) {
        WebCharacter character = characterService.get(characterId);
        if (character == null)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Character with id " + characterId + " does not exist");
        return ResponseEntity.ok(character);
    }

    @ResponseBody
    @GetMapping(path = "/getAllNames")
    public List<String> getAllNames() {
        return characterService.getAllIds();
    }

    @ResponseBody
    @GetMapping(path = "/getAllCharacters")
    public List<WebCharacter> getAllCharacters(){
        return characterService.getAllCharacters();
    }

}
