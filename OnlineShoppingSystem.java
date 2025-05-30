class User {
    String username;
    String password;
    Cart cart;

    void login() {}
    void logout() {}
}

class Product {
    String productID;
    String name;
    double price;
    int stock;

    void updateStock(int quantity) {}
    void applyDiscount(double percentage) {}
}

class Order {
    String orderID;
    User user;
    List<Product> productList;
    String status;

    void placeOrder() {}
    void cancelOrder() {}
}

class Cart {
    List<Product> items;
    double total;

    void addItem(Product product) {}
    void removeItem(Product product) {}
    void checkout() {}
}