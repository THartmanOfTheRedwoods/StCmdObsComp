class OrderCompletedState implements OrderState {
    private EcommerceOrderProcessor2 orderProcessor;

    public OrderCompletedState(EcommerceOrderProcessor2 orderProcessor) {
        this.orderProcessor = orderProcessor;
    }

    @Override
    public void processOrder() {
        System.out.println("Order completed successfully!");
    }
}
