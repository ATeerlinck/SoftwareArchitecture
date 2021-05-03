package discount;

public interface DiscountDiscount implements DiscountStrategy{
    @Override
    public double getBillAmount(double billAmount){
        return billAmount - (billAmount * 0.5);
    };
}
