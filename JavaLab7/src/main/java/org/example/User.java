package org.example;
import java.util.*;

class User {
    private Integer id;
    private String username;
    private Map<Product, Integer> cart;
    private List<Order> orders;

    // Конструктор, гетери, сетери та інші методи
    public User(Integer id, String username) {
        this.id = id;
        this.username = username;
        this.cart = new HashMap<>();
    }

    // Гетери та сетери для полів
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Map<Product, Integer> getCart() {
        return cart;
    }

    public void setCart(Map<Product, Integer> cart) {
        this.cart = cart;
    }

    // Логіка додавання товарів до кошика
    public void addToCart(Product product, int quantity) {
        if (quantity <= 0) {
            System.out.println("Невірна кількість товарів. Введіть коректну кількість.");
            return;
        }

        if (product.getStock() < quantity) {
            System.out.println("На жаль, недостатньо товару на складі.");
            return;
        }

        cart.put(product, cart.getOrDefault(product, 0) + quantity);
        product.setStock(product.getStock() - quantity);

        System.out.println("Товар додано до кошика: " + product.getName() + " (Кількість: " + quantity + ")");
    }

    // Логіка видалення товарів з кошика
    public void removeFromCart(Product product) {
        if (cart.containsKey(product)) {
            int quantity = cart.get(product);
            cart.remove(product);
            product.setStock(product.getStock() + quantity);

            System.out.println("Товар видалено з кошика: " + product.getName() + " (Кількість: " + quantity + ")");
        } else {
            System.out.println("Товар не знайдено в кошику.");
        }
    }

    public List<Order> getOrders() {
        if (orders == null) {
            orders = new ArrayList<>();
        }
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
    public void addOrder(Order order) {
        if (orders == null) {
            orders = new ArrayList<>();
        }
        orders.add(order);
    }
    @Override
    public String toString() {
        return "User{id=" + id + ", username='" + username + "', cart=" + cart + '}';
    }
}
