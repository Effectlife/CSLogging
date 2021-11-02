package be.effectlife.cslogging.processors;

import be.effectlife.cslogging.models.WebCharacter;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

public interface Processor {
    void process(WebCharacter webCharacter, Map<String, Object> input);

    default boolean bool(String value) {
        if (value == null) return false;
        return !value.equals("0");
    }

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

    default String multiLineReplace(String val) {
        if (StringUtils.isBlank(val)) return "";

        val = val.replaceAll("¤", "<br>");
        String toCheckToShow = val.replace("<br>", "");
        if (!toCheckToShow.trim().startsWith("%show")) {
            val = "<i>Hidden by user</i>";
        } else {
            val = val.replace("%show", "");
        }


        return val.trim();
    }
}
