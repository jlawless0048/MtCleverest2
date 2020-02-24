import java.util.*;
import java.io.*;
public class pyJavaWiki{
    public static void main(String[] args) throws IOException , InterruptedException {  
        Scanner sksk = new Scanner(System.in);
        String userChoice = sksk.nextLine();
        System.out.print(wiki(userChoice));
    }
    public static String wiki(String str) throws IOException , InterruptedException {
        FileWriter fr = new FileWriter(new File("wordfile.txt"));
        fr.write(str);
        fr.close();

        Process p = Runtime.getRuntime().exec("python WikiDown.py");
        Thread.sleep(5000);
        
        File output = new File("output.txt");
        Scanner sksks = new Scanner(output);
        
        String sum = "";
        while(sksks.hasNextLine()){
                sum = sum + sksks.nextLine();
           }
        output.delete();
        return sum;
    }
}
