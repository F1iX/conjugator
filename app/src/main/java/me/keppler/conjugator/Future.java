package me.keppler.conjugator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by felix on 16/11/17.
 */

public final class Future {
    public static String[] get(String verb){
        String[] forms = new String[6];

        Map<String,String> exceptions = new HashMap<String,String>();
        exceptions.put("caber","cabr"); // Yo cabré = I will fit in
        exceptions.put("decir", "dir"); // Yo diré = I will speak
        exceptions.put("haber", "habr"); // Yo habré = I will have
        exceptions.put("hacer", "har"); // Yo haré = I will do
        exceptions.put("poder","podr"); // Yo podré = I will be able to
        exceptions.put("poner", "pondré"); // Yo pondré = I will put
        exceptions.put("querer", "querr"); // Yo querré = I will want
        exceptions.put("saber", "sabr"); // Yo sabré = I will know
        exceptions.put("salir","saldr"); // Yo saldré = I will leave
        exceptions.put("tener", "tendr"); // Yo tendré = I will have
        exceptions.put("valer", "valdr"); // El valrá = It will be worth
        exceptions.put("venir", "vendr"); // Yo vendré = I will come

        if(exceptions.containsKey(verb)) verb = exceptions.get(verb); // replace infinitive with exception if applicant

        // hablar = to speak
        forms[0] = verb + "é"; // Yo hablaré = I will speak
        forms[1] = verb + "ás"; // Tu hablarás = You will speak
        forms[2] = verb + "á"; // El hablará = He will speak
        forms[3]  = verb + "emos"; // Nosotros hablaremos = We will speak
        forms[4]  = verb + "éis"; // Vosotros hablaréis = You (group) will speak
        forms[5]  = verb + "án"; // Ellos hablarán = They will speak

        return forms;
    }
}
