package com.contest;

/**
 * @author HUAWEI
 */
public class AgedBrieUpdateStrategy implements IItemUpdateStrategy {

    public static int MAX_QUALITY = 50;

    @Override
    public void updateItem(Item item) {
        item.sellIn--;
        item.quality++;
        if (item.quality > MAX_QUALITY) {
            item.quality = MAX_QUALITY;
        }
    }
}
