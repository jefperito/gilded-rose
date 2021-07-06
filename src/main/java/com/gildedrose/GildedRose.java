package com.gildedrose;

import com.gildedrose.item.GildedRoseItem;
import com.gildedrose.item.Item;
import com.gildedrose.item.ItemBuilder;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class GildedRose {
    public static final String AGED_BRIE_NAME = "Aged Brie";
    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT_NAME = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS_HAND_OF_RAGNAROS_NAME = "Sulfuras, Hand of Ragnaros";

    private List<GildedRoseItem> gildedRoseItems;

    public GildedRose(List<Item> items) {
        gildedRoseItems = items.stream().map(ItemBuilder::build).collect(toList());
    }

    public List<GildedRoseItem> getItems() {
        return gildedRoseItems;
    }

    public void updateQuality() {
        gildedRoseItems.forEach(GildedRoseItem::update);
    }
}
