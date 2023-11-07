package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox winter, wall, kings;
    private Button select;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        winter = (CheckBox) findViewById(R.id.Cheakbox1);
        wall = (CheckBox) findViewById(R.id.Cheakbox2);
        kings = (CheckBox) findViewById(R.id.Cheakbox3);

        select = (Button) findViewById(R.id.Resullt);
        resultTextView = (TextView) findViewById(R.id.resulttext);

        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder stringBuilder = new StringBuilder();
                if (winter.isChecked()) {
                    String value = winter.getText().toString();
                    stringBuilder.append(value + " is your House\n");
                }
                if (wall.isChecked()) {
                    String value = wall.getText().toString();
                    stringBuilder.append(value + " is your House\n");
                }
                if (kings.isChecked()) {
                    String value = kings.getText().toString();
                    stringBuilder.append(value + " is your House");
                }

                resultTextView.setText(stringBuilder);

            }

        });


    }
}
