package homeWorkOopPart3;

import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car("lada", "Granta", 2020, "Россия", "желтый", 180, 1.8, "седан", "МКПП", "А405РО122", 5);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 150, 1.6, "седан", "АКПП", "к261ва102", 4);
        Car bmw = new Car("BMW", "Z8", 2021, "Германия", "черный", 162, 2.4, "хетчбек", "МКПП", "м125аз154", 5);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "красный", 180, 2.2, "седан", "АКПП", "а468оо078", 4);
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южная Корея", "желтый", 220, 3.0, "Внедорожник", "АКПП", "р556ла164", 5);
        Train firstTrain = new Train("Ласточка", "B-901", 2011, "Россия", "", 301, 3500, 0, "Белорусский вокзал", "Минск-Пасажирский", 11);
        Train secondTrain = new Train("Ленинград", "D-125", 2019, "Россия", "", 270, 1700, 0, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);
        Bus bus1 = new Bus("Нефаз", "1132", 2015, "Россия", "Синий", 130);
        Bus bus2 = new Bus("ПАЗ", "О-214", 1968, "CCСР", "Желтый", 90);

        printInfoAboutCar(lada);
        printInfoAboutCar(audi);
        printInfoAboutCar(bmw);
        printInfoAboutCar(kia);
        printInfoAboutCar(hyundai);
        System.out.println();
        printInfoAboutTrain(firstTrain);
        printInfoAboutTrain(secondTrain);
        System.out.println();
        printInfoAboutBus(bus1);
        printInfoAboutBus(bus2);


    }
        private static void printInfoAboutCar(Car car) {
            System.out.println(" Марка " + car.getBrand() + ",модель " + car.getModel() + ",объем двигателя: " + car.getEngineVolume() + ",цвет " + car.getColor() +
                    ",год выпуска: " + car.getManufacturedYear() + ",страна изготовления: " + car.getManufacturedCountry() + " коробка передач " + car.getTransmission()
                    + " тип кузова " + car.getBodyType() + " рег. номер: " + car.getRegNumber() + " количество мест " + car.getPlace() + " тип заправки: " + car.reFill())  ;
        }

    private static void printInfoAboutTrain(Train train) {
        System.out.println("Марка " + train.getBrand() + ",модель " + train.getModel() + ",цвет " + train.getColor() +
                ",год выпуска: " + train.getManufacturedYear() + ",страна изготовления: " + train.getManufacturedCountry() + ", максимальная скорость " +
                train.getMaxSpeed() + " ,цена за поездку " + train.getPriceOfTrip() + " ,начальная станция: " + train.getNameOfStartStation() + " ,конечная станция: " +
                train.getNameOfFinishStation() + " ,количество вагонов " + train.getNumberOfWagons() + " ,время в пути " + train.getTimeOfTrip() + " тип заправки: " + train.reFill());
    }

    private static void printInfoAboutBus(Bus bus) {
         System.out.println(" Марка " + bus.getBrand() + ", модель " + bus.getModel() + ", год выпуска " + bus.getManufacturedYear() +
                 ", страна производства " + bus.getManufacturedCountry() + ", цвет " + bus.getColor() + ", тип заправки: " + bus.reFill());
    }
 }

