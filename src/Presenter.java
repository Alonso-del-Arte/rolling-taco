import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.lang.management.BufferPoolMXBean;



public class Presenter {


    private final TacoTruck view;


    private void setCurrentScreen(JPanel screen) {

        this.view.setContentPane(screen);

        view.revalidate();

    }


    public JFrame getView() {

        return this.view;

    }


    public Presenter(TacoTruck tacoTruck) {

        this.view = tacoTruck;

        setCurrentScreen(new TacoTruckWelcomePanel());

        ((TacoTruckWelcomePanel)this.getCurrentScreen())
                .getStartButton()
                .addActionListener(new StartButtonActionListener());

    }


    public Container getCurrentScreen() {

        return view.getContentPane();

    }


    public static void main(String[] args) {

        new Presenter(new TacoTruck());

    }

    private class StartButtonActionListener implements ActionListener {


        @Override

        public void actionPerformed(ActionEvent e) {
            String customerName = ((TacoTruckWelcomePanel)getCurrentScreen()).getCustomerNameField().getText();
            setCurrentScreen(new OrderPanel(customerName));
            getCurrentScreen().revalidate();


        }

    }


}