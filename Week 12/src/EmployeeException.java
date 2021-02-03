import java.io.IOException;

public class EmployeeException {
    String id, payRate;

    public EmployeeException(String id, String payRate){
        this.id = id;
        this.payRate = payRate;
        try{
            if(Integer.parseInt(payRate) > 50 ){
                throw new Exception("Pay Rate greater than 50");
            }
            if(Integer.parseInt(payRate) < 6 ){
                throw new Exception("Pay Rate less than 6");
            }
        } catch (Exception e) {
            ThrowEmployee tr = new ThrowEmployee(this.id, this.payRate);

        }
    }
}
