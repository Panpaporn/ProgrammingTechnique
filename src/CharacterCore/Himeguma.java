package src.CharacterCore;

public class Himeguma extends Pokemon{
    public Himeguma(String name){
        super(name);
        hp = (int)(Math.random()*800);
        max_hp = hp;
    }
    public void attack(Pokemon enemy){
        System.out.println("src.character.Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(40);
    }
}