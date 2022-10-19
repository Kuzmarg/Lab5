package flowerStore;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Flower {
    private int sepalLength;
    private int price;
    private FlowerColor color;

    public String getColor() {
        return color.toString();
    }
}
