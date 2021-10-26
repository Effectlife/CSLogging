package be.effectlife.cslogging.processors;

import be.effectlife.cslogging.models.WebCharacter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class EsperProcessor implements Processor {
    private static final Logger LOG = LoggerFactory.getLogger(EsperProcessor.class);

    @Override
    public void process(WebCharacter webCharacter, Map<String, Object> input) {
        Map<String, String> data = new HashMap<>();
        input.forEach((k, v) -> {
            String val = "";
            if (v != null) val = v.toString();
            data.put(k, val);
        });

        webCharacter.setTalentPoints(data.get("tp"));
        webCharacter.setSlotsUsed(data.get("slu"));
        webCharacter.setTalentPointsMax(data.get("tpm"));
        webCharacter.setSlotRank(data.get("sr"));
        webCharacter.setSlotsMax(data.get("ts"));

        webCharacter.setMastery6(bool(data.get("ms6")));
        webCharacter.setMastery6used(bool(data.get("ms6u")));
        webCharacter.setMastery7(bool(data.get("ms7")));
        webCharacter.setMastery7used(bool(data.get("ms7u")));
        webCharacter.setMastery8(bool(data.get("ms8")));
        webCharacter.setMastery8used(bool(data.get("ms8u")));
        webCharacter.setMastery9(bool(data.get("ms9")));
        webCharacter.setMastery9used(bool(data.get("ms9u")));


    }
}
