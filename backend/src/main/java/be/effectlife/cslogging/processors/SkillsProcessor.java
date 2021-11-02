package be.effectlife.cslogging.processors;

import be.effectlife.cslogging.models.BonusProfRow;
import be.effectlife.cslogging.models.WebCharacter;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class SkillsProcessor implements Processor {
    @Override
    public void process(WebCharacter webCharacter, Map<String, Object> input) {
        ArrayList<BonusProfRow> rows = new ArrayList<>();
        List<Map<String, String>> bonusProfList = ((Map<String, List<Map<String, String>>>) input.get("bplist")).get("bonusProfList");
        for (Map<String, String> skillMap : bonusProfList) {
            rows.add(processRow(skillMap));
        }
        webCharacter.setBonusProfRows(rows.stream().sorted(Comparator.comparing(BonusProfRow::getSkillName)).collect(Collectors.toList()));
    }

    private BonusProfRow processRow(Map<String, String> skillMap) {
        BonusProfRow bonusProfRow = new BonusProfRow();
        bonusProfRow.setBonus(skillMap.get("bonus"));
        bonusProfRow.setSkillName(skillMap.get("display"));
        String attrval = skillMap.get("prof");
        bonusProfRow.setProf(StringUtils.isNotBlank(attrval) && !attrval.equals("0"));
        bonusProfRow.setRel(skillMap.get("rel"));
        return bonusProfRow;

    }
}
