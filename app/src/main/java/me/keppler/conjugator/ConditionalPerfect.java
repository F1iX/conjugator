package me.keppler.conjugator;

/**
 * Created by felix on 20/11/17.
 */

public class ConditionalPerfect {
    public static String[] get(String verb){
        String[] forms = Conditional.get("haber");
        String pastParticiple = PresentPerfect.getPastParticiple(verb);

        // build combined present perfect
        for(int i = 0; i < forms.length; i++){
            forms[i] = forms[i] + " " + pastParticiple;
        }

        return forms;
    }
}
