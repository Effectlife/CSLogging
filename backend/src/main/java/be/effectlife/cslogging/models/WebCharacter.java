package be.effectlife.cslogging.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class WebCharacter {
    private static final Logger LOG = LoggerFactory.getLogger(WebCharacter.class);

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

    private String classResourceMax;
    private String otherResourceMax;
    private String classResource;
    private String otherResource;
    private String classResourceName;
    private String otherResourceName;

    //Rows
    private List<AttackRow> attackRows;
    private List<ProficiencyRow> proficiencyRows;
    private List<TraitRow> traitRows;
    //private List<HpModRow> hpModRows; //TODO: Figure out what this is/where to find it in r20
    private List<InventoryRow> inventoryRows;
    private List<ToolRow> toolRows;
    private List<ClassResourceRow> classResourceRows;
    private List<DamageModRow> damageModRows;


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
    private String acrobatics_bonus;
    private boolean acrobatics_prof;
    private String animal_handling_bonus;
    private boolean animal_handling_prof;
    private String arcana_bonus;
    private boolean arcana_prof;
    private String athletics_bonus;
    private boolean athletics_prof;
    private String deception_bonus;
    private boolean deception_prof;
    private String history_bonus;
    private boolean history_prof;
    private String insight_bonus;
    private boolean insight_prof;
    private String intimidation_bonus;
    private boolean intimidation_prof;
    private String investigation_bonus;
    private boolean investigation_prof;
    private String medicine_bonus;
    private boolean medicine_prof;
    private String nature_bonus;
    private boolean nature_prof;
    private String perception_bonus;
    private boolean perception_prof;
    private String performance_bonus;
    private boolean performance_prof;
    private String persuasion_bonus;
    private boolean persuasion_prof;
    private String religion_bonus;
    private boolean religion_prof;
    private String sleight_of_hand_bonus;
    private boolean sleight_of_hand_prof;
    private String stealth_bonus;
    private boolean stealth_prof;
    private String survival_bonus;
    private boolean survival_prof;

    public String getClassResourceMax() {
        return classResourceMax;
    }

    public void setClassResourceMax(String classResourceMax) {
        this.classResourceMax = classResourceMax;
    }

    public String getOtherResourceMax() {
        return otherResourceMax;
    }

    public void setOtherResourceMax(String otherResourceMax) {
        this.otherResourceMax = otherResourceMax;
    }

    public String getClassResource() {
        return classResource;
    }

    public void setClassResource(String classResource) {
        this.classResource = classResource;
    }

    public String getOtherResource() {
        return otherResource;
    }

    public void setOtherResource(String otherResource) {
        this.otherResource = otherResource;
    }

    public String getClassResourceName() {
        return classResourceName;
    }

    public void setClassResourceName(String classResourceName) {
        this.classResourceName = classResourceName;
    }

    public String getOtherResourceName() {
        return otherResourceName;
    }

    public void setOtherResourceName(String otherResourceName) {
        this.otherResourceName = otherResourceName;
    }

    public String getPassiveWisdom() {
        return passiveWisdom;
    }

    public void setPassiveWisdom(String passiveWisdom) {
        this.passiveWisdom = passiveWisdom;
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

    public String getAcrobatics_bonus() {
        return acrobatics_bonus;
    }

    public void setAcrobatics_bonus(String acrobatics_bonus) {
        this.acrobatics_bonus = acrobatics_bonus;
    }

    public boolean isAcrobatics_prof() {
        return acrobatics_prof;
    }

    public void setAcrobatics_prof(boolean acrobatics_prof) {
        this.acrobatics_prof = acrobatics_prof;
    }

    public String getAnimal_handling_bonus() {
        return animal_handling_bonus;
    }

    public void setAnimal_handling_bonus(String animal_handling_bonus) {
        this.animal_handling_bonus = animal_handling_bonus;
    }

    public boolean isAnimal_handling_prof() {
        return animal_handling_prof;
    }

    public void setAnimal_handling_prof(boolean animal_handling_prof) {
        this.animal_handling_prof = animal_handling_prof;
    }

    public String getArcana_bonus() {
        return arcana_bonus;
    }

    public void setArcana_bonus(String arcana_bonus) {
        this.arcana_bonus = arcana_bonus;
    }

    public boolean isArcana_prof() {
        return arcana_prof;
    }

    public void setArcana_prof(boolean arcana_prof) {
        this.arcana_prof = arcana_prof;
    }

    public String getAthletics_bonus() {
        return athletics_bonus;
    }

    public void setAthletics_bonus(String athletics_bonus) {
        this.athletics_bonus = athletics_bonus;
    }

    public boolean isAthletics_prof() {
        return athletics_prof;
    }

    public void setAthletics_prof(boolean athletics_prof) {
        this.athletics_prof = athletics_prof;
    }

    public String getDeception_bonus() {
        return deception_bonus;
    }

    public void setDeception_bonus(String deception_bonus) {
        this.deception_bonus = deception_bonus;
    }

    public boolean isDeception_prof() {
        return deception_prof;
    }

    public void setDeception_prof(boolean deception_prof) {
        this.deception_prof = deception_prof;
    }

    public String getHistory_bonus() {
        return history_bonus;
    }

    public void setHistory_bonus(String history_bonus) {
        this.history_bonus = history_bonus;
    }

    public boolean isHistory_prof() {
        return history_prof;
    }

    public void setHistory_prof(boolean history_prof) {
        this.history_prof = history_prof;
    }

    public String getInsight_bonus() {
        return insight_bonus;
    }

    public void setInsight_bonus(String insight_bonus) {
        this.insight_bonus = insight_bonus;
    }

    public boolean isInsight_prof() {
        return insight_prof;
    }

    public void setInsight_prof(boolean insight_prof) {
        this.insight_prof = insight_prof;
    }

    public String getIntimidation_bonus() {
        return intimidation_bonus;
    }

    public void setIntimidation_bonus(String intimidation_bonus) {
        this.intimidation_bonus = intimidation_bonus;
    }

    public boolean isIntimidation_prof() {
        return intimidation_prof;
    }

    public void setIntimidation_prof(boolean intimidation_prof) {
        this.intimidation_prof = intimidation_prof;
    }

    public String getInvestigation_bonus() {
        return investigation_bonus;
    }

    public void setInvestigation_bonus(String investigation_bonus) {
        this.investigation_bonus = investigation_bonus;
    }

    public boolean isInvestigation_prof() {
        return investigation_prof;
    }

    public void setInvestigation_prof(boolean investigation_prof) {
        this.investigation_prof = investigation_prof;
    }

    public String getMedicine_bonus() {
        return medicine_bonus;
    }

    public void setMedicine_bonus(String medicine_bonus) {
        this.medicine_bonus = medicine_bonus;
    }

    public boolean isMedicine_prof() {
        return medicine_prof;
    }

    public void setMedicine_prof(boolean medicine_prof) {
        this.medicine_prof = medicine_prof;
    }

    public String getNature_bonus() {
        return nature_bonus;
    }

    public void setNature_bonus(String nature_bonus) {
        this.nature_bonus = nature_bonus;
    }

    public boolean isNature_prof() {
        return nature_prof;
    }

    public void setNature_prof(boolean nature_prof) {
        this.nature_prof = nature_prof;
    }

    public String getPerception_bonus() {
        return perception_bonus;
    }

    public void setPerception_bonus(String perception_bonus) {
        this.perception_bonus = perception_bonus;
    }

    public boolean isPerception_prof() {
        return perception_prof;
    }

    public void setPerception_prof(boolean perception_prof) {
        this.perception_prof = perception_prof;
    }

    public String getPerformance_bonus() {
        return performance_bonus;
    }

    public void setPerformance_bonus(String performance_bonus) {
        this.performance_bonus = performance_bonus;
    }

    public boolean isPerformance_prof() {
        return performance_prof;
    }

    public void setPerformance_prof(boolean performance_prof) {
        this.performance_prof = performance_prof;
    }

    public String getPersuasion_bonus() {
        return persuasion_bonus;
    }

    public void setPersuasion_bonus(String persuasion_bonus) {
        this.persuasion_bonus = persuasion_bonus;
    }

    public boolean isPersuasion_prof() {
        return persuasion_prof;
    }

    public void setPersuasion_prof(boolean persuasion_prof) {
        this.persuasion_prof = persuasion_prof;
    }

    public String getReligion_bonus() {
        return religion_bonus;
    }

    public void setReligion_bonus(String religion_bonus) {
        this.religion_bonus = religion_bonus;
    }

    public boolean isReligion_prof() {
        return religion_prof;
    }

    public void setReligion_prof(boolean religion_prof) {
        this.religion_prof = religion_prof;
    }

    public String getSleight_of_hand_bonus() {
        return sleight_of_hand_bonus;
    }

    public void setSleight_of_hand_bonus(String sleight_of_hand_bonus) {
        this.sleight_of_hand_bonus = sleight_of_hand_bonus;
    }

    public boolean isSleight_of_hand_prof() {
        return sleight_of_hand_prof;
    }

    public void setSleight_of_hand_prof(boolean sleight_of_hand_prof) {
        this.sleight_of_hand_prof = sleight_of_hand_prof;
    }

    public String getStealth_bonus() {
        return stealth_bonus;
    }

    public void setStealth_bonus(String stealth_bonus) {
        this.stealth_bonus = stealth_bonus;
    }

    public boolean isStealth_prof() {
        return stealth_prof;
    }

    public void setStealth_prof(boolean stealth_prof) {
        this.stealth_prof = stealth_prof;
    }

    public String getSurvival_bonus() {
        return survival_bonus;
    }

    public void setSurvival_bonus(String survival_bonus) {
        this.survival_bonus = survival_bonus;
    }

    public boolean isSurvival_prof() {
        return survival_prof;
    }

    public void setSurvival_prof(boolean survival_prof) {
        this.survival_prof = survival_prof;
    }
}
