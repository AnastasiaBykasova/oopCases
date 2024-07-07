package gameCharacters;

public class Mage extends Character implements MagicUser {
    public Mage(String name) {
        super(name);
        this.mana = 120;
        this.attack = 5;
        this.defence = 2;
    }

    @Override
    public void castSpell(Character target) {
        int damage = (int) (attack * 1.5); //урон магии
        target.health -= damage;
        System.out.println(name + " использует заклинание на " + target.name + ". Урон: " + damage);
    }
}
