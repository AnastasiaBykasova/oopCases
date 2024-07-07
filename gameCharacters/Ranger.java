package gameCharacters;

public class Ranger extends Character implements Archer {
    public Ranger(String name) {
        super(name);
        this.health = 100;
        this.attack = 12;
        this.defence = 4;
    }

    @Override
    public void shootArrow(Character target) {
        int damage = attack;
        target.health -= damage;
        System.out.println(name + " стреляет в " + target.name + ". Урон: " + damage);
    }
}
