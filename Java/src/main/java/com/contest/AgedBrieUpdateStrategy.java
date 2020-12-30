package com.contest;

public class AgedBrieUpdateStrategy implements IItemUpdateStrategy {

    @Override
    public void updateItem(Item item) {
        item.sellIn--;
        item.quality++;
        if (item.quality > 50) {
            item.quality = 50;
        }
    }
}
