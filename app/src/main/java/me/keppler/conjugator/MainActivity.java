package me.keppler.conjugator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




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

                final EditText input = (EditText) findViewById(R.id.textEditVerb);

                if(input.getText().toString().length() > 2) {
                    final TextView tenseTextView = (TextView) findViewById(R.id.textViewTense);
                    final TextView exampleTextView = (TextView) findViewById(R.id.textViewExample);

                    String tense = "", example = "";
                    Conjugation forms = new Conjugation();
                    switch (progress) {
                        case 0:
                            tense = "Pluperfect";
                            example = "Yo había hablando = I had spoken";
                            forms = Present.get(input.getText().toString());
                            break;
                        case 1:
                            tense = "Preterite";
                            example = "Yo hablé = I spoke";
                            forms = Present.get(input.getText().toString());
                            break;
                        case 2:
                            tense = "Imperfect";
                            example = "Yo hablaba = I spoke";
                            forms = Present.get(input.getText().toString());
                            break;
                        case 3:
                            tense = "Present Perfect";
                            example = "Yo he hablando = I have spoken";
                            forms = Present.get(input.getText().toString());
                            break;
                        case 4:
                            tense = "Present";
                            example = "Yo hablo = I speak";
                            forms = Present.get(input.getText().toString());
                            break;
                        case 5:
                            tense = "Future";
                            example = "Yo hablaré = I will speak";
                            forms = Present.get(input.getText().toString());
                            break;
                        case 6:
                            tense = "Future Perfect";
                            example = "Yo habré hablando = I will have spoken";
                            forms = Present.get(input.getText().toString());
                            break;
                    }
                    tenseTextView.setText(tense);
                    exampleTextView.setText(example);

                    ((TextView) findViewById(R.id.textViewYo)).setText(forms.Yo);
                    ((TextView) findViewById(R.id.textViewTu)).setText(forms.Tu);
                    ((TextView) findViewById(R.id.textViewEl)).setText(forms.El);
                    ((TextView) findViewById(R.id.textViewNosotros)).setText(forms.Nosotros);
                    ((TextView) findViewById(R.id.textViewVosotros)).setText(forms.Vosotros);
                    ((TextView) findViewById(R.id.textViewEllos)).setText(forms.Ellos);
                }
            }
        });
    }
}
