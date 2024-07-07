package orderSystem;

import java.util.List;

public interface Order {
    int getId();
    String getCustomerName();
    double getTotalPrice();
    void addItem(OrderItem item);
    void removeItem(OrderItem item);
    List<OrderItem> getItems();
}