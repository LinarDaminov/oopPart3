package homeWorkOopPart3;

public class Bus extends Transport{

    public Bus(String brand, String model, int manufacturedYear, String manufacturedCountry, String color, int maxSpeed) {
        super(brand, model, manufacturedYear, manufacturedCountry, color, maxSpeed);
    }

    @Override
    public String reFill() {
        String fuel =  " Дизель или бензин";
        return fuel;
    }

}
