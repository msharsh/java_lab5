import flowerstore.Flower;
import flowerstore.FlowerType;


public class Main {
    public static void main(String[] args) {
        Flower[] flowers = new Flower[3];
        for (int i = 0; i < flowers.length; i++) {
            flowers[i] = new Flower(FlowerType.ROSE);
        }
        flowers[0] = new Flower(FlowerType.ROSE);
        flowers[0].setPrice(50);
        flowers[0].setSepalLength(20.5);
        int[] color = {125, 0, 0};
        flowers[0].setColor(color);
        System.out.println(flowers[0]);
    }
}
