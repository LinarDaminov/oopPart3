package homeWorkOopPart3Animals;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
