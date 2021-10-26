package be.effectlife.cslogging.processors.spells;

import be.effectlife.cslogging.models.SpellRow;
import be.effectlife.cslogging.processors.Processor;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@Component
public abstract class BaseSpellProcessor implements Processor {
    private static final Logger LOG = LoggerFactory.getLogger(CantripProcessor.class);

    protected List<SpellRow> prepRows(String sp, Map<String, Object> input, String sheetType) {
        final Map<String, Map<String, Map<String, String>>> rowList = (Map<String, Map<String, Map<String, String>>>) input.get(sp + "r");
        final ArrayList<String> rowIds = (ArrayList<String>) input.get(sp + "id");
        if (rowIds == null) return null;

        ArrayList<SpellRow> rows = new ArrayList<>();
        for (String rowId : rowIds) {
            rows.add(processRow(rowList.get(rowId), sheetType));
        }
        return rows;
    }

    protected SpellRow processRow(Map<String, Map<String, String>> stringMapMap, String sheetType) {

        SpellRow spellRow = new SpellRow();
        spellRow.setName(getRowValue(stringMapMap, "spellname"));
        String spellschool = getRowValue(stringMapMap, "spellschool");
        if (StringUtils.isNotBlank(spellschool)) {
            spellschool = spellschool.substring(0, 1).toUpperCase(Locale.ROOT) + spellschool.substring(1).toLowerCase(Locale.ROOT);
        } else {
            switch (sheetType) {
                case "esper":
                    spellschool = "Alteration";
                    break;
                case "ame":
                    spellschool = "Abjuration";
                    break;
                default:
                    spellschool = "Abjuration";
                    break;
            }
        }
        spellRow.setSchool(spellschool);
        spellRow.setRitual(getRowBool(stringMapMap, "spellritual"));
        spellRow.setCastingTime(getRowValue(stringMapMap, "spellcastingtime"));
        spellRow.setRange(getRowValue(stringMapMap, "spellrange"));
        spellRow.setTarget(getRowValue(stringMapMap, "spelltarget"));
        spellRow.setCompMaterials(getRowValue(stringMapMap, "spellcomp_materials"));
        spellRow.setClazz(getRowValue(stringMapMap, "spellclass"));
        spellRow.setHigherLevel(getRowValue(stringMapMap, "spellathigherlevels"));
        spellRow.setDuration(getRowValue(stringMapMap, "spellduration"));
        spellRow.setSource(getRowValue(stringMapMap, "spellsource"));
        spellRow.setConcentration(getRowBool(stringMapMap, "spellconcentration"));
        spellRow.setDescription(getRowValue(stringMapMap, "spelldescription"));
        spellRow.setAbility(getRowValue(stringMapMap, "spell_ability"));

        String spellcomp_s = getRowValue(stringMapMap, "spellcomp_s");
        String spellcomp_m = getRowValue(stringMapMap, "spellcomp_m");
        String spellcomp_v = getRowValue(stringMapMap, "spellcomp_v");
        ArrayList<String> vsmList = new ArrayList<>();
        if (!spellcomp_v.equals("0")) vsmList.add("V");
        if (!spellcomp_s.equals("0")) vsmList.add("S");
        if (!spellcomp_m.equals("0")) vsmList.add("M");
        spellRow.setCompVsm(String.join(", ", vsmList));

        return spellRow;
    }


}
