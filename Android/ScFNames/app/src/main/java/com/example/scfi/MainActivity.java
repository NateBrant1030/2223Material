package com.example.scfi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstNameTXT ,lastNameTXT,cityTXT,schoolTXT,broTXT,sisTXT;
    Button gen;
    TextView output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNameTXT=findViewById(R.id.firstNameTXT);
        lastNameTXT = findViewById(R.id.lastNameTxt);
        cityTXT=findViewById(R.id.cityTXT);
        schoolTXT=findViewById(R.id.schoolTXT);
        broTXT=findViewById(R.id.broTXT);
        sisTXT=findViewById(R.id.sisTXT);
        output=findViewById(R.id.output);
        gen = findViewById(R.id.gen);

        gen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generate();
            }
        });

    }
    private void generate(){

    }
}