package me.keppler.conjugator;

import android.content.Context;

/**
 * Created by felix on 02/10/17.
 */

public final class Present {
    public static String[] get(String verb){
        String[] forms = new String[6];
        
        // comer = eat
        forms[0] = verb.substring(0, verb.length()-2) + "o";
        forms[1] = verb.substring(0, verb.length()-2) + "es"; // differs for -ar
        forms[2] = verb.substring(0, verb.length()-2) + "e"; // differs for -ar
        forms[3]  = verb.substring(0, verb.length()-2) + "emos"; // differs for -ir/-ar
        forms[4]  = verb.substring(0, verb.length()-2) + "éis"; // differs for -ir/-ar
        forms[5]  = verb.substring(0, verb.length()-2) + "en"; // differs for -ar

        if(verb.endsWith("ir")){ // asistir = attend
            forms[3]  = verb.substring(0, verb.length()-2) + "imos";
            forms[4]  = verb.substring(0, verb.length()-2) + "ís";
        } else if(verb.endsWith("ar")){ // trabajar = work
            forms[1] = verb.substring(0, verb.length()-2) + "as";
            forms[2] = verb.substring(0, verb.length()-2) + "a";
            forms[3]  = verb.substring(0, verb.length()-2) + "amos";
            forms[4]  = verb.substring(0, verb.length()-2) + "áis";
            forms[5]  = verb.substring(0, verb.length()-2) + "an";
        }

        if(verb.equals("ir")){
            forms[0] = "voy";
            forms[1] = "vas";
            forms[2] = "va";
            forms[3] = "vamos";
            forms[4] = "vais";
            forms[5] = "van";
        } else if(verb.equals("dormir")){
            forms[0] = "duermo";
            forms[1] = "duermes";
            forms[2] = "duerme";
            forms[5] = "duermen";
        } else if(verb.equals("haber")) {
            forms[0] = "he";
            forms[1] = "has";
            forms[2] = "ha";
            forms[3] = "habemos";
            forms[5] = "han";
        } else if(verb.equals("asir")){
            forms[0] = "asgo";
        } else if(verb.equals("caer")){
            forms[0] = "caigo";
        } else if(verb.equals("dar")){
            forms[0] = "doy";
        } else if(verb.equals("decir")){
            forms[0] = "digo";
        } else if(verb.equals("hacer")){
            forms[0] = "hago";
        } else if(verb.equals("poner")){
            forms[0] = "pongo";
        } else if(verb.equals("saber")){
            forms[0] = "sé";
        } else if(verb.equals("salir")){
            forms[0] = "salgo";
        } else if(verb.equals("tener")){
            forms[0] = "tengo";
        } else if(verb.equals("traer")){
            forms[0] = "traigo";
        } else if(verb.equals("valer")){
            forms[0] = "valgo";
        } else if(verb.equals("venir")){
            forms[0] = "vengo";
        } else if(verb.equals("ver")){
            forms[0] = "veo";
        }

        return forms;
    }
}
