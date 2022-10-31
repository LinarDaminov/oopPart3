package homeWorkOopPart3;

public abstract class Transport {
    private String brand;
    private String model;
    private final int manufacturedYear;
    private final String manufacturedCountry;
    private String color;
    private int maxSpeed;


    public Transport(String brand, String model, int manufacturedYear, String manufacturedCountry, String color, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.manufacturedYear = manufacturedYear;
        this.manufacturedCountry = manufacturedCountry;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }
     public String getModel() {
        return model;
    }
      public int getManufacturedYear() {
        return manufacturedYear;
    }

    public String getManufacturedCountry() {
        return manufacturedCountry;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isBlank() && color == null) {
            this.color = "default";
        } else {
            this.color = color;
        }

    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed < 0) {
            maxSpeed = 120;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public abstract String reFill();
}
