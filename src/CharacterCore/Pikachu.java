package src.CharacterCore;

public class Pikachu extends Pokemon{
    public Pikachu(String name){
        super(name);
        hp = (int)(Math.random()*100);
        max_hp = hp;
    }
    public void attack(Pokemon enemy){
        System.out.println("src.character.Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(10);
    }
}