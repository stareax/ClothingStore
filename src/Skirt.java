public class Skirt extends Clothes implements WomanClothes {
    public Skirt(Sizes size, String color, Integer price) {
        super(size, color, price);
    }

    @Override
    public Boolean suitWomen(Human human) {
        return human.getSize().equals(this.getSize()) && human.getMoneyAmount() >= this.getPrice();
    }

    @Override
    public String toString() {
        return "Юбка " + super.toString();
    }
}
