public enum Sizes {
    XXS(32, "Детский размер"),
    XS(34, "Подростковый размер"),
    S(36, "Маленький размер"),
    M(38, "Средний размер"),
    L(40, "Большой размер"),
    XL(42, "Размер для жирных");

    private Integer euroSize;
    private String description;

    Sizes(Integer euroSize, String description) {
        this.euroSize = euroSize;
        this.description = description;
    }

    public Integer getEuroSize() {
        return euroSize;
    }

    public String getDescription() {
        return description;
    }

    public Data getData(){
        Data data = new Data();
        data.euroSize = this.euroSize;
        data.description = this.description;
        return data;
    }

    public class Data {
        Integer euroSize;
        String description;
    }
}
