package flowerstore;

public class Chamomile extends Flower {
    public static final int chamomilePrice = 20;
    public static final int chamomileSepalLength = 3;
    public Chamomile() {
        setColor(FlowerColor.WHITE);
        setPrice(chamomilePrice);
        setSepalLength(chamomileSepalLength);
    }
}
