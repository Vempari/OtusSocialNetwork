import org.junit.Test;

import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


class SolutionTest {
    @Test
    public void test() {
        assertEquals("Burger Fries Chicken Pizza Pizza Pizza Sandwich Milkshake Milkshake Coke", Solution.getOrder("milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza"));
        assertEquals("Burger Fries Fries Chicken Pizza Sandwich Milkshake Coke", Solution.getOrder("pizzachickenfriesburgercokemilkshakefriessandwich"));
    }

}