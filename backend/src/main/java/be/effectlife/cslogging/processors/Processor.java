package be.effectlife.cslogging.processors;

import be.effectlife.cslogging.models.WebCharacter;

import java.util.Map;

public interface Processor {
    void process(WebCharacter webCharacter, Map<String, Object> input);

    default boolean bool(Map<String, Object> input, String attr) {
        return !input.get(attr).toString().equals("0");
    }
}
