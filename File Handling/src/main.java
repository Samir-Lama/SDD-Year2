import java.io.*;

public class main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Student s = new Student("Shyam", "Male", 98089898);
//        Student r = new Student("Sita", "Female", 9808678);
//        FileOutputStream fos = new FileOutputStream("data.dat", true);
//        DataOutputStream dos = new DataOutputStream(fos);
//        ObjectOutputStream oos = new ObjectOutputStream(dos);
//        oos.writeObject(r);
//        dos.close();


        try{
            FileInputStream fis = new FileInputStream("data.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student obj  = null;
            while (true) {
                if(obj.getPhone()/2 == 0){
                    System.out.print("Number is Even");
                }else{
                    System.out.print("Number is Odd");
                }

            }
            ois.close();
        } catch (Exception e){
            System.out.print("\nEnd of File");
        }


    }
}
