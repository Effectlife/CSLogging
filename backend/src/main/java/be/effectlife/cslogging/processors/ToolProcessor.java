package be.effectlife.cslogging.processors;

import be.effectlife.cslogging.models.ToolRow;
import be.effectlife.cslogging.models.WebCharacter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Map;

@Component
public class ToolProcessor implements Processor {

    @Override
    public void process(WebCharacter webCharacter, Map<String, Object> input) {
        final Map<String, Map<String, Map<String, String>>> rowList = (Map<String, Map<String, Map<String, String>>>) input.get("tor");
        final ArrayList<String> rowIds = (ArrayList<String>) input.get("toid"); if(rowIds == null)return;

        ArrayList<ToolRow> rows = new ArrayList<>();
        for (String rowId : rowIds) {
            rows.add(processRow(rowList.get(rowId)));
        }
        webCharacter.setToolRows(rows);
    }

    private ToolRow processRow(Map<String, Map<String, String>> stringMapMap) {

        ToolRow toolRow = new ToolRow();
        toolRow.setToolName(getRowValue(stringMapMap, "toolname"));
        toolRow.setToolAttr(getRowValue(stringMapMap, "toolattr"));
        toolRow.setToolBonusDisplay(getRowValue(stringMapMap, "toolbonus_display"));
        return toolRow;

    }
}
