import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){
        File f = new File("src/ex1.txt");
        try {
            Scanner s = new Scanner(f);
            double sum = 0, n;
            while(s.hasNext()){
                n = s.nextDouble();
                sum = sum + n;
            }
            System.out.print("Overall Sum = " + sum);
            s.close();
//            System.out.print(a);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
