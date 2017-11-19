package me.keppler.conjugator;

/**
 * Created by felix on 18/11/17.
 */

public class Preterite {
    public static String[] get(String verb) {
        String[] forms = new String[6];

        // comer = to eat, compartir = to share
        forms[0] = verb.substring(0, verb.length() - 2) + "í"; // Yo comí = I ate, Yo compartí = I shared
        forms[1] = verb.substring(0, verb.length() - 2) + "iste"; // Tu comiste = You ate, Tu compartiste = You shared
        forms[2] = verb.substring(0, verb.length() - 2) + "ió"; // Ella comió = She ate, El compartió = He shared
        forms[3] = verb.substring(0, verb.length() - 2) + "imos"; // Nosotros comimos = We ate, Nosotros compartimos = We shared
        forms[4] = verb.substring(0, verb.length() - 2) + "isteis"; // Vosotros comisteis = You ate, Vosotros compartisteis = You shared
        forms[5] = verb.substring(0, verb.length() - 2) + "ieron"; // Ellos comieron = They ate, Ellas compartieron = They shared

        if (verb.endsWith("ar")) { // hablar = to speak
            forms[0] = verb.substring(0, verb.length() - 2) + "é"; // Yo hablé = I spoke
            forms[1] = verb.substring(0, verb.length() - 2) + "aste"; // Tu hablaste = You spoke
            forms[2] = verb.substring(0, verb.length() - 2) + "ó"; // El habló = He spoke
            forms[3] = verb.substring(0, verb.length() - 2) + "amos"; // Nosotros hablamos = We spoke
            forms[4] = verb.substring(0, verb.length() - 2) + "asteis"; // Vosotros hablasteis = You spoke
            forms[5] = verb.substring(0, verb.length() - 2) + "aron"; // Ellos hablaron = They spoke
        }

        switch(verb){
            case "andar": // to go
                forms[0] = "anduve";
                forms[1] = "anduviste";
                forms[2] = "anduvo";
                forms[3] = "anduvimos";
                forms[4] = "anduvisteis";
                forms[5] = "anduvieron";
                break;
            case "ir": // to go
            case "ser": // to be
                forms[0] = "fui"; // Yo fui allí ayer = I was there yesterday
                forms[1] = "fuiste"; // Fuiste anoche = You were last night
                forms[2] = "fue"; // El fue una vez = He was once
                forms[3] = "fuimos"; // Nosotros fuimos hace dos meses = We were two months ago
                forms[4] = "fuisteis"; // Vosotros fuisteis la semana pasada = You were last week
                forms[5] = "fueron"; // Ellos fueron anoche = They were last night
                break;
            case "conducir": // to drive
                forms[0] = "conduje"; // Yo conduje ayer = I drove yesterday
                forms[1] = "condujiste"; // Condujiste una vez = You drove one time
                forms[2] = "condujo"; // El condujo anoche = He drove last night
                forms[3] = "condujimos"; // Nosotros condujimos esta tarde = We drove this afternoon
                forms[4] = "condujisteis"; // Vosotros condujisteis el lunes pasado = You drove last monday
                forms[5] = "condujeron"; // Ellos condujeron hace dos dias = They drove two days ago
                break;
            case "dar": // to give
                forms[0] = "di"; // Yo di anteayer = I gave the day before yesterday
                forms[1] = "diste"; // Diste hoy por la mañana = You gave this morning
                forms[2] = "dio"; // El dio el otro día = He gave the other day
                forms[3] = "dimos"; // Nosotros dimos entonces = We gave then
                forms[4] = "disteis"; // Vosotros disteis el año pasado = They gave last year
                forms[5] = "dieron"; // Ellos dieron desde el primer momento = They gave from the first moment
                break;
            case "decir": // to say/tell
                forms[0] = "dije"; // Yo dije en ese momento = I said that moment
                forms[1] = "dijiste"; // Dijiste ayer = You said yesterday
                forms[2] = "dijo"; // El dijo anteanoche = He said the night before last night
                forms[3] = "dijimos"; // Nosotros dijimos ayer al mediodía = We said yesterday at noon
                forms[4] = "dijisteis"; // Vosotros dijisteis hace dos días = You said two days ago
                forms[5] = "dijeron"; // Ellos dijeron anteayer = They said the day before yesterday
                break;
            case "estar": // to be (feeling)
                forms[0] = "estuve"; // Yo estuve una vez = I was once
                forms[1] = "estuviste"; // Estuviste anoche = You were last night
                forms[2] = "estuvo"; // El estuvo esta tarde = He was this afternoon
                forms[3] = "estuvimos"; // Nosotros estuvimos ayer por la noche = We were last night
                forms[4] = "estuvisteis"; // Vosotros estuvisteis = You were
                forms[5] = "estuvieron"; // Ellos estuvieron = They were
                break;
            case "hacer": // to do
                forms[0] = "hice";
                forms[1] = "hiciste";
                forms[2] = "hizo";
                forms[3] = "hicimos";
                forms[4] = "hicisteis";
                forms[5] = "hicieron";
                break;
            case "poner": // to put
                forms[0] = "puse";
                forms[1] = "pusiste";
                forms[2] = "puso";
                forms[3] = "pusimos";
                forms[4] = "pusisteis";
                forms[5] = "pusieron";
                break;
            case "poder": // to be able to
                forms[0] = "pude";
                forms[1] = "pudiste";
                forms[2] = "pudo";
                forms[3] = "pudimos";
                forms[4] = "pudisteis";
                forms[5] = "pudieron";
                break;
            case "querer": // to want/love
                forms[0] = "quise";
                forms[1] = "quisiste";
                forms[2] = "quiso";
                forms[3] = "quisimos";
                forms[4] = "quisisteis";
                forms[5] = "quisieron";
                break;
                // TODO: Further irregularities
        }
        return forms;
    }
}
