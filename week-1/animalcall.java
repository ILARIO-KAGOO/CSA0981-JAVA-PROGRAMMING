//import java.util.*;

class Animal
{
    public void animalsound()
    {
        System.out.println("AnimalSound");
    }
}

class Dog extends Animal
{
    public void animalsound()
    {
        System.out.println("Dog sound");
    }
}
public class animalcall {
    public static void main(String[] args)
    {
        Dog hi;
        hi = new Dog();
        hi.animalsound();
    }
}