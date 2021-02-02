import java.util.Scanner;

public class ParseIntError {
    public static void main(String[] args){
        String word;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter int value:");
        // Input
        word = sc.next();
        int n;
        //Conversion string to int
        try{
            n = Integer.parseInt(word);
            System.out.print("Conversion Successful\nDisplaying int variable: " + n);
        }
        catch (Exception e){
            System.out.print("You did not enter valid input");
        }



    }
}