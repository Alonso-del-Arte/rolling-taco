package tacoGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Presenter {import javax.swing.*;
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
                setCurrentScreen(new OrderPanel());
            }
        }

    }

}
