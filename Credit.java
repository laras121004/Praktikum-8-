public class Credit extends Payment {

    private String number;
    private String type;
    private String expDate;

    public Credit(float amount, String number, String type, String expDate) {
        super(amount);
        this.number = number;
        this.type = type;
        this.expDate = expDate;
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getExpDate() {
        return expDate;
    }
    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
    @Override
    public boolean authorized() {
        return true;
    }
}