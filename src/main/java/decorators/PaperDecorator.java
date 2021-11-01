package decorators;

import flowerstore.Item;

public class PaperDecorator extends ItemDecorator{
    private Item item;

    public PaperDecorator(Item item) {
        this.item = item;
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }

    @Override
    public double getPrice() {
        return 13 + item.getPrice();
    }
}
