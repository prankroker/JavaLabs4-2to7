# JavaLab7

# Електронна Комерція

Це спрощена реалізація бекенду для електронної комерції на Java, яка фокусується на управлінні запасами, корзинами користувачів та обробці замовлень.

## Вступ

Цей проект - реалізація бекенду для електронної комерційної платформи на Java. Він включає класи для управління товарами, користувачами та замовленнями. Мета - надати основу для розуміння та впровадження основних концепцій об'єктно-орієнтованого програмування та колекцій Java.

## Класи

### Product (Товар)

- Поля: id (Integer), name (String), price (double), stock (int)
- Методи: Конструктори, гетери, сетери, compareTo (для сортування), додаткові методи

### User (Користувач)

- Поля: id (Integer), username (String), cart (Map<Product, Integer>), orders (List<Order>)
- Методи: Конструктори, гетери, сетери, addToCart, removeFromCart, додаткові методи

### Order (Замовлення)

- Поля: id (Integer), userId (Integer), orderDetails (Map<Product, Integer>), totalPrice (double)
- Методи: Конструктори, гетери, сетери, addProductToOrder, calculateTotalPrice, додаткові методи

### ECommercePlatform (Платформа Електронної Комерції)

- Поля: users (Map<Integer, User>), products (Map<Integer, Product>), orders (Map<Integer, Order>)
- Методи: addUser, addProduct, createOrder, displayAvailableProducts, displayUsers, displayOrders, додаткові методи

### ECommerceDemo (Демонстрація Електронної Комерції)

- Головний клас для демонстрації функціональності електронної комерційної платформи.

## Симуляція

Клас `ECommerceDemo` симулює взаємодію з платформою електронної комерції, включаючи дії користувачів, управління корзинами, обробку замовлень та демонстрацію розширених функцій.
