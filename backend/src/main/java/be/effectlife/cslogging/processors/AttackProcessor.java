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
        final Map<String, Map<String, Map<String, String>>> attackRows = (Map<String, Map<String, Map<String, String>>>) input.get("attackRows");
        final ArrayList<String> attackRowIds = (ArrayList<String>) input.get("attackRowIds");

        ArrayList<AttackRow> rows = new ArrayList<>();
        for (String attackRowId : attackRowIds) {
            rows.add(processRow(attackRows.get(attackRowId)));
        }
        webCharacter.setAttackRows(rows);
    }

    private AttackRow processRow(Map<String, Map<String, String>> stringMapMap) {

        AttackRow attackRow = new AttackRow();
        final Map<String, String> atkname = stringMapMap.get("atkname");
        if (atkname != null) attackRow.setAtkName(atkname.get("current"));
        final Map<String, String> atkbonus = stringMapMap.get("atkbonus");
        if (atkbonus != null) attackRow.setAtkBonus(atkbonus.get("current"));
        final Map<String, String> saveeffect = stringMapMap.get("saveeffect");
        if (saveeffect != null) attackRow.setSaveEffect(saveeffect.get("current"));
        final Map<String, String> atkdesc = stringMapMap.get("atk_desc");
        if (atkdesc != null) attackRow.setAtkDesc(atkdesc.get("current"));
        final Map<String, String> atkrange = stringMapMap.get("atkrange");
        if (atkrange != null) attackRow.setAtkRange(atkrange.get("current"));
        final Map<String, String> atkdmgtype = stringMapMap.get("atkdmgtype");
        if (atkdmgtype != null) attackRow.setAtkDmgType(atkdmgtype.get("current"));
        return attackRow;

    }
}
