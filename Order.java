import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Date date;
    private String status;
    private List<OrderDetail> orderDetails;
    private Payment payment;

    public Order(Date date, String status) {
        this.date = date;
        this.status = status;
        this.orderDetails = new ArrayList<>();
    }

    public double calcSubTotal() {
        return orderDetails.stream().mapToDouble(OrderDetail::calcSubTotal).sum();
    }
    public double calcTax() {
        return orderDetails.stream().mapToDouble(OrderDetail::calcTax).sum();
    }
    public double calcTotal() {
        return calcSubTotal() + calcTax();
    }
    public double calcTotalWeight() {
        return orderDetails.stream().mapToDouble(OrderDetail::calcWeight).sum();
    }
    public void addOrderDetail(OrderDetail detail) {
        orderDetails.add(detail);
    }

    //setter getter
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    public Payment getPayment() {
        return payment;
    }
    public Date getDate() {
        return date;
    }
    public String getStatus() {
        return status;
    }
}