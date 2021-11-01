package delivery;

import flowerstore.Item;

import java.util.LinkedList;

public class PostDeliveryStrategy implements Delivery{
    @Override
    public boolean deliver(LinkedList<Item> items) {
        System.out.println("Delivering " + items + " with post office delivery.");
        return true;
    }
}
