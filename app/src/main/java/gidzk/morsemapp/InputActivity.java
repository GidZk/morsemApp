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
import android.widget.EditText;
import android.widget.TextView;

import gidzk.morsemapp.ENGINE.LanguageParser;
import gidzk.morsemapp.ENGINE.Translator;

public class InputActivity extends AppCompatActivity{
    EditText textIn;
    TextView textOut;
    // TODO:  finish the "nice" parse of the translator.
    Translator translator = LanguageParser.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        textIn = findViewById(R.id.textIn);
        textOut = findViewById(R.id.textOut);


        textIn.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                System.out.println("TRIGAAA");

                textIn = findViewById(R.id.textIn);
                textOut = findViewById(R.id.textOut);

                textOut.setText(textIn.getText());


            }
        });

}









// just for my own memorys sake
    private void onEventIn(){


        // when event occurs, update the state with the new inputs
    textIn = findViewById(R.id.textIn);
    textOut = findViewById(R.id.textOut);

    // setter for the textView.
    textOut.setText(textIn.getText());



    }





    private void wireTextIn(EditText textIn){




        textIn.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {




            }
        });
    }



}
