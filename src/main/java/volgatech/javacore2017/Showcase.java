package volgatech.javacore2017;

import java.util.Vector;

public class Showcase {
    public Showcase() {
        mProducts = new Vector<Product>();
        mProducts.add(new Product("Doshirak", 12.5f, 50, true, false, false));
        mProducts.add(new Product("Mayonnaise", 60.2f, 54, false, false, false));
        mProducts.add(new Product("Bread", 20.5f, 47, false, false, false));
        mProducts.add(new Product("Sausage", 144f, 30, false, true, false));
        mProducts.add(new Product("Vodka", 250f, 20, false, false, true));
        printShowcaseInfo();
    }

    private Vector<Product> mProducts;

    private void printShowcaseInfo() {
        System.out.println("Supermarket products have been formed:");
        for(int i = 0;  i < mProducts.size(); ++i) {
            System.out.println("product " + "#" + (i + 1) + " " + mProducts.get(i).getProductName());
        }
    }

    public Vector<Product> getProducts() {
        return mProducts;
    }
}
