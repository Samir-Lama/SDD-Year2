public class Student {
    int idNo;
    String name;

    public Student(int idNo, String name) {
        this.idNo = idNo;
        this.name = name;
    }

    public String toString(){
        return "Student Id Number: " + idNo +"\nStudent Name: " + name + "\n";

    }
}
