package delivery;

import flowerstore.Item;

import java.util.LinkedList;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public boolean deliver(LinkedList<Item> items) {
        System.out.println("Delivering " + items + " with DHL delivery.");
        return true;
    }
}
