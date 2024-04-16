public class EcommerceOrderProcessor {
    private String orderStatus;
    private double orderTotal;
    private boolean isPaymentReceived;
    private boolean isItemsShipped;
    private boolean isOrderCompleted;

    public void processOrder(double total) {
        orderTotal = total;
        isPaymentReceived = false;
        isItemsShipped = false;
        isOrderCompleted = false;

        // Step 1: Receive payment
        if (orderTotal > 0) {
            System.out.printf("Received payment of $%.2f%n", orderTotal);
            isPaymentReceived = true;
        } else {
            System.out.println("Order total is 0, cannot process payment.");
            orderStatus = "Payment Pending";
        }

        // Step 2: Ship items
        if (isPaymentReceived) {
            System.out.println("Preparing items for shipment...");
            isItemsShipped = true;
            orderStatus = "Items Shipped";
        } else {
            System.out.println("Cannot ship items until payment is received.");
            orderStatus = "Payment Pending";
        }

        // Step 3: Complete order
        if (isItemsShipped) {
            System.out.println("Order completed successfully!");
            isOrderCompleted = true;
            orderStatus = "Order Completed";
        } else {
            System.out.println("Order not completed yet.");
            orderStatus = "Items Shipping";
        }
    }
}