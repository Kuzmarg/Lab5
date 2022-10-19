package flowerstore;

public class Chamomile extends Flower {
    public static final int CHAMOMILEPRICE = 20;
    public static final int CHAMOMILESEPALLENGTH = 3;
    public Chamomile() {
        setColor(FlowerColor.WHITE);
        setPrice(CHAMOMILEPRICE);
        setSepalLength(CHAMOMILESEPALLENGTH);
    }
}
