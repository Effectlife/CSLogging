package be.effectlife.cslogging.processors;

import be.effectlife.cslogging.models.TraitRow;
import be.effectlife.cslogging.models.WebCharacter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Map;

@Component
public class TraitsProcessor implements Processor {

    @Override
    public void process(WebCharacter webCharacter, Map<String, Object> input) {
        final Map<String, Map<String, Map<String, String>>> rowList = (Map<String, Map<String, Map<String, String>>>) input.get("trr");
        final ArrayList<String> rowIds = (ArrayList<String>) input.get("trid");

        ArrayList<TraitRow> rows = new ArrayList<>();
        for (String rowId : rowIds) {
            rows.add(processRow(rowList.get(rowId)));
        }
        webCharacter.setTraitRows(rows);
    }

    private TraitRow processRow(Map<String, Map<String, String>> stringMapMap) {

        TraitRow traitRow = new TraitRow();
        traitRow.setName(getRowValue(stringMapMap, "name"));
        traitRow.setDescription(getRowValue(stringMapMap, "description"));
        traitRow.setSourceType(getRowValue(stringMapMap, "source_type"));
        traitRow.setSource(getRowValue(stringMapMap, "source"));
        return traitRow;

    }
}
