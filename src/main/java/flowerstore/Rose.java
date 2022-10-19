package flowerstore;

public class Rose extends Flower {
    public static final int ROSEPRICE = 25;
    public static final int ROSESEPALLENGTH = 1;
    public Rose() {
        setColor(FlowerColor.RED);
        setPrice(ROSEPRICE);
        setSepalLength(ROSESEPALLENGTH);
    }
}
