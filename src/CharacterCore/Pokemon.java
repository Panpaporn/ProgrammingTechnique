package src.CharacterCore;

public abstract class Pokemon {
    //method
    protected String name;
    protected String type;
    protected int hp;
    protected int max_hp;
    protected int atk;
    protected int def;
    protected String path;
    public Pokemon(String name){
        this.name = name;
        this.hp = 0;
        path = "src/images/character/"+name+".gif";
    }
    public String getName(){
        return name;
    }
    public String getType() {
        return type;
    }
    public int getHP(){
        return hp;
    }
    public int getMax_hp(){
        return max_hp;
    }
    public String getPath(){ return path; }
    public void setName(String name){
        this.name = name;
    }
    public void eat(int n){
        if(hp == max_hp)
            hp = max_hp;
        else {
            hp+= n;
            if(hp > max_hp)
                hp = max_hp;

        }

    }

    public boolean damage(int value){
        value -= (value*def/100);
        if(hp == 0){
            return false;
        }
        int currentHP = hp - value;
        if(currentHP >= 0){
             this.hp = currentHP;
        }
        else{
            this.hp = 0;
        }
        return true;
    }
    public String toString(){
        return name;
    }
}