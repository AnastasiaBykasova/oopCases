package orderSystem;

public class DeliveryOrder extends AbstractOrder {
    private String deliveryAddress;

    public DeliveryOrder(int id, String customerName, String deliveryAddress) {
        super(id, customerName);
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }
}
