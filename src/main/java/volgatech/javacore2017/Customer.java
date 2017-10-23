package volgatech.javacore2017;


import javafx.util.Pair;

import java.util.Random;
import java.util.Vector;

public class Customer extends Basket {
    public Customer(String name) {
        final Pair<Integer, Integer> RANGE_MONEY = new Pair<Integer, Integer>(2000, 5000);

        mBuyerCategory = BuyerCategory.values()[(int) (Math.random() * BuyerCategory.values().length)];
        mAmountOfMoney = RANGE_MONEY.getKey() + (int) (Math.random() * RANGE_MONEY.getValue());
        mName = name;
    }

    private BuyerCategory mBuyerCategory;
    private Integer mAmountOfMoney;
    private String mName;

    public String getName() {
        return mName;
    }

    public void productSelection(Vector<Product> products) {
        final Pair<Integer, Integer> RANGE_AMOUNT_PRODUCT = new Pair<Integer, Integer>(1, 4);
        float totalAmount = 0;
        for (int i = 0; i < products.size(); ++i) {
            Random random = new Random();
            if (random.nextBoolean()) {
                Product product = products.get(i);
                Integer amount = RANGE_AMOUNT_PRODUCT.getKey() + (int) (Math.random() * RANGE_AMOUNT_PRODUCT.getValue());
                totalAmount += amount * product.getCost();
                if (totalAmount <= mAmountOfMoney) {
                    if (product.getIsAdult() && mBuyerCategory == BuyerCategory.CHILD) {
                        System.out.println("Child wants to take the product for adults!!!");
                        continue;
                    }
                    if (product.isContainsAmountProduct(amount)) { // если содержиться нужное количество продуктов, то берем
                        product.takeProducts(amount); //взять продукт
                        putProductFromBasket(product.getProductName(), amount); //положить
                        System.out.println("Customer ‘" + mName + "’ picked up " + amount + " units of " + product.getProductName());
                    }
                } else {
                    return;
                }
            }


        }
    }
}
