public class three {
    public static void main(String[] args){
        Employee empOnly = new Employee("Ram", "20/20/2020", 200, 30);
        ProductionWoker emp = new ProductionWoker("Sam", "20/30/2020", 200, 30, 1);

        System.out.print("Rate of Ram" + empOnly.getPay(3) + "\n Rate of Sam "+ emp.getPay(1));
    }
    
}

class Employee{
    String name, date_joined;
    int number;
    double rate;

    double getPay(int hours){
        double salary = hours * this.rate;
        return salary;
    }

    public Employee(String name, String date_joined, int number, double rate) {
        this.name = name;
        this.date_joined = date_joined;
        this.number = number;
        this.rate = rate;
    }
}

class ProductionWoker extends Employee{
    int shift;
    public ProductionWoker(String name, String date_joined, int number, double rate, int shift) {
        super(name, date_joined, number, rate);
        // TODO Auto-generated constructor stub
        this.shift = shift;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    double getPaty(int hours) {
        double salary = 0;
        if (this.shift == 1) {
            salary = this.rate * hours;
        }
        if(this.shift == 2){
            salary = this.rate * hours * 2;
        }
        return salary;
    }
    
}
