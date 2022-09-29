import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Clothes> clothes = new ArrayList<>();
        clothes.add(new Tshirt(Sizes.S, "Оранжевый", 200));
        clothes.add(new Tshirt(Sizes.L, "Белая", 300));
        clothes.add(new Tshirt(Sizes.M, "Коричневая", 300));
        clothes.add(new Skirt(Sizes.S, "Розовая", 500));
        clothes.add(new Trousers(Sizes.S, "Черные", 1000));
        clothes.add(new Trousers(Sizes.L,  "Черные", 1500));

        Man dima = new Man("Дима", Sizes.L, 1000);
        Woman tanya = new Woman("Таня", Sizes.XL, 40);

        Shop hm = new Shop();
        System.out.println(hm.suitHuman(dima, clothes).toString());
        System.out.println(hm.suitHuman(tanya, clothes).toString());


    }
}
