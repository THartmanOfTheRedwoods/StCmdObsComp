class ItemsShippingState implements OrderState {
    private EcommerceOrderProcessor2 orderProcessor;

    public ItemsShippingState(EcommerceOrderProcessor2 orderProcessor) {
        this.orderProcessor = orderProcessor;
    }

    @Override
    public void processOrder() {
        System.out.println("Preparing items for shipment...");
        orderProcessor.changeState(new OrderCompletedState(orderProcessor));
        orderProcessor.processOrder(); // Continue processing
    }
}
