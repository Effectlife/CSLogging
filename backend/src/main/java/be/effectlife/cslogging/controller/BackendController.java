package be.effectlife.cslogging.controller;

import be.effectlife.cslogging.dto.CSLoggingDTO;
import be.effectlife.cslogging.dto.Character;
import javassist.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.*;

@Controller
@RequestMapping("/api")
@CrossOrigin(origins = "https://app.roll20.net")
public class BackendController {
    private static Map<String, Character> characterMap = new HashMap<>();
    private static final Logger LOG = LoggerFactory.getLogger(BackendController.class);

    public static final String HELLO_TEXT = "Hello from Spring Boot Backend!";

    @ResponseBody
    @GetMapping(path = "/hello")
    public String sayHello() {
        LOG.info("GET called on /hello resource");
        return HELLO_TEXT;
    }

    @ResponseBody
    @PostMapping(path = "/csl")
    public String csl(@RequestBody CSLoggingDTO csLoggingDTO) {
        //analyze and save each characters data to a file
        List<Character> characters = csLoggingDTO.getCharacters();
        characterMap.clear();
        for (Character character : characters) {
            characterMap.put(character.getName(), character);
        }
        return "{}";
    }

    @ResponseBody
    @GetMapping(path = "/getCharacter")
    public ResponseEntity<?> getCharacter(@RequestParam String name) {
        Character character = characterMap.get(name);
        if (character == null)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Character with name " + name + " does not exist");
        return ResponseEntity.ok(character);
    }

    @ResponseBody
    @GetMapping(path = "/getAllNames")
    public Set<String> getAllNames() {
        return characterMap.keySet();
    }

}
