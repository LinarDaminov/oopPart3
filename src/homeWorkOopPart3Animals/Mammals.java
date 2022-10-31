package homeWorkOopPart3Animals;

public class Mammals extends Animals {
    private String livingEnvironment;
    private double speedMove;

    public Mammals(String name, int age, String livingEnvironment, double speedMove) {
        super(name, age);
        if (livingEnvironment.isBlank() || livingEnvironment.isEmpty() || livingEnvironment == null) {
            this.livingEnvironment = "Неопознанная среда обитания";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
        if (speedMove == 0) {
            this.speedMove = 5;
        } else {
            this.speedMove = speedMove;
        }
    }

    public Mammals(String name, int age) {
        super(name, age);

    }

    public void walk() {
        System.out.println("I am walking");
    }



    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment.isBlank() || livingEnvironment.isEmpty() || livingEnvironment == null) {
            this.livingEnvironment = "Неопознанная среда обитания";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public void setSpeedMove(double speedMove) {
        if (speedMove == 0) {
            this.speedMove = 5;
        } else {
            this.speedMove = speedMove;
        }
    }

}
