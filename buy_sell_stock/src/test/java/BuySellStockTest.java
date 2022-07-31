import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class BuySellStockTest {
    static BuySellStock stock;

    @Test
    public void testOnePrice() {
        stock = new BuySellStock(new int[] {1});
        int result = stock.maxProfit();
        assertEquals(0, result);
    }

    @Test
    public void testSamePrices() {
        stock = new BuySellStock(new int[]{2,2,2});
        int result = stock.maxProfit();
        assertEquals(0, result);
    }

    @Test
    public void testMaxPriceAtTheBeginning() {
        stock = new BuySellStock(new int[]{7,1,5,3,6,4});
        int result = stock.maxProfit();
        assertEquals(5, result);
    }

    @Test
    public void testMinPriceAtTheEnd() {
        stock = new BuySellStock(new int[]{5,3,6,7,1});
        int result = stock.maxProfit();
        assertEquals(4, result);
    }
}
