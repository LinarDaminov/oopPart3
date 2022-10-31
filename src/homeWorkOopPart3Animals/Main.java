package homeWorkOopPart3Animals;

import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] args) {
        Herbivores gazelle = new Herbivores("gazelle", 2, "field", 12.2, "grass");
        Herbivores giraffe = new Herbivores("giraffe", 1, "zoo", 3, "grass");
        Herbivores horse = new Herbivores("horse", 5, "village", 15, "grass");

        System.out.println(gazelle.toString());
        gazelle.eat();
        System.out.println(giraffe.toString());
        giraffe.eat();
        System.out.println(horse.toString());
        horse.eat();



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
        frog.eat();
        System.out.println(snake.toString());
        snake.eat();

        DontFlyingBirds peacock = new DontFlyingBirds("peacock ", 1, "zoo", "walk");
        DontFlyingBirds penguin = new DontFlyingBirds("penguin", 1, "zoo", "walk");
        DontFlyingBirds doDoBird = new DontFlyingBirds("doDoBird", 1, "zoo", "walk");

        System.out.println(peacock.toString());
        peacock.move();
        System.out.println(penguin.toString());
        penguin.move();
        System.out.println(doDoBird.toString());
        doDoBird.move();


        FlyingBirds seagull = new FlyingBirds("seagull", 2, "sea", "fly");
        FlyingBirds altbatros = new FlyingBirds("altbatros ", 2, "sea, ", "fly");
        FlyingBirds falcon = new FlyingBirds("falcon", 2, "sea", "fly");

        System.out.println(seagull.toString());
        seagull.move();
        System.out.println(altbatros.toString());
        altbatros.move();
        System.out.println(falcon.toString());
        falcon.move();

        System.out.println(hyena.equals(tiger));
        System.out.println(bear.equals(horse));
        System.out.println(horse.equals(falcon));
        System.out.println(gazelle.equals(altbatros));
        System.out.println(frog.equals(horse));
        System.out.println(seagull.equals(giraffe));
        System.out.println(frog.equals(frog));

    }

}

