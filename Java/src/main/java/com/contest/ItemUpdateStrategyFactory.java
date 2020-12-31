package com.contest;

import java.util.HashMap;
import java.util.Map;

/**
 * @author HUAWEI
 */
public class ItemUpdateStrategyFactory {

    private Map<String, IItemUpdateStrategy> itemUpdateStrategyMap;

    public ItemUpdateStrategyFactory() {
        this.itemUpdateStrategyMap = new HashMap<>();
        this.itemUpdateStrategyMap.put("Aged Brie", new AgedBrieUpdateStrategy());
        this.itemUpdateStrategyMap.put("Backstage passes", new BackstagePassesUpdateStrategy());
        this.itemUpdateStrategyMap.put("Sulfuras", new SulfurasUpdateStrategy());
        this.itemUpdateStrategyMap.put("", new NormalUpdateStrategy());
    }

    public IItemUpdateStrategy getItemUpdateStrategy(String name) {
        if (this.itemUpdateStrategyMap.get(name) == null) {
            return new NormalUpdateStrategy();
        }
        return this.itemUpdateStrategyMap.get(name);
    }
}
