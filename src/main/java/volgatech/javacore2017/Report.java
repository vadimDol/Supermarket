package volgatech.javacore2017;

import java.util.Vector;

public class Report {
    public Report() {
        mTotalEarned = 0;
    }

    private double mTotalEarned;

    public void setTotalEarned(double totalAmount) {
        mTotalEarned += totalAmount;
    }

    public void printReport(Vector<Product> products) {
        System.out.println("Total Earned: " + String.format("%.2f", mTotalEarned));
        System.out.println("The stock contains.");
        for(Product product : products) {
            System.out.printf("%4s%4s\n", product.getProductName(), product.getAmount());
        }
    }
}
