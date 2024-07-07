package orderSystem;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractOrder implements Order {
    private int id;
    private String customerName;
    private List<OrderItem> items = new ArrayList<>();

    public AbstractOrder(int id, String customerName) {
        this.id = id;
        this.customerName = customerName;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getCustomerName() {
        return customerName;
    }

    @Override
    public void addItem(OrderItem item) {
        items.add(item);
    }

//    @Override
//    public void removeItem(orderSystem.OrderItem item) {
//        items.remove(item);
//    }

    @Override
    public void removeItem(OrderItem item) {
        items.removeIf(orderItem -> orderItem.getName().equals(item.getName())
                && orderItem.getPrice() == item.getPrice()
                && orderItem.getQuantity() == item.getQuantity());
    }

    @Override
    public List<OrderItem> getItems() {
        return items;
    }

    @Override
    public double getTotalPrice() {
        double totalPrice = 0;
        for (OrderItem item : items) {
            totalPrice += item.getPrice() * item.getQuantity();
        }
        return totalPrice;
    }
}
