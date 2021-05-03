package discount;

public class DefaultDiscount implements DiscountStrategy {
    @Override
    public double getBillAmount(double billAmount){
        return billAmount;
    };
}
