package flowerstore;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class FlowerTypesTest {
    public static final int ROSEPRICE = 25;
    public static final int ROSESEPALLENGTH = 1;
    public static final int TULIPPRICE = 30;
    public static final int TULIPSEPALLENGTH = 2;
    public static final int CHAMOMILEPRICE = 20;
    public static final int CHAMOMILESEPALLENGTH = 3;
    private Flower flower;

    @Test
    public void roseTest() {
        flower = new Rose();
        Assertions.assertEquals(flower.getColor(), "#FF0000");
        Assertions.assertEquals(flower.getPrice(), ROSEPRICE);
        Assertions.assertEquals(flower.getSepalLength(), ROSESEPALLENGTH);
    }

    @Test
    public void tulipTest() {
        flower = new Tulip();
        Assertions.assertEquals(flower.getColor(), "#0000FF");
        Assertions.assertEquals(flower.getPrice(), TULIPPRICE);
        Assertions.assertEquals(flower.getSepalLength(), TULIPSEPALLENGTH);
    }

    @Test
    public void chamomileTest() {
        flower = new Chamomile();
        Assertions.assertEquals(flower.getColor(), "#FFFFFF");
        Assertions.assertEquals(flower.getPrice(), CHAMOMILEPRICE);
        Assertions.assertEquals(flower.getSepalLength(), CHAMOMILESEPALLENGTH);
    }
}
