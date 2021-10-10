package be.effectlife.cslogging.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ToolRow {
    private static final Logger LOG = LoggerFactory.getLogger(ToolRow.class);

    private String toolName;
    private String toolAttr;
    private String toolBonusDisplay;

    public ToolRow() {
    }

    public ToolRow(String toolName, String toolAttr, String toolBonusDisplay) {
        this.toolName = toolName;
        this.toolAttr = toolAttr;
        this.toolBonusDisplay = toolBonusDisplay;
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

    public String getToolBonusDisplay() {
        return toolBonusDisplay;
    }

    public void setToolBonusDisplay(String toolBonusDisplay) {
        this.toolBonusDisplay = toolBonusDisplay;
    }
}
