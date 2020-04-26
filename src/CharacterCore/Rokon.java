package src.CharacterCore;

public class Rokon extends Pokemon {
    public Rokon(String name){
        super(name);
        hp = (int)(Math.random()*500);
        max_hp = hp;
    }
    public void attack(Pokemon enemy){
        System.out.println("src.character.Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(50);
    }
}