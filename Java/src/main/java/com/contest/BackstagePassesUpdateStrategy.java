package com.contest;

/**
 * @author HUAWEI
 */
public class BackstagePassesUpdateStrategy implements IItemUpdateStrategy {

    public static int MAX_QUALITY = 50;
    public static int MAX_SHOW_TIME = 10;
    public static int MED_SHOW_TIME = 5;
    public static int MIN_SHOW_TIME = 0;

    @Override
    public void updateItem(Item item) {
        item.sellIn--;
        if (item.sellIn >= MAX_SHOW_TIME) {
            item.quality++;
        } else if (item.sellIn < MAX_SHOW_TIME && item.sellIn >= MED_SHOW_TIME) {
            item.quality += 2;
        } else if (item.sellIn <= MED_SHOW_TIME && item.sellIn >= MIN_SHOW_TIME) {
            item.quality += 3;
        } else {
            item.quality = 0;
        }
        if (item.quality > MAX_QUALITY) {
            item.quality = MAX_QUALITY;
        }
    }
}
