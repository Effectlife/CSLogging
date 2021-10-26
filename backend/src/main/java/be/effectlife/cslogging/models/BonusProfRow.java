package be.effectlife.cslogging.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BonusProfRow {
    private static final Logger LOG = LoggerFactory.getLogger(BonusProfRow.class);
    private String skillName;
    private String bonus;
    private String rel;
    boolean prof;

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public boolean isProf() {
        return prof;
    }

    public void setProf(boolean prof) {
        this.prof = prof;
    }
}
