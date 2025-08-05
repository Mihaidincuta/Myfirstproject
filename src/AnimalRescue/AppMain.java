package AnimalRescue;

import java.util.Arrays;

public class AppMain {

public static void main(String[] args) {

Dog luna = new Dog();
Adopter mihai = new Adopter();
Food pedigree = new Food();
RecreationActivity walk = new RecreationActivity();
Veterinarian alex = new Veterinarian();



    System.out.println("The dog's name is: " + luna.name);
    System.out.println("The adopter's name is: " + mihai.name);
    System.out.println("The price of the food is: " + pedigree.price + " lei");
    System.out.println("The recreation activity is: " + walk.name);
    System.out.println("Alex is the main " + alex.specialization);



}




}
