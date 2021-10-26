package be.effectlife.cslogging.processors.spells;

import be.effectlife.cslogging.models.WebCharacter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Spell6Processor extends BaseSpellProcessor {
    private static final Logger LOG = LoggerFactory.getLogger(Spell6Processor.class);

    @Override
    public void process(WebCharacter webCharacter, Map<String, Object> input) {
        webCharacter.setS6Rows(prepRows("s6", input, webCharacter.getSheetType()));

    }


}
