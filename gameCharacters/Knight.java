package gameCharacters;

public class Knight extends Character implements Warrior {
    public Knight(String name) {
        super(name);
        this.health = 150;
        this.attack = 15;
        this.defence = 10;
    }

    @Override
    public void useSkill(Character target) {
        int damage = (int) (attack * 1.2);
        target.health -= damage;
        System.out.println(name + " использует умение на " + target.name + ". Урон: " + damage);
    }
}
