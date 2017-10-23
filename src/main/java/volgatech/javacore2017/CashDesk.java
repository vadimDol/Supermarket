package volgatech.javacore2017;

import util.Pair;

import java.util.Vector;

public class CashDesk extends  Bill  {
    public CashDesk(Vector<Product> productsInfo) {
        mProductsInfo = productsInfo;
    }

    private Vector<Product> mProductsInfo;


    public void queue(Customer customer, Report report) {
        double totalAmount = calculatioTotalAmount(customer.getProductsFromBasket(), mProductsInfo); // итого
        System.out.println("Customer ‘" + customer.getName() + "’ at the cash desk, amount to pay: " + String.format("%.2f", totalAmount));
        report.setTotalEarned(totalAmount);
    }
}
