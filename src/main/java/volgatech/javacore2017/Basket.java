package volgatech.javacore2017;

import util.Pair;

import java.util.Vector;

public class Basket {
    public Basket() {
        mProducts = new Vector<Pair<String, Integer>>();
    }

    private Vector<Pair<String, Integer>> mProducts;

    public void putProductFromBasket(String productName, Integer count) {
        mProducts.add(new Pair<String, Integer>(productName, count));
    }

    public Vector<Pair<String, Integer>> getProductsFromBasket() {
        return mProducts;
    }
}
