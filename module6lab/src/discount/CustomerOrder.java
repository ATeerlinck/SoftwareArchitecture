package discount;

public class CustomerOrder {

    private String customerName;
    private double billAmount;
    private DiscountStrategy discountStrategy discountStrategy;

    public CustomerOrder(String customerName, double billAmount, DiscountStrategy discountStrategy) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        this.discountStrategy = discountStrategy;
    }

    public double getBillAmount() {
        return discountStrategy.getBillAmount(billAmount);
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Customer{"
                + "customerName='" + customerName + '\''
                + ", billAmount=" + billAmount
                + '}';
    }
}
