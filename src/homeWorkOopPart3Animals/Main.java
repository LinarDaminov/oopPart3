package homeWorkOopPart3Animals;

import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] args) {
        Herbivores gazelle = new Herbivores("gazelle", 2, "field", 12.2, "grass");
        Herbivores giraffe = new Herbivores("giraffe", 1, "zoo", 3, "grass");
        Herbivores horse = new Herbivores("horse", 5, "village", 15, "grass");

        System.out.println(gazelle.toString());
        gazelle.graze();
        System.out.println(giraffe.toString());
        giraffe.graze();
        System.out.println(horse.toString());
        horse.graze();
        System.out.println(gazelle.equals(giraffe));
        System.out.println(giraffe.equals(horse));

        Predators hyena = new Predators("hyena", 2, "forest", 12, "meat");
        Predators tiger = new Predators("tiger", 6, "desert", 18, "meat");
        Predators bear = new Predators("bear", 4, "forest", 7, "meat");

        System.out.println(hyena.toString());
        hyena.toString();
        System.out.println(tiger.toString());
        tiger.toString();
        System.out.println(bear.toString());
        bear.toString();

        Amphibia frog = new Amphibia("frog", 1, "water");
        Amphibia snake = new Amphibia("snake", 2, "water");

        System.out.println(frog.toString());
        frog.hunt();
        System.out.println(snake.toString());
        snake.hunt();

        DontFlyingBirds peacock = new DontFlyingBirds("peacock ", 1, "zoo", "walk");
        DontFlyingBirds penguin = new DontFlyingBirds("penguin", 1, "zoo", "walk");
        DontFlyingBirds doDobird = new DontFlyingBirds("doDoBird", 1, "zoo", "walk");

        System.out.println(peacock.toString());
        peacock.walk();
        System.out.println(penguin.toString());
        penguin.walk();
        System.out.println(doDobird.toString());
        doDobird.walk();


        FlyingBirds seagull = new FlyingBirds("seagull", 2, "sea", "fly");
        FlyingBirds altbatros = new FlyingBirds("altbatros ", 2, "sea, ", "fly");
        FlyingBirds falcon = new FlyingBirds("falcon", 2, "sea", "fly");

        System.out.println(seagull.toString());
        seagull.fly();
        System.out.println(altbatros.toString());
        altbatros.fly();
        System.out.println(falcon.toString());
        falcon.fly();

    }

}

