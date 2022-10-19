package flowerstore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor @Getter @Setter
public class FlowerPack {
    private Flower flower;
    private int amount;

    public int getPrice() {
        return amount*flower.getPrice();
    }
}
