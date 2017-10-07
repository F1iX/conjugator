package me.keppler.conjugator;

/**
 * Created by felix on 07/10/17.
 */

public class GoingToFuture {
    public static String[] get(String verb) {
        // get conjugation of auxiliary verb ir
        String[] forms = Present.get("ir");

        // build combined going to future
        for(int i = 0; i < forms.length; i++){
            forms[i] = forms[i] + " a " + verb;
        }

        return forms;
    }
}
