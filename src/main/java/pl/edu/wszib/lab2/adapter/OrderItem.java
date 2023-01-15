package pl.edu.wszib.lab2.adapter;

import java.math.BigDecimal;

public class OrderItem {
    public final String productId;
    public final BigDecimal quantity;
    public final BigDecimal price;

    public OrderItem(String productId, BigDecimal quantity, BigDecimal price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "productId='" + productId + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
