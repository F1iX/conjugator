package me.keppler.conjugator;

/**
 * Created by felix on 20/11/17.
 */

public class Conditional {
    public static String[] get(String verb){
        String[] forms = new String[6];

        verb = Future.replaceExceptions(verb); // same irregularities as future tense

        // hablar = to speak
        forms[0] = verb + "ía"; // Yo hablaría = I would speak
        forms[1] = verb + "ías"; // Tu hablarías = You would speak
        forms[2] = verb + "ía"; // El hablaría = He would speak
        forms[3]  = verb + "íamos"; // Nosotros hablaríamos = We would speak
        forms[4]  = verb + "íais"; // Vosotros hablaríais = You (group) would speak
        forms[5]  = verb + "ían"; // Ellos hablarian = They would speak

        return forms;
    }
}
