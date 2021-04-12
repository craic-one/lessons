package com.ifmo.jjd.lesson7;

// стаический импорт

import com.ifmo.jjd.lesson7.utils.Randoms;

import static com.ifmo.jjd.lesson7.Settings.*; // * импортирует все константы из класса Settings


final public class King extends Unit { // если у класса стоит final то у него не могут быть наследники
    private int gold = GOLD_COUNT; // или вариант: Settings.GOLD_COUNT;
    private BattleUnit[] army; //из объектов родительского типа значит в массив можем добавить объекты BattleUnit
    // и любого егоналсдника Infantry. Но при обращении будут доступны свойства и методы только
    // из родительского BattleUnit

    public King() {
        super(KING_HEALTH);
    }

    // стоимость армии 200
    private void generateArmy() {
        army = new BattleUnit[ARMY_COUNT];
        if (gold < ARMY_PRICE) return;
        for (int i = 0; i < army.length; i++) {
            army[i] = BattleUnit.getBattleUnit(); //армия состоит из БаттлЮнитов по методу гетБаттлеЮнит
        }
        minusGold(ARMY_PRICE); // этот метод вызываем, так как он описан ниже
    }

    //стоимость каждого юнита 20
    public void addUnit() {
        for (int i = 0; i < army.length; i++) {
            if (army[i].isAlive()) continue; // если юнит жив, то проверяем деньги у короля и дальше
            if ((gold - UNIT_PRICE) < 0) return; //сначала надо проверить выполняется ли протое условие на ноль?!
            army[i] = BattleUnit.getBattleUnit(); // создаем новую боевую единицу
            minusGold(UNIT_PRICE);
        }

    }

    public void startBattle(King enemy) {
        // в цикле
        //1. рандомный юнит армии короля атакует рандомного юнита из армии противника
        //2. рандомный юнит армии противника атакует рандомного юнита из армии короля
        // после атаки у юнитов вызывается метод rest()
        // юниты с 0 здоровьем не должны атаковать
        // юнитов с 0 здоровья нельзя атаковать
        for (int i = 0; i < army.length; i++) {
            int thisIndex = Randoms.getRandomInt(army.length);
            int enemyIndex = Randoms.getRandomInt(army.length);
            if (!army[thisIndex].isAlive() || !enemy.army[enemyIndex].isAlive()) continue;
            army[thisIndex].attack(enemy.army[enemyIndex]);
            army[thisIndex].rest();
            if (!enemy.army[enemyIndex].isAlive()) continue;
            enemy.army[enemyIndex].attack(army[thisIndex]);
            enemy.army[enemyIndex].rest();
        }

        // количество живых юнитов

    }

    private boolean hasGold() {
        return gold > 0;
    }

    private void plusGold(int count) {
        gold += count;
    }

    private void minusGold(int count) {
        if (!hasGold()) return;
        gold -= count;
    }

    @Override
    public void rest() {
        minusGold(50);
        plusHealth(10);
    }
}
