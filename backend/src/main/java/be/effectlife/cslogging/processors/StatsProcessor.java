package be.effectlife.cslogging.processors;

import be.effectlife.cslogging.models.WebCharacter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class StatsProcessor implements Processor {

    @Override
    public void process(WebCharacter webCharacter, Map<String, Object> input) {
        Map<String, String> data = new HashMap<>();
        input.forEach((k, v) -> {
            String val = "";
            if (v != null) val = v.toString();
            data.put(k, val);
        });
        webCharacter.setStrength(data.get("str"));
        webCharacter.setStrength_mod(data.get("strm"));
        webCharacter.setDexterity(data.get("dex"));
        webCharacter.setDexterity_mod(data.get("dexm"));
        webCharacter.setConstitution(data.get("con"));
        webCharacter.setConstitution_mod(data.get("conm"));
        webCharacter.setWisdom(data.get("wis"));
        webCharacter.setWisdom_mod(data.get("wism"));
        webCharacter.setCharisma(data.get("cha"));
        webCharacter.setCharisma_mod(data.get("cham"));
        webCharacter.setIntelligence(data.get("int"));
        webCharacter.setIntelligence_mod(data.get("intm"));

        webCharacter.setStrength_save_bonus(data.get("strsb"));
        webCharacter.setStrength_save_prof(bool(data, "strsp"));
        webCharacter.setDexterity_save_bonus(data.get("dexsb"));
        webCharacter.setDexterity_save_prof(bool(data, "dexsp"));
        webCharacter.setConstitution_save_bonus(data.get("consb"));
        webCharacter.setConstitution_save_prof(bool(data, "consp"));
        webCharacter.setIntelligence_save_bonus(data.get("intsb"));
        webCharacter.setIntelligence_save_prof(bool(data, "intsp"));
        webCharacter.setWisdom_save_bonus(data.get("wissb"));
        webCharacter.setWisdom_save_prof(bool(data, "wissp"));
        webCharacter.setCharisma_save_bonus(data.get("chasb"));
        webCharacter.setCharisma_save_prof(bool(data, "chasp"));
    }
}
