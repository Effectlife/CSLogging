package be.effectlife.cslogging.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class WebCharacter {
    private static final Logger LOG = LoggerFactory.getLogger(WebCharacter.class);
    private String sheetType;
    //Basic information
    private String id;
    private String name;
    private String ac;
    private String initiative;
    private String speed;
    private String hp;
    private String hp_max;
    private String hp_temp;
    private String hit_dice;
    private String hit_dice_max;
    private String hit_dice_roll;
    private boolean deathSaveFail1;
    private boolean deathSaveFail2;
    private boolean deathSaveFail3;
    private boolean deathSaveSuccess1;
    private boolean deathSaveSuccess2;
    private boolean deathSaveSuccess3;

    //Money
    private String cp;//Copper Pieces
    private String sp;//Silver Pieces
    private String ep;//Electrum Pieces
    private String gp;//Gold Pieces
    private String pp;//Platinum Pieces

    //TODO: Discuss with Arv, could be that these fields contain 'secret' information.
    private String characterAppearance;
    //private String characterBackstory;
    private String alliesAndOrganisations;
    private String additionalFeatureAndTraits;
    private String treasure;
    private String backstory;
    private String personalityTraits;
    private String bonds;
    private String flaws;
    private String ideals;

    private String age;
    private String size;
    private String height;
    private String weight;
    private String eyes;
    private String skin;
    private String hair;

    private String classDisplay;
    private String background;
    private String raceDisplay;
    private String alignment;
    private String experience;
    private String passiveWisdom;

    private String totalWeight;

    //Rows
    private List<AttackRow> attackRows;
    private List<ProficiencyRow> proficiencyRows;
    private List<TraitRow> traitRows;
    //private List<HpModRow> hpModRows; //TODO: Figure out what this is/where to find it in r20
    private List<InventoryRow> inventoryRows;
    private List<ToolRow> toolRows;
    private List<ClassResourceRow> classResourceRows;
    private List<DamageModRow> damageModRows;
    private List<SpellRow> cantripRows;
    private List<SpellRow> s1Rows;
    private List<SpellRow> s2Rows;
    private List<SpellRow> s3Rows;
    private List<SpellRow> s4Rows;
    private List<SpellRow> s5Rows;
    private List<SpellRow> s6Rows;
    private List<SpellRow> s7Rows;
    private List<SpellRow> s8Rows;
    private List<SpellRow> s9Rows;
    private List<BonusProfRow> bonusProfRows;


    //basic stats
    private String strength;
    private String strength_mod;
    private String dexterity;
    private String dexterity_mod;
    private String constitution;
    private String constitution_mod;
    private String wisdom;
    private String wisdom_mod;
    private String charisma;
    private String charisma_mod;
    private String intelligence;
    private String intelligence_mod;

    //Bonuses
    private boolean inspiration;
    private String pb; //Proficiency Bonus

    //Saving throws
    private String strength_save_bonus;
    private boolean strength_save_prof;
    private String dexterity_save_bonus;
    private boolean dexterity_save_prof;
    private String constitution_save_bonus;
    private boolean constitution_save_prof;
    private String intelligence_save_bonus;
    private boolean intelligence_save_prof;
    private String wisdom_save_bonus;
    private boolean wisdom_save_prof;
    private String charisma_save_bonus;
    private boolean charisma_save_prof;

    //Skills

    private String spellCastingAbility;
    private String spellSaveDC;
    private String spellAttackBonus;


    private String L1t;
    private String L2t;
    private String L3t;
    private String L4t;
    private String L5t;
    private String L6t;
    private String L7t;
    private String L8t;
    private String L9t;
    private String L1e;
    private String L2e;
    private String L3e;
    private String L4e;
    private String L5e;
    private String L6e;
    private String L7e;
    private String L8e;
    private String L9e;

    private String encumberance;

    //Esper
    private boolean mastery6;
    private boolean mastery6used;
    private boolean mastery7;
    private boolean mastery7used;
    private boolean mastery8;
    private boolean mastery8used;
    private boolean mastery9;
    private boolean mastery9used;

    private String slotsUsed;
    private String talentPoints;
    private String talentPointsMax;
    private String slotRank;
    private String slotsMax;

    public String getSlotsMax() {
        return slotsMax;
    }

    public void setSlotsMax(String slotsMax) {
        this.slotsMax = slotsMax;
    }

    public boolean isMastery6() {
        return mastery6;
    }

    public void setMastery6(boolean mastery6) {
        this.mastery6 = mastery6;
    }

    public boolean isMastery6used() {
        return mastery6used;
    }

    public void setMastery6used(boolean mastery6used) {
        this.mastery6used = mastery6used;
    }

    public boolean isMastery7() {
        return mastery7;
    }

    public void setMastery7(boolean mastery7) {
        this.mastery7 = mastery7;
    }

    public boolean isMastery7used() {
        return mastery7used;
    }

    public void setMastery7used(boolean mastery7used) {
        this.mastery7used = mastery7used;
    }

    public boolean isMastery8() {
        return mastery8;
    }

    public void setMastery8(boolean mastery8) {
        this.mastery8 = mastery8;
    }

    public boolean isMastery8used() {
        return mastery8used;
    }

    public void setMastery8used(boolean mastery8used) {
        this.mastery8used = mastery8used;
    }

    public boolean isMastery9() {
        return mastery9;
    }

    public void setMastery9(boolean mastery9) {
        this.mastery9 = mastery9;
    }

    public boolean isMastery9used() {
        return mastery9used;
    }

    public void setMastery9used(boolean mastery9used) {
        this.mastery9used = mastery9used;
    }

    public String getSlotsUsed() {
        return slotsUsed;
    }

    public void setSlotsUsed(String slotsUsed) {
        this.slotsUsed = slotsUsed;
    }

    public String getTalentPoints() {
        return talentPoints;
    }

    public void setTalentPoints(String talentPoints) {
        this.talentPoints = talentPoints;
    }

    public String getTalentPointsMax() {
        return talentPointsMax;
    }

    public void setTalentPointsMax(String talentPointsMax) {
        this.talentPointsMax = talentPointsMax;
    }

    public String getSlotRank() {
        return slotRank;
    }

    public void setSlotRank(String slotRank) {
        this.slotRank = slotRank;
    }

    public String getSheetType() {
        return sheetType;
    }

    public void setSheetType(String sheetType) {
        this.sheetType = sheetType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAc() {
        return ac;
    }

    public void setAc(String ac) {
        this.ac = ac;
    }

    public String getInitiative() {
        return initiative;
    }

    public void setInitiative(String initiative) {
        this.initiative = initiative;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getHp_max() {
        return hp_max;
    }

    public void setHp_max(String hp_max) {
        this.hp_max = hp_max;
    }

    public String getHp_temp() {
        return hp_temp;
    }

    public void setHp_temp(String hp_temp) {
        this.hp_temp = hp_temp;
    }

    public String getHit_dice() {
        return hit_dice;
    }

    public void setHit_dice(String hit_dice) {
        this.hit_dice = hit_dice;
    }

    public String getHit_dice_max() {
        return hit_dice_max;
    }

    public void setHit_dice_max(String hit_dice_max) {
        this.hit_dice_max = hit_dice_max;
    }

    public String getHit_dice_roll() {
        return hit_dice_roll;
    }

    public void setHit_dice_roll(String hit_dice_roll) {
        this.hit_dice_roll = hit_dice_roll;
    }

    public boolean isDeathSaveFail1() {
        return deathSaveFail1;
    }

    public void setDeathSaveFail1(boolean deathSaveFail1) {
        this.deathSaveFail1 = deathSaveFail1;
    }

    public boolean isDeathSaveFail2() {
        return deathSaveFail2;
    }

    public void setDeathSaveFail2(boolean deathSaveFail2) {
        this.deathSaveFail2 = deathSaveFail2;
    }

    public boolean isDeathSaveFail3() {
        return deathSaveFail3;
    }

    public void setDeathSaveFail3(boolean deathSaveFail3) {
        this.deathSaveFail3 = deathSaveFail3;
    }

    public boolean isDeathSaveSuccess1() {
        return deathSaveSuccess1;
    }

    public void setDeathSaveSuccess1(boolean deathSaveSuccess1) {
        this.deathSaveSuccess1 = deathSaveSuccess1;
    }

    public boolean isDeathSaveSuccess2() {
        return deathSaveSuccess2;
    }

    public void setDeathSaveSuccess2(boolean deathSaveSuccess2) {
        this.deathSaveSuccess2 = deathSaveSuccess2;
    }

    public boolean isDeathSaveSuccess3() {
        return deathSaveSuccess3;
    }

    public void setDeathSaveSuccess3(boolean deathSaveSuccess3) {
        this.deathSaveSuccess3 = deathSaveSuccess3;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getSp() {
        return sp;
    }

    public void setSp(String sp) {
        this.sp = sp;
    }

    public String getEp() {
        return ep;
    }

    public void setEp(String ep) {
        this.ep = ep;
    }

    public String getGp() {
        return gp;
    }

    public void setGp(String gp) {
        this.gp = gp;
    }

    public String getPp() {
        return pp;
    }

    public void setPp(String pp) {
        this.pp = pp;
    }

    public String getCharacterAppearance() {
        return characterAppearance;
    }

    public void setCharacterAppearance(String characterAppearance) {
        this.characterAppearance = characterAppearance;
    }

    public String getAlliesAndOrganisations() {
        return alliesAndOrganisations;
    }

    public void setAlliesAndOrganisations(String alliesAndOrganisations) {
        this.alliesAndOrganisations = alliesAndOrganisations;
    }

    public String getAdditionalFeatureAndTraits() {
        return additionalFeatureAndTraits;
    }

    public void setAdditionalFeatureAndTraits(String additionalFeatureAndTraits) {
        this.additionalFeatureAndTraits = additionalFeatureAndTraits;
    }

    public String getTreasure() {
        return treasure;
    }

    public void setTreasure(String treasure) {
        this.treasure = treasure;
    }

    public String getBackstory() {
        return backstory;
    }

    public void setBackstory(String backstory) {
        this.backstory = backstory;
    }

    public String getPersonalityTraits() {
        return personalityTraits;
    }

    public void setPersonalityTraits(String personalityTraits) {
        this.personalityTraits = personalityTraits;
    }

    public String getBonds() {
        return bonds;
    }

    public void setBonds(String bonds) {
        this.bonds = bonds;
    }

    public String getFlaws() {
        return flaws;
    }

    public void setFlaws(String flaws) {
        this.flaws = flaws;
    }

    public String getIdeals() {
        return ideals;
    }

    public void setIdeals(String ideals) {
        this.ideals = ideals;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getClassDisplay() {
        return classDisplay;
    }

    public void setClassDisplay(String classDisplay) {
        this.classDisplay = classDisplay;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getRaceDisplay() {
        return raceDisplay;
    }

    public void setRaceDisplay(String raceDisplay) {
        this.raceDisplay = raceDisplay;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getPassiveWisdom() {
        return passiveWisdom;
    }

    public void setPassiveWisdom(String passiveWisdom) {
        this.passiveWisdom = passiveWisdom;
    }

    public String getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(String totalWeight) {
        this.totalWeight = totalWeight;
    }

    public List<AttackRow> getAttackRows() {
        return attackRows;
    }

    public void setAttackRows(List<AttackRow> attackRows) {
        this.attackRows = attackRows;
    }

    public List<ProficiencyRow> getProficiencyRows() {
        return proficiencyRows;
    }

    public void setProficiencyRows(List<ProficiencyRow> proficiencyRows) {
        this.proficiencyRows = proficiencyRows;
    }

    public List<TraitRow> getTraitRows() {
        return traitRows;
    }

    public void setTraitRows(List<TraitRow> traitRows) {
        this.traitRows = traitRows;
    }

    public List<InventoryRow> getInventoryRows() {
        return inventoryRows;
    }

    public void setInventoryRows(List<InventoryRow> inventoryRows) {
        this.inventoryRows = inventoryRows;
    }

    public List<ToolRow> getToolRows() {
        return toolRows;
    }

    public void setToolRows(List<ToolRow> toolRows) {
        this.toolRows = toolRows;
    }

    public List<ClassResourceRow> getClassResourceRows() {
        return classResourceRows;
    }

    public void setClassResourceRows(List<ClassResourceRow> classResourceRows) {
        this.classResourceRows = classResourceRows;
    }

    public List<DamageModRow> getDamageModRows() {
        return damageModRows;
    }

    public void setDamageModRows(List<DamageModRow> damageModRows) {
        this.damageModRows = damageModRows;
    }

    public List<SpellRow> getCantripRows() {
        return cantripRows;
    }

    public void setCantripRows(List<SpellRow> cantripRows) {
        this.cantripRows = cantripRows;
    }

    public List<SpellRow> getS1Rows() {
        return s1Rows;
    }

    public void setS1Rows(List<SpellRow> s1Rows) {
        this.s1Rows = s1Rows;
    }

    public List<SpellRow> getS2Rows() {
        return s2Rows;
    }

    public void setS2Rows(List<SpellRow> s2Rows) {
        this.s2Rows = s2Rows;
    }

    public List<SpellRow> getS3Rows() {
        return s3Rows;
    }

    public void setS3Rows(List<SpellRow> s3Rows) {
        this.s3Rows = s3Rows;
    }

    public List<SpellRow> getS4Rows() {
        return s4Rows;
    }

    public void setS4Rows(List<SpellRow> s4Rows) {
        this.s4Rows = s4Rows;
    }

    public List<SpellRow> getS5Rows() {
        return s5Rows;
    }

    public void setS5Rows(List<SpellRow> s5Rows) {
        this.s5Rows = s5Rows;
    }

    public List<SpellRow> getS6Rows() {
        return s6Rows;
    }

    public void setS6Rows(List<SpellRow> s6Rows) {
        this.s6Rows = s6Rows;
    }

    public List<SpellRow> getS7Rows() {
        return s7Rows;
    }

    public void setS7Rows(List<SpellRow> s7Rows) {
        this.s7Rows = s7Rows;
    }

    public List<SpellRow> getS8Rows() {
        return s8Rows;
    }

    public void setS8Rows(List<SpellRow> s8Rows) {
        this.s8Rows = s8Rows;
    }

    public List<SpellRow> getS9Rows() {
        return s9Rows;
    }

    public void setS9Rows(List<SpellRow> s9Rows) {
        this.s9Rows = s9Rows;
    }

    public List<BonusProfRow> getBonusProfRows() {
        return bonusProfRows;
    }

    public void setBonusProfRows(List<BonusProfRow> bonusProfRows) {
        this.bonusProfRows = bonusProfRows;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getStrength_mod() {
        return strength_mod;
    }

    public void setStrength_mod(String strength_mod) {
        this.strength_mod = strength_mod;
    }

    public String getDexterity() {
        return dexterity;
    }

    public void setDexterity(String dexterity) {
        this.dexterity = dexterity;
    }

    public String getDexterity_mod() {
        return dexterity_mod;
    }

    public void setDexterity_mod(String dexterity_mod) {
        this.dexterity_mod = dexterity_mod;
    }

    public String getConstitution() {
        return constitution;
    }

    public void setConstitution(String constitution) {
        this.constitution = constitution;
    }

    public String getConstitution_mod() {
        return constitution_mod;
    }

    public void setConstitution_mod(String constitution_mod) {
        this.constitution_mod = constitution_mod;
    }

    public String getWisdom() {
        return wisdom;
    }

    public void setWisdom(String wisdom) {
        this.wisdom = wisdom;
    }

    public String getWisdom_mod() {
        return wisdom_mod;
    }

    public void setWisdom_mod(String wisdom_mod) {
        this.wisdom_mod = wisdom_mod;
    }

    public String getCharisma() {
        return charisma;
    }

    public void setCharisma(String charisma) {
        this.charisma = charisma;
    }

    public String getCharisma_mod() {
        return charisma_mod;
    }

    public void setCharisma_mod(String charisma_mod) {
        this.charisma_mod = charisma_mod;
    }

    public String getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(String intelligence) {
        this.intelligence = intelligence;
    }

    public String getIntelligence_mod() {
        return intelligence_mod;
    }

    public void setIntelligence_mod(String intelligence_mod) {
        this.intelligence_mod = intelligence_mod;
    }

    public boolean isInspiration() {
        return inspiration;
    }

    public void setInspiration(boolean inspiration) {
        this.inspiration = inspiration;
    }

    public String getPb() {
        return pb;
    }

    public void setPb(String pb) {
        this.pb = pb;
    }

    public String getStrength_save_bonus() {
        return strength_save_bonus;
    }

    public void setStrength_save_bonus(String strength_save_bonus) {
        this.strength_save_bonus = strength_save_bonus;
    }

    public boolean isStrength_save_prof() {
        return strength_save_prof;
    }

    public void setStrength_save_prof(boolean strength_save_prof) {
        this.strength_save_prof = strength_save_prof;
    }

    public String getDexterity_save_bonus() {
        return dexterity_save_bonus;
    }

    public void setDexterity_save_bonus(String dexterity_save_bonus) {
        this.dexterity_save_bonus = dexterity_save_bonus;
    }

    public boolean isDexterity_save_prof() {
        return dexterity_save_prof;
    }

    public void setDexterity_save_prof(boolean dexterity_save_prof) {
        this.dexterity_save_prof = dexterity_save_prof;
    }

    public String getConstitution_save_bonus() {
        return constitution_save_bonus;
    }

    public void setConstitution_save_bonus(String constitution_save_bonus) {
        this.constitution_save_bonus = constitution_save_bonus;
    }

    public boolean isConstitution_save_prof() {
        return constitution_save_prof;
    }

    public void setConstitution_save_prof(boolean constitution_save_prof) {
        this.constitution_save_prof = constitution_save_prof;
    }

    public String getIntelligence_save_bonus() {
        return intelligence_save_bonus;
    }

    public void setIntelligence_save_bonus(String intelligence_save_bonus) {
        this.intelligence_save_bonus = intelligence_save_bonus;
    }

    public boolean isIntelligence_save_prof() {
        return intelligence_save_prof;
    }

    public void setIntelligence_save_prof(boolean intelligence_save_prof) {
        this.intelligence_save_prof = intelligence_save_prof;
    }

    public String getWisdom_save_bonus() {
        return wisdom_save_bonus;
    }

    public void setWisdom_save_bonus(String wisdom_save_bonus) {
        this.wisdom_save_bonus = wisdom_save_bonus;
    }

    public boolean isWisdom_save_prof() {
        return wisdom_save_prof;
    }

    public void setWisdom_save_prof(boolean wisdom_save_prof) {
        this.wisdom_save_prof = wisdom_save_prof;
    }

    public String getCharisma_save_bonus() {
        return charisma_save_bonus;
    }

    public void setCharisma_save_bonus(String charisma_save_bonus) {
        this.charisma_save_bonus = charisma_save_bonus;
    }

    public boolean isCharisma_save_prof() {
        return charisma_save_prof;
    }

    public void setCharisma_save_prof(boolean charisma_save_prof) {
        this.charisma_save_prof = charisma_save_prof;
    }

    public String getSpellCastingAbility() {
        return spellCastingAbility;
    }

    public void setSpellCastingAbility(String spellCastingAbility) {
        this.spellCastingAbility = spellCastingAbility;
    }

    public String getSpellSaveDC() {
        return spellSaveDC;
    }

    public void setSpellSaveDC(String spellSaveDC) {
        this.spellSaveDC = spellSaveDC;
    }

    public String getSpellAttackBonus() {
        return spellAttackBonus;
    }

    public void setSpellAttackBonus(String spellAttackBonus) {
        this.spellAttackBonus = spellAttackBonus;
    }

    public String getL1t() {
        return L1t;
    }

    public void setL1t(String l1t) {
        L1t = l1t;
    }

    public String getL2t() {
        return L2t;
    }

    public void setL2t(String l2t) {
        L2t = l2t;
    }

    public String getL3t() {
        return L3t;
    }

    public void setL3t(String l3t) {
        L3t = l3t;
    }

    public String getL4t() {
        return L4t;
    }

    public void setL4t(String l4t) {
        L4t = l4t;
    }

    public String getL5t() {
        return L5t;
    }

    public void setL5t(String l5t) {
        L5t = l5t;
    }

    public String getL6t() {
        return L6t;
    }

    public void setL6t(String l6t) {
        L6t = l6t;
    }

    public String getL7t() {
        return L7t;
    }

    public void setL7t(String l7t) {
        L7t = l7t;
    }

    public String getL8t() {
        return L8t;
    }

    public void setL8t(String l8t) {
        L8t = l8t;
    }

    public String getL9t() {
        return L9t;
    }

    public void setL9t(String l9t) {
        L9t = l9t;
    }

    public String getL1e() {
        return L1e;
    }

    public void setL1e(String l1e) {
        L1e = l1e;
    }

    public String getL2e() {
        return L2e;
    }

    public void setL2e(String l2e) {
        L2e = l2e;
    }

    public String getL3e() {
        return L3e;
    }

    public void setL3e(String l3e) {
        L3e = l3e;
    }

    public String getL4e() {
        return L4e;
    }

    public void setL4e(String l4e) {
        L4e = l4e;
    }

    public String getL5e() {
        return L5e;
    }

    public void setL5e(String l5e) {
        L5e = l5e;
    }

    public String getL6e() {
        return L6e;
    }

    public void setL6e(String l6e) {
        L6e = l6e;
    }

    public String getL7e() {
        return L7e;
    }

    public void setL7e(String l7e) {
        L7e = l7e;
    }

    public String getL8e() {
        return L8e;
    }

    public void setL8e(String l8e) {
        L8e = l8e;
    }

    public String getL9e() {
        return L9e;
    }

    public void setL9e(String l9e) {
        L9e = l9e;
    }

    public String getEncumberance() {
        return encumberance;
    }

    public void setEncumberance(String encumberance) {
        this.encumberance = encumberance;
    }
}
