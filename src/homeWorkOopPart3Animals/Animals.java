package homeWorkOopPart3Animals;

public class Animals {
    private final String name;
    private final int age;

    public Animals(String name, int age) {
        if (name.isBlank() || name.isEmpty() || name == null) {
            this.name = "Default";
        } else {
            this.name = name;
        }
        if (age == 0) {
            this.age = 2;
        } else {
            this.age = age;
        }

    }

    public void eat() {
        System.out.println(" I am eating");
           }

    public void sleep() {
        System.out.println("I am sleeping");

    }

    public void move() {
        System.out.println("I am moving");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
