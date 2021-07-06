package com.gildedrose;

import com.gildedrose.item.GildedRoseItem;
import com.gildedrose.item.Item;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GildedRoseTest {

    private static final String FOO_NAME = "foo";
    private static final String AGED_BRIE_NAME = "Aged Brie";
    private static final String BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT_NAME = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS_HAND_OF_RAGNAROS_NAME = "Sulfuras, Hand of Ragnaros";

    @Test
    public void shouldOwnsQualityZeroAndSellInNegativeOneWhetherNameIsUnknown() {
        GildedRose gildedRose = buildGildedRoseWithOneItem(FOO_NAME);

        gildedRose.updateQuality();

        assertItems(FOO_NAME, -1, 0, gildedRose);
    }

    @Test
    public void shouldOwnsQualityTwoAndSellInNegativeOneWhetherNameIsAgedBrie() {
        GildedRose gildedRose = buildGildedRoseWithOneItem(AGED_BRIE_NAME);

        gildedRose.updateQuality();

        assertItems(AGED_BRIE_NAME, -1, 2, gildedRose);
    }

    @Test
    public void shouldOwnsQualityTwoAndSellInNegativeOneWhetherNameIsBackstagePassesToATafkal80etcConcert() {
        GildedRose gildedRose = buildGildedRoseWithOneItem(BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT_NAME);

        gildedRose.updateQuality();

        assertItems(BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT_NAME, -1, 0, gildedRose);
    }

    @Test
    public void shouldOwnsQualityZeroAndSellInZeroWhetherNameIsSulfurasHandOfRagnaros() {
        GildedRose gildedRose = buildGildedRoseWithOneItem(SULFURAS_HAND_OF_RAGNAROS_NAME);

        gildedRose.updateQuality();

        assertItems(SULFURAS_HAND_OF_RAGNAROS_NAME, 0, 0, gildedRose);
    }

    @Test
    public void shouldOwnsQualityZeroAndSellInNegativeOneWhetherNameIsUnknownAndSellInZeroAndQualityOne() {
        GildedRose gildedRose = buildGildedRoseWithOneItem(FOO_NAME, 0, 1);

        gildedRose.updateQuality();

        assertItems(FOO_NAME, -1, 0, gildedRose);
    }

    @Test
    public void shouldOwnsQualityZeroAndSellInNegativeTwoWhetherNameIsUnknown3AndSellInNegativeAndQualityGreaterThanOne() {
        GildedRose gildedRose = buildGildedRoseWithOneItem(FOO_NAME, -1, 2);

        gildedRose.updateQuality();

        assertItems(FOO_NAME, -2, 0, gildedRose);
    }

    @Test
    public void shouldOwnsQualityTwoAndSellInNegativeOneWhetherNameIsSulfurasHandOfRagnarosWithSellInNegativeOneAndQualityTwo() {
        GildedRose gildedRose = buildGildedRoseWithOneItem(SULFURAS_HAND_OF_RAGNAROS_NAME, -1, 2);

        gildedRose.updateQuality();

        assertItems(SULFURAS_HAND_OF_RAGNAROS_NAME, -1, 2, gildedRose);
    }

    private void assertItems(String expectedName, int expectedSellIn, int expectedQuality, GildedRose gildedRose) {
        GildedRoseItem item = gildedRose.getItems().get(0);

        assertEquals(expectedName, item.getName());
        assertEquals(expectedSellIn, item.getSellIn());
        assertEquals(expectedQuality, item.getQuality());
    }

    private GildedRose buildGildedRoseWithOneItem(String name) {
        return buildGildedRoseWithOneItem(name, 0, 0);
    }

    private GildedRose buildGildedRoseWithOneItem(String name, int sellIn, int quality) {
        return new GildedRose(asList(new Item(name, sellIn, quality)));
    }
}
