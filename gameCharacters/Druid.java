package gameCharacters;

public class Druid extends Character implements MagicUser {
    private boolean isTransformed;
    private String animalForm;

    public Druid(String name) {
        super(name);
        this.mana = 100;
        this.attack = 4;
        this.defence = 3;
        this.isTransformed = false;
        this.animalForm = "";
    }

    @Override
    public void castSpell(Character target) {
        int damage = (int) (attack * 1.1); //урон магии
        target.health -= damage;
        System.out.println(name + " использует заклинание на " + target.name + ". Урон: " + damage);
    }

    public void summon(String animal) {
        if (!isTransformed) {
            System.out.println(name + " призывает " + animal + "!");
            // логика для вызова животного
            // создать объект "animal" и добавить его в список союзников
        } else {
            System.out.println(name + " уже преобразован в " + animalForm + "!");
        }
    }

    public void transform(String animal) {
        if (!isTransformed) {
            isTransformed = true;
            animalForm = animal;
            System.out.println(name + " преобразуется в " + animal + "!");
            // логика для трансформации
            // изменить характеристики персонажа на характеристики животного
        } else {
            System.out.println(name + " уже преобразован в " + animalForm + "!");
        }
    }

    public void untransform() {
        if (isTransformed) {
            isTransformed = false;
            System.out.println(name + " возвращается в свою человеческую форму!");
            // логика для обратной трансформации
            // вернуть характеристики персонажа к исходным
        } else {
            System.out.println(name + " не был преобразован!");
        }
    }
}
