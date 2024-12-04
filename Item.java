public class Item {
    private double shippingWeight;
    private String description;

    public Item(double shippingWeight, String description) {
        this.shippingWeight = shippingWeight;
        this.description = description;
    }

    public double getPriceForQuantity(int quantity) {
        return quantity * 10;//ini contoh per harga barang
    }
    public double getTax() {
        return 2.5; //pajak
    }
    public boolean inStock() {
        return true;
    }

    public double getShippingWeight() {
        return shippingWeight;
    }
    public String getDescription() {
        return description;
    }
}