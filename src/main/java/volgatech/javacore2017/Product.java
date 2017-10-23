package volgatech.javacore2017;

public class Product {
    public Product(String productName, Float cost, Integer amount
            , Boolean discount, Boolean sellByWeight, Boolean isAdult ) {
        mSellByWeight = sellByWeight;
        mProductName = productName;
        mDiscount = discount;
        mIsAdult = isAdult;
        mAmount = amount;
        mCost = cost;
    }

    private Boolean mSellByWeight;
    private String mProductName;
    private Boolean mDiscount;
    private Boolean mIsAdult;
    private Integer mAmount;
    private Float mCost;

    public Boolean getSellByWeight() {
        return mSellByWeight;
    }

    public Boolean getDiscount() {
        return mDiscount;
    }

    public Float getCost() {
        return mCost;
    }

    public Integer getAmount() {
        return mAmount;
    }

    public Boolean getIsAdult() {
        return mIsAdult;
    }


    public String getProductName() {
        return mProductName;
    }

    public void takeProducts(Integer amount) {
        mAmount -= amount;
    }

    public Boolean isContainsAmountProduct(Integer amount) {
        return mAmount >= amount;
    }
}
