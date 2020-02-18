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
   public void build(String file) throws IOException { 
       Scanner reader = new Scanner(new File(file));
       Scanner readerTwo = new Scanner(new File(file)); 
       int arrayCount = 0;
       while(reader.hasNext()){
           reader.nextLine();
           arrayCount++;
       }   
       array = new String[arrayCount];
       logicalSize = arrayCount;
       int count = 0;
       while (readerTwo.hasNext()){
           String stringuno = readerTwo.nextLine();
           array[count] = stringuno;
           count++;
       }
   }
   public int search(String str){
       boolean found = false;
       int index = -1;
       int length = array.length / 2;
       int oldLength = -1;
       while (!found){
            if(oldLength != length){
                if((str.compareTo(" " + array[length] + " ") == 0 || str.compareTo(" " + array[length] + ".") == 0 || str.compareTo(" " + array[length] + "!") == 0 || str.compareTo(" " + array[length] + "?")== 0 || str.compareTo(" " + array[length] + "-") == 0 || str.compareTo(" " + array[length] + ",") == 0)){
                    found = true;
                    index = length;
                }
                else if((str.compareTo(" " + array[length] + " ") < 0 || str.compareTo(" " + array[length] + ".") < 0 || str.compareTo(" " + array[length] + "!") < 0 || str.compareTo(" " + array[length] + "?")< 0 || str.compareTo(" " + array[length] + "-") < 0 || str.compareTo(" " + array[length] + ",") < 0)){
                    length /= 2;
                }
                else{
                    length = (length * 2 + length) / 2;
                }
                oldLength = length;
            }
            else{
                break;
            }
       }
       return index;
   }
   public void sort(String[] array){
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
        String[] newArray = new String[logicalSize];
	for(int i = logicalSize; i > index; i--){
	    newArray[i + 1] = array[i];
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
}
