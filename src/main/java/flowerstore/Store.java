package flowerstore;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter @Getter
public class Store {
    private List<FlowerBucket> flowerBuckets = new ArrayList<>();

    public void addFlowerBucket(FlowerBucket flowerBucket) {
        flowerBuckets.add(flowerBucket);
    }

    public double searchMostExpensive() {
        if (flowerBuckets.size() == 0) {
            return -1;
        }
        double mostExpensive = flowerBuckets.get(0).getPrice();
        int index = 0;
        for (int i = 1; i < flowerBuckets.size(); i++) {
            if (flowerBuckets.get(i).getPrice() > mostExpensive) {
                mostExpensive = flowerBuckets.get(i).getPrice();
                index = i;
            }
        }
        return index;
    }
}
