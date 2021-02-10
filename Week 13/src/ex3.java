import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) throws IOException {
        File f= new File("src/ex3.txt");
        Scanner fs = new Scanner(f);
        String a = fs.next();
        String split[] = a.split(",");
        double[] sales = new double[split.length];
        double totalSales = 0, highestSales = 1, averageSales = 0, lowestSales = 999999;


        for (int i = 0; i < split.length; i++){
            sales[i] = Double.parseDouble(split[i]); // Assigning sales
            totalSales = totalSales + sales[i]; // Total Sales
            averageSales = totalSales/(i+1);

            // Initilising value for highest and lowest sales

            if(highestSales < sales[i]){
                highestSales = sales[i];
            }
            if(lowestSales > sales[i]){
                lowestSales = sales[i];
            }


        }

        System.out.print("Total Sales: " + totalSales
        + "\nAverage Sales: " + averageSales
        + "\nHighest Sales: " + highestSales
        + "\nLowest Sales: " + lowestSales);

    }
}
