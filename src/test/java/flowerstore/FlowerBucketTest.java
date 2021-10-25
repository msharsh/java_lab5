package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    private FlowerBucket flowerBucket;

    @BeforeEach
    void setUp() {
        flowerBucket = new FlowerBucket();
        Flower flowerR = new Flower(FlowerType.ROSE);
        flowerR.setPrice(10);
        Flower flowerC = new Flower(FlowerType.CHAMOMILE);
        flowerC.setPrice(20);
        Flower flowerT = new Flower(FlowerType.TULIP);
        flowerT.setPrice(30);

        FlowerPack flowerPackR = new FlowerPack();
        flowerPackR.setFlower(flowerR);
        flowerPackR.setAmount(1);
        FlowerPack flowerPackC = new FlowerPack();
        flowerPackC.setFlower(flowerC);
        flowerPackC.setAmount(2);
        FlowerPack flowerPackT = new FlowerPack();
        flowerPackT.setFlower(flowerT);
        flowerPackT.setAmount(3);

        flowerBucket.addFlowerPack(flowerPackR);
        flowerBucket.addFlowerPack(flowerPackC);
        flowerBucket.addFlowerPack(flowerPackT);
    }

    @Test
    void getPrice() {
        assertEquals(140, flowerBucket.getPrice());
    }
}