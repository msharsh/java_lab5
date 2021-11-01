package delivery;

import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryTest {
    private Delivery postDelivery;
    private Delivery DHLDelivery;

    @BeforeEach
    void setUp() {
        postDelivery = new PostDeliveryStrategy();
        DHLDelivery = new DHLDeliveryStrategy();
    }

    @Test
    void deliver() {
        LinkedList<Item> items = new LinkedList<>();
        Flower flower = new Flower(FlowerType.ROSE);
        items.add(flower);
        assertTrue(postDelivery.deliver(items));
        assertTrue(DHLDelivery.deliver(items));
    }
}