package homeWorkOopPart3Animals;

import java.util.Objects;

public class Herbivores extends Mammals {
    private String foodType;

    public Herbivores(String name, int age, String livingEnvironment, double speedMove) {
        super(name, age, livingEnvironment, speedMove);
    }

    public Herbivores(String name, int age, String livingEnvironment, double speedMove, String foodType) {
        super(name, age, livingEnvironment, speedMove);
        if (foodType == null || foodType.isBlank()) {
            this.foodType = "meat";
        } else {
            this.foodType = foodType;
        }
    }

    public void eat() {
        System.out.println("I am grazing");
    }



    @Override
    public String toString() {
        return "Animal: " + ", name: " + getName() + ", age " + getAge() +
                ", Food:" + foodType + " класс: " + getClass();
    }
}
