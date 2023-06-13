package com.example.slmpruefung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SlmPruefungApplication {

//@RestController leider war dies nicht möglich deshalb hart auf der Console gecodet

    public static void main(String[] args) {
        SpringApplication.run(SlmPruefungApplication.class, args);
        int zahl = 12345;
        int quersumme = berechneQuersumme(zahl);
        System.out.println("Die Quersumme von " + zahl + " ist: " + quersumme);
    }


    public static int berechneQuersumme(int number) {
        int quersumme = 0;
        int durchlaeufe = 0;

        while (number != 0) {
            quersumme += number % 10; // Addiere die letzte Ziffer zur Quersumme
            number /= 10; // Entferne die letzte Ziffer von der Zahl
            durchlaeufe++;
        }

        System.out.println("Anzahl der Durchläufe: " + durchlaeufe);
        return quersumme;
    }
}
