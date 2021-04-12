package com.ifmo.jjd.lesson6;

import java.util.Objects;
import java.util.UUID;

public class Climber {
    //свойства, которыми будут обладать все ОБъекты класса (поля, атрибуты)
    //сначала указываем тип данных + имя переменной

    private String fullName;
    private int age;
    private String email;
    private UUID uuid;

    // методы - набор инструкций под единым именем (или создать сеттеры)
    //могут просто что-то делают
    void setFullName(String fullName) {
        if (fullName == null || fullName.trim().length() < 3) {
            throw new IllegalArgumentException("Значение fullName < 3");
        }
        this.fullName = fullName;
    }

    /*package-private*/
    void setAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Значение age < 18");
        }
        this.age = age;
    }

    public void setEmail(String email) {
        if (email == null || !email.trim().contains("@")) {
            throw new IllegalArgumentException("Это не email");
        }
        this.email = email;
    }

    public void setUuid() {
        this.uuid = UUID.randomUUID();
    }

    //может возвращать значение свойств getter
    public String getFullName(){
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public UUID getUuid() {
        return uuid;
    }

    // Alt + Insert или правая клавиша Generate
    @Override
    public String toString() {
        return "Climber{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", uuid=" + uuid +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Climber)) return false;
        Climber climber = (Climber) o;
        return age == climber.age && Objects.equals(fullName, climber.fullName) && Objects.equals(email, climber.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, age, email, uuid);
    }
    

}
