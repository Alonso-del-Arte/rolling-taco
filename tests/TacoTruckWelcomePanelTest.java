import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

public class TacoTruckWelcomePanelTest {

    @Test
    public void welcomePanel_initialState() {

        TacoTruckWelcomePanel welcome = new TacoTruckWelcomePanel();
        JTextField customerNameField = (JTextField) welcome.getComponents() [0];
        JButton startButton = (JButton) welcome.getComponents() [1];


        assertEquals("TacoTruckWelcomePanel", welcome.getName());

        assertEquals("StartOrderButton",welcome.getStartButton().getName());
        assertEquals("Start Order",welcome.getStartButton().getText());
        assertEquals("StartOrderButton", startButton.getName());
        assertEquals("Start Order", startButton.getText());
        assertEquals(startButton, welcome.getStartButton());

        assertEquals("CustomerNameField", welcome.getCustomerNameField().getName());
        assertEquals("Enter Customer Name", welcome.getCustomerNameField().getText());
        assertEquals("CustomerNameField", customerNameField.getName());
        assertEquals("Enter Customer Name", customerNameField.getText());
        assertEquals(customerNameField, welcome.getCustomerNameField());

    }






}