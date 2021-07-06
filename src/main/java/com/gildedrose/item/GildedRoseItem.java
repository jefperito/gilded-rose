package com.gildedrose.item;

public abstract class GildedRoseItem {

    private String name;

    private int sellIn;

    private int quality;

    public GildedRoseItem(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    abstract void updateQualityBasedOnQuality();

    abstract void updateSellIn();

    abstract void updateQualityBasedOnSellIn();

    public void update() {
        updateQualityBasedOnQuality();
        updateSellIn();
        updateQualityBasedOnSellIn();
    }

    public int getQuality() {
        return quality;
    }

    public int getSellIn() {
        return sellIn;
    }

    public String getName() {
        return name;
    }

    void setQuality(int quality) {
        this.quality = quality;
    }

    void incrementQuality() {
        this.quality++;
    }

    void decrementQuality() {
        this.quality--;
    }

    void decrementSellIn() {
        this.sellIn--;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
