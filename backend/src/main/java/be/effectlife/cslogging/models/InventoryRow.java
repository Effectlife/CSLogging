package be.effectlife.cslogging.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InventoryRow {
    private static final Logger LOG = LoggerFactory.getLogger(InventoryRow.class);
    private String itemName;
    private String itemCount;
    private String itemProperties;
    private String itemWeight;
    private String itemContent;
    private String itemModifiers;
    private boolean hasAttack;
    private boolean useAsResource;
    private boolean equipped;

    public InventoryRow() {
    }

    public InventoryRow(String itemName, String itemCount, String itemProperties, String itemWeight, String itemContent, String itemModifiers, boolean hasAttack, boolean useAsResource, boolean equipped) {
        this.itemName = itemName;
        this.itemCount = itemCount;
        this.itemProperties = itemProperties;
        this.itemWeight = itemWeight;
        this.itemContent = itemContent;
        this.itemModifiers = itemModifiers;
        this.hasAttack = hasAttack;
        this.useAsResource = useAsResource;
        this.equipped = equipped;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemCount() {
        return itemCount;
    }

    public void setItemCount(String itemCount) {
        this.itemCount = itemCount;
    }

    public String getItemProperties() {
        return itemProperties;
    }

    public void setItemProperties(String itemProperties) {
        this.itemProperties = itemProperties;
    }

    public String getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(String itemWeight) {
        this.itemWeight = itemWeight;
    }

    public String getItemContent() {
        return itemContent;
    }

    public void setItemContent(String itemContent) {
        this.itemContent = itemContent;
    }

    public String getItemModifiers() {
        return itemModifiers;
    }

    public void setItemModifiers(String itemModifiers) {
        this.itemModifiers = itemModifiers;
    }

    public boolean isHasAttack() {
        return hasAttack;
    }

    public void setHasAttack(boolean hasAttack) {
        this.hasAttack = hasAttack;
    }

    public boolean isUseAsResource() {
        return useAsResource;
    }

    public void setUseAsResource(boolean useAsResource) {
        this.useAsResource = useAsResource;
    }

    public boolean isEquipped() {
        return equipped;
    }

    public void setEquipped(boolean equipped) {
        this.equipped = equipped;
    }
}
