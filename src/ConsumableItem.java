public abstract class ConsumableItem {

    private double price;

    public abstract double getPrice();

    public double getUnitPrice() {
        return price;
    }

    public abstract boolean hasPriceBreak();

    public abstract int getPriceBreakPoint();

    public abstract double getPriceBreakPrice();

    public ConsumableItem(double unitPrice) {
        this.price = unitPrice;
    }
}
