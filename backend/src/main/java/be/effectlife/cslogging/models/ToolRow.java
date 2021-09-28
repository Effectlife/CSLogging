package be.effectlife.cslogging.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ToolRow {
    private static final Logger LOG = LoggerFactory.getLogger(ToolRow.class);

    private String toolName;
    private String toolAttr;
    private String toolBonus;

    public ToolRow() {
    }

    public ToolRow(String toolName, String toolAttr, String toolBonus) {
        this.toolName = toolName;
        this.toolAttr = toolAttr;
        this.toolBonus = toolBonus;
    }

    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    public String getToolAttr() {
        return toolAttr;
    }

    public void setToolAttr(String toolAttr) {
        this.toolAttr = toolAttr;
    }

    public String getToolBonus() {
        return toolBonus;
    }

    public void setToolBonus(String toolBonus) {
        this.toolBonus = toolBonus;
    }
}
