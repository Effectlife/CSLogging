package be.effectlife.cslogging.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TraitRow {
    private static final Logger LOG = LoggerFactory.getLogger(TraitRow.class);
    private String name;
    private String description;
    private String source;
    private String sourceType;

    public TraitRow() {
    }

    public TraitRow(String name, String description, String source, String sourceType) {
        this.name = name;
        this.description = description;
        this.source = source;
        this.sourceType = sourceType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }
}
