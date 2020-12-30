package com.contest;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            item.sellIn--;
            if (item.sellIn < 0) {
                item.quality -= 2;
            } else {
                item.quality--;
            }
        }
    }
}