import java.io.File;
import java.io.IOException;

public class ThrowEmployee {
   String id, hrWage;

    public ThrowEmployee(String id, String hrWage) {
        this.id = id;
        this.hrWage = hrWage;
    }

    public static void main(String args[]) throws IOException {
        File f = new File("emp.txt");
        boolean res = f.createNewFile();

    }
}
