package me.keppler.conjugator;

/**
 * Created by felix on 16/11/17.
 */

public final class Imperfect {
    public static String[] get(String verb) {
        String[] forms = new String[6];

        if(verb.equals("ver")){ // ver = to see
            verb = "ver*"; // Yo veía, Tu veías, El veía, Nosotros veíamos, Vosotros veíais, Ellos veían
        }

        // comer = to eat, pedir = to ask
        forms[0] = verb.substring(0, verb.length() - 2) + "ía"; // Yo comía = I ate, Yo pedía = I asked
        forms[1] = verb.substring(0, verb.length() - 2) + "ías"; // Tu comías = You ate, Tu pedías = You asked
        forms[2] = verb.substring(0, verb.length() - 2) + "ía"; // Ella comía = She ate, El pedía = He asked
        forms[3] = verb.substring(0, verb.length() - 2) + "íamos"; // Nosotros comíamos = We ate, Nosotros pedíamos = We asked
        forms[4] = verb.substring(0, verb.length() - 2) + "íais"; // Vosotros comíais = You ate, Vosotros pedíais = You asked
        forms[5] = verb.substring(0, verb.length() - 2) + "ían"; // Ellos comían = They ate, Ellas pedían = They asked

        if (verb.endsWith("ar")) { // hablar = to speak
            forms[0] = verb.substring(0, verb.length() - 2) + "aba"; // Yo hablaba = I spoke
            forms[1] = verb.substring(0, verb.length() - 2) + "abas"; // Tu hablabas = You spoke
            forms[2] = verb.substring(0, verb.length() - 2) + "aba"; // El hablaba = He spoke
            forms[3] = verb.substring(0, verb.length() - 2) + "ábamos"; // Nosotros hablábamos = We spoke
            forms[4] = verb.substring(0, verb.length() - 2) + "abais"; // Vosotros hablabais = You spoke
            forms[5] = verb.substring(0, verb.length() - 2) + "aban"; // Ellos hablaban = They spoke
        }

        switch(verb){
            case "ir": // ir = to go
                forms[0] = "iba";
                forms[1] = "ibas";
                forms[2] = "iba";
                forms[3] = "íbamos";
                forms[4] = "ibais";
                forms[5] = "iban";
                break;
            case "ser": // ser = to be
                forms[0] = "era";
                forms[1] = "eras";
                forms[2] = "era";
                forms[3] = "éramos";
                forms[4] = "erais";
                forms[5] = "eran";
                break;
        }
        return forms;
    }
}
