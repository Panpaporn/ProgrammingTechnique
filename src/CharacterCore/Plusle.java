package src.CharacterCore;

public class Plusle extends Pokemon{
    public Plusle(String name){
        super(name);
        hp = (int)(Math.random()*700);
        max_hp = hp;
    }
    public void attack(Pokemon enemy){
        System.out.println("src.character.Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(20);
    }
}