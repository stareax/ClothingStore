import java.util.ArrayList;
import java.util.List;

public class Shop {

    public List<Clothes> suitHuman(Human human, List<Clothes> list){
        System.out.println("Уважаемый/ая, " + human.getName() + ", вам доступен следующий гардероб:\n");
        List<Clothes> reusltList = new ArrayList<>();
        for(Clothes clothes : list){
            if (clothes instanceof ManClothes){
                if (((ManClothes) clothes).suitMan(human)){
                    reusltList.add(clothes);
                }
            }
            if (clothes instanceof WomanClothes){
                if (((WomanClothes) clothes).suitWomen(human)){
                    reusltList.add(clothes);
                }
            }
        }
        return reusltList;
    }

}
