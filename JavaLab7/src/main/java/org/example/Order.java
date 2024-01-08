package org.example;
import java.util.*;

class Order {
    private Integer id;
    private Integer userId;
    private Map<Product, Integer> orderDetails;
    private double totalPrice;

    // Конструктор, гетери, сетери та метод
    public Order(Integer id, Integer userId) {
        this.id = id;
        this.userId = userId;
        this.orderDetails = new HashMap<>();
        this.totalPrice = 0.0;
    }

    // Гетери та сетери для полів
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Map<Product, Integer> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(Map<Product, Integer> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    // Логіка додавання товарів до замовлення
    public void addProductToOrder(Product product, int quantity) {
        if (quantity <= 0) {
            System.out.println("Невірна кількість товарів. Введіть коректну кількість.");
            return;
        }

        if (product.getStock() < quantity) {
            System.out.println("На жаль, недостатньо товару на складі.");
            return;
        }

        orderDetails.put(product, orderDetails.getOrDefault(product, 0) + quantity);
        product.setStock(product.getStock() - quantity);

        System.out.println("Товар додано до замовлення: " + product.getName() + " (Кількість: " + quantity + ")");
    }

    // Логіка розрахунку загальної вартості замовлення
    public void calculateTotalPrice() {
        totalPrice = orderDetails.entrySet().stream()
                .mapToDouble(entry -> entry.getKey().getPrice() * entry.getValue())
                .sum();

        System.out.println("Загальна вартість замовлення: " + totalPrice);
    }

    @Override
    public String toString() {
        return "Order{id=" + id + ", userId=" + userId + ", orderDetails=" + orderDetails + ", totalPrice=" + totalPrice + '}';
    }
}

