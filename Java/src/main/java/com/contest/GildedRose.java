package com.contest;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            item.sellIn--;
            if ("Aged Brie".equals(item.name)) {
                item.quality++;
            } else {
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
    }
}