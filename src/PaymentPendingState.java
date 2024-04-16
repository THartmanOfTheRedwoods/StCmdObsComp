// Concrete Order States
class PaymentPendingState implements OrderState {
    private EcommerceOrderProcessor2 orderProcessor;

    public PaymentPendingState(EcommerceOrderProcessor2 orderProcessor) {
        this.orderProcessor = orderProcessor;
    }

    @Override
    public void processOrder() {
        if (orderProcessor.getOrderTotal() > 0) {
            System.out.printf("Received payment of $%.2f%n", orderProcessor.getOrderTotal());
            orderProcessor.changeState(new ItemsShippingState(orderProcessor));
            orderProcessor.processOrder(); // If we changed state we can auto-process.
        } else {
            System.out.println("Order total is 0, cannot process payment.");
        }
    }
}
