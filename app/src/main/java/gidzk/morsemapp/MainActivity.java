package gidzk.morsemapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.playButton);
        b.setOnClickListener(this);

    }



    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this,InputActivity.class);
        startActivity(intent);


    }
}
