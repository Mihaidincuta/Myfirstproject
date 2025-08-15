package AnimalRescue;



public class AppMain {

public static void main(String[] args) {

Dog luna = new Dog();
Adopter mihai = new Adopter();
Food pedigree = new Food();
RecreationActivity walk = new RecreationActivity();
Veterinarian alex = new Veterinarian();

luna.setName("luna");
luna.setAge(1);
mihai.setAvailableMoney(500);
pedigree.setPrice(150);
walk.setMood("Walking");
mihai.setNume("Mihai");
alex. setSpecialization("Doctor");





    System.out.println("The dog's name is: " + luna.getName());
    System.out.println("The dog's age is: " + luna.getAge());
    System.out.println("The adopter's name is: " + mihai.getNume());
    System.out.println("The available money is: " + mihai.getAvailableMoney() + " lei");
    System.out.println("The price of the food is: " + pedigree.getPrice() + " lei");
    System.out.println("The recreation activity is: " + walk.getMood());
    System.out.println("Alex is the main " + alex.getSpecialization());



}




}
