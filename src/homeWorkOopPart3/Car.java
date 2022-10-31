package homeWorkOopPart3;

public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private int place;

    public Car(String brand, String model, int manufacturedYear, String manufacturedCountry, String color, int maxSpeed, double engineVolume, String bodyType, String transmission, String regNumber, int place) {
        super(brand, model,manufacturedYear,manufacturedCountry,color,maxSpeed);
        this.bodyType = bodyType;

        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (transmission == null || transmission.isBlank()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (regNumber.isBlank()) {
            this.regNumber = "о00000777";
        } else {
            this.regNumber = regNumber;
        }

        this.place = place;


    }

    public String getBodyType() {
        return bodyType;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        if (place <= 0) {
            this.place = 5;
        } else {
            this.place = place;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

       public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
    }
         public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber.isBlank()) {
            this.regNumber = "о00000777";
        } else {
            this.regNumber = regNumber;
        }
    }


    @Override
    public String reFill() {
        String fuel = " Бензин, дизель или зарядка";
        return fuel;
    }
}












