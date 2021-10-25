package flowerstore;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(50);
        flower.setSepalLength(20.5);
        int[] color = {125, 0, 0};
        flower.setColor(color);
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(50, flower.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getSepalLength() {
        assertEquals(20.5, flower.getSepalLength());
    }

    @org.junit.jupiter.api.Test
    void getColor() {
        int[] color = {125, 0, 0};
        assertArrayEquals(color, flower.getColor());
    }

    @org.junit.jupiter.api.Test
    void getFlowerType() {
        assertEquals(FlowerType.ROSE, flower.getFlowerType());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        assertEquals("Flower(price=50.0, sepalLength=20.5, color=[125, 0, 0], flowerType=ROSE)", flower.toString());
    }
}