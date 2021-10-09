package be.effectlife.cslogging.processors;

import be.effectlife.cslogging.models.DamageModRow;
import be.effectlife.cslogging.models.WebCharacter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Map;

@Component
public class DamageModProcessor implements Processor {

    @Override
    public void process(WebCharacter webCharacter, Map<String, Object> input) {
        final Map<String, Map<String, Map<String, String>>> rowList = (Map<String, Map<String, Map<String, String>>>) input.get("dar");
        final ArrayList<String> rowIds = (ArrayList<String>) input.get("daid"); if(rowIds == null)return;

        ArrayList<DamageModRow> rows = new ArrayList<>();
        for (String rowId : rowIds) {
            rows.add(processRow(rowList.get(rowId)));
        }
        webCharacter.setDamageModRows(rows);
    }

    private DamageModRow processRow(Map<String, Map<String, String>> stringMapMap) {

        DamageModRow damageModRow = new DamageModRow();
        return damageModRow;

    }
}
