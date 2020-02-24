
/**
 * A Game of Hangman Designed for Use with the Mt. Cleverest Bot!
 *
 * Hunter Stewart
 * 1.0
 */

import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class Hangman
{
    public Hangman(){
    }
    public void startGame()throws IOException{
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;
    int count5 = 0;
    int it = 0;
    String guess;
        
    Scanner scanboi = new Scanner(System.in);
    Random randy = new Random();
        
    Scanner reader = new Scanner(new File("texts/keys/keys.txt"));
    Scanner readerTwo = new Scanner(new File("texts/keys/keys.txt")); 
    int arrayCount = 0;
    
    while(reader.hasNext()){
        reader.nextLine();
        arrayCount++;
    }   
    String[] key = new String[arrayCount];
    int count = 0;
    while (readerTwo.hasNext()){
        String stringuno = readerTwo.nextLine();
        key[count] = stringuno;
        count++;
    }
    
    int rand = randy.nextInt(count); 
    
    String word = key[rand];
    
    while(it < word.length()){
        it++;
    }
    
    String[] guessin = new String[it];
    
    for(int i = 0; i < guessin.length; i++){
        guessin[i] = "*";
    }
    
    System.out.println("");
    
        if (count4 == 0){
            System.out.println("       _______   ");
            System.out.println("      |/      |  ");
            System.out.println("      |          ");
            System.out.println("      |          ");
            System.out.println("      |          ");
            System.out.println("      |          ");
            System.out.println("      |          ");
            System.out.println("   ___|___       ");
        }
        else if (count4 == 1){
            System.out.println("       _______   ");
            System.out.println("      |/      |  ");
            System.out.println("      |      (_) ");
            System.out.println("      |          ");
            System.out.println("      |          ");
            System.out.println("      |          ");
            System.out.println("      |          ");
            System.out.println("   ___|___       ");
        }
        else if (count4 == 2){
            System.out.println("       _______   ");
            System.out.println("      |/      |  ");
            System.out.println("      |      (_) ");
            System.out.println("      |       |  ");
            System.out.println("      |       |  ");
            System.out.println("      |          ");
            System.out.println("      |          ");
            System.out.println("   ___|___       ");
        }
        else if (count4 == 3){
            System.out.println("       _______   ");
            System.out.println("      |/      |  ");
            System.out.println("      |      (_) ");
            System.out.println("      |      \\|/ ");
            System.out.println("      |       |  ");
            System.out.println("      |          ");
            System.out.println("      |          ");
            System.out.println("   ___|___       ");
        }
        else if (count4 == 4){
            System.out.println("       _______   ");
            System.out.println("      |/      |  ");
            System.out.println("      |      (_) ");
            System.out.println("      |      \\|  ");
            System.out.println("      |       |  ");
            System.out.println("      |          ");
            System.out.println("      |          ");
            System.out.println("   ___|___       ");
        }
        else if (count4 == 5){
            System.out.println("       _______   ");
            System.out.println("      |/      |  ");
            System.out.println("      |      (_) ");
            System.out.println("      |      \\|/ ");
            System.out.println("      |       |  ");
            System.out.println("      |      /   ");
            System.out.println("      |          ");
            System.out.println("   ___|___       ");
        }
        else if (count4 == 6){
            System.out.println("       _______   ");
            System.out.println("      |/      |  ");
            System.out.println("      |      (_) ");
            System.out.println("      |      \\|/ ");
            System.out.println("      |       |  ");
            System.out.println("      |      / \\ ");
            System.out.println("      |          ");
            System.out.println("   ___|___       ");
        }
        
    System.out.println("");
    System.out.print("  ");
        
    for(int i = 0; i < guessin.length; i++){
        if (guessin[i] != "*"){
            System.out.print(guessin[i] + " ");
        }
        else{
            System.out.print("_ ");
        }
    }
    
    System.out.println("");
    
    while (true){
        while (true){
            while (true){
                try{
                    System.out.println("");
                    System.out.print("Select a letter: ");
                    guess = scanboi.nextLine();
                    guess = guess.trim();
                    guess = guess.toLowerCase();
                    System.out.println("");
                    break;
                } catch (Exception e){
                    System.out.println("That's not valid!");
                    scanboi.nextLine();
                }
            }
            if (guess.equals("a") || guess.equals("b") || guess.equals("c") || guess.equals("d") ||
                guess.equals("e") || guess.equals("f") || guess.equals("g") || guess.equals("h") ||
                guess.equals("i") || guess.equals("j") || guess.equals("k") || guess.equals("l") ||
                guess.equals("m") || guess.equals("n") || guess.equals("o") || guess.equals("p") ||
                guess.equals("q") || guess.equals("r") || guess.equals("s") || guess.equals("t") ||
                guess.equals("u") || guess.equals("v") || guess.equals("w") || guess.equals("x") ||
                guess.equals("y") || guess.equals("z")){
                break;
            }
            else{
                System.out.println("That's not valid!");
            }
        }
        count3 = 0;
        for(int i = 0; i < word.length(); i++){
           if (word.substring(i, i + 1).equals(guess)){
               guessin[i] = guess;
               count3++;
           }
        }
        if(count3 < 1){
            System.out.println("Wrong!");
            count4++;
        }
        count5 = 0;
        for(int i = 0; i < word.length(); i++){
            if (guessin[i].equals("*")){
                count5++;
            }
        }
        if (count4 == 0){
            System.out.println("       _______   ");
            System.out.println("      |/      |  ");
            System.out.println("      |          ");
            System.out.println("      |          ");
            System.out.println("      |          ");
            System.out.println("      |          ");
            System.out.println("      |          ");
            System.out.println("   ___|___       ");
        }
        else if (count4 == 1){
            System.out.println("       _______   ");
            System.out.println("      |/      |  ");
            System.out.println("      |      (_) ");
            System.out.println("      |          ");
            System.out.println("      |          ");
            System.out.println("      |          ");
            System.out.println("      |          ");
            System.out.println("   ___|___       ");
        }
        else if (count4 == 2){
            System.out.println("       _______   ");
            System.out.println("      |/      |  ");
            System.out.println("      |      (_) ");
            System.out.println("      |       |  ");
            System.out.println("      |       |  ");
            System.out.println("      |          ");
            System.out.println("      |          ");
            System.out.println("   ___|___       ");
        }
        else if (count4 == 3){
            System.out.println("       _______   ");
            System.out.println("      |/      |  ");
            System.out.println("      |      (_) ");
            System.out.println("      |      \\|  ");
            System.out.println("      |       |  ");
            System.out.println("      |          ");
            System.out.println("      |          ");
            System.out.println("   ___|___       ");
        }
        else if (count4 == 4){
            System.out.println("       _______   ");
            System.out.println("      |/      |  ");
            System.out.println("      |      (_) ");
            System.out.println("      |      \\|/ ");
            System.out.println("      |       |  ");
            System.out.println("      |          ");
            System.out.println("      |          ");
            System.out.println("   ___|___       ");
        }
        else if (count4 == 5){
            System.out.println("       _______   ");
            System.out.println("      |/      |  ");
            System.out.println("      |      (_) ");
            System.out.println("      |      \\|/ ");
            System.out.println("      |       |  ");
            System.out.println("      |      /   ");
            System.out.println("      |          ");
            System.out.println("   ___|___       ");
        }
        else if (count4 == 6){
            System.out.println("       _______   ");
            System.out.println("      |/      |  ");
            System.out.println("      |      (_) ");
            System.out.println("      |      \\|/ ");
            System.out.println("      |       |  ");
            System.out.println("      |      / \\ ");
            System.out.println("      |          ");
            System.out.println("   ___|___       ");
        }
        
        System.out.println("");
        System.out.print("  ");
           
        for(int i = 0; i < guessin.length; i++){
            if (guessin[i] != "*"){
                System.out.print(guessin[i] + " ");
            }
            else{
                System.out.print("_ ");
            }
        }
        
        System.out.println("");
        
        if (count5 == 0){
            System.out.println("");
            System.out.println("That's Right!");
            break;
        }
        if (count4 == 6){
            System.out.println("");
            System.out.println("You Lose!");
            System.out.println("The Correct Word Was: " + word);
            break;
        }
    }
}
}
