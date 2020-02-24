

/**
 * Its Tic-Tac-Toe made to be implemented into Mt. Cleverest!
 *
 * Hunter Stewart
 * 1.1
 */
import java.util.Random;
import java.util.Scanner;

public class Tictactoe
{
    public Tictactoe(){
    }
    public void startGame(){
        //Variable Declaration
        int d7 = 0, d8 = 0, d9 = 0, d4 = 0, d5 = 0, d6 = 0, d1 = 0, d2 = 0, d3 = 0;
        double in;
        int rin = 0, abs;
        
        //Object Initialization
        Scanner scanboi = new Scanner(System.in);
        Random randy = new Random();
        
        //Gets rid of ugly first space
        System.out.println("");
        
        //Initial Printing of board
        if (d7 == 1){
            System.out.print(" x |");
        }else if (d7 == 2){
            System.out.print(" o |");
        }
        else{
            System.out.print("   |");
        }
        if (d8 == 1){
            System.out.print(" x |");
        }else if (d8 == 2){
            System.out.print(" o |");
        }
        else{
            System.out.print("   |");
        }
        if (d9 == 1){
            System.out.println(" x ");
        }else if (d9 == 2){
            System.out.println(" o ");
        }
        else{
            System.out.println("   ");
        }
        System.out.println("-----------");
        if (d4 == 1){
            System.out.print(" x |");
        }else if (d4 == 2){
            System.out.print(" o |");
        }
        else{
            System.out.print("   |");
        }
        if (d5 == 1){
            System.out.print(" x |");
        }else if (d5 == 2){
            System.out.print(" o |");
        }
        else{
            System.out.print("   |");
        }
        if (d6 == 1){
            System.out.println(" x ");
        }else if (d6 == 2){
            System.out.println(" o ");
        }
        else{
            System.out.println("   ");
        }
        System.out.println("-----------");
        if (d1 == 1){
            System.out.print(" x |");
        }else if (d1 == 2){
            System.out.print(" o |");
        }
        else{
            System.out.print("   |");
        }
        if (d2 == 1){
            System.out.print(" x |");
        }else if (d2 == 2){
            System.out.print(" o |");
        }
        else{
            System.out.print("   |");
        }
        if (d3 == 1){
            System.out.println(" x ");
        }else if (d3 == 2){
            System.out.println(" o ");
        }
        else{
            System.out.println("   ");
        }
        System.out.println("");
        
        //Actual Game
        while (true){
        //Checks for Ties
        if (d1 > 0 && d2 > 0 && d3 > 0 && d4 > 0 && d5 > 0 && d6 > 0 && d7 > 0 && d8 > 0 && d9 > 0){
            System.out.println("Cats Game!");
            break;
        }
        
        //Player Phase
        while(true){
        
        while(true){
        try{
            System.out.println("Select a Square.");
            in = scanboi.nextDouble();
            rin = (int)in;
            break;
        } catch (Exception e){
            System.out.println("That's not valid!");
            scanboi.nextLine();
        }
    }
    
            if(d1 == 0 && rin == 1){
                System.out.println("You select Square 1");
                d1 = 1;
                break; 
            } 
            else if(d2 == 0 && rin == 2){
                System.out.println("You select Square 2");
                d2 = 1;
                break; 
            }
            else if(d3 == 0 && rin == 3){
                System.out.println("You select Square 3");
                d3 = 1;
                break; 
            }
            else if(d4 == 0 && rin == 4){
                System.out.println("You select Square 4");
                d4 = 1;
                break; 
            }
            else if(d5 == 0 && rin == 5){
                System.out.println("You select Square 5");
                d5 = 1;
                break; 
            }
            else if(d6 == 0 && rin == 6){
                System.out.println("You select Square 6");
                d6 = 1;
                break; 
            }
            else if(d7 == 0 && rin == 7){
                System.out.println("You select Square 7");
                d7 = 1;
                break; 
            }
            else if(d8 == 0 && rin == 8){
                System.out.println("You select Square 8");
                d8 = 1;
                break; 
            }
            else if(d9 == 0 && rin == 9){
                System.out.println("You select Square 9");
                d9 = 1;
                break; 
            }
            else{
                System.out.println("That's not Valid!");
            }
        }
        
        //Prints Board After Player Phase
        if (d7 == 1){
            System.out.print(" x |");
        }else if (d7 == 2){
            System.out.print(" o |");
        }
        else{
            System.out.print("   |");
        }
        if (d8 == 1){
            System.out.print(" x |");
        }else if (d8 == 2){
            System.out.print(" o |");
        }
        else{
            System.out.print("   |");
        }
        if (d9 == 1){
            System.out.println(" x ");
        }else if (d9 == 2){
            System.out.println(" o ");
        }
        else{
            System.out.println("   ");
        }
        System.out.println("-----------");
        if (d4 == 1){
            System.out.print(" x |");
        }else if (d4 == 2){
            System.out.print(" o |");
        }
        else{
            System.out.print("   |");
        }
        if (d5 == 1){
            System.out.print(" x |");
        }else if (d5 == 2){
            System.out.print(" o |");
        }
        else{
            System.out.print("   |");
        }
        if (d6 == 1){
            System.out.println(" x ");
        }else if (d6 == 2){
            System.out.println(" o ");
        }
        else{
            System.out.println("   ");
        }
        System.out.println("-----------");
        if (d1 == 1){
            System.out.print(" x |");
        }else if (d1 == 2){
            System.out.print(" o |");
        }
        else{
            System.out.print("   |");
        }
        if (d2 == 1){
            System.out.print(" x |");
        }else if (d2 == 2){
            System.out.print(" o |");
        }
        else{
            System.out.print("   |");
        }
        if (d3 == 1){
            System.out.println(" x ");
        }else if (d3 == 2){
            System.out.println(" o ");
        }
        else{
            System.out.println("   ");
        }
        System.out.println("");
        
        //Checks to See if Player Has Won
        if( (d1 == 1 && d2 == 1 && d3 == 1) || (d4 == 1 && d5 == 1 && d6 == 1) ||
            (d7 == 1 && d8 == 1 && d9 == 1) || (d7 == 1 && d5 == 1 && d3 == 1) ||
            (d1 == 1 && d5 == 1 && d9 == 1) || (d7 == 1 && d4 == 1 && d1 == 1) ||
            (d8 == 1 && d5 == 1 && d2 == 1) || (d9 == 1 && d6 == 1 && d3 == 1) ){
                System.out.println("You Win!");
                break;
            }
            
        //Checks to See if Game Tied
        if (d1 > 0 && d2 > 0 && d3 > 0 && d4 > 0 && d5 > 0 && d6 > 0 && d7 > 0 && d8 > 0 && d9 > 0){
            System.out.println("Cats Game!");
            break;
        }
        
        //Computer Phase
        while(true){
            //Checks if Computer Can Get 3 and Win 
            if(((d8 == 2 && d9 == 2) || (d4 == 2 && d1 == 2) || (d5 == 2 && d3 == 2)) && (d7 == 0)){
                System.out.println("I choose Square 7.");
                d7 = 2;
                break;
            }
            else if(((d7 == 2 && d8 == 2) || (d6 == 2 && d3 == 2) || (d5 == 2 && d1 == 2))  && (d9 == 0)){
                System.out.println("I choose Square 9.");
                d9 = 2;
                break;
            }
            else if(((d2 == 2 && d3 == 2) || (d4 == 2 && d7 == 2) || (d5 == 2 && d9 == 2)) && (d1 == 0)){
                System.out.println("I choose Square 1.");
                d1 = 2;
                break;
            }
            else if(((d1 == 2 && d2 == 2) || (d6 == 2 && d9 == 2) || (d5 == 2 && d7 == 2)) && (d3 == 0)){
                System.out.println("I choose Square 3.");
                d3 = 2;
                break;
            }
            else if(((d7 == 2 && d9 == 2) || (d5 == 2 && d2 == 2)) && (d8 == 0)){
                System.out.println("I choose Square 8.");
                d8 = 2;
                break;
            }
            else if(((d7 == 2 && d1 == 2) || (d5 == 2 && d6 == 2)) && (d4 == 0)){
                System.out.println("I choose Square 4.");
                d4 = 2;
                break;
            }
            else if(((d9 == 2 && d3 == 2) || (d5 == 2 && d4 == 2)) && (d6 == 0)){
                System.out.println("I choose Square 6.");
                d6 = 2;
                break;
            }
            else if(((d1 == 2 && d3 == 2) || (d5 == 2 && d8 == 2)) && (d2 == 0)){
                System.out.println("I choose Square 2.");
                d2 = 2;
                break;
            }
            else if(((d7 == 2 && d9 == 2) || (d5 == 2 && d2 == 2)) && (d8 == 0)){
                System.out.println("I choose Square 8.");
                d8 = 2;
                break;
            }
            else if(((d7 == 2 && d3 == 2) || (d9 == 2 && d1 == 2) ||
                    (d8 == 2 && d2 == 2) || (d4 == 2 && d6 == 2)) && (d5 == 0)){
                System.out.println("I choose Square 5.");
                d5 = 2;
                break;
            }
            
            //Checks if Player Can Win Next Turn and Blocks
            else if(((d8 == 1 && d9 == 1) || (d4 == 1 && d1 == 1) || (d5 == 1 && d3 == 1))  && (d7 == 0)){
                System.out.println("I choose Square 7.");
                d7 = 2;
                break;
            }
            else if(((d7 == 1 && d8 == 1) || (d6 == 1 && d3 == 1) || (d5 == 1 && d1 == 1))  && (d9 == 0)){
                System.out.println("I choose Square 9.");
                d9 = 2;
                break;
            }
            else if(((d2 == 1 && d3 == 1) || (d4 == 1 && d7 == 1) || (d5 == 1 && d9 == 1)) && (d1 == 0)){
                System.out.println("I choose Square 1.");
                d1 = 2;
                break;
            }
            else if(((d1 == 1 && d2 == 1) || (d6 == 1 && d9 == 1) || (d5 == 1 && d7 == 1)) && (d3 == 0)){
                System.out.println("I choose Square 3.");
                d3 = 2;
                break;
            }
            else if(((d7 == 1 && d9 == 1) || (d5 == 1 && d2 == 1)) && (d8 == 0)){
                System.out.println("I choose Square 8.");
                d8 = 2;
                break;
            }
            else if(((d7 == 1 && d1 == 1) || (d5 == 1 && d6 == 1)) && (d4 == 0)){
                System.out.println("I choose Square 4.");
                d4 = 2;
                break;
            }
            else if(((d9 == 1 && d3 == 1) || (d5 == 1 && d4 == 1)) && (d6 == 0)){
                System.out.println("I choose Square 6.");
                d6 = 2;
                break;
            }
            else if(((d1 == 1 && d3 == 1) || (d5 == 1 && d8 == 1)) && (d2 == 0)){
                System.out.println("I choose Square 2.");
                d2 = 2;
                break;
            }
            else if(((d7 == 1 && d9 == 1) || (d5 == 1 && d2 == 1)) && (d8 == 0)){
                System.out.println("I choose Square 8.");
                d8 = 2;
                break;
            }
            else if(((d7 == 1 && d3 == 1) || (d9 == 1 && d1 == 1) ||
                    (d8 == 1 && d2 == 1) || (d4 == 1 && d6 == 1)) && (d5 == 0)){
                System.out.println("I choose Square 5.");
                d5 = 2;
                break;
            }
            
            //Places Squares in Corners for Optimal Strategy
            else if(d7 == 0 || d9 == 0 || d1 == 0 || d3 == 0){
                abs = randy.nextInt(4) + 1;
                if (abs == 1 && d7 == 0){
                    System.out.println("I choose Square 7.");
                    d7 = 2;
                    break;
                }
                else if (abs == 2 && d9 == 0){
                    System.out.println("I choose Square 9.");
                    d9 = 2;
                    break;
                }
                else if (abs == 3 && d1 == 0){
                    System.out.println("I choose Square 1.");
                    d1 = 2;
                    break;
                }
                else if (abs == 4 && d3 == 0){
                    System.out.println("I choose Square 3.");
                    d3 = 2;
                    break;
                }
            }
            else{
                abs = randy.nextInt(5) + 1;
                if (abs == 1 && d8 == 0){
                    System.out.println("I choose Square 8.");
                    d8 = 2;
                    break;
                }
                else if (abs == 2 && d4 == 0){
                    System.out.println("I choose Square 4.");
                    d4 = 2;
                    break;
                }
                else if (abs == 3 && d5 == 0){
                    System.out.println("I choose Square 5.");
                    d5 = 2;
                    break;
                }
                else if (abs == 4 && d6 == 0){
                    System.out.println("I choose Square 6.");
                    d6 = 2;
                    break;
                }
                else if (abs == 5 && d2 == 0){
                    System.out.println("I choose Square 2.");
                    d2 = 2;
                    break;
                }
            }
        }
        
        //Prints Board After Computer Phase
        if (d7 == 1){
            System.out.print(" x |");
        }else if (d7 == 2){
            System.out.print(" o |");
        }
        else{
            System.out.print("   |");
        }
        if (d8 == 1){
            System.out.print(" x |");
        }else if (d8 == 2){
            System.out.print(" o |");
        }
        else{
            System.out.print("   |");
        }
        if (d9 == 1){
            System.out.println(" x ");
        }else if (d9 == 2){
            System.out.println(" o ");
        }
        else{
            System.out.println("   ");
        }
        System.out.println("-----------");
        if (d4 == 1){
            System.out.print(" x |");
        }else if (d4 == 2){
            System.out.print(" o |");
        }
        else{
            System.out.print("   |");
        }
        if (d5 == 1){
            System.out.print(" x |");
        }else if (d5 == 2){
            System.out.print(" o |");
        }
        else{
            System.out.print("   |");
        }
        if (d6 == 1){
            System.out.println(" x ");
        }else if (d6 == 2){
            System.out.println(" o ");
        }
        else{
            System.out.println("   ");
        }
        System.out.println("-----------");
        if (d1 == 1){
            System.out.print(" x |");
        }else if (d1 == 2){
            System.out.print(" o |");
        }
        else{
            System.out.print("   |");
        }
        if (d2 == 1){
            System.out.print(" x |");
        }else if (d2 == 2){
            System.out.print(" o |");
        }
        else{
            System.out.print("   |");
        }
        if (d3 == 1){
            System.out.println(" x ");
        }else if (d3 == 2){
            System.out.println(" o ");
        }
        else{
            System.out.println("   ");
        }
        
        //Checks if Computer Has Won
        if( (d1 == 2 && d2 == 2 && d3 == 2) || (d4 == 2 && d5 == 2 && d6 == 2) ||
            (d7 == 2 && d8 == 2 && d9 == 2) || (d7 == 2 && d5 == 2 && d3 == 2) ||
            (d1 == 2 && d5 == 2 && d9 == 2) || (d7 == 2 && d4 == 2 && d1 == 2) ||
            (d8 == 2 && d5 == 2 && d2 == 2) || (d9 == 2 && d6 == 2 && d3 == 2) ){
                System.out.println("You Lose!");
                break;
            }
    }
    }
}
