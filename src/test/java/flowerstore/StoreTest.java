package flowerstore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StoreTest {
    public static final int CHECKEDAMOUNT = 10;
    public static final int CHECKEDPRICE = 250;
    private FlowerBucket flowerBucket;
    private Store store;

    @Test
    public void checkStore() {
        List<FlowerPack> flowerPacks = new ArrayList<>();
        flowerPacks.add(new FlowerPack(new Rose(), CHECKEDAMOUNT));

        flowerBucket = new FlowerBucket();
        flowerBucket.add(new FlowerPack(new Rose(), CHECKEDAMOUNT));
        List<FlowerBucket> flowerBuckets = new ArrayList<>();
        flowerBuckets.add(flowerBucket);

        FlowerSpec searched = new FlowerSpec(flowerPacks, CHECKEDPRICE);
        store = new Store(flowerBuckets);

        Assertions.assertEquals(store.search(searched), flowerBuckets);
    }
}
