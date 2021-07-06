package com.gildedrose.item;

public class DefaultItem extends GildedRoseItem {

    public DefaultItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    void updateQualityBasedOnQuality() {
        if (getQuality() > 0) {
            decrementQuality();
        }
    }

    @Override
    void updateSellIn() {
        decrementSellIn();
    }

    @Override
    void updateQualityBasedOnSellIn() {
        if (getQuality() > 0) {
            decrementQuality();
        }
    }
}
