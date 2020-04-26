package src.CharacterCore;

public class Achamo extends Pokemon {
    public Achamo(String name){
        //super ใช้เรียก method ที่สืบทอดมาจากคลาส Achamo
        super(name);
        hp = (int)(Math.random()*860);
        max_hp = hp;
    }
    public void attack(Pokemon enemy){
        System.out.println("src.character.Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(35);
    }
}