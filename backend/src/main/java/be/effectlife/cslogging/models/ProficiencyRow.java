package be.effectlife.cslogging.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProficiencyRow {
    private static final Logger LOG = LoggerFactory.getLogger(ProficiencyRow.class);
    private String name;
    private String profType;

    public ProficiencyRow() {
    }

    public ProficiencyRow(String name, String profType) {
        this.name = name;
        this.profType = profType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfType() {
        return profType;
    }

    public void setProfType(String profType) {
        this.profType = profType;
    }
}
