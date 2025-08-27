package com.royvdpol;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * A simple program that displays a random fact about me.
 */
public class RandomFactGenerator {
    private static final List<String> FACTS = initializeFacts();
    private static final Random RANDOM = new Random();


    private static List<String> initializeFacts() {
        List<String> facts = new ArrayList<>();
        facts.add("Op het moment dat ik dit schrijf ben ik 35.");
        facts.add("Ik heb 3 kinderen.");
        facts.add("Ik ben getrouwd.");
        return List.copyOf(facts); // Creates an immutable list (Java 9+)
    }

    private static String getRandomFact() {
        if (FACTS.isEmpty()) {
            return "Geen feiten beschikbaar!";
        }
        return FACTS.get(RANDOM.nextInt(FACTS.size()));
    }

    public static void main(String[] args) {
        System.out.printf("Hoi! Ik ben Roy. En dit is een willekeurig gekozen feitje: %s%n", getRandomFact());
    }
}