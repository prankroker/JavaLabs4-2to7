package org.example;
import java.util.*;

class ECommerceDemo {
    public static void main(String[] args) {
        // Ініціалізація та демонстрація функціональності
        ECommercePlatform platform = new ECommercePlatform();

        // Додавання користувачів, товарів і інше
        User user1 = new User(1, "user1");
        User user2 = new User(2, "user2");

        Product product1 = new Product(1, "Laptop", 999.99, 10);
        Product product2 = new Product(2, "Phone", 499.99, 20);

        platform.addUser(user1);
        platform.addUser(user2);

        platform.addProduct(product1);
        platform.addProduct(product2);

        user1.addToCart(product1, 2);
        user2.addToCart(product2, 1);

        platform.createOrder(user1);
        platform.createOrder(user2);

        // Симуляція виведення відсортованих списків товарів
        System.out.println("Відсортований список товарів за назвою:");
        displaySortedProducts(platform.getProducts().values(), new ProductNameComparator());

        System.out.println("\nВідсортований список товарів за запасами:");
        displaySortedProducts(platform.getProducts().values(), new ProductStockComparator());

        // Симуляція взаємодії користувачів, кошиків та замовлень
        displayPlatformStatus(platform);
    }

    // Метод для виведення відсортованого списку товарів
    private static void displaySortedProducts(Iterable<Product> products, Comparator<Product> comparator) {
        List<Product> sortedProducts = new ArrayList<>();
        for (Product product : products) {
            sortedProducts.add(product);
        }

        Collections.sort(sortedProducts, comparator);

        for (Product product : sortedProducts) {
            System.out.println(product);
        }
    }

    // Метод для виведення інформації про платформу
    private static void displayPlatformStatus(ECommercePlatform platform) {
        System.out.println("\nСтатус платформи:");

        System.out.println("\nСписок користувачів:");
        platform.displayUsers();

        System.out.println("\nСписок доступних товарів:");
        platform.displayAvailableProducts();

        System.out.println("\nСписок замовлень:");
        platform.displayOrders();
    }
}

