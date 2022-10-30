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

    public void graze() {
        System.out.println("I am grazing");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(foodType, that.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodType);
    }

    @Override
    public String toString() {
        return "Animal: " + ", name: " + getName() + ", age " + getAge() +
                ", Food:" + foodType;
    }
}
