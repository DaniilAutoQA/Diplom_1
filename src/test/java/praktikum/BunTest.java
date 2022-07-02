package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BunTest {

    Bun bun = new Bun("one", 12f);

    @Test
    public void getNameReturnsCorrectValue() {
        assertEquals("one", bun.getName());
    }

    @Test
    public void getPriceReturnsCorrectValue() {
        assertEquals(12f, bun.getPrice(), 0);
    }

}