package src.CharacterCore;

public class Purin extends Pokemon {
    public Purin(String name){
        super(name);
        hp = (int)(Math.random()*60);
        max_hp = hp;
    }
    public void attack(Pokemon enemy){
        System.out.println("src.character.Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(5);
    }
}