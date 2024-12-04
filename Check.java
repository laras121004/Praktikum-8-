public class Check extends Payment {
    private String name;
    private String bankID;

    public Check(float amount, String name, String bankID) {
        super(amount);
        this.name = name;
        this.bankID = bankID;
    }

    public String getName() {
        return name;
    }
    public String getBankID() {
        return bankID;
    }
    public void setBankID(String bankID) {
        this.bankID = bankID;
    }
    @Override
    public boolean authorized() {
        return true;
    }
}