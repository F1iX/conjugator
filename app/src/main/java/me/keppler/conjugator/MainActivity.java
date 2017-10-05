package me.keppler.conjugator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int tenseId;
    String verb;    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SeekBar seek = (SeekBar) findViewById(R.id.seekBar);
        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tenseId = progress;
                conjugate();
            }
        });

        final EditText input = (EditText) findViewById(R.id.textEditVerb);
    }

    void conjugate(){
        String tense = "", example = "";
        Conjugation forms = new Conjugation();
        switch (tenseId) {
            case 0:
                tense = "Pretérito pluscuamperfecto";
                example = "Yo había hablando = I had spoken";
                forms = Present.get(verb, forms);
                break;
            case 1:
                tense = "Pretérito indefinido";
                example = "Yo hablé = I spoke";
                forms = Present.get(verb, forms);
                break;
            case 2:
                tense = "Pretérito imperfecto";
                example = "Yo hablaba = I spoke";
                forms = Present.get(verb, forms);
                break;
            case 3:
                tense = "Pretérito perfecto";
                example = "Yo he hablando = I have spoken";
                forms = Present.get(verb, forms);
                break;
            case 4:
                tense = "Presente";
                example = "Yo hablo = I speak";
                forms = Present.get(verb, forms);
                break;
            case 5:
                tense = "Futuro proximo";
                example = "Yo voy a hablar = I am goint to speak";
                forms = Present.get(verb, forms);
                break;
            case 6:
                tense = "Futuro simple";
                example = "Yo hablaré = I will speak";
                forms = Present.get(verb, forms);
                break;
            case 7:
                tense = "Futuro perfecto";
                example = "Yo habré hablando = I will have spoken";
                forms = Present.get(verb, forms);
                break;
        }

        ((TextView) findViewById(R.id.textViewTense)).setText(tense);
        ((TextView) findViewById(R.id.textViewExample)).setText(example);

        ((TextView) findViewById(R.id.textViewYo)).setText(forms.Yo);
        ((TextView) findViewById(R.id.textViewTu)).setText(forms.Tu);
        ((TextView) findViewById(R.id.textViewEl)).setText(forms.El);
        ((TextView) findViewById(R.id.textViewNosotros)).setText(forms.Nosotros);
        ((TextView) findViewById(R.id.textViewVosotros)).setText(forms.Vosotros);
        ((TextView) findViewById(R.id.textViewEllos)).setText(forms.Ellos);
    }
}
