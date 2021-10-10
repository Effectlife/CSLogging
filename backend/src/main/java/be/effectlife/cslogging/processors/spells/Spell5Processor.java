package be.effectlife.cslogging.processors.spells;

import be.effectlife.cslogging.models.WebCharacter;
import be.effectlife.cslogging.models.spells.SpellRow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Map;

@Component
public class Spell5Processor extends BaseSpellProcessor {
    private static final Logger LOG = LoggerFactory.getLogger(Spell5Processor.class);

    @Override
    public void process(WebCharacter webCharacter, Map<String, Object> input) {
        webCharacter.setS5Rows(prepRows("s5", input));

    }



}
