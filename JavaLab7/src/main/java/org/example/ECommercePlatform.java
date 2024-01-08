package org.example;
import java.util.*;

class ECommercePlatform {
    private Map<Integer, User> users;
    private Map<Integer, Product> products;
    private Map<Integer, Order> orders;

    // Конструктор
    public ECommercePlatform() {
        this.users = new HashMap<>();
        this.products = new HashMap<>();
        this.orders = new HashMap<>();
    }

    // Гетери та сетери
    public Map<Integer, User> getUsers() {
        return users;
    }

    public void setUsers(Map<Integer, User> users) {
        this.users = users;
    }

    public Map<Integer, Product> getProducts() {
        return products;
    }

    public void setProducts(Map<Integer, Product> products) {
        this.products = products;
    }

    public Map<Integer, Order> getOrders() {
        return orders;
    }

    public void setOrders(Map<Integer, Order> orders) {
        this.orders = orders;
    }

    // Методи для додавання користувачів, товарів, створення замовлення та інші функціональності
    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    public void addProduct(Product product) {
        products.put(product.getId(), product);
    }

    public void createOrder(User user) {
        // Генерація нового ідентифікатора для замовлення
        int orderId = orders.size() + 1;

        // Створення нового замовлення та додавання його до платформи
        Order order = new Order(orderId, user.getId());
        orders.put(orderId, order);

        // Додавання замовлення користувачу
        user.getOrders().add(order);
    }

    public void displayAvailableProducts() {
        System.out.println("Доступні товари:");

        for (Product product : products.values()) {
            System.out.println(product);
        }
    }

    public void displayUsers() {
        System.out.println("Користувачі:");

        for (User user : users.values()) {
            System.out.println(user);
        }
    }

    public void displayOrders() {
        System.out.println("Замовлення:");

        for (Order order : orders.values()) {
            System.out.println(order);
        }
    }
}

