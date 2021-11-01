package flowerstore;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class FlowerPack extends Item{
    private  Flower flower;
    private int amount;

    @Override
    public String getDescription() {
        return "Pack with flowers of type: " + flower.getFlowerType();
    }

    public double getPrice() {
        return flower.getPrice() * amount;
    }
}
