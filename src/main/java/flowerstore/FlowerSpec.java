package flowerstore;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor @Getter
public class FlowerSpec {
    private List<FlowerPack> flowerPackList;
    private double price;
}
