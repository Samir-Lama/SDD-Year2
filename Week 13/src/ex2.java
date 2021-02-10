import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("src/ex2.txt", true);
        PrintWriter pw = new PrintWriter(fw);
        try{
            String word;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter anything: ");
            word = s.nextLine();
            pw.append(word);
            pw.close();
            System.out.print("Entered data added to file!");
        }catch (Exception e){
            System.out.print("Error!!");
        }

    }
}
