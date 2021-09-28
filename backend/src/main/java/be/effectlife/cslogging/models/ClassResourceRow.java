package be.effectlife.cslogging.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassResourceRow {
    private static final Logger LOG = LoggerFactory.getLogger(ClassResourceRow.class);
    private String name;
    private int value;
    private int max;

    public ClassResourceRow() {
    }

    public ClassResourceRow(String name, int value, int max) {
        this.name = name;
        this.value = value;
        this.max = max;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
