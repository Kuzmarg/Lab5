package flowerstore;

public class Tulip extends Flower {
    public static final int tulipPrice = 30;
    public static final int tulipSepalLength = 2;
    public Tulip() {
        setSepalLength(tulipSepalLength);
        setPrice(tulipPrice);
        setColor(FlowerColor.BLUE);
    }
}
