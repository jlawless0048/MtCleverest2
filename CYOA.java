
/**
 * @author Josh Lawless, Drew Malapanes
 */

import java.io.*;
import java.util.*;
import javax.swing.*;

public class CYOA
{
   public static void startGame(){
       int choice1, choice2, choice3, choice4, choice5;
       String input = JOptionPane.showInputDialog("You have been riding your horse for hours on your way home from visiting family. Your horse, Buttercup, is exhausted and cannot go any further. \n 1. Give her fresh water. \n 2. Feed her an apple. \n 3. Pet her."); 
       choice1 = Integer.parseInt(input);
       
       String messageOne = "You realize you will have to stop and rest for the night. You are on a cobblestone path in a dark, wooded area. You look around and see a narrow, dirt path up ahead, diverging off the main road. It’s so well hidden you are surprised you noticed it."
       + "\n 1.) Lead Buttercup along the main path. \n 2.) Lead Buttercup down the dirt path.";
       
       String[] choicesOne = {"You give Buttercup water from your canteen. She seems appreciative, but she is still exhausted." , 
           "You feed Buttercup an apple from your sack. She seems appreciative, but she is still exhausted." ,
           "You lovingly pat Buttercup’s back. She seems appreciative, but she is still exhausted."};
           
     if(choice1 == 1){
            input = JOptionPane.showInputDialog(choicesOne[0] + "\n" + messageOne);           
    }
     else if(choice1 == 2){
            input = JOptionPane.showInputDialog(choicesOne[1] + " \n" + messageOne);            
    }
     else if(choice1 == 3){
            input = JOptionPane.showInputDialog(choicesOne[2] +  " \n" + messageOne);         
    }
  }
}