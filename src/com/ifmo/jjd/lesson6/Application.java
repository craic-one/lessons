package com.ifmo.jjd.lesson6;

import java.lang.management.MonitorInfo;
import java.util.UUID;

public class Application {
    public static void main(String[] args) {
        Climber climber1 = new Climber();
        // обращение к свойствам объекта
        //climber1.fullName = "Иван Григорьев";
        //climber1.email = "ivan@mail.com";
        //climber1.age = 35;
        //climber1.uuid = UUID.randomUUID();
        climber1.setFullName("Иван Григорьев");
        climber1.setAge(34);
        climber1.setEmail("ivan@mail.com");
        climber1.setUuid();

        Climber climber2 = new Climber();
        // обращение к свойствам объекта
        //climber2.fullName = "Елена Михайлова";
        //climber2.email = "lenalena@mail.com";
        //climber2.age = 33;
        //climber2.uuid = UUID.randomUUID();

        climber2.setFullName("Елена Михайлова");
        climber2.setAge(32);
        climber2.setEmail("lenelene@mail.com");
        climber2.setUuid();

        int elenaAge = climber1.getAge();

        System.out.println(elenaAge);
        System.out.println(climber1);
        System.out.println(climber2);

        Mountain everest = new Mountain("Эверест", 8848);
        Mountain elbrus = new Mountain("Эльбрус",5642);

        Mountain defaultMountain = new Mountain();

        System.out.println(everest);
        System.out.println(elbrus);



    }
}
