/**
 * Arraytime
 *
 * Hunter
 * 1.2
 */
import java.io.*;
import java.util.*;
public class ArrayBuild
{
   private String[] array;
   private int logicalSize;
   public ArrayBuild(){
       logicalSize = 0;
   }
   public ArrayBuild(String file) throws IOException{
       logicalSize = 0;
       this.build(file);
   }
   public void build(String file) throws IOException{ 
       Scanner reader = new Scanner(new File(file));
       Scanner readerTwo = new Scanner(new File(file)); 
       
       int arrayCount = 0;
       while(reader.hasNext()){
           reader.nextLine();
           arrayCount++;
       }   
       array = new String[arrayCount];
       logicalSize = arrayCount - 1;
       int count = 0;
       while (readerTwo.hasNext()){
           String stringuno = readerTwo.nextLine();
           array[count] = stringuno;
           count++;
       }
   }
   public int search(String str){
       int index = -1;
       for(String element : array){
           if(str.contains(" " + element + " ") || str.contains(" " + element + ".") || str.contains(" " + element + "!") || str.contains(" " + element + "?") || str.contains(" " + element + "-") || str.contains(" " + element + ",")){
               index = 1;
           }
       }
       return index;
       }
   public void sort(){
        int i, j;  
        String key;
        for (i = 1; i < logicalSize; i++){  
            key = array[i];  
            j = i - 1;  
            while (j >= 0 && array[j].compareTo(key) > 0) {  
                array[j + 1] = array[j];  
                j = j - 1;  
            }  
            array[j + 1] = key;  
        }  
   }  
   public String[] insert(int index, String ele){
        logicalSize++;
        String[] newArray = new String[logicalSize + 1];
        for(int i = logicalSize; i > index; i--){
            newArray[i] = array[i - 1];
        } 
        newArray[index] = ele;
        return newArray;
   }
   public void update(String file) throws IOException{
        FileWriter filey = new FileWriter(file);
        for(String element : array){
            filey.write(element);
        }
        filey.close();
   }
   public String getRandom(){
        Random rando = new Random();
        int randGen = rando.nextInt(this.array.length);
        return this.array[randGen];
   }
   public void setArray(String[] bruh){
        array = bruh;
   }
}
