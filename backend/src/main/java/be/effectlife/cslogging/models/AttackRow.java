package be.effectlife.cslogging.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AttackRow {
    private static final Logger LOG = LoggerFactory.getLogger(AttackRow.class);
    private String atkDmgType; //2d8+2 DamageType1 + 3d12+1 DamageType2+ 2 Magic Bonus //Actual damage roll
    private String atkBonus; //+10  //To hit Roll
    private String atkRange; //10m
    private String atkName; //TestWeapon
    private String saveEffect; //SaveEffect
    private String atkDesc; //DescriptionForTestWeapon

    public AttackRow() {
    }

    public AttackRow(String atkDmgType, String atkBonus, String atkRange, String atkName, String saveEffect, String atkDesc) {
        this.atkDmgType = atkDmgType;
        this.atkBonus = atkBonus;
        this.atkRange = atkRange;
        this.atkName = atkName;
        this.saveEffect = saveEffect;
        this.atkDesc = atkDesc;
    }

    public String getAtkDmgType() {
        return atkDmgType;
    }

    public void setAtkDmgType(String atkDmgType) {
        this.atkDmgType = atkDmgType;
    }

    public String getAtkBonus() {
        return atkBonus;
    }

    public void setAtkBonus(String atkBonus) {
        this.atkBonus = atkBonus;
    }

    public String getAtkRange() {
        return atkRange;
    }

    public void setAtkRange(String atkRange) {
        this.atkRange = atkRange;
    }

    public String getAtkName() {
        return atkName;
    }

    public void setAtkName(String atkName) {
        this.atkName = atkName;
    }

    public String getSaveEffect() {
        return saveEffect;
    }

    public void setSaveEffect(String saveEffect) {
        this.saveEffect = saveEffect;
    }

    public String getAtkDesc() {
        return atkDesc;
    }

    public void setAtkDesc(String atkDesc) {
        this.atkDesc = atkDesc;
    }
}
