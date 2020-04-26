package src.CharacterCore;

public class Ponyta extends Pokemon{
    public Ponyta(String name){
        super(name);
        hp = (int)(Math.random()*1200);
        max_hp = hp;
    }
    public void attack(Pokemon enemy){
        System.out.println("src.character.Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(75);
    }
}