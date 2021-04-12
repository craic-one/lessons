package com.ifmo.jjd.lesson6;

import java.util.Arrays;
import java.util.Objects;

public class ClimbingGroup {
    private Mountain mountain;
    private Climber[] climbers;

    public ClimbingGroup(Mountain mountain, int climbersCount) {
        this.mountain = Objects.requireNonNull(mountain, "Гора это не ноль");
        climbers = new Climber[climbersCount];
    }

    public void addClimber (Climber climber){
        Objects.requireNonNull(climber,"Климбер не может быть без имени");
        for (int i = 0; i < climbers.length; i++) {
            if (climbers[i] == null){
                climbers[i]=climber;
                return; //в void методах используется для завершения работы метода
            }
                                }
        System.out.println("Мест нет");
    }

    @Override
    public String toString() {
        return "ClimbingGroup{" +
                "mountain=" + mountain +
                ", climbers=" + Arrays.toString(climbers) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClimbingGroup)) return false;
        ClimbingGroup that = (ClimbingGroup) o;
        return Objects.equals(mountain, that.mountain) && Arrays.equals(climbers, that.climbers);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mountain);
        result = 31 * result + Arrays.hashCode(climbers);
        return result;
    }

    @Override
    public ClimbingGroup clone() {
        Mountain copyM = this.mountain.clone();
        ClimbingGroup copyGr = new ClimbingGroup(copyM, climbers.length);
        copyGr.climbers = climbers.clone();
        return copyGr;
    }
}
