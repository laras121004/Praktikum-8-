public class Cash extends Payment {
    private double cashTendered;

    public Cash(double amount, double cashTendered) {
        super(amount);
        this.cashTendered = cashTendered;
    }

    public double getCashTendered() {
        return cashTendered;
    }
    @Override
    public boolean authorized() {
        return cashTendered >= amount;
    }
}