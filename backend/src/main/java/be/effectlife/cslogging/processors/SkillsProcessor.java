package be.effectlife.cslogging.processors;

import be.effectlife.cslogging.models.WebCharacter;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class SkillsProcessor implements Processor {
    @Override
    public void process(WebCharacter webCharacter, Map<String, Object> input) {
        webCharacter.setAcrobatics_bonus(input.get("acrobatics_bonus").toString());
        webCharacter.setAcrobatics_prof(bool(input, "acrobatics_prof"));
        webCharacter.setAnimal_handling_bonus(input.get("animal_handling_bonus").toString());
        webCharacter.setAnimal_handling_prof(bool(input, "animal_handling_prof"));
        webCharacter.setArcana_bonus(input.get("arcana_bonus").toString());
        webCharacter.setArcana_prof(bool(input, "arcana_prof"));
        webCharacter.setAthletics_bonus(input.get("athletics_bonus").toString());
        webCharacter.setAthletics_prof(bool(input, "athletics_prof"));
        webCharacter.setDeception_bonus(input.get("deception_bonus").toString());
        webCharacter.setDeception_prof(bool(input, "deception_prof"));
        webCharacter.setHistory_bonus(input.get("history_bonus").toString());
        webCharacter.setHistory_prof(bool(input, "history_prof"));
        webCharacter.setInsight_bonus(input.get("insight_bonus").toString());
        webCharacter.setInsight_prof(bool(input, "insight_prof"));
        webCharacter.setIntimidation_bonus(input.get("intimidation_bonus").toString());
        webCharacter.setIntimidation_prof(bool(input, "intimidation_prof"));
        webCharacter.setInvestigation_bonus(input.get("investigation_bonus").toString());
        webCharacter.setInvestigation_prof(bool(input, "investigation_prof"));
        webCharacter.setMedicine_bonus(input.get("medicine_bonus").toString());
        webCharacter.setMedicine_prof(bool(input, "medicine_prof"));
        webCharacter.setNature_bonus(input.get("nature_bonus").toString());
        webCharacter.setNature_prof(bool(input, "nature_prof"));
        webCharacter.setPerception_bonus(input.get("perception_bonus").toString());
        webCharacter.setPerception_prof(bool(input, "perception_prof"));
        webCharacter.setPerformance_bonus(input.get("performance_bonus").toString());
        webCharacter.setPerformance_prof(bool(input, "performance_prof"));
        webCharacter.setPersuasion_bonus(input.get("persuasion_bonus").toString());
        webCharacter.setPersuasion_prof(bool(input, "persuasion_prof"));
        webCharacter.setReligion_bonus(input.get("religion_bonus").toString());
        webCharacter.setReligion_prof(bool(input, "religion_prof"));
        webCharacter.setSleight_of_hand_bonus(input.get("sleight_of_hand_bonus").toString());
        webCharacter.setSleight_of_hand_prof(bool(input, "sleight_of_hand_prof"));
        webCharacter.setStealth_bonus(input.get("stealth_bonus").toString());
        webCharacter.setStealth_prof(bool(input, "stealth_prof"));
        webCharacter.setSurvival_bonus(input.get("survival_bonus").toString());
        webCharacter.setSurvival_prof(bool(input, "survival_prof"));


    }
}
