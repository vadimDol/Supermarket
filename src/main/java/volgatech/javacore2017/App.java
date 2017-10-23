package volgatech.javacore2017;

public class App {
    public static void main(String[] args) {
        try {
            Supermarket supermarket = new Supermarket(200);
            supermarket.open();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
