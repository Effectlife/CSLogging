package be.effectlife.cslogging.processors;

import be.effectlife.cslogging.models.ProficiencyRow;
import be.effectlife.cslogging.models.WebCharacter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Map;

@Component
public class ProficienciesProcessor implements Processor {

    @Override
    public void process(WebCharacter webCharacter, Map<String, Object> input) {
        final Map<String, Map<String, Map<String, String>>> rowList = (Map<String, Map<String, Map<String, String>>>) input.get("prr");
        final ArrayList<String> rowIds = (ArrayList<String>) input.get("prid");

        ArrayList<ProficiencyRow> rows = new ArrayList<>();
        for (String rowId : rowIds) {
            rows.add(processRow(rowList.get(rowId)));
        }
        webCharacter.setProficiencyRows(rows);
    }

    private ProficiencyRow processRow(Map<String, Map<String, String>> stringMapMap) {

        ProficiencyRow proficiencyRow = new ProficiencyRow();
        proficiencyRow.setName(getRowValue(stringMapMap, "name"));
        proficiencyRow.setProfType(getRowValue(stringMapMap, "prof_type"));
        return proficiencyRow;

    }
}
