package com.contest;

public class NormalUpdateStrategy implements IItemUpdateStrategy {

    @Override
    public void updateItem(Item item) {
        item.sellIn--;
        if (item.sellIn < 0) {
            item.quality -= 2;
        } else {
            item.quality--;
        }
        if (item.quality < 0) {
            item.quality = 0;
        }
    }
}
