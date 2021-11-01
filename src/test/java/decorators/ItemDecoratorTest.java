package decorators;

import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemDecoratorTest {
    Flower flower = new Flower(FlowerType.ROSE);
    ItemDecorator paper;
    ItemDecorator ribbon;
    ItemDecorator basket;

    @BeforeEach
    void setUp() {
        flower.setPrice(10);
        paper = new PaperDecorator(flower);
        ribbon = new RibbonDecorator(flower);
        basket = new BasketDecorator(flower);
    }

    @Test
    void getPrice() {
        assertEquals(23, paper.getPrice());
        assertEquals(14, basket.getPrice());
        assertEquals(50, ribbon.getPrice());
    }
}