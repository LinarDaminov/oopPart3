package homeWorkOopPart3Animals;

public class Birds extends  Animals {
    private String livingEnvironment;


    public Birds(String name, int age, String livingEnvironment) {
        super(name, age);
        if (livingEnvironment.isBlank() || livingEnvironment.isEmpty() || livingEnvironment == null) {
            this.livingEnvironment = "Неопознанная среда обитания";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

        public void hunt () {
            System.out.println("I am hunting");
        }

        public String getLivingEnvironment () {
            return livingEnvironment;
        }

        public void setLivingEnvironment (String livingEnvironment){
            if (livingEnvironment.isBlank() || livingEnvironment.isEmpty() || livingEnvironment == null) {
                this.livingEnvironment = "Неопознанная среда обитания";
            } else {
                this.livingEnvironment = livingEnvironment;
            }

        }
    }

