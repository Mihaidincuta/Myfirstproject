package AnimalRescue;

public class Luna extends Dog{

//Java Polymorphism
    @Override
    public void bark() {
        System.out.println("oink oink");
    }

    @Override
    public void bite() {
        System.out.println("meat meat");
    }
}
