package dev.indicemasacorporal;

import java.util.Scanner;
import dev.indicemasacorporal.models.Calcular;
import dev.indicemasacorporal.models.Person;
/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    // public static void main(String[] args) {
    //     System.out.println("Hello World!");
    // }


public static void main(String[] args) {

    Scanner dataEntry = new Scanner(System.in);


    System.out.println("Introduce tu altura en metros: ");
    double height1 = dataEntry.nextDouble();

    System.out.println("Introduce tu peso en kilogramos: ");
    double weight1 = dataEntry.nextDouble();


    Person person = new Person(weight1, height1);

    Calcular imcCaculator = new Calcular();

    String result = imcCaculator.calculateIMC(person);

    double calculated = person.getWeight() / Math.pow(person.getHeight(), 2);
    
    System.out.println ("Tu IMC es: " + calculated  + result);




    dataEntry.close();
}



}