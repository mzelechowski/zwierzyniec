package pl.mzelechowski;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Big dog", "woof", true));
        animals.add(new Animal("Cow", "moo", true));
        animals.add(new Animal("Small dog", "woof", false));
        animals.add(new Animal("Frog dog", "croak", false));
        Random r = new Random();
        System.out.println("Loud Animals");
        for (Animal a : animals) {
            int i = r.nextInt(5) + 1;
            Thread.sleep(i * 100);

            if (a.isLoud()) {
                System.out.print(a.getName() + " : ");
                a.speak(i);
            }
        }
        System.out.println("\nSilent Animals");
        for (Animal a : animals) {
            int i = r.nextInt(5) + 1;
            Thread.sleep(i * 100);

            if (!a.isLoud()){
                System.out.print(a.getName() + " : ");
                a.speak(i);
            }
        }


    }
}
