import java.util.Date;

public class Main {
    public static void main(String[] args) {
      
        customer customer = new customer("Agus", "kp.sedih banget");
        System.out.println("Customer");
        System.out.println("Name: " + customer.getName());
        System.out.println("Address: " + customer.getAddress());
        System.out.println();

        //order detail manual setting per item harganya 10
        Item item1 = new Item(5.0, "Laptop");
        Item item2 = new Item(2.0, "smartphone");
        OrderDetail detail1 = new OrderDetail(4, "Taxable", item1);
        OrderDetail detail2 = new OrderDetail(3, "Non-Taxable", item2);

        //informasi item dan order detail
        System.out.println("Item 1: " + item1.getDescription() + ", Shipping Weight: " + item1.getShippingWeight() + " kg * " + detail1.getQuantity());
        System.out.println("Item 2: " + item2.getDescription() + ", Shipping Weight: " + item2.getShippingWeight() + " kg * " + detail2.getQuantity());
        System.out.println();

        // Membuat Order
        Order order = new Order(new Date(), "Processing");
        order.addOrderDetail(detail1);
        order.addOrderDetail(detail2);

        //informasi Order
        System.out.println(order.getDate());
        System.out.println("Total Weight: " + order.calcTotalWeight() + " kg");
        System.out.println("SubTotal: " + order.calcSubTotal());
        System.out.println("Tax: " + order.calcTax());
        System.out.println("Total: " + order.calcTotal());
        System.out.println("Status: " + order.getStatus());
        System.out.println();

        //contoh cash
        double amountToPay = order.calcTotal();
        Payment cashPayment = new Cash(amountToPay, 100.0);
        order.setPayment(cashPayment);
        System.out.println("Payment Method: Cash");
        System.out.println("Amount to Pay: " + cashPayment.getAmount());
        System.out.println("Cash Tendered: " + ((Cash) cashPayment).getCashTendered());
        System.out.println("Payment Authorized: " + cashPayment.authorized());
        System.out.println();
    }
}