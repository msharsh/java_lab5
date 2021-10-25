package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    Store store;

    @BeforeEach
    void setUp() {
        store = new Store();

        Flower flower1 = new Flower(FlowerType.ROSE);
        flower1.setPrice(10);
        Flower flower2 = new Flower(FlowerType.CHAMOMILE);
        flower2.setPrice(20);

        FlowerPack flowerPack1 = new FlowerPack();
        flowerPack1.setFlower(flower1);
        flowerPack1.setAmount(1);
        FlowerPack flowerPack2 = new FlowerPack();
        flowerPack2.setFlower(flower2);
        flowerPack2.setAmount(3);

        FlowerBucket flowerBucket1 = new FlowerBucket();
        flowerBucket1.addFlowerPack(flowerPack1);
        FlowerBucket flowerBucket2 = new FlowerBucket();
        flowerBucket2.addFlowerPack(flowerPack2);

        store.addFlowerBucket(flowerBucket1);
        store.addFlowerBucket(flowerBucket2);
    }

    @Test
    void searchMostExpensive() {
        assertEquals(1, store.searchMostExpensive());
    }
}