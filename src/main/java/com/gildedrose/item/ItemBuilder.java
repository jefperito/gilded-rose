package com.gildedrose.item;

import com.gildedrose.GildedRose;

public class ItemBuilder {

    public static GildedRoseItem build(Item item) {
        if (item.getName().equals(GildedRose.AGED_BRIE_NAME)) {
            return new AgedBrie(item.getName(), item.getSellIn(), item.getQuality());
        }
        if (item.getName().equals(GildedRose.SULFURAS_HAND_OF_RAGNAROS_NAME)) {
            return new SulfurasHandOfRagnaros(item.getName(), item.getSellIn(), item.getQuality());
        }
        if (item.getName().equals(GildedRose.BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT_NAME)) {
            return new Backstage(item.getName(), item.getSellIn(), item.getQuality());
        }
        return new DefaultItem(item.getName(), item.getSellIn(), item.getQuality());
    }
}
