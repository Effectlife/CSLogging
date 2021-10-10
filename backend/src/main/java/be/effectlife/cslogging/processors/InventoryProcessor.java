package be.effectlife.cslogging.processors;

import be.effectlife.cslogging.models.InventoryRow;
import be.effectlife.cslogging.models.WebCharacter;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

@Component
public class InventoryProcessor implements Processor {

    @Override
    public void process(WebCharacter webCharacter, Map<String, Object> input) {
        final Map<String, Map<String, Map<String, String>>> rowList = (Map<String, Map<String, Map<String, String>>>) input.get("inr");
        final ArrayList<String> rowIds = (ArrayList<String>) input.get("inid"); if(rowIds == null)return;

        ArrayList<InventoryRow> rows = new ArrayList<>();
        for (String rowId : rowIds) {
            rows.add(processRow(rowList.get(rowId)));
        }
        webCharacter.setInventoryRows(rows);
        Optional<Integer> totalWeight = rows.stream().filter(r -> StringUtils.isNotBlank(r.getItemWeight())).map(r -> Integer.parseInt(r.getItemWeight())).reduce(Integer::sum);
        totalWeight.ifPresent(integer -> webCharacter.setTotalWeight("" + integer));
    }

    private InventoryRow processRow(Map<String, Map<String, String>> stringMapMap) {

        InventoryRow inventoryRow = new InventoryRow();
        inventoryRow.setItemName(getRowValue(stringMapMap, "itemname"));
        inventoryRow.setEquipped(getRowBool(stringMapMap, "equipped"));
        inventoryRow.setItemCount(getRowValue(stringMapMap, "itemcount"));
        inventoryRow.setItemProperties(getRowValue(stringMapMap, "itemproperties"));
        inventoryRow.setItemWeight(getRowValue(stringMapMap, "itemweight"));
        inventoryRow.setItemContent(getRowValue(stringMapMap, "itemcontent"));
        inventoryRow.setItemModifiers(getRowValue(stringMapMap, "itemmodifiers"));
        inventoryRow.setHasAttack(getRowBool(stringMapMap, "hasattack"));
        inventoryRow.setUseAsResource(getRowBool(stringMapMap, "useasresource"));
        return inventoryRow;

    }
}
