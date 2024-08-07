package abstraction;

import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalsTest {

    @Test
    public void testMakeSoundDog() {
        Dog dog = new Dog();
        assertEquals("Bark!", dog.makeSound());
    }

    @Test
    public void testMakeSoundCat() {
        Cat cat = new Cat();
        assertEquals("Meow!", cat.makeSound());
    }

    @Test
    public void testEatAnimal() {
        Animal animal = new Dog(); // Это может быть любой объект Animal
        assertEquals("The animal is eating.", animal.eat());
    }

    @Test
    public void testEatCat() {
        Cat cat = new Cat();
        assertEquals("Cat is eating fish", cat.eat());
    }
}