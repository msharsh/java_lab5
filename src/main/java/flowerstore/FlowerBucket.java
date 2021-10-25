package flowerstore;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();

    public double getPrice() {
        double price = 0;
        for (int i = 0; i < flowerPacks.size(); i++) {
            price += flowerPacks.get(i).getPrice();
        }
    }
}
