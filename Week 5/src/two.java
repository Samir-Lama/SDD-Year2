public class two {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Mustang", "FM-100", 30);
        while (car.speed != 60) {
            car.accelarate();
            System.out.print("Speed: " + car.speed + "\n");
        }
        while (car.speed != 0) {
            car.brake();
            System.out.print("Speed: " + car.speed + "\n");
        }
    }
}

class Car {
    String make, model, registration;
    int speed;

    public Car(String make, String model, String registration, int speed) {
        this.make = make;
        this.speed = speed;
        this.model = model;
        this.registration = registration;

    }

    void accelarate() {
        this.speed = this.speed + 5;
    }

    void brake() {
        this.speed = this.speed - 10;
    }

    int getSpeed() {
        return this.speed;
    }

}