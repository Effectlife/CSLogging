package be.effectlife.cslogging.processors;

import be.effectlife.cslogging.models.WebCharacter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.abs;

@Component
public class AimeProcessor implements Processor {
    private static final Logger LOG = LoggerFactory.getLogger(AimeProcessor.class);


    @Override
    public void process(WebCharacter webCharacter, Map<String, Object> input) {
        Map<String, String> data = new HashMap<>();
        input.forEach((k, v) -> {
            String val = "";
            if (v != null) val = v.toString();
            data.put(k, val);
        });

        webCharacter.setCorruption_bonus(data.get("corrb"));
        webCharacter.setCorruption_prof(bool(data.get("corrp")));

        webCharacter.setDistinctiveQuality(multiLineReplace(data.get("diq")));
        webCharacter.setSpeciality(multiLineReplace(data.get("spec")));
        webCharacter.setHope(multiLineReplace(data.get("hope")));
        webCharacter.setDespair(multiLineReplace(data.get("desp")));
        try {
            int cr = Integer.parseInt(data.get("cr"));
            int crm = Integer.parseInt(data.get("crm"));
            int w = Integer.parseInt(data.get("wis"));
            int madnessValue = (((abs(cr + crm - w)) + (cr + crm - w)) / 2);
            webCharacter.setMadnessThreshold(madnessValue + "");
        }catch (Exception e){
            LOG.warn("Cannot calculate Madness due to missing values");
        }
        webCharacter.setClassDisplay(data.get("cldi") + " "+data.get("cllv"));


    }
}
