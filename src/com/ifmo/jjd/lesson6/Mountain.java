package com.ifmo.jjd.lesson6;

import java.util.Objects;

public class Mountain implements Cloneable{
    private String name;
    private int height;

    //конструктор - вызывается когда мы создаем объект new String и тп
    public Mountain (){
        //вызов конструктора
        this("Гора по умолчанию", 300);
    }

    public Mountain(String name, int height) {
        setName(name);
        setHeight(height);
    }



    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.trim().length() < 2) {
            throw new IllegalArgumentException("name < 2");
        }
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    private void setHeight(int height) {
        if (height < 100) {
            throw new IllegalArgumentException("height < 100");
        }
        this.height = height;
    }


    @Override
    public String toString() {
        return "Mountain{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mountain)) return false;
        Mountain mountain = (Mountain) o;
        return height == mountain.height && Objects.equals(name, mountain.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height);
    }

    @Override
    public Mountain clone() {
        try {
            return (Mountain) super.clone();
        } catch (CloneNotSupportedException e){
            return null;
        }

    }
}
