import org.junit.Test;

import static org.junit.Assert.*;

public class OrderPanelTest {

    @Test
    public void test_OrderHasCustomerName() {
        OrderPanel orderPanel1 = new OrderPanel("Coal");
        OrderPanel orderPanel2 = new OrderPanel("Julia");
        assertEquals("Coal", orderPanel1.getCustomerName());
        assertEquals("Julia", orderPanel2.getCustomerName());

    }

}