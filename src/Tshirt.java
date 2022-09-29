public class Tshirt extends Clothes implements ManClothes, WomanClothes{

    public Tshirt(Sizes size, String color, Integer price) {
        super(size, color, price);
    }

    @Override
    public Boolean suitMan(Human human) {
        return human.getSize().equals(this.getSize()) && human.getMoneyAmount() >= this.getPrice();
    }

    @Override
    public Boolean suitWomen(Human human) {
        return human.getSize().equals(this.getSize()) && human.getMoneyAmount() >= this.getPrice();
    }

    @Override
    public String toString() {
        return "Майка " + super.toString();
    }
}
