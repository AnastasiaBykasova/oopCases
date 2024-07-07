package orderSystem;

public class MainOrders {
    public static void main(String[] args) {
        int id = 0;
        Order withDelivery1 = new DeliveryOrder(id, "John Matter", "Prod st., 12");
        withDelivery1.addItem(new CertainOrderItem("Milkshake", 2.99, 2));
        withDelivery1.addItem(new CertainOrderItem("Ceasar Salad", 3.99, 1));
        withDelivery1.addItem(new CertainOrderItem("Bowled Rice", 3.99, 1));
        System.out.println("Delivery Order total price: " + withDelivery1.getTotalPrice());
        id ++;
        Order withoutDelivery1 = new RegularOrder(id, "Milly James");
        withoutDelivery1.addItem(new CertainOrderItem("Soup", 2.99, 4));
        withoutDelivery1.addItem(new CertainOrderItem("Sugar", 0.99, 2));
        OrderItem removedItem = new CertainOrderItem("Sugar", 0.99, 1);
        withoutDelivery1.removeItem(removedItem);
        System.out.println("Regular Order items:");
        for (OrderItem item : withoutDelivery1.getItems()) {
            System.out.println(item.getName() + " - " + item.getPrice() + " - " + item.getQuantity());
        }
        System.out.println("Regular Order total price: " + withoutDelivery1.getTotalPrice());
    }
}