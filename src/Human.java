public abstract class Human {
    private String name;
    private Sizes size;
    private Integer moneyAmount;

    public Human(String name, Sizes size, Integer moneyAmount) {
        this.name = name;
        this.size = size;
        this.moneyAmount = moneyAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public Integer getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(Integer moneyAmount) {
        this.moneyAmount = moneyAmount;
    }


}
