package src.CharacterCore;

public class Eevee extends Pokemon{
    public Eevee(String name){
        super(name);
        hp = (int)(Math.random()*1300);
        max_hp = hp;
    }
    public void attack(Pokemon enemy){
        System.out.println("src.character.Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(85);
    }
}