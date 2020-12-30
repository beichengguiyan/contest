package com.contest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {

    @Test
    public void should_fix_me() {
        Item[] items = new Item[]{new Item("normal", 10, 20)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(9, (gildedRose.items[0]).sellIn);
        assertEquals(19, gildedRose.items[0].quality);
    }

    @Test
    public void should_return_8_and_18_when_update_two_days() {
        //given
        Item[] items = new Item[]{new Item("normal", 10, 20)};
        GildedRose gildedRose = new GildedRose(items);

        //when
        for (int i = 0; i < 2; i++) {
            gildedRose.updateQuality();
        }

        //then
        assertEquals(8, (gildedRose.items[0]).sellIn);
        assertEquals(18, gildedRose.items[0].quality);
    }

    @Test
    public void should_return_9_19_and_14_24when_given_two_items() {
        //given
        Item[] items = new Item[]{new Item("normal", 10, 20), new Item("normal", 15, 25)};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(9, (gildedRose.items[0]).sellIn);
        assertEquals(19, gildedRose.items[0].quality);
        assertEquals(14, (gildedRose.items[1]).sellIn);
        assertEquals(24, gildedRose.items[1].quality);
    }

    @Test
    public void should_return_8_when_sellIn_less_than_zero() {
        //given
        Item[] items = new Item[]{new Item("normal", 10, 20)};
        GildedRose gildedRose = new GildedRose(items);

        //when
        for (int i = 0; i < 11; i++) {
            gildedRose.updateQuality();
        }

        //then
        assertEquals(-1, (gildedRose.items[0]).sellIn);
        assertEquals(8, gildedRose.items[0].quality);
    }

    @Test
    public void should_return_0_when_sellIn_f10() {
        //given
        Item[] items = new Item[]{new Item("normal", 10, 20)};
        GildedRose gildedRose = new GildedRose(items);

        //when
        for (int i = 0; i < 20; i++) {
            gildedRose.updateQuality();
        }

        //then
        assertEquals(-10, (gildedRose.items[0]).sellIn);
        assertEquals(0, gildedRose.items[0].quality);
    }

    @Test
    public void should_return_21_when_item_is_AgedBrie() {
        //given
        Item[] items = new Item[]{new Item("Aged Brie", 10, 20)};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(9, (gildedRose.items[0]).sellIn);
        assertEquals(21, gildedRose.items[0].quality);
    }

    @Test
    public void should_return_50_when_when_sellIn_f90() {
        //given
        Item[] items = new Item[]{new Item("Aged Brie", 10, 20)};
        GildedRose gildedRose = new GildedRose(items);

        //when
        for (int i = 0; i < 100; i++) {
            gildedRose.updateQuality();
        }

        //then
        assertEquals(-90, (gildedRose.items[0]).sellIn);
        assertEquals(50, gildedRose.items[0].quality);
    }

    @Test
    public void should_return_10_and_20_when_when_item_is_Sulfuras() {
        //given
        Item[] items = new Item[]{new Item("Sulfuras", 10, 20)};
        GildedRose gildedRose = new GildedRose(items);

        //when
        for (int i = 0; i < 100; i++) {
            gildedRose.updateQuality();
        }

        //then
        assertEquals(10, (gildedRose.items[0]).sellIn);
        assertEquals(20, gildedRose.items[0].quality);
    }

    @Test
    public void should_return_19_and_11_when_item_is_Backstagepasses() {
        //given
        Item[] items = new Item[]{new Item("Backstage passes", 20, 10)};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(19, (gildedRose.items[0]).sellIn);
        assertEquals(11, gildedRose.items[0].quality);
    }
    @Test
    public void should_return_9_and_22_when_item_is_Backstagepasses() {
        //given
        Item[] items = new Item[]{new Item("Backstage passes", 20, 10)};
        GildedRose gildedRose = new GildedRose(items);

        //when
        for (int i = 0; i < 11; i++) {
            gildedRose.updateQuality();
        }

        //then
        assertEquals(9, (gildedRose.items[0]).sellIn);
        assertEquals(22, gildedRose.items[0].quality);
    }
}
