package be.effectlife.cslogging.processors;

import be.effectlife.cslogging.models.WebCharacter;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Component
public class BasicsProcessor implements Processor {
    @Override
    public void process(WebCharacter webCharacter, Map<String, Object> input) {
        Map<String, String> data = new HashMap<>();
        input.forEach((k, v) -> {
            String val = "";
            if (v != null) val = v.toString();
            data.put(k, val);
        });
        webCharacter.setInspiration(bool(data, "insp"));
        webCharacter.setPb(data.get("pb"));
        webCharacter.setAc(data.get("ac"));
        webCharacter.setInitiative(data.get("init"));
        webCharacter.setSpeed(data.get("spe"));
        webCharacter.setHp_max(data.get("hpm"));
        webCharacter.setHp(data.get("hp"));
        webCharacter.setHp_temp(data.get("hpt"));
        webCharacter.setHit_dice_max(data.get("hdm"));
        webCharacter.setHit_dice(data.get("hd"));
        webCharacter.setHit_dice_roll(data.get("hdr"));
        webCharacter.setCp(data.get("cp"));
        webCharacter.setSp(data.get("sp"));
        webCharacter.setEp(data.get("ep"));
        webCharacter.setGp(data.get("gp"));
        webCharacter.setPp(data.get("pp"));

        webCharacter.setCharacterAppearance(multiLineReplace(data.get("ca")));
        webCharacter.setBackstory(multiLineReplace(data.get("cb")));
        webCharacter.setAlliesAndOrganisations(multiLineReplace(data.get("ao")));
        webCharacter.setAdditionalFeatureAndTraits(multiLineReplace(data.get("aft")));
        webCharacter.setTreasure(multiLineReplace(data.get("tre")));
        webCharacter.setPersonalityTraits(multiLineReplace(data.get("pt")));
        webCharacter.setBonds(multiLineReplace(data.get("bo")));
        webCharacter.setFlaws(multiLineReplace(data.get("fl")));
        webCharacter.setIdeals(multiLineReplace(data.get("ide")));

        webCharacter.setClassDisplay(multiLineReplace(data.get("cldi")));
        webCharacter.setBackground(multiLineReplace(data.get("back")));
        webCharacter.setRaceDisplay(multiLineReplace(data.get("rcdi")));
        webCharacter.setAlignment(multiLineReplace(data.get("alig")));
        webCharacter.setExperience(multiLineReplace(data.get("exp")));
        webCharacter.setPassiveWisdom(multiLineReplace(data.get("pw")));

        webCharacter.setDeathSaveSuccess1(bool(data, "dss1"));
        webCharacter.setDeathSaveSuccess2(bool(data, "dss2"));
        webCharacter.setDeathSaveSuccess3(bool(data, "dss3"));
        webCharacter.setDeathSaveFail1(bool(data, "dsf1"));
        webCharacter.setDeathSaveFail2(bool(data, "dsf2"));
        webCharacter.setDeathSaveFail3(bool(data, "dsf3"));

        webCharacter.setAge(data.get("ag"));
        webCharacter.setSize(data.get("sz"));
        webCharacter.setHeight(data.get("he"));
        webCharacter.setWeight(data.get("we"));
        webCharacter.setEyes(data.get("ey"));
        webCharacter.setSkin(data.get("sk"));
        webCharacter.setHair(data.get("ha"));

        webCharacter.setSpellCastingAbility(getSCA(data));
        webCharacter.setSpellAttackBonus(data.get("sab"));
        webCharacter.setSpellSaveDC(data.get("ssdc"));


        webCharacter.setL1t(data.get("l1t"));
        webCharacter.setL2t(data.get("l2t"));
        webCharacter.setL3t(data.get("l3t"));
        webCharacter.setL4t(data.get("l4t"));
        webCharacter.setL5t(data.get("l5t"));
        webCharacter.setL6t(data.get("l6t"));
        webCharacter.setL7t(data.get("l7t"));
        webCharacter.setL8t(data.get("l8t"));
        webCharacter.setL9t(data.get("l9t"));

        webCharacter.setL1e(data.get("l1e"));
        webCharacter.setL2e(data.get("l2e"));
        webCharacter.setL3e(data.get("l3e"));
        webCharacter.setL4e(data.get("l4e"));
        webCharacter.setL5e(data.get("l5e"));
        webCharacter.setL6e(data.get("l6e"));
        webCharacter.setL7e(data.get("l7e"));
        webCharacter.setL8e(data.get("l8e"));
        webCharacter.setL9e(data.get("l9e"));
    }

    private String getSCA(Map<String, String> data) {
        String spab = data.get("spab");
        if (StringUtils.isNotBlank(spab)) {
            spab = spab.toUpperCase(Locale.ROOT);
            if (spab.contains("STRENGTH")) return "STRENGTH";
            if (spab.contains("DEXTERITY")) return "DEXTERITY";
            if (spab.contains("CONSTITUTION")) return "CONSTITUTION";
            if (spab.contains("INTELLIGENCE")) return "INTELLIGENCE";
            if (spab.contains("WISDOM")) return "WISDOM";
            if (spab.contains("CHARISMA")) return "CHARISMA";
        }
        return "NONE";
    }
}
