package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunGetNameParametrizedTest {

    private final String name;

    public BunGetNameParametrizedTest(String name) {
        this.name = name;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {""},
                {null},
                {"-120000000000000000000000000000f"},
                {"!@#$%^&*()vfdb "},
                {"     "},
                {"burger"}
        };
    }

    @Test
    public void getNameReturnsCorrectValue() {
        Bun bun = new Bun(name, 12f);
        assertEquals(name, bun.getName());
    }

}
