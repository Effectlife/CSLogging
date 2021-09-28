package be.effectlife.cslogging.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class WebCharacter {
    private static final Logger LOG = LoggerFactory.getLogger(WebCharacter.class);

    //Basic information
    private String id;
    private String name;
    private int ac;
    private int initiative;
    private int speed;
    private int hp;
    private int hp_max;
    private int hp_temp;
    private int hit_dice;
    private int hit_dice_max;
    private int deathSaveFails;
    private int deathSaveSuccesses;

    //Money
    private int cp;//Copper Pieces
    private int sp;//Silver Pieces
    private int ep;//Electrum Pieces
    private int gp;//Gold Pieces
    private int pp;//Platinum Pieces

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
    private int strength;
    private int strength_mod;
    private int dexterity;
    private int dexterity_mod;
    private int constitution;
    private int constitution_mod;
    private int wisdom;
    private int wisdom_mod;
    private int charisma;
    private int charisma_mod;
    private int intelligence;
    private int intelligence_mod;

    //Bonuses
    private boolean inspiration;
    private int pb; //Proficiency Bonus

    //Saving throws
    private int strength_save_bonus;
    private boolean strength_save_prof;
    private int dexterity_save_bonus;
    private boolean dexterity_save_prof;
    private int constitution_save_bonus;
    private boolean constitution_save_prof;
    private int intelligence_save_bonus;
    private boolean intelligence_save_prof;
    private int wisdom_save_bonus;
    private boolean wisdom_save_prof;
    private int charisma_save_bonus;
    private boolean charisma_save_prof;

    //Skills
    private int acrobatics_bonus;
    private boolean acrobatics_prof;
    private int animal_handling_bonus;
    private boolean animal_handling_prof;
    private int arcana_bonus;
    private boolean arcana_prof;
    private int athletics_bonus;
    private boolean athletics_prof;
    private int deception_bonus;
    private boolean deception_prof;
    private int history_bonus;
    private boolean history_prof;
    private int insight_bonus;
    private boolean insight_prof;
    private int intimidation_bonus;
    private boolean intimidation_prof;
    private int investigation_bonus;
    private boolean investigation_prof;
    private int medicine_bonus;
    private boolean medicine_prof;
    private int nature_bonus;
    private boolean nature_prof;
    private int perception_bonus;
    private boolean perception_prof;
    private int performance_bonus;
    private boolean performance_prof;
    private int persuasion_bonus;
    private boolean persuasion_prof;
    private int religion_bonus;
    private boolean religion_prof;
    private int sleight_of_hand_bonus;
    private boolean sleight_of_hand_prof;
    private int stealth_bonus;
    private boolean stealth_prof;
    private int survival_bonus;
    private boolean survival_prof;



}
