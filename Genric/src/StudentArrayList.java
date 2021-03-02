import java.util.ArrayList;

public class StudentArrayList {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1,"Ram"));
        students.add(new Student(2, "Sam"));
        students.add(new Student(3, "Hari"));

        for (int i = 0; i < students.size(); i++){
            System.out.print(students.get(i).toString());
        }
    }
}
