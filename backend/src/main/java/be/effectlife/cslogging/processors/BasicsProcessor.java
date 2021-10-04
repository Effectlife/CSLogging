package be.effectlife.cslogging.processors;

import be.effectlife.cslogging.models.WebCharacter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
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

        webCharacter.setClassDisplay(data.get("cldi"));
        webCharacter.setBackground(data.get("back"));
        webCharacter.setRaceDisplay(data.get("rcdi"));
        webCharacter.setAlignment(data.get("alig"));
        webCharacter.setExperience(data.get("exp"));
        webCharacter.setPassiveWisdom(data.get("pw"));

        webCharacter.setDeathSaveSuccess1(bool(data, "dss1"));
        webCharacter.setDeathSaveSuccess2(bool(data, "dss2"));
        webCharacter.setDeathSaveSuccess3(bool(data, "dss3"));
        webCharacter.setDeathSaveFail1(bool(data, "dsf1"));
        webCharacter.setDeathSaveFail2(bool(data, "dsf2"));
        webCharacter.setDeathSaveFail3(bool(data, "dsf3"));
    }
}
