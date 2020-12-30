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
    public void should_return_8_and_18_when_update_two() {
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
}
