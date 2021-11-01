package decorators;

import flowerstore.Item;

public abstract class ItemDecorator extends Item {
    public abstract String getDescription();
    public abstract double getPrice();
}
