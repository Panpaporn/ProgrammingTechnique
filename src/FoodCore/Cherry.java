package src.FoodCore;

public class Cherry extends Food{
    //abstactmethod
    public Cherry() {
        //super ใช้เรียก method ที่สืบทอดมาจากคลาส food
        super("Cherry", 20);
        System.out.println("create ch");
    }
}
