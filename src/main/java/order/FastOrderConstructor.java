package order;

import com.sun.org.apache.xpath.internal.operations.Or;
import delivery.Delivery;
import delivery.PostDeliveryStrategy;
import flowerstore.*;
import payment.CreditCardPaymentStrategy;
import payment.Payment;

import java.util.LinkedList;

public enum FastOrderConstructor {
    ROSE_BUCKET(FlowerType.ROSE), TULIP_BUCKET(FlowerType.TULIP), CHAMOMILE_BUCKET(FlowerType.CHAMOMILE);

    private final FlowerType flowerType;

    FastOrderConstructor(FlowerType flowerType) {
        this.flowerType = flowerType;
    }

    public FlowerType getFlowerType() {
        return flowerType;
    }

    public static Order createOrder(FastOrderConstructor bucketType, int flowersNum) {
        Flower flower = new Flower(bucketType.flowerType);
        FlowerPack flowerPack = new FlowerPack();
        flowerPack.setFlower(flower);
        flowerPack.setAmount(flowersNum);
        FlowerBucket flowerBucket = new FlowerBucket();
        flowerBucket.addFlowerPack(flowerPack);
        Delivery delivery = new PostDeliveryStrategy();
        Payment payment = new CreditCardPaymentStrategy();
        Order order = new Order(new LinkedList(), payment, delivery);
        order.addItem(flowerBucket);
        return order;
    }
}
