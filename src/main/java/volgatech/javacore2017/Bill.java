package volgatech.javacore2017;

import util.Pair;

import java.util.Vector;

public class Bill {
    public Bill() {

    }

    public double calculatioTotalAmount(Vector<Pair<String, Integer>> productsFromBasket, Vector<Product> productsInfo) { //расчет общей суммы
        float result = 0;
        for (Pair<String, Integer> productFromBasket : productsFromBasket) {
            for (Product productInfo : productsInfo) {
                if (productInfo.getProductName().equals(productFromBasket.getFirst())) {
                    result += productFromBasket.getSecond() * productInfo.getCost();
                }
            }
        }
        return result;
    }
}
