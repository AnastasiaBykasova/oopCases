package gameCharacters;

import java.util.Timer;
import java.util.TimerTask;

public abstract class Character {
    protected String name;
    protected int level;
    private int XP;
    private int neededXP;
    protected int health;
    private int maxHealth;
    protected int mana;
    private int maxMana;
    protected int attack;
    protected int defence;

    public Character(String name) {
        this.name = name;
        this.level = 1;
        this.health = 100;
        this.maxHealth = 100;
        this.mana = 50;
        this.maxMana = 50;
        this.attack = 10;
        this.defence = 5;
    }

    // Метод для восстановления маны каждые 10 минут
    public void startManaRegen() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                regenMana();
            }
        }, 0, 600000); // 600000 миллисекунд = 10 минут
    }

    // Метод для увеличения маны на определенное значение
    private void regenMana() {
        mana += 5; // Например, прибавляем 5 маны за 10 минут
        if (mana > maxMana) {
            mana = maxMana; // Не позволяем мане превысить максимум
        }
        System.out.println(name + ": Мана восстановлена, текущее значение: " + mana);
    }

    public void attack(Character target) {
        int damage = attack - target.defence;
        target.health -= damage;
        System.out.println(name + " атакует " + target.name + ". Урон: " + damage);
    }

    public void addExperience(int experience) {
        XP += experience;
        if (isFull(XP, neededXP)) {
            levelUp();
        }
    }

    private void levelUp() {
        level++;
        neededXP = calculateXpForNextLevel(neededXP, level);
        health += 50;
        maxHealth += 50;
        mana += 10;
        maxMana += 10;
        attack += 5;
        defence += 5;
        System.out.println(name + ": Повышен до уровня " + level + "!");
    }

    private int calculateXpForNextLevel(int previous, int level) {
        int res = previous * level;
        return res;
    }

    public void heal(int amount) {
        health += amount;
        if (isFull(health, maxHealth)) {
            health = maxHealth;
        }
        System.out.println(name + ": Здоровье восстановлено, текущее значение: " + health);
    }

    private boolean isFull(int current, int max) {
        return current >= max;
    }
}
