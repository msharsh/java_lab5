package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private FlowerPack flowerPack;

    @BeforeEach
    void setUp() {
        Flower flower = new Flower(FlowerType.CHAMOMILE);
        flowerPack = new FlowerPack();
        flower.setPrice(10);
        flowerPack.setFlower(flower);
        flowerPack.setAmount(4);
    }

    @Test
    void getPrice() {
        assertEquals(40, flowerPack.getPrice());
    }
}