package gidzk.morsemapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class InputActivity extends AppCompatActivity {
    EditText textIn;
    TextView textOut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        textIn = findViewById(R.id.textIn);
        textOut = findViewById(R.id.textOut);

}


// just for my own memorys sake
    private void onEventIn(){


        // when event occurs, update the state with the new inputs
    textIn = findViewById(R.id.textIn);
    textOut = findViewById(R.id.textOut);

    // setter for the textView.
    textOut.setText(textIn.getText());



    }




}
