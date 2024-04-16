public class EcommerceOrderProcessor2 {
    private double orderTotal;
    private OrderState currentState;

    public EcommerceOrderProcessor2(double orderTotal) {
        this.orderTotal = orderTotal;
        this.currentState = new PaymentPendingState(this);
    }

    public void processOrder() {
        currentState.processOrder();
    }

    public void changeState(OrderState newState) {
        this.currentState = newState;
    }

    public double getOrderTotal() {
        return orderTotal;
    }
}