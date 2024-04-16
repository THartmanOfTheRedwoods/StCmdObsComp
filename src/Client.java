public class Client {
    public static void main(String[] args) {
        System.out.println("If-Else chain method (BAD)");
        System.out.println("-".repeat(120));
        EcommerceOrderProcessor orderProcessor = new EcommerceOrderProcessor();
        orderProcessor.processOrder(100.00);


        System.out.printf("%nState Design Pattern method (GOOD)%n");
        System.out.println("-".repeat(120));
        EcommerceOrderProcessor2 orderProcessor2 = new EcommerceOrderProcessor2(100.00);
        orderProcessor2.processOrder();

        System.out.println("Both accomplish the same thing, but the state pattern supports Single Responsibility and the Open/Close principle");
    }
}
