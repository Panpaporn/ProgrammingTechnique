package src.CharacterCore;

public class Pochama extends Pokemon{
    public Pochama(String name){
        super(name);
        hp = (int)(Math.random()*920);
        def = 10;
        max_hp = hp;
    }
    public void attack(Pokemon enemy){
        System.out.println("src.character.Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(40);
    }
}