package homeWorkOopPart3Animals;

public class FlyingBirds extends Birds {
            private String typeOfMove;

    public FlyingBirds(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    public FlyingBirds(String name, int age, String livingEnvironment, String typeOfMove) {
        super(name, age, livingEnvironment);
        if (typeOfMove.isBlank() || typeOfMove.isEmpty() || typeOfMove == null) {
            this.typeOfMove = "Неопознанная среда обитания";
        } else {
            this.typeOfMove = typeOfMove;
        }
    }

    public void move() {
            System.out.println("I am flying");
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
    @Override
    public String toString() {
        return "Animal: " + ", name: " + getName() + ", age " + getAge() +
                ", livingEnvironment " + getLivingEnvironment() + " typeOfMove: " + getTypeOfMove() + " класс: " + getClass();
    }
}
