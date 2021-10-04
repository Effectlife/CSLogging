package be.effectlife.cslogging.processors;

import be.effectlife.cslogging.models.WebCharacter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class SkillsProcessor implements Processor {
    @Override
    public void process(WebCharacter webCharacter, Map<String, Object> input) {
        Map<String, String> data = new HashMap<>();
        input.forEach((k, v) -> {
            String val = "";
            if (v != null) val = v.toString();
            data.put(k, val);
        });
        webCharacter.setAcrobatics_bonus(data.get("acrob"));
        webCharacter.setAcrobatics_prof(bool(data, "acrop"));
        webCharacter.setAnimal_handling_bonus(data.get("animb"));
        webCharacter.setAnimal_handling_prof(bool(data, "animp"));
        webCharacter.setArcana_bonus(data.get("arcab"));
        webCharacter.setArcana_prof(bool(data, "arcap"));
        webCharacter.setAthletics_bonus(data.get("athlb"));
        webCharacter.setAthletics_prof(bool(data, "athlp"));
        webCharacter.setDeception_bonus(data.get("deceb"));
        webCharacter.setDeception_prof(bool(data, "decep"));
        webCharacter.setHistory_bonus(data.get("histb"));
        webCharacter.setHistory_prof(bool(data, "histp"));
        webCharacter.setInsight_bonus(data.get("insib"));
        webCharacter.setInsight_prof(bool(data, "insip"));
        webCharacter.setIntimidation_bonus(data.get("intib"));
        webCharacter.setIntimidation_prof(bool(data, "intip"));
        webCharacter.setInvestigation_bonus(data.get("inveb"));
        webCharacter.setInvestigation_prof(bool(data, "invep"));
        webCharacter.setMedicine_bonus(data.get("medib"));
        webCharacter.setMedicine_prof(bool(data, "medip"));
        webCharacter.setNature_bonus(data.get("natub"));
        webCharacter.setNature_prof(bool(data, "natup"));
        webCharacter.setPerception_bonus(data.get("percb"));
        webCharacter.setPerception_prof(bool(data, "percp"));
        webCharacter.setPerformance_bonus(data.get("perfb"));
        webCharacter.setPerformance_prof(bool(data, "perfp"));
        webCharacter.setPersuasion_bonus(data.get("persb"));
        webCharacter.setPersuasion_prof(bool(data, "persp"));
        webCharacter.setReligion_bonus(data.get("relib"));
        webCharacter.setReligion_prof(bool(data, "relip"));
        webCharacter.setSleight_of_hand_bonus(data.get("sleib"));
        webCharacter.setSleight_of_hand_prof(bool(data, "sleip"));
        webCharacter.setStealth_bonus(data.get("steab"));
        webCharacter.setStealth_prof(bool(data, "steap"));
        webCharacter.setSurvival_bonus(data.get("survb"));
        webCharacter.setSurvival_prof(bool(data, "survp"));


    }
}
