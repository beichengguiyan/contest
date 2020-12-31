package com.contest;

class GildedRose {
    Item[] items;
    public GildedRose(Item[] items) {
        this.items = items;
    }


    public void updateQuality() {
        //策略上下文
        ItemStrategyContext itemStrategyContext = new ItemStrategyContext();
        //策略工厂
        ItemUpdateStrategyFactory itemUpdateStrategyFactory = new ItemUpdateStrategyFactory();
        for (Item item : items) {
            //获取并设置策略
            IItemUpdateStrategy itemUpdateStrategy = itemUpdateStrategyFactory.getItemUpdateStrategy(item.name);
            itemStrategyContext.setItemUpdateStrategy(itemUpdateStrategy);
            //执行策略
            itemStrategyContext.updateItem(item);
        }
    }

    /*
    public void updateQuality() {
        for (Item item : items) {
            if ("Backstage passes".equals(item.name)) {
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
            } else if ("Sulfuras".equals(item.name)) {
                continue;
            } else if ("Aged Brie".equals(item.name)) {
                item.sellIn--;
                item.quality++;
                if (item.quality > 50) {
                    item.quality = 50;
                }
            } else {
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
    }*/
}