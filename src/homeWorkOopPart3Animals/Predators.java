package homeWorkOopPart3Animals;

public class Predators extends Mammals{
    private String foodType;

    public Predators(String name, int age, String livingEnvironment, double speedMove) {
        super(name, age, livingEnvironment, speedMove);
    }

    public Predators(String name, int age, String livingEnvironment, double speedMove, String foodType) {
        super(name, age, livingEnvironment, speedMove);
        if (foodType == null || foodType.isBlank()) {
            this.foodType = "meat";
        } else {
            this.foodType = foodType;
        }
    }

    @Override
    public String toString() {
        return "Animal: " + ", name: " + getName() + ", age " + getAge() +
                ", Food:" + foodType + " класс: " + getClass();
    }

    @Override
    public void eat() {
        System.out.println("i am hunting");
    }
}
