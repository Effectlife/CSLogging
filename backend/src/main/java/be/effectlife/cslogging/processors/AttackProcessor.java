package be.effectlife.cslogging.processors;

import be.effectlife.cslogging.models.AttackRow;
import be.effectlife.cslogging.models.WebCharacter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Map;

@Component
public class AttackProcessor implements Processor {

    @Override
    public void process(WebCharacter webCharacter, Map<String, Object> input) {
        final Map<String, Map<String, Map<String, String>>> rowList = (Map<String, Map<String, Map<String, String>>>) input.get("atr");
        final ArrayList<String> rowIds = (ArrayList<String>) input.get("atid");

        ArrayList<AttackRow> rows = new ArrayList<>();
        for (String rowId : rowIds) {
            rows.add(processRow(rowList.get(rowId)));
        }
        webCharacter.setAttackRows(rows);
    }

    private AttackRow processRow(Map<String, Map<String, String>> stringMapMap) {

        AttackRow attackRow = new AttackRow();
        attackRow.setAtkName(getRowValue(stringMapMap, "atkname"));
        attackRow.setAtkBonus(getRowValue(stringMapMap, "atkbonus"));
        attackRow.setSaveEffect(getRowValue(stringMapMap, "saveeffect"));
        attackRow.setAtkDesc(getRowValue(stringMapMap, "atk_desc"));
        attackRow.setAtkRange(getRowValue(stringMapMap, "atkrange"));
        attackRow.setAtkDmgType(getRowValue(stringMapMap, "atkdmgtype"));
        return attackRow;

    }
}
