import java.io.IOException;
import java.util.Scanner;

public class Employee {
    String idNum, hourlyWage;

    public Employee(String idNum, String hourlyWage) throws IOException {
        this.idNum = idNum;
        this.hourlyWage = hourlyWage;
        new EmployeeException(idNum,hourlyWage);
    }
    public static void main(String[] args) throws IOException {
        String empId, empWage;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee id:");
        empId = sc.next();
        System.out.print("Enter employee hourly wage:");
        empWage = sc.next();
        Employee e;
        e = new Employee(empId, empWage);
    }
}

