package me.keppler.conjugator;

import android.content.Context;

/**
 * Created by felix on 02/10/17.
 */

public final class Conjugation {
    private Context context;

    String Yo = context.getApplicationContext().getResources().getString(R.string.s1);
    String Tu = context.getApplicationContext().getResources().getString(R.string.s2);
    String El = context.getApplicationContext().getResources().getString(R.string.s3);
    String Nosotros = context.getApplicationContext().getResources().getString(R.string.p1);
    String Vosotros = context.getApplicationContext().getResources().getString(R.string.p2);
    String Ellos = context.getApplicationContext().getResources().getString(R.string.p3);

    public Conjugation(Context current){
        this.context = current;
    }
}
