public abstract class Clothes {
    private Sizes size;
    private String color;
    private Integer price;

    public Clothes(Sizes size, String color, Integer price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                "размер=" + size +
                ", цвет='" + color + '\'' +
                ", цена=" + price +
                '}' + "\n";
    }
}
