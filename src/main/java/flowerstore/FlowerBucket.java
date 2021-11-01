package flowerstore;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter @Getter
public class FlowerBucket extends Item{
    List<FlowerPack> flowerPacks = new ArrayList<>();

    @Override
    public String getDescription() {
        String line = "Bucket with following packs:\n";
        for (FlowerPack flowerPack: flowerPacks) {
            line += "   " + flowerPack.getDescription() + "\n";
        }
        return line;
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }
}
