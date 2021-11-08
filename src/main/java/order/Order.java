package order;

import delivery.Delivery;
import flowerstore.Item;
import payment.Payment;
import user.User;

import java.util.LinkedList;
import java.util.List;

public class Order {
    LinkedList<Item> items = new LinkedList<>();
    Payment payment;
    Delivery delivery;
    List<User> users;

    public Order(LinkedList<Item> items, Payment payment, Delivery delivery) {
        this.items = items;
        this.payment = payment;
        this.delivery = delivery;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void setDeliveryStrategy(Delivery delivery){
        this.delivery = delivery;
    }

    public void setPaymentStrategy(Payment payment){
        this.payment = payment;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    private void notifyUsers(String status) {
        for (User user : users) {
            user.update(status);
        }
    }

    public void order(String status) {
        notifyUsers(status);
    }
}
