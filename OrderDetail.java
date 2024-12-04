public class OrderDetail {
    private int quantity;
    private String taxStatus;
    private Item item;

    public OrderDetail(int quantity, String taxStatus, Item item) {
        this.quantity = quantity;
        this.taxStatus = taxStatus;
        this.item = item;
    }

    public double calcSubTotal() {
        return item.getPriceForQuantity(quantity);
    }
    public double calcTax() {
        if (taxStatus.equalsIgnoreCase("Taxable")) {
            return item.getTax() * quantity;
        }
        return 0.0; //non-taxable
    }
    public double calcWeight() {
        return item.getShippingWeight() * quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}