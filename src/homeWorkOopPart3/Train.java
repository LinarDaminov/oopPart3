package homeWorkOopPart3;

public class Train extends Transport {
    private double priceOfTrip;
    private int timeOfTrip;
    private String nameOfStartStation;
    private String nameOfFinishStation;
    private int numberOfWagons;


    public Train(String brand, String model, int manufacturedYear, String manufacturedCountry, String color, int maxSpeed,
                 double priceOfTrip, int timeOfTrip, String nameOfStartStation, String nameOfFinishStation, int numberOfWagons) {
        super(brand, model, manufacturedYear, manufacturedCountry, color, maxSpeed);
        this.priceOfTrip = priceOfTrip;
        this.timeOfTrip = timeOfTrip;
        this.nameOfStartStation = nameOfStartStation;
        this.nameOfFinishStation = nameOfFinishStation;
        this.numberOfWagons = numberOfWagons;
    }

    public double getPriceOfTrip() {
        return priceOfTrip;
    }

    public void setPriceOfTrip(double priceOfTrip) {
        this.priceOfTrip = priceOfTrip;
    }

    public int getTimeOfTrip() {
        return timeOfTrip;
    }

    public void setTimeOfTrip(int timeOfTrip) {
        this.timeOfTrip = timeOfTrip;
    }

    public String getNameOfStartStation() {
        return nameOfStartStation;
    }

    public void setNameOfStartStation(String nameOfStartStation) {
        this.nameOfStartStation = nameOfStartStation;
    }

    public String getNameOfFinishStation() {
        return nameOfFinishStation;
    }

    public void setNameOfFinishStation(String nameOfFinishStation) {
        this.nameOfFinishStation = nameOfFinishStation;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    @Override
    public String reFill() {
        String fuel = "  Дизель";
        return fuel;
    }

}

