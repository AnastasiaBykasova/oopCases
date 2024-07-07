package gameCharacters;

public class MainCharacters {
    public static void main(String[] args) {
        // Создание персонажей
        Mage mage = new Mage("Merlin");
        Knight knight = new Knight("Arthur");
        Ranger ranger = new Ranger("Robin");
        Rogue rogue = new Rogue("Shadow");
        Druid druid = new Druid("Fiora");

        // Атака мага
        mage.castSpell(knight);

        // Атака воина
        knight.useSkill(ranger);

        // Атака лучника
        ranger.shootArrow(mage);

        // Атака разбойника
        rogue.stealth();
        rogue.backstab(druid);

        // Друид призывает животное
        druid.summon("Wolf");

        // Друид преобразуется в животное
        druid.transform("Bear");
        druid.attack(knight); // Атака медведя
        druid.untransform();
    }
}
