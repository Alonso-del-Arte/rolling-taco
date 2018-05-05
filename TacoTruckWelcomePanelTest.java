package tacoGUI;

import static org.junit.Assert.*;
import org.junit.Test;

import javax.swing.*;


public class TacoTruckWelcomePanelTest {

    @Test
    public void testWelcomePanelInitialState() {
        TacoTruckWelcomePanel welcome = new TacoTruckWelcomePanel();
        JButton startButton = (JButton) welcome.getComponents()[0];
        assertEquals("TacoTruckWelcomePanel", welcome.getName());
        assertEquals("StartOrderButton", welcome.getStartButton().getName());
        assertEquals("Start Order", welcome.getStartButton().getText());
        assertEquals("Start Order", startButton.getText());
        assertEquals(startButton, welcome.getStartButton());
    }

}