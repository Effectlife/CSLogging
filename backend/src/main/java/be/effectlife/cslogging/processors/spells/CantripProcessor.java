package be.effectlife.cslogging.processors.spells;

import be.effectlife.cslogging.models.AttackRow;
import be.effectlife.cslogging.models.WebCharacter;
import be.effectlife.cslogging.models.spells.SpellRow;
import be.effectlife.cslogging.processors.Processor;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class CantripProcessor extends BaseSpellProcessor {
    private static final Logger LOG = LoggerFactory.getLogger(CantripProcessor.class);

    @Override
    public void process(WebCharacter webCharacter, Map<String, Object> input) {
        webCharacter.setCantripRows(prepRows("can", input));

    }



}
