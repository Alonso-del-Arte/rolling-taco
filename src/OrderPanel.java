import javax.swing.*;

public class OrderPanel extends JPanel {

    private String customerName;

    public OrderPanel(String customerName) {
        this.customerName = customerName;
        this.add(new JLabel("Order for: " + customerName));

    }

    public String getCustomerName() {

        return customerName;

    }
}