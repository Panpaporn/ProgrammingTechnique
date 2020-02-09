import java.io.*;
import java.util.*;


public class PokemonGame{
        public static void main(String args[])
        {
            System.out.println("Game started!");
            Pokemon sth  = new Pokemon("sth");
            while(true) {
                System.out.println(sth.getDetails());
                sth.recieveExp(5);
                wait(1000);
            }
        }
}