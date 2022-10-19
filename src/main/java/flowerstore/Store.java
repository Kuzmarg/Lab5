package flowerstore;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Store {
    private List<FlowerBucket> flowerBuckets;

    public List<FlowerBucket> search(FlowerSpec searchRequest) {
        List matchingBuckets = new ArrayList<>();
        for (FlowerBucket flowerBucket : flowerBuckets) {
            FlowerSpec checkedSpec = flowerBucket.getSpec();
            if (checkedSpec.getPrice() != searchRequest.getPrice()) {
                continue;
            }
            boolean areMatching = false;
            for (FlowerPack flowerPack : checkedSpec.getFlowerPackList()) {
                for (FlowerPack searchedPack
                        : searchRequest.getFlowerPackList()) {
                    if (flowerPack.equals(searchedPack)) {
                        areMatching = true;
                    }
                }
            }
            if (areMatching) {
                matchingBuckets.add(flowerBucket);
            }
        }
        return matchingBuckets;
    }
}

