package flowerstore;

public class Tulip extends Flower {
    public static final int TULIPPRICE = 30;
    public static final int TULIPSEPALLENGTH = 2;
    public Tulip() {
        setSepalLength(TULIPSEPALLENGTH);
        setPrice(TULIPPRICE);
        setColor(FlowerColor.BLUE);
    }
}
