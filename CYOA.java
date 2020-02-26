
/**
 * @author Josh Lawless, Drew Malapanes
 */

import java.io.*;
import java.util.*;
import javax.swing.*;

public class CYOA
{
   public static void startGame(){
       int choice1, choice2 = 0, choice3 = 0,  choice4 = 0, choice5 = 0, choice6 = 0;
       String input = JOptionPane.showInputDialog("You have been riding your horse for hours on your way home from visiting family. Your horse, Buttercup, is exhausted and cannot go any further. \n 1. Give her fresh water. \n 2. Feed her an apple. \n 3. Pet her."); 
       choice1 = Integer.parseInt(input);
       
       String messageOne = "You realize you will have to stop and rest for the night. You are on a cobblestone path in a dark, wooded area. You look around and see a narrow, dirt path up ahead, diverging off the main road. It’s so well hidden you are surprised you noticed it."
       + "\n 1.) Lead Buttercup along the main path. \n 2.) Lead Buttercup down the dirt path.";
       
       String[] choicesOne = {"You give Buttercup water from your canteen. She seems appreciative, but she is still exhausted." , 
           "You feed Buttercup an apple from your sack. She seems appreciative, but she is still exhausted." ,
           "You lovingly pat Buttercup’s back. She seems appreciative, but she is still exhausted."};
           
     if(choice1 == 1){
            input = JOptionPane.showInputDialog(choicesOne[0] + "\n" + messageOne);    
            choice2 = Integer.parseInt(input);
    }
     else if(choice1 == 2){
            input = JOptionPane.showInputDialog(choicesOne[1] + " \n" + messageOne);        
            choice2 = Integer.parseInt(input);            
    }
     else if(choice1 == 3){
            input = JOptionPane.showInputDialog(choicesOne[2] +  " \n" + messageOne);
            choice2 = Integer.parseInt(input);
    }
    if(choice2 == 1){
        JOptionPane.showMessageDialog(null, "You follow the main road and come upon a small village. You tie up Buttercup on a post outside the inn, before renting a room for the night. You fall into a comfortable sleep. \n Unfortunately, a Pagan cult raids the inn during the night. They slit your throat in your sleep, stealing your belongings and your horse. \n YOU ARE DEAD");   
    }
    else if(choice2 == 2){
        input = JOptionPane.showInputDialog("You and Buttercup head down the dirt path. The woods grow thicker, completely blocking out any moonlight from above. \n After walking for a few minutes, you see a light at the end of the path on the horizon. You pick up your pace, Buttercup beginning to lag behind. You reach the end of the path soon, finding the light to be a lamp post. \n The lamppost marks the beginning of a flight of stone stairs, gradually winding up a mountain range. You turn your gaze upwards, your eyes landing upon an impressive stone castle. \n 1.) Tie Buttercup to a tree and ascend the stairs. \n 2.) Turn around and follow the main path. ");
        choice3 = Integer.parseInt(input);
        if(choice3 == 1){
        
            input = JOptionPane.showInputDialog("You tie Buttercup securely to a tree. You pat her butt, grab your satchel, and begin up the stairs. \n After reaching the castle, you are wheezing, tired, and very cold. \n\n\n You walk up to the gate, which leads to a drawbridge. “Hello?” you shout. There is no response. “Hello? Is anyone home? I need some help.” \n There is no verbal response, but the gate raises and the drawbridge lowers. \n 1.) Keep going");
            input = JOptionPane.showInputDialog("You hesitantly step forward, across the drawbridge and to the main door of the castle. The main door is cracked slightly. \n You push the door open farther and step in. Candles are lit upon the chandelier, and an enticing feast lays spread on the table before you, untouched, but still warm. \n 1.) Rush forward and begin eating. \n 2.) Resist the meal and head down the hallway to the left.");
            choice4 = Integer.parseInt(input);
            if(choice4 == 1){
                JOptionPane.showMessageDialog(null,"You rush towards the food and begin shoveling food into your face with your hands. The long, cold walk to the castle has left you famished. Perfectly prepared turkey, potatoes, ham, pork cutlets, steak. \n With each bite, the steak gets rarer and bloodier. The pork gradually becomes chewy. You look down and your hands are covered in blood, and you’re holding a human leg. \n You realize the meat in your mouth is not from a farm animal, but it is too late. You collapse onto the floor, convulsing as your hearts stops and you transform into a vampire. \n YOU ARE UNDEAD.");
            }
            else if(choice4 == 2){
                input = JOptionPane.showInputDialog("Although you are hungry, you turn away from the food and head down the hallway. Portraits of sickly, pale faces line both walls. You come to the end of the hallway. \n 1.) Turn Left. \n 2.) Turn Right");
                choice5 = Integer.parseInt(input);
                if(choice5 == 1){
                    JOptionPane.showMessageDialog(null, "You turn left into another hallway. You walk forward hesitantly. You step onto an off-colored tile, and immediately the floor underneath you disappears. \n You realize you have fallen victim to a secret trapdoor as you whack your head on the metal tube leading down, down, down. \n You finally land in a dank, underground space. You gather your bearings. Dark humanoid figures slink out from the shadows, hissing, and spitting. \n‘Hungry…’ they sneer, suddenly descending upon your body, taking huge chunks of flesh from your form with their sharp teeth. \n Within ten minutes, nothing is left of you except for your skeleton, each bone licked clean by the monsters. \n YOU ARE DEAD.");
                }
                else if(choice5 == 2){
                    input = JOptionPane.showInputDialog("You turn right. There is a flight of stairs. \n 1.) Ascend");
                    input = JOptionPane.showInputDialog("You head up the stairs. From one of the doorways, a figure steps out into the hallway, blocking your path. \n “You have made it this far. For that, I am offering you a gift. It will bless you with agility, strength, and, most importantly,” he pauses, his eyes narrowing. \n “the power to live forever. Do you accept?” \n 1.) Accept his gift. \n 2.) Reject his gift.");
                    choice6 = Integer.parseInt(input);
                    if(choice6 == 1){
                        JOptionPane.showMessageDialog(null, "“Yes, I accept this gift,” you reply. The man lurches forward, grabbing your shoulders and sinking his teeth into the skin of your neck. \n You sense the warmth of blood running down your neck before you collapse onto the floor, succumbing to the curse of vampirism. \n YOU ARE UNDEAD");

                    }
                    else if(choice6 == 2){
                        JOptionPane.showMessageDialog(null, "“No, I do not want your gift,” you reply. “So be it.” the vampire sneers. \n He lurches forward, slitting your throat with one slash of his concealed dagger.\n YOU ARE DEAD.");
                    }
                }
            }
        }
        else if(choice3 == 2){
            JOptionPane.showMessageDialog(null, "You follow the main road and come upon a small village. You tie up Buttercup on a post outside the inn, before renting a room for the night. You fall into a comfortable sleep. \n Unfortunately, a Pagan cult raids the inn during the night. They slit your throat in your sleep, stealing your belongings and your horse. \n YOU ARE DEAD");
        }
    }
  }
}