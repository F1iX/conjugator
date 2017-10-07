package me.keppler.conjugator;

/**
 * Created by felix on 02/10/17.
 */

public final class PresentPerfect {
    public static String[] get(String verb) {
        String pastParticiple;

        if(verb.endsWith("ar")){ // trabajar -> trabajado
            if(verb.matches(".*[aeiou]..")){ // add accent if a vowel precedes the ending (abstaer -> abstraído)
                pastParticiple = verb.substring(0, verb.length() - 2) + "ádo";
            } else {
                pastParticiple = verb.substring(0, verb.length() - 2) + "ado";
            }
        } else { // comer -> comido as well as asistir -> asistido
            if(verb.matches(".*[aeiou]{1}..")){ // add accent if a vowel precedes the ending (leer -> leído as well as abstaer -> abstraído)
                pastParticiple = verb.substring(0, verb.length() - 2) + "ído";
            } else {
                pastParticiple = verb.substring(0, verb.length() - 2) + "ido";
            }
        }

        if(verb.equals("abrir")){
            pastParticiple = "abierto";
        } else if(verb.equals("cubrir")){
            pastParticiple = "cubierto";
        } else if(verb.equals("decir")){
            pastParticiple = "dicho";
        } else if(verb.equals("escribir")){
            pastParticiple = "escrito";
        } else if(verb.equals("hacer")){
            pastParticiple = "hecho";
        } else if(verb.equals("imprimir")){
            pastParticiple = "impreso";
        } else if(verb.equals("morir")){
            pastParticiple = "muerto";
        } else if(verb.equals("poner")){
            pastParticiple = "puesto";
        } else if(verb.equals("resolver")){
            pastParticiple = "resuelto";
        } else if(verb.equals("romper")){
            pastParticiple = "roto";
        } else if(verb.equals("ver")){
            pastParticiple = "visto";
        } else if(verb.equals("volver")){
            pastParticiple = "vuelto";
        }
        // get conjugation of auxiliary verb haber
         String[] forms = Present.get("haber");

        // build combined present perfect
        for(int i = 0; i < forms.length; i++){
            forms[i] = forms[i] + " " + pastParticiple;
        }

        return forms;
    }
}
