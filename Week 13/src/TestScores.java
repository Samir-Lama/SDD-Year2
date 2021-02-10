import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestScores {
    double marks[];

    public TestScores(double[] marks) {

        this.marks = marks;
    }

    double avgTest(){
        double sum = 0;
        for (int i = 0; i < this.marks.length; i++){
            sum = this.marks[i] + sum;
        }
        double average = sum/this.marks.length;
        return average;
    }


    // Finding average from program
//    public static void main(String[] args){
//        double marks[] = {44, 55,660, 77};
//        for (int i = 0; i < marks.length; i++){
//            if(marks[i] < 0 || marks[i] > 100 ){
//                throw new IllegalArgumentException("Invalid Marks Entered");
//            }
//        }
//        TestScores ts = new TestScores(marks);
//        System.out.print(ts.avgTest());
//    }

    //
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("src/TestScores.txt");
        Scanner fs = new Scanner(f);
        String a = fs.next();
        String split[] = a.split(",");
        double[] marks = new double[split.length];
        for (int i = 0; i < split.length; i++) {
            marks[i] = Double.parseDouble(split[i]); // Assigning marks
            if(marks[i] > 100 || marks[i] < 0){
                throw new IllegalArgumentException("Invalid Marks Enetered");
            }
        }

        TestScores ts = new TestScores(marks);
        System.out.print("Your Average marks is : " + ts.avgTest());


    }
}
