package com.royvdpol;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static List<String> facts = new ArrayList<String>();
    public static void main(String[] args) {
        facts.add("Op het moment dat ik dit schrijf ben ik 35.");
        facts.add("Ik heb 3 kinderen.");
        facts.add("Ik ben getrouwd.");

        System.out.println("Hoi! Ik ben Roy. En dit is een willekeurig gekozen feitje uit een List: ");

        String randomItem = facts.get(new Random().nextInt(facts.size()));

        System.out.println(randomItem);
    }
}