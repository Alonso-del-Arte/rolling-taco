import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

public class TacoTruckTest {

    @Test
    public void testTacoTruckInitialState() {
        TacoTruck tacoTruck = new TacoTruck();
        assertEquals("TacoTruckFrame", tacoTruck.getName());
        assertEquals("DisAint Taco Bell", tacoTruck.getTitle());
        assertTrue(tacoTruck.isVisible());
        assertEquals(JFrame.EXIT_ON_CLOSE, tacoTruck.getDefaultCloseOperation());
        assertEquals(600, tacoTruck.getWidth());
        assertEquals(200, tacoTruck.getHeight());
        assertEquals("TacoTruckWelcomePanel", tacoTruck.getContentPane().getName());
    }


}