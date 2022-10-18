package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static TextView outputLBL;
    static EditText inputTXT;
    static Button enterBTN;
    // the fist method to run
    @Override
    protected void onCreate(Bundle savedInstanceState) { //equal to public static void main
        super.onCreate(savedInstanceState); //inherits constructor ro run rhe on create
        setContentView(R.layout.activity_main);

//        connect java objects to connect to your widget
        outputLBL =findViewById(R.id.textView);
        inputTXT = findViewById(R.id.inputBox);
        enterBTN = findViewById(R.id.enterBTN);

        enterBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hello();
            }
        });
    }
    public static void hello(){
        String ui = String.valueOf(inputTXT.getText());

        outputLBL.setText("Hello " + ui);
    }
}