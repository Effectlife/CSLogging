package be.effectlife.cslogging.processors;

import be.effectlife.cslogging.models.WebCharacter;
import org.apache.commons.lang3.StringUtils;

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
        return "";
    }

    default boolean getRowBool(Map<String, Map<String, String>> stringMapMap, String attr) {
        final Map<String, String> attribute = stringMapMap.get(attr);
        return attribute != null && bool(attribute, "current");
    }

    default String multiLineReplace(WebCharacter webCharacter, String val) {

        if (StringUtils.isNotBlank(val) && val.trim().startsWith("%hide")) {
            val = "<i>Hidden by user</i>";
        }


        if (StringUtils.isNotBlank(val)) return val.replaceAll("¤", "<br>");
        return val;
    }
}
