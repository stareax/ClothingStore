public class Trousers extends Clothes implements WomanClothes, ManClothes{

    public Trousers(Sizes size, String color, Integer price) {
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
        return "Штаны " + super.toString();
    }
}
