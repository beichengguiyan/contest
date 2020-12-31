package com.contest;

/**
 * @author HUAWEI
 */
public class NormalUpdateStrategy implements IItemUpdateStrategy {

    public static int MIN_SELLIN = 0;
    public static int MIN_QUALITY = 0;

    @Override
    public void updateItem(Item item) {
        item.sellIn--;
        if (item.sellIn < MIN_SELLIN) {
            item.quality -= 2;
        } else {
            item.quality--;
        }
        if (item.quality < MIN_QUALITY) {
            item.quality = 0;
        }
    }
}
