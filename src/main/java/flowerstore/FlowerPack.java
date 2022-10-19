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
    public boolean equals(FlowerPack flowerPack) {
        Flower firstFlower = this.getFlower();
        Flower secondFlower = flowerPack.getFlower();
        return (firstFlower.getSepalLength() == secondFlower.getSepalLength() &&
                firstFlower.getColor().equals(secondFlower.getColor()) &&
                firstFlower.getPrice() == secondFlower.getPrice());

    }
}
