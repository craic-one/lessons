package com.ifmo.jjd.lesson10;

import java.time.LocalDateTime;

// java.lang.Enum
public class Article {
    private final String title;
    private String text;
    private final LocalDateTime created;
    private Country country;

    public Article (String title){
        this.title = title;
        created = LocalDateTime.now();
    }

    public void setText(String text) {
        this.text = text;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    // объявление перечислений с названием Country, public во всей SRC
    public enum Country { //extends java.lang.Enum
     AUSTRALIA, UK, USA, Beautiful_Russia_of_the_future //ПИШУТСЯ ПО ПРИНЦИПУ КОНСТАНТ
    }
}