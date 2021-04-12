package com.ifmo.jjd.lesson7;

abstract public class Unit implements RestAble{ //класс Юнит реализует/имплементирует интерфейс RestAble,
    // может реализовыать много интерфейсов. Интерфейс накладывает на класс обяхательство реализовать все абстрактные
    // методы, которые в нем перечислены на усмотрение класса Unit
    protected int healthScore; // свойства
    protected final int maxHealthScore; // свойства, protected - разрешает к нему обратить из дочернего класса

    public Unit(int healthScore) {
        this.healthScore = healthScore;
        maxHealthScore = healthScore;
    }

    public boolean isAlive() {
        return healthScore > 0; //булевые операторы возвращают true/false, поэтому if не пишем
    }

    // увеличение значения healthScore на count, но не больше maxHealthScore
    public void plusHealth(int count) {
    if (!isAlive()) return;
    healthScore = healthScore + count >= maxHealthScore ? maxHealthScore : healthScore + count;
    }


    // уменьшает значение healthScore на count
    public void minusHealth(int count) {
        if (!isAlive()) return;
        healthScore -= count;
    }

}
