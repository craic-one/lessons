package com.ifmo.jjd.lesson7;

import com.ifmo.jjd.lesson7.utils.Randoms;

abstract public class BattleUnit extends Unit implements AttackAble {
    // Unit супер класс
    //BattleUnit дочерний, получает все методы и свойства из суперкласса
    // Конструкторы не наследуются

    private int attackScore;

    public BattleUnit(int healthScore, int attackScore) {
        super(healthScore); // вызовы констурктора родителя super - это обращение к родител ьскому классй
        this.attackScore = attackScore;
    }

    public int getAttackScore() {
        return attackScore;
    }

    public static BattleUnit getBattleUnit() {
        String[] tyres = {"knight", "infantry"};
        BattleUnit unit = null;
        switch (tyres[Randoms.getRandomInt(tyres.length)]) {
            case "knight":
                unit = new Knight(Randoms.getRandomInt(10, 30), Randoms.getRandomInt(10, 50));
                break;
            case "infantry":
                unit = new Infantry(Randoms.getRandomInt(10, 60), Randoms.getRandomInt(10, 40));
                break;

        }
        return unit;
    }
}
