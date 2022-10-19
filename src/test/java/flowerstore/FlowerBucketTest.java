package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FlowerBucketTest {
    private FlowerBucket flowerBucket;
    private static final int checkPrice = 10;
    private static final int checkTotalPrice = 100;
    @BeforeEach
    public void init() {
        Flower flower = new Rose();
        flower.setPrice(checkPrice);
        FlowerPack flowerPack = new FlowerPack(flower, checkPrice);
        flowerBucket = new FlowerBucket();
        flowerBucket.add(flowerPack);
    }

    @Test
    public void testPrice() {
        Assertions.assertEquals(checkTotalPrice, flowerBucket.getPrice());
    }

}
