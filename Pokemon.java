import java.io.*;
import java.lang.Math;

public class Pokemon
{
    private String Name;
    private int HP;
    private int ATK;
    private int DEF;
    private int Level;
    private int Exp;
    private int levelUpExp;
    private int leastHP = 10;
    private int leastATK = 5;
    private int leastDEF = 3;

    public Pokemon(String name)
    {
        Name = name;
        Level = 1;
        Exp = 0;
        levelUpExp = 5;
        HP = (int)(Math.random() * 12) + leastHP;
        ATK = (int)Math.random() + leastATK;
        DEF = (int)(Math.random() * 10) + leastDEF;
    }

    public String getDetails()
    {
        private String  respond =   "----------Pokemon Details----------\n" +
                                    "Name : " + Name +
                                    "\nLevel : " + Level + "\tExp : " + Exp + "/" + levelUpExp +
                                    "\nHP : " + HP +
                                    "\nATK : " + ATK +
                                    "\nDEF : " + DEF +
                                    "\n---------------------------------";
        return respond;
    }


    public void RecieveXP(int RecievedXP)
    {
        Exp += RecievedXP;
        if (Exp >= levelUpExp) {
            Exp = Exp % levelUpExp;
            LevelUp();
        }
    }

    public void LevelUp()
    {
        Level++;
        levelUpExp += 5;
        statusUp();
        System.out.println("Level up!");
    }

}