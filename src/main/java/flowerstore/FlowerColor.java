package flowerstore;

public enum FlowerColor {
    RED, GREEN, BLUE, WHITE;

    @Override
    public String toString() {
        if (this.equals(FlowerColor.WHITE)) {
            return "#FFFFFF";
        }

        if (this.equals(FlowerColor.RED)) {
            return "#FF0000";
        }

        if (this.equals(FlowerColor.GREEN)) {
            return "#00FF00";
        }

        return "#0000FF";
    }
}
