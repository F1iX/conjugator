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

        switch(verb){
            case "abrir":
                pastParticiple = "abierto";
                break;
            case "cubrir":
                pastParticiple = "cubierto";
                break;
            case "decir":
                pastParticiple = "dicho";
                break;
            case "escribir":
                pastParticiple = "escrito";
                break;
            case "hacer":
                pastParticiple = "hecho";
                break;
            case "imprimir":
                pastParticiple = "impreso";
                break;
            case "morir":
                pastParticiple = "muerto";
                break;
            case "poner":
                pastParticiple = "puesto";
                break;
            case "resolver":
                pastParticiple = "resuelto";
                break;
            case "romper":
                pastParticiple = "roto";
                break;
            case "ver":
                pastParticiple = "visto";
                break;
            case "volver":
                pastParticiple = "vuelto";
                break;
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
