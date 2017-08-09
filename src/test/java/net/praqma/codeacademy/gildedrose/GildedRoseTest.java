package net.praqma.codeacademy.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    @Test
    public void next() {
        Item[] items = new Item[] { new Item("next", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("next", app.items[0].name);
    }

}
