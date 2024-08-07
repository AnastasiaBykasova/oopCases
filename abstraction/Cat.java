package abstraction;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating fish");
    }
}
