package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FlowerBucketTest {
    private static final int CHECKPRICE = 10;
    private static final int CHECKTOTALPRICE = 100;
    private FlowerBucket flowerBucket;
    @BeforeEach
    public void init() {
        Flower flower = new Rose();
        flower.setPrice(CHECKPRICE);
        FlowerPack flowerPack = new FlowerPack(flower, CHECKPRICE);
        flowerBucket = new FlowerBucket();
        flowerBucket.add(flowerPack);
    }

    @Test
    public void testPrice() {
        Assertions.assertEquals(CHECKTOTALPRICE, flowerBucket.getPrice());
    }

}
