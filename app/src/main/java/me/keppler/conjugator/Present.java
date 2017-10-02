package me.keppler.conjugator;

/**
 * Created by felix on 02/10/17.
 */

public final class Present {
    public static Conjugation get(String verb){
        Conjugation forms = new Conjugation();

        // comer = eat
        forms.Yo = verb.substring(0, verb.length()-2) + "o";
        forms.Tu = verb.substring(0, verb.length()-2) + "es"; // differs for -ar
        forms.El = verb.substring(0, verb.length()-2) + "e"; // differs for -ar
        forms.Nosotros = verb.substring(0, verb.length()-2) + "emos"; // differs for -ir/-ar
        forms.Vosotros = verb.substring(0, verb.length()-2) + "éis"; // differs for -ir/-ar
        forms.Ellos = verb.substring(0, verb.length()-2) + "en"; // differs for -ar

        if(verb.endsWith("ir")){ // asistir = attend
            forms.Nosotros = verb.substring(0, verb.length()-2) + "imos";
            forms.Vosotros = verb.substring(0, verb.length()-2) + "ís";
        } else if(verb.endsWith("ar")){ // trabajar = work
            forms.Tu = verb.substring(0, verb.length()-2) + "as";
            forms.El = verb.substring(0, verb.length()-2) + "a";
            forms.Nosotros = verb.substring(0, verb.length()-2) + "amos";
            forms.Vosotros = verb.substring(0, verb.length()-2) + "áis";
            forms.Ellos = verb.substring(0, verb.length()-2) + "an";
        };

        return forms;
    }
}
