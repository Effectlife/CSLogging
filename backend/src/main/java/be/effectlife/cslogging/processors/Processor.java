package be.effectlife.cslogging.processors;

import be.effectlife.cslogging.models.WebCharacter;

import java.util.Map;

public interface Processor {
    void process(WebCharacter webCharacter, Map<String, Object> input);

    default boolean bool(Map<String, String> input, String attr) {

        Object attrval = input.get(attr);
        if (attrval == null) return false;
        return !attrval.toString().equals("0");
    }

    default String getRowValue(Map<String, Map<String, String>> stringMapMap, String attr) {
        final Map<String, String> attribute = stringMapMap.get(attr);
        if (attribute != null) return attribute.get("current");
        return null;
    }

    default boolean getRowBool(Map<String, Map<String, String>> stringMapMap, String attr) {
        final Map<String, String> attribute = stringMapMap.get(attr);
        return bool(attribute, "current");
    }
}
