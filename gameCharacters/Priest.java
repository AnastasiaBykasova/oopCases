package gameCharacters;

public class Priest extends Character implements MagicUser {
    public Priest(String name) {
        super(name);
        this.health = 140;
        this.attack = 13;
        this.defence = 7;
    }

    @Override
    public void castSpell(Character target) {
        int damage = (int) (attack * 2); //урон магии
        target.health -= damage;
        System.out.println(name + " использует заклинание на " + target.name + ". Урон: " + damage);
    }

    public void heal(Character target) {
        int healing = level * attack;
        target.health += healing;
        System.out.println(name + " исцеляет " + target.name + " на " + healing + " здоровья");
    }
}
