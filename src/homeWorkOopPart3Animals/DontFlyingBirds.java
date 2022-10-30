package homeWorkOopPart3Animals;

public class DontFlyingBirds extends Birds{
    private String typeOfMove;

    public DontFlyingBirds(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    public DontFlyingBirds(String name, int age, String livingEnvironment, String typeOfMove) {
        super(name, age, livingEnvironment);
        if (typeOfMove.isBlank() || typeOfMove.isEmpty() || typeOfMove == null) {
            this.typeOfMove = "Неопознанная среда обитания";
        } else {
            this.typeOfMove = typeOfMove;
        }
    }

    public String getTypeOfMove() {
        return typeOfMove;
    }

    public void setTypeOfMove(String typeOfMove) {
        if (typeOfMove.isBlank() || typeOfMove.isEmpty() || typeOfMove == null) {
            this.typeOfMove = "Неопознанная среда обитания";
        } else {
            this.typeOfMove = typeOfMove;
        }
    }

    public void walk() {
        System.out.println("I am walking");

    }
    @Override
    public String toString() {
        return "Animal: " + ", name: " + getName() + ", age " + getAge() +
                ", livingEnvironment " + getLivingEnvironment() + " typeOfMove: " + getTypeOfMove();
    }
}
