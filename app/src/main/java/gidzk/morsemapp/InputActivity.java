package gidzk.morsemapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import gidzk.morsemapp.ENGINE.LanguageParser;
import gidzk.morsemapp.ENGINE.Translator;

public class InputActivity extends AppCompatActivity implements View.OnClickListener{
    EditText textIn;
    TextView textOut;
    Button translateBtn;
    // TODO:  finish the "nice" parse of the translator.
    Translator translator = LanguageParser.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        textIn = findViewById(R.id.textIn);
        textOut = findViewById(R.id.textOut);
        translateBtn = findViewById(R.id.translateBtn);
        translateBtn.setOnClickListener(this);

        textIn.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                textIn = findViewById(R.id.textIn);
                textOut = findViewById(R.id.textOut);

                String s = translator.decryptParse(textIn.getText().toString());
                System.out.println(s);
                textOut.setText(s);

            }
        });


}





    @Override
    public void onClick(View view) {
        // todo pass to next Activity, where  the flashLight is being manipulated.


    }
}
