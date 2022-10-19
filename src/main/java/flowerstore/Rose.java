package flowerstore;

public class Rose extends Flower {
    public static final int rosePrice = 25;
    public static final int roseSepalLength = 1;
    public Rose() {
        setColor(FlowerColor.RED);
        setPrice(rosePrice);
        setSepalLength(roseSepalLength);
    }
}
