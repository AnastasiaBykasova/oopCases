package abstraction;

// абстрактный класс, представляющий всех животных
abstract class Animal {
    public void eat() {
        System.out.println("The animal is eating.");
    }

    // абстрактный метод, который должен быть реализован в каждом подклассе
    public abstract void makeSound();
}
