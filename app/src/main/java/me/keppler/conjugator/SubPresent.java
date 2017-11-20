package me.keppler.conjugator;

/**
 * Created by felix on 19/11/17.
 */

public class SubPresent {
    public static String[] get(String verb){
        String[] forms = new String[6];

        if(verb.endsWith("car")){
            verb = verb.substring(0, verb.length()-3) + "quar"; // ...que yo coloque = ...that I place
        } else if(verb.endsWith("gar")){
            verb = verb.substring(0, verb.length()-3) + "guar";
        } else if(verb.endsWith("zar")){
            verb = verb.substring(0, verb.length()-3) + "car"; // ...que yo rechace = ...that I reject
        }
        // Todo: Further "regular" irregularities if not already irregular in 1st person present

        String firstSingularPresent = Present.get(verb)[0];

        // comer = to eat
        forms[0] = firstSingularPresent.substring(0, firstSingularPresent.length()-1) + "a"; // ...que yo coma = ...that I eat
        forms[1] = firstSingularPresent.substring(0, firstSingularPresent.length()-1) + "as"; // ...que tu comas = ...that you eat
        forms[2] = firstSingularPresent.substring(0, firstSingularPresent.length()-1) + "coma"; // ...que el coma = ...that he eats
        forms[3]  = firstSingularPresent.substring(0, firstSingularPresent.length()-1) + "comamos"; // ...que nosotros comamos = ...that we eat
        forms[4]  = firstSingularPresent.substring(0, firstSingularPresent.length()-1) + "comáis"; // ...que vosotros comáis = ...that you eat
        forms[5]  = firstSingularPresent.substring(0, firstSingularPresent.length()-1) + "coman"; // ...que ellos coman = ...that they eat

        if(verb.endsWith("ar")){ // trabajar = to work
            forms[0] = firstSingularPresent.substring(0, firstSingularPresent.length()-1) + "e"; // ...que yo trabaje = ...that I work
            forms[1] = firstSingularPresent.substring(0, firstSingularPresent.length()-1) + "es"; // ...que tu trabajes = ...that you work
            forms[2]  = firstSingularPresent.substring(0, firstSingularPresent.length()-1) + "e"; // ...que el trabaje = ...that he works
            forms[3]  = firstSingularPresent.substring(0, firstSingularPresent.length()-1) + "emos"; // ...que nosotros trabajemos = ...that we work
            forms[4]  = firstSingularPresent.substring(0, firstSingularPresent.length()-1) + "éis"; // ...que vosotros trabajéis = ...that you work
            forms[5]  = firstSingularPresent.substring(0, firstSingularPresent.length()-1) + "en"; // ...que ellos trabajen = ...that they work
        }

        switch(verb){
            case "dar":
                forms[0] = "dé";
                forms[2] = "dé";
                forms[4] = "deis";
                break;
            case "estar":
                forms[0] = "esté";
                forms[1] = "estés";
                forms[2] = "esté";
                forms[5] = "estén";
                break;
            case "haber":
                forms[0] = "haya";
                forms[1] = "hayas";
                forms[2] = "haya";
                forms[3] = "hayamos";
                forms[4] = "hayáis";
                forms[5] = "hayan";
                break;
            case "ir":
                forms[0] = "vaya";
                forms[1] = "vayas";
                forms[2] = "vaya";
                forms[3] = "vayamos";
                forms[4] = "vayáis";
                forms[5] = "vayan";
                break;
            case "saber":
                forms[0] = "sepa";
                forms[1] = "sepas";
                forms[2] = "sepa";
                forms[3] = "sepamos";
                forms[4] = "sepáis";
                forms[5] = "sepan";
                break;
            case "ser":
                forms[0] = "sea";
                forms[1] = "seas";
                forms[2] = "sea";
                forms[3] = "seamos";
                forms[4] = "seáis";
                forms[5] = "sean";
                break;
        }
        return forms;
    }
}
