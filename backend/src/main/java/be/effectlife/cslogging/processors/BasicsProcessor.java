package be.effectlife.cslogging.processors;

import be.effectlife.cslogging.models.WebCharacter;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class BasicsProcessor implements Processor {
    @Override
    public void process(WebCharacter webCharacter, Map<String, Object> input) {
        webCharacter.setInspiration(bool(input, "inspiration"));
        webCharacter.setPb(input.get("pb").toString());
        webCharacter.setAc(input.get("ac").toString());
        webCharacter.setInitiative(input.get("initiative_bonus").toString());
        webCharacter.setSpeed(input.get("speed").toString());
        webCharacter.setHp_max(input.get("hp_max").toString());
        webCharacter.setHp(input.get("hp").toString());
        webCharacter.setHp_temp(input.get("hp_temp").toString());
        webCharacter.setHit_dice_max(input.get("hit_dice_max").toString());
        webCharacter.setHit_dice(input.get("hit_dice").toString());
        webCharacter.setCp(input.get("cp").toString());
        webCharacter.setSp(input.get("sp").toString());
        webCharacter.setEp(input.get("ep").toString());
        webCharacter.setGp(input.get("gp").toString());
        webCharacter.setPp(input.get("pp").toString());
        final boolean deathsave_succ1 = bool(input, "deathsave_succ1");
        final boolean deathsave_succ2 = bool(input, "deathsave_succ2");
        final boolean deathsave_succ3 = bool(input, "deathsave_succ3");
        final boolean deathsave_fail1 = bool(input, "deathsave_fail1");
        final boolean deathsave_fail2 = bool(input, "deathsave_fail2");
        final boolean deathsave_fail3 = bool(input, "deathsave_fail3");

        int successes = 0;
        int failures = 0;

        if (deathsave_fail1) failures++;
        if (deathsave_fail2) failures++;
        if (deathsave_fail3) failures++;

        if (deathsave_succ1) successes++;
        if (deathsave_succ2) successes++;
        if (deathsave_succ3) successes++;

        webCharacter.setDeathSaveFails(failures + "");
        webCharacter.setDeathSaveSuccesses(successes + "");
    }
}
