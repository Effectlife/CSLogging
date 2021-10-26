package be.effectlife.cslogging.processors.spells;

import be.effectlife.cslogging.models.WebCharacter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class CantripProcessor extends BaseSpellProcessor {
    private static final Logger LOG = LoggerFactory.getLogger(CantripProcessor.class);

    @Override
    public void process(WebCharacter webCharacter, Map<String, Object> input) {
        webCharacter.setCantripRows(prepRows("can", input, webCharacter.getSheetType()));

    }



}
