package com.gildedrose.item;

public class AgedBrie extends GildedRoseItem {

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    void updateQualityBasedOnQuality() {
        if (getQuality() < 50) {
            incrementQuality();
        }
    }

    @Override
    void updateSellIn() {
        decrementSellIn();
    }

    @Override
    void updateQualityBasedOnSellIn() {
        if (getQuality() < 50) {
            incrementQuality();
        }
    }
}
