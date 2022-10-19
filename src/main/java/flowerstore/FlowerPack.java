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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlowerPack that = (FlowerPack) o;
        Flower firstFlower = getFlower();
        Flower secondFlower = that.getFlower();
        return (firstFlower.getSepalLength() == secondFlower.getSepalLength()
                && firstFlower.getColor().equals(secondFlower.getColor())
                && firstFlower.getPrice() == secondFlower.getPrice());
    }
}
