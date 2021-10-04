package be.effectlife.cslogging.processors;

import be.effectlife.cslogging.models.ClassResourceRow;
import be.effectlife.cslogging.models.WebCharacter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Component
public class ClassResourceProcessor implements Processor {

    @Override
    public void process(WebCharacter webCharacter, Map<String, Object> input) {
        final Map<String, Map<String, Map<String, String>>> rowList = (Map<String, Map<String, Map<String, String>>>) input.get("rer");
        final ArrayList<String> rowIds = (ArrayList<String>) input.get("reid");
        Map<String, String> data = new HashMap<>();
        input.forEach((k, v) -> {
            String val = "";
            if (v != null) val = v.toString();
            data.put(k, val);
        });

        webCharacter.setClassResource(data.get("cr"));
        webCharacter.setOtherResource(data.get("or"));
        webCharacter.setClassResourceName(data.get("crn"));
        webCharacter.setOtherResourceName(data.get("orn"));
        webCharacter.setClassResourceMax(data.get("crm"));
        webCharacter.setOtherResourceMax(data.get("orm"));

        ArrayList<ClassResourceRow> rows = new ArrayList<>();
        for (String rowId : rowIds) {
            rows.add(processRow(rowList.get(rowId)));
        }
        webCharacter.setClassResourceRows(rows);
    }

    private ClassResourceRow processRow(Map<String, Map<String, String>> stringMapMap) {

        ClassResourceRow classResourceRow = new ClassResourceRow();
        classResourceRow.setNameLeft(getValue(stringMapMap, "resource_left_name", "current"));
        classResourceRow.setNameRight(getValue(stringMapMap, "resource_right_name", "current"));
        classResourceRow.setMaxLeft(getValue(stringMapMap, "resource_left", "max"));
        classResourceRow.setMaxRight(getValue(stringMapMap, "resource_right", "max"));
        classResourceRow.setMaxLeft(getValue(stringMapMap, "resource_left", "current"));
        classResourceRow.setMaxRight(getValue(stringMapMap, "resource_right", "current"));
        return classResourceRow;

    }

    private String getValue(Map<String, Map<String, String>> stringMapMap, String attribute, String field) {
        Map<String, String> stringStringMap = stringMapMap.get(attribute);
        if (stringStringMap == null) return "";
        return stringStringMap.get(field);
    }
}
