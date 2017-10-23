package volgatech.javacore2017;


import javax.management.timer.Timer;
import java.lang.ref.Reference;
import java.util.Random;

public class Supermarket extends Showcase {
    public Supermarket(Integer workTime) {
        mWorkTime = workTime;
        mCashDesk = new CashDesk(getProducts());
        report = new Report();
    }

    private Integer mWorkTime;
    private Integer mAmountCustomers;
    private CashDesk mCashDesk;
    private Report report;

    public void open() {
        System.out.println("Supermarket is opened");
        mAmountCustomers = 0;
        long currentTime = 0;
        long startTime = System.currentTimeMillis();
        int timer = 0;
        while (mWorkTime >= timer) {
            if (timer < (int) currentTime) {
                NewCustomer();
                timer = (int) currentTime;
            }
            currentTime = (System.currentTimeMillis() - startTime) / Timer.ONE_SECOND;
        }
        System.out.println("Supermarket is closed");
        report.printReport(getProducts());
    }

    private void NewCustomer() {
        Random random = new Random();
        if (random.nextBoolean()) {
            ++mAmountCustomers;
            Customer customer = new Customer("Customer #" + mAmountCustomers);
            System.out.println("New customer ‘" + customer.getName() + "’ arrived");
            customer.productSelection(getProducts());
            mCashDesk.queue(customer, report);
        }
    }

}
