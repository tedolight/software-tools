import java.util.Date;
import java.util.List;
import java.time.LocalDateTime;

/**
 * @author PRECISION
 * @version 1.0
 * @created 5-May-2025
 */
public class FoodDeliverySystem {
    
    // ===================== Customer =====================
    public class Customer {
        public String username;
        public int phoneNumber;
        public String email;
        public String address;

        public void login() {}
        public void logout() {}
        public void browseRestaurant() {}
        public void resetPassword() {}
        public void register() {}
        public void viewOrderHistory() {}
        public void rateFood() {}
        public void placeOrder() {}
        public void trackDelivery() {}
    }

    // ===================== Order =====================
    public class Order {
        public int orderId;
        public String customerName;
        public List<MenuItem> items;
        public LocalDateTime orderTime;
        public double totalAmount;

        public void addItem(MenuItem item) {}
        public void removeItem(MenuItem item) {}
        public double calculateTotal() { return 0.0; }
        public String getOrderDetails() { return ""; }
        public boolean isCompleted() { return false; }
    }

    // ===================== Payment =====================
    public class Payment {
        public int paymentId;
        public double amountPaid;
        public String paymentMethod;
        public String paymentStatus;
        public LocalDateTime paymentDate;

        public boolean makePayment(String method, double amount) { return true; }
        public String getPaymentStatus() { return ""; }
        public boolean refund() { return false; }
        public void printReceipt() {}
    }

    // ===================== Delivery =====================
    public class Delivery {
        public int id;
        public String name;
        public Date date;
        public String address;

        public void viewDeliveryAssignments() {}
        public void updateDeliveryStatus() {}
        public void navigateToLocation() {}
        public void markOrderDelivered() {}
        public void notifyCompletion() {}
        public void login() {}
        public void logout() {}
    }

    // ===================== Admin =====================
    public class Admin {
        private int adminId;
        private int role;
        public String adminName;
        private String password;

        public void assignRole() {}
        public void viewReport() {}
        public void manageRestaurantData() {}
        public void manageUser() {}
        public void login() {}
        public void logout() {}
    }

    // ===================== Restaurant =====================
    public class Restaurant {
        public int restaurantId;
        public String name;
        public String location;

        public void manageMenu() {}
        public void confirmOrder() {}
        public void viewOrder() {}
        public void updateOrderStatus() {}
        public void manageProfile() {}
        public void login() {}
        public void logout() {}
    }

    // ===================== Menu =====================
    public class Menu {
        public int id;
        public String name;
        public String description;
        public double price;

        public void addItem(MenuItem item) {}
        public void removeItem(MenuItem item) {}
        public void updateItem(MenuItem item) {}
    }

    // ===================== MenuItem =====================
    public class MenuItem {
        public String name;
        public double price;
        public String description;
        public int itemId;

        public String getDetails() { return ""; }
        public void updatePrice(double newPrice) {}
        public void changeDescription(String desc) {}
        public void toggleAvailability() {}
    }

    // ===================== OrderItem =====================
    public class OrderItem {
        public int orderItemId;
        public MenuItem menuItem;
        public int quantity;
        public double price;
        public double subtotal;

        public double calculateSubTotal() { return 0.0; }
        public void updateQuantity(int newQuantity) {}
        public String getDetails() { return ""; }
    }

    // ===================== Rating =====================
    public class Rating {
        public int ratingId;
        public Customer customer;
        public Restaurant restaurant;
        public Order order;
        public int score;
        public String comment;
        public Date date;

        public void submitRating() {}
        public void editRating(int newScore, String newComment) {}
    }
}
