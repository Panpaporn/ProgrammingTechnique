package src.Core;

import src.CharacterCore.*;
import src.FoodCore.*;

import java.util.ArrayList;

public class Player {

    private String name;
    private String sex;
    private String pic;
    private ArrayList<Pokemon> bag = new ArrayList<Pokemon>();
    private Food st;
    private Food ch;
    private Food gr;
    private Pokemon wild;

    // initial method
    public Player(String name, String sex){
        this.name = name;
        this.sex = sex;
        this.pic = "src/images/trainer/"+sex+"1.gif";
        Pokemon p = random();
        bag.add(p);
        st = new Strawberry();
        ch = new Cherry();
        gr = new Grape();
        System.out.println("add complete for "+this.name);
    }

    // get methods
    public String getName(){
        return name;
    }
    public String getSex(){
        return sex;
    }
    public String getPath(){
        return pic;
    }
    public Pokemon getPokemon(int index){
        Pokemon p = bag.get(index);
        System.out.println("request "+p.getName()+" detail index= "+index);
        return p;
    }
    public Pokemon getWild(){
        return wild;
    }
    public int getBagSize(){
        return bag.size();
    }
    public int getFood(int n){
        if(n==1){
            return st.getValue();
        }else if(n==2){
            return ch.getValue();
        }else if(n==3){
            return gr.getValue();
        }else return 0;
    }

    // modify methods
    public void setName(String name){
        this.name = name;
    }
    public void setSex(String sex){
        this.sex = sex;
        this.pic = "images/trainer/"+sex+".gif";
    }
    public void addRandomPokemon(){
        Pokemon p = random();
        bag.add(p);
    }
    public void addPokemon(Pokemon p){
        bag.add(p);
    }
    public void setPokemon(int index, Pokemon p){
        bag.remove(index);
        bag.add(index, p);
    }
    public void dropPokemon(int index){
        bag.remove(index);
    }
    public void initWild(){
        wild = random();
        System.out.println("init wild");
    }
    public boolean setWild(Pokemon p){
        if(p.getHP()>0){
            wild = p;
            return false;
        }else{
            wild = random();
            return true;
        }
    }

    public Pokemon random(){
        int type =(int)(Math.random()*10);
        System.out.println(type);
        if(type == 0)
            return new Pikachu("Pikachu");
        else if(type == 1)
            return new Kabigon("Kabigon");
        else if(type == 2)
            return new Rokon("Rokon");
        else if(type == 3)
            return new Purin("Purin");
        else if(type == 4)
            return new Ponyta("Ponyta");
        else if(type == 5)
            return new Eevee("Eevee");
        else if(type == 6)
            return new Himeguma("Himeguma");
        else if(type == 7)
            return new Achamo("Achamo");
        else if(type == 8)
            return new Plusle("Plusle");
        else if(type == 9)
            return new Pochama("Pochama");
        return null;
    }
}
