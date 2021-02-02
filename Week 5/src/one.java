public class one {
    public static void main(String[] args) {
        Pet dog = new Pet("Shaggy", "Pitbull", "22");
        dog.provider();
    }
}

class Pet {
    String name, type, age;

    public Pet(String name, String type, String age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    // Getter
    String getPetName() {
        return this.name;
    }

    String getPetTypee() {
        return this.type;
    }

    String getPetAge() {
        return this.age;
    }

    public void provider() {
        System.out.print(this.name + " is a " + this.age + " year old" + this.type);
    }
}
