package me.keppler.conjugator;

import android.content.Context;

/**
 * Created by felix on 02/10/17.
 */

public final class Present {
    public static String[] get(String verb){
        String[] forms = new String[6];
        
        // comer = to eat
        forms[0] = verb.substring(0, verb.length()-2) + "o"; // Yo como = I eat
        forms[1] = verb.substring(0, verb.length()-2) + "es"; // Tu comes = You eat
        forms[2] = verb.substring(0, verb.length()-2) + "e"; // El come = He eats
        forms[3]  = verb.substring(0, verb.length()-2) + "emos"; // Nosotros comemos = We eat
        forms[4]  = verb.substring(0, verb.length()-2) + "éis"; // Vosotros coméis = You eat
        forms[5]  = verb.substring(0, verb.length()-2) + "en"; // Ellos comen = They eat

        if(verb.endsWith("ir")){ // asistir = to attend
            forms[3]  = verb.substring(0, verb.length()-2) + "imos"; // Nosotros asistimos = We attend
            forms[4]  = verb.substring(0, verb.length()-2) + "ís"; // Vosotros asistís = You attend
        } else if(verb.endsWith("ar")){ // trabajar = to work
            forms[1] = verb.substring(0, verb.length()-2) + "as"; // Tu trabajas = You work
            forms[2] = verb.substring(0, verb.length()-2) + "a"; // El trabaja = He works
            forms[3]  = verb.substring(0, verb.length()-2) + "amos"; // Nosotros trabajamos = We work
            forms[4]  = verb.substring(0, verb.length()-2) + "áis"; // Vosotros trabajáis = You work
            forms[5]  = verb.substring(0, verb.length()-2) + "an"; // Ellos trabajan = They work
        }

        switch(verb){
            case "ir":
                forms[0] = "voy";
                forms[1] = "vas";
                forms[2] = "va";
                forms[3] = "vamos";
                forms[4] = "vais";
                forms[5] = "van";
                break;
            case "dormir":
                forms[0] = "duermo";
                forms[1] = "duermes";
                forms[2] = "duerme";
                forms[5] = "duermen";
                break;
            case "haber":
                forms[0] = "he";
                forms[1] = "has";
                forms[2] = "ha";
                forms[3] = "habemos";
                forms[5] = "han";
                break;
            case "asir":
                forms[0] = "asgo";
                break;
            case "caer":
                forms[0] = "caigo";
                break;
            case "dar":
                forms[0] = "doy";
                break;
            case "decir":
                forms[0] = "digo";
                break;
            case "hacer":
                forms[0] = "hago";
                break;
            case "poner":
                forms[0] = "pongo";
                break;
            case "saber":
                forms[0] = "sé";
                break;
            case "salir":
                forms[0] = "salgo";
                break;
            case "tener":
                forms[0] = "tengo";
                break;
            case "traer":
                forms[0] = "traigo";
                break;
            case "valer":
                forms[0] = "valgo";
                break;
            case "venir":
                forms[0] = "vengo";
                break;
            case "ver":
                forms[0] = "veo";
                break;
        }

        //Todo: Further irregularities

        return forms;
    }
}
