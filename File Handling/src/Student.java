import java.io.Serializable;
public class Student implements Serializable {
    String name, gender;
    int phone;

    // Constructor
    public Student(String name, String gender, int phone) {
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }

    // Setter

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    // Getter
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getPhone() {
        return phone;
    }
}
