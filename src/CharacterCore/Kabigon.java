package src.CharacterCore;

public class Kabigon extends Pokemon {
    public Kabigon(String name){
        super(name);
        hp = (int)(Math.random()*1000);
        max_hp = hp;
    }
    public void attack(Pokemon enemy){
        System.out.println("src.character.Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(30);
    }
}