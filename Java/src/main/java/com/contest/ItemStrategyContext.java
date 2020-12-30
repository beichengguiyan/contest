package com.contest;

/**
 * @author HUAWEI
 */
public class ItemStrategyContext {

    private IItemUpdateStrategy itemUpdateStrategy;

    /**
     * 设置策略接口
     *
     * @param itemUpdateStrategy
     */
    public void setItemUpdateStrategy(IItemUpdateStrategy itemUpdateStrategy) {
        this.itemUpdateStrategy = itemUpdateStrategy;
    }

    public void updateItem(Item item) {
        if (itemUpdateStrategy != null) {
            itemUpdateStrategy.updateItem(item);
        }
    }

}
