package model;

public class Taco extends ConsumableItem {

    static final double TACO_REGULAR_PRICE = 3.00;

    static final double TACO_PRICE_BREAK_PRICE = 2.50;

    static final int TACO_PRICE_BREAK_POINT = 3;


    private boolean hasGuacamole = false;

    public Taco() {
        super(3.0);
    }

    public boolean hasGuacamole() {
        return this.hasGuacamole;
    }

    public void addGuacamole() {
        this.hasGuacamole = true;
        this.setUnitPrice(this.getUnitPrice()+ .75);
    }

}
