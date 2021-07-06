package com.gildedrose.item;

public class Backstage extends GildedRoseItem {

    public Backstage(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    void updateQualityBasedOnQuality() {
        if (getQuality() < 50) {
            if (getSellIn() < 11) {
                incrementQuality();
            }

            if (getSellIn() < 6) {
                incrementQuality();
            }
        }
    }

    @Override
    void updateSellIn() {
        decrementSellIn();
    }

    @Override
    void updateQualityBasedOnSellIn() {
        setQuality(0);
    }
}
