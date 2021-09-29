package be.effectlife.cslogging.processors;

import be.effectlife.cslogging.models.WebCharacter;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class StatsProcessor implements Processor {

    @Override
    public void process(WebCharacter webCharacter, Map<String, Object> input) {
        webCharacter.setStrength(input.get("strength").toString());
        webCharacter.setStrengthMod(input.get("strength_mod").toString());
        webCharacter.setDexterity(input.get("dexterity").toString());
        webCharacter.setConstitution(input.get("constitution").toString());
        webCharacter.setConstitution_mod(input.get("constitution_mod").toString());
        webCharacter.setWisdom(input.get("wisdom").toString());
        webCharacter.setWisdom_mod(input.get("wisdom_mod").toString());
        webCharacter.setCharisma(input.get("charisma").toString());
        webCharacter.setCharisma_mod(input.get("charisma_mod").toString());
        webCharacter.setIntelligence(input.get("intelligence").toString());
        webCharacter.setIntelligence_mod(input.get("intelligence_mod").toString());

        webCharacter.setStrength_save_bonus(input.get("strength_save_bonus").toString());
        webCharacter.setStrength_save_prof(bool(input, "strength_save_prof"));
        webCharacter.setDexterity_save_bonus(input.get("dexterity_save_bonus").toString());
        webCharacter.setDexterity_save_prof(bool(input, "dexterity_save_prof"));
        webCharacter.setConstitution_save_bonus(input.get("constitution_save_bonus").toString());
        webCharacter.setConstitution_save_prof(bool(input, "constitution_save_prof"));
        webCharacter.setIntelligence_save_bonus(input.get("intelligence_save_bonus").toString());
        webCharacter.setIntelligence_save_prof(bool(input, "intelligence_save_prof"));
        webCharacter.setWisdom_save_bonus(input.get("wisdom_save_bonus").toString());
        webCharacter.setWisdom_save_prof(bool(input, "wisdom_save_prof"));
        webCharacter.setCharisma_save_bonus(input.get("charisma_save_bonus").toString());
        webCharacter.setCharisma_save_prof(bool(input, "charisma_save_prof"));
    }
}
