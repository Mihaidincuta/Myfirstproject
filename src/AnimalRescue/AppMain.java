package AnimalRescue;



public class AppMain {

public static void main(String[] args) {

Dog dog = new Dog();
Adopter mihai = new Adopter();
Food pedigree = new Food();
RecreationActivity walk = new RecreationActivity();
Veterinarian alex = new Veterinarian();

dog.setName("luna");
dog.setAge(1);
mihai.setAvailableMoney(500);
pedigree.setPrice(150);
walk.setMood("Walking");
mihai.setNume("Mihai");
alex. setSpecialization("Doctor");
dog.setSpeak("woof");






    System.out.println("The dog's name is: " + dog.getName());
    System.out.println("The dog's age is: " + dog.getAge());
    System.out.println("The adopter's name is: " + mihai.getNume());
    System.out.println("The available money is: " + mihai.getAvailableMoney() + " lei");
    System.out.println("The price of the food is: " + pedigree.getPrice() + " lei");
    System.out.println("The recreation activity is: " + walk.getMood());
    System.out.println("Alex is the main " + alex.getSpecialization());
    System.out.println("The dog speak: " + dog.getSpeak());

    //Java Polymorphism


    Luna luna = new Luna();

    dog.bark();

    luna.bark();

    dog.bite();

    luna.bite();













}






}
