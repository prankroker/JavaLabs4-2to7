package org.example;
import java.util.*;

class Product implements Comparable<Product> {
    private Integer id;
    private String name;
    private double price;
    private int stock;
    private List<Order> orders;
    private Map<Product, Integer> cart;

    public Product(Integer id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Map<Product, Integer> getCart() {
        Map<Product, Integer> cart = null;
        return cart;
    }

    public void setCart(Map<Product, Integer> cart) {
        this.cart = cart;
    }

    public List<Order> getOrders() {
        List<Order> orders = null;
        return orders;
    }

    // Setter for the orders field
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', price=" + price + ", stock=" + stock + '}';
    }
}