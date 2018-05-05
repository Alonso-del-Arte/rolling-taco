public class Taco extends FoodItem {

    static final double TACO_REGULAR_PRICE = 3.00;
    static final double TACO_PRICE_BREAK_PRICE = 2.50;
    static final int TACO_PRICE_BREAK_POINT = 3;

    private boolean withGuacamole = false;

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public boolean hasPriceBreak() {
        return false;
    }

    @Override
    public int getPriceBreakPoint() {
        return 0;
    }

    @Override
    public double getPriceBreakPrice() {
        return 0;
    }

    public Taco() {
        super(TACO_REGULAR_PRICE);
    }

    public boolean hasGuacamole() {
        return withGuacamole;
    }

    public void addGuacamole() {
        withGuacamole = true;
    }
}
