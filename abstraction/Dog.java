package abstraction;

public class Dog extends Animal {
    @Override
    public Object makeSound() {
        String string = "Bark!";
        System.out.println(string);
        return string;
    }
}
