package gameCharacters;

public class Rogue extends Character implements Warrior {
    private boolean isStealth;

    public Rogue(String name) {
        super(name);
        this.health = 160;
        this.attack = 18;
        this.defence = 6;
        this.isStealth = false;
    }

    @Override
    public void useSkill(Character target) {
        int damage = (int) (attack * 1.6);
        target.health -= damage;
        System.out.println(name + " использует умение на " + target.name + ". Урон: " + damage);
    }

    public void stealth() {
        if (!isStealth) {
            isStealth = true;
            System.out.println(name + ": Скрылся в тени!");
        } else {
            System.out.println(name + ": Уже скрывается!");
        }
    }

    public void unstealth() {
        if (isStealth) {
            isStealth = false;
            System.out.println(name + ": Вышел из тени!");
        } else {
            System.out.println(name + ": Не был скрыт!");
        }
    }

    public void backstab(Character target) {
        if (isStealth) {
            int damage = (attack * 2);
            target.health -= damage;
            System.out.println(name + " наносит удар в спину " + target.name + ". Урон: " + damage);
            unstealth();
        }
        else {
            System.out.println(name + ": Невозможно нанести удар в спину, не будучи скрытым!");
        }
    }
}
