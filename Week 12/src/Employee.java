import java.io.IOException;
import java.util.Scanner;

public class Employee {
    String idNum, hourlyWage;

    public Employee(String idNum, String hourlyWage){
        this.idNum = idNum;
        this.hourlyWage = hourlyWage;
        EmployeeException emp = new EmployeeException(this.idNum, this.hourlyWage);
    }
    public static void main(String args[]){
        String id, hrWage;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee id:");
        id = sc.next();
        System.out.print("Enter Employee hourly wage:");
        hrWage = sc.next();

        Employee emp = new Employee(id, hrWage);


    }
}

