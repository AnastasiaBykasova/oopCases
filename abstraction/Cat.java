package abstraction;

public class Cat extends Animal {
    @Override
    public Object makeSound() {
        String string = "Meow!";
        System.out.println(string);
        return string;
    }

    @Override
    public Object eat() {
        String string = "Cat is eating fish";
        System.out.println(string);
        return string;
    }
}
