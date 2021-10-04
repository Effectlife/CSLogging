package be.effectlife.cslogging.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassResourceRow {
    private static final Logger LOG = LoggerFactory.getLogger(ClassResourceRow.class);
    private String nameLeft;
    private String nameRight;
    private String valueLeft;
    private String valueRight;
    private String maxLeft;
    private String maxRight;
    
    public String getNameLeft() {
        return nameLeft;
    }

    public void setNameLeft(String nameLeft) {
        this.nameLeft = nameLeft;
    }

    public String getNameRight() {
        return nameRight;
    }

    public void setNameRight(String nameRight) {
        this.nameRight = nameRight;
    }

    public String getValueLeft() {
        return valueLeft;
    }

    public void setValueLeft(String valueLeft) {
        this.valueLeft = valueLeft;
    }

    public String getValueRight() {
        return valueRight;
    }

    public void setValueRight(String valueRight) {
        this.valueRight = valueRight;
    }

    public String getMaxLeft() {
        return maxLeft;
    }

    public void setMaxLeft(String maxLeft) {
        this.maxLeft = maxLeft;
    }

    public String getMaxRight() {
        return maxRight;
    }

    public void setMaxRight(String maxRight) {
        this.maxRight = maxRight;
    }
}
