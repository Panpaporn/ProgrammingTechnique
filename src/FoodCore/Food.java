package src.FoodCore;

public abstract class Food {
    protected String name;
    protected int value;

    //method
    public Food(String name, int value){
        //  thisใช้เรียกตัวแปรของเราเอง
        this.name = name;
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}
