package orderSystem;

public class CertainOrderItem implements OrderItem {
    private String name;
    private double price;
    private int quantity;

    public CertainOrderItem(String  name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CertainOrderItem other = (CertainOrderItem) obj;
        return name.equals(other.name) && price == other.price && quantity == other.quantity;
    }
}
