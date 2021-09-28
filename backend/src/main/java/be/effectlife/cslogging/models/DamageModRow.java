package be.effectlife.cslogging.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DamageModRow {
    private static final Logger LOG = LoggerFactory.getLogger(DamageModRow.class);
    private String name;
    private String damage;
    private String type;
    private boolean active;

    public DamageModRow() {
    }

    public DamageModRow(String name, String damage, String type, boolean active) {
        this.name = name;
        this.damage = damage;
        this.type = type;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
