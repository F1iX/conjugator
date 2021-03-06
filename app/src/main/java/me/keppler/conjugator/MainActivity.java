package me.keppler.conjugator;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int tenseId;
    String verb;
    Boolean subjuntivo;
    
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
        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(final CharSequence s, int start, int before, int count) {
                verb = input.getText().toString();
                conjugate();
            }

            @Override
            public void afterTextChanged(final Editable s) {
            }
        });

        final CheckBox sub = (CheckBox) findViewById(R.id.checkBox);
        sub.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                subjuntivo = isChecked;
                conjugate();
            }
        });

        /* Get recent entries from shared preferences */
        SharedPreferences prefs = getApplicationContext().getSharedPreferences("me.keppler.conjugator", android.content.Context.MODE_PRIVATE);
        verb = prefs.getString("recentVerb", "");
        tenseId = prefs.getInt("recentTenseId", 4);
        subjuntivo = prefs.getBoolean("recentSubjuntivoCheckbox", false);

        input.setText(verb); // Populate recent value
        seek.setProgress(tenseId); // populate recent value
        sub.setChecked(subjuntivo); // Populate recent value
    }

    @Override
    protected void onPause() {
        super.onPause();
        /* Persist data by writing values to shared preferences*/
        SharedPreferences prefs = getApplicationContext().getSharedPreferences("me.keppler.conjugator", android.content.Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("recentVerb", verb);
        editor.putInt("recentTenseId", tenseId);
        editor.putBoolean("recentSubjuntivoCheckbox", subjuntivo);
        editor.apply();
    }

    void conjugate(){
        String tense = "", example = "";
        String[] forms = {getString(R.string.s1)
                , getString(R.string.s2)
                , getString(R.string.s3)
                , getString(R.string.p1)
                , getString(R.string.p2)
                , getString(R.string.p3)};

        if(subjuntivo){
            // TODO: Subjuntivo forms
            switch (tenseId) {
                case 0:
                    tense = "Subjuntivo del pretérito pluscuamperfecto";
                    example = "...que yo hubiera hablado = ...that I had spoken";
                    if (verb.length() > 1) {
                        //forms = Pluperfect.get(verb);
                    }
                    break;
                case 1:
                    tense = "Subjuntivo del pretérito pluscuamperfecto II";
                    example = "...que yo hubiese hablando = ...that I had spoken";
                    if (verb.length() > 1) {
                        //forms = PreteriteIndefinido.get(verb);
                    }
                    break;
                case 2:
                    tense = "Subjuntivo del pretérito imperfecto";
                    example = "...que yo hablara = ...that I spoke";
                    if (verb.length() > 1) {
                        //forms = Imperfect.get(verb);
                    }
                    break;
                case 3:
                    tense = "Subjuntivo del pretérito perfecto";
                    example = "...que yo haya hablado = ...that I have spoken";
                    if (verb.length() > 1) {
                        //forms = PresentPerfect.get(verb);
                    }
                    break;
                case 4:
                    tense = "Subjuntivo del presente";
                    example = "...que yo hablo = ...that I speak";
                    if (verb.length() > 1) {
                        forms = SubPresent.get(verb);
                    }
                    break;
                case 5:
                    tense = "Conditional";
                    example = "Yo hablaría = I would speak";
                    if (verb.length() > 1) {
                        forms = Conditional.get(verb);
                    }
                    break;
                case 6:
                    tense = "Conditional perfect";
                    example = "Yo habría hablado = I would have spoken";
                    if (verb.length() > 1) {
                        forms = ConditionalPerfect.get(verb);
                    }
                    break;
            }
        } else {
            switch (tenseId) {
                case 0:
                    tense = "Pretérito pluscuamperfecto";
                    example = "Yo había hablando = I had spoken";
                    if (verb.length() > 1) {
                        //forms = Pluperfect.get(verb);
                    }
                    break;
                case 1:
                    tense = "Pretérito indefinido";
                    example = "Yo hablé = I spoke (at a definite point of time)";
                    if (verb.length() > 1) {
                        forms = Preterite.get(verb);
                    }
                    break;
                case 2:
                    tense = "Pretérito imperfecto";
                    example = "Yo hablaba = I spoke (without defined end)";
                    if (verb.length() > 1) {
                        forms = Imperfect.get(verb);
                    }
                    break;
                case 3:
                    tense = "Pretérito perfecto";
                    example = "Yo he hablando = I have spoken";
                    if (verb.length() > 1) {
                        forms = PresentPerfect.get(verb);
                    }
                    break;
                case 4:
                    tense = "Presente";
                    example = "Yo hablo = I speak";
                    if (verb.length() > 1) {
                        forms = Present.get(verb);
                    }
                    break;
                case 5:
                    tense = "Futuro proximo";
                    example = "Yo voy a hablar = I am going to speak";
                    if (verb.length() > 1) {
                        forms = GoingToFuture.get(verb);
                    }
                    break;
                case 6:
                    tense = "Futuro simple";
                    example = "Yo hablaré = I will speak";
                    if (verb.length() > 1) {
                        forms = Future.get(verb);
                    }
                    break;
                case 7:
                    tense = "Futuro perfecto";
                    example = "Yo habré hablando = I will have spoken";
                    if (verb.length() > 1) {
                        //forms = FuturePerfect.get(verb);
                    }
                    break;
            }
        }

        ((TextView) findViewById(R.id.textViewTense)).setText(tense);
        ((TextView) findViewById(R.id.textViewExample)).setText(example);

        ((TextView) findViewById(R.id.textViewYo)).setText(forms[0]);
        ((TextView) findViewById(R.id.textViewTu)).setText(forms[1]);
        ((TextView) findViewById(R.id.textViewEl)).setText(forms[2]);
        ((TextView) findViewById(R.id.textViewNosotros)).setText(forms[3]);
        ((TextView) findViewById(R.id.textViewVosotros)).setText(forms[4]);
        ((TextView) findViewById(R.id.textViewEllos)).setText(forms[5]);
    }
}
