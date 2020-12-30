package com.contest;

public class BackstagePassesUpdateStrategy implements IItemUpdateStrategy {

    @Override
    public void updateItem(Item item) {
        item.sellIn--;
        if (item.sellIn >= 10) {
            item.quality++;
        } else if (item.sellIn < 10 && item.sellIn >= 5) {
            item.quality += 2;
        } else if (item.sellIn <= 5 && item.sellIn >= 0) {
            item.quality += 3;
        } else {
            item.quality = 0;
        }
        if (item.quality > 50) {
            item.quality = 50;
        }
    }
}
