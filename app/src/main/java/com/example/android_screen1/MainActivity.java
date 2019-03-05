package com.example.android_screen1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nameField;
    TextView displayNameLabel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayNameLabel = (TextView) findViewById(R.id.displayNameLabel);
        Button btnDisplayName = (Button) findViewById(R.id.buttonEnterName);

        btnDisplayName.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                nameField = (EditText) findViewById(R.id.nameField);
                displayNameLabel.setText(nameField.getText());

            }
        });


    }
}