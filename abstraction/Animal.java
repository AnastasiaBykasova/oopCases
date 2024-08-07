package abstraction;

// абстрактный класс, представляющий всех животных
abstract class Animal {
    public Object eat() {
        String string = "The animal is eating.";
        System.out.println(string);
        return string;
    }

    // абстрактный метод, который должен быть реализован в каждом подклассе
    public abstract Object makeSound();
}
