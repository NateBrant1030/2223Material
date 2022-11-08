package com.example.pizzaplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup Rgroup;
    private RadioButton small,med,large;
    private CheckBox pineapple,bacon,jalopenos;
    private Button submit;
    private double total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioButton small = findViewById(R.id.small);
        RadioButton med = findViewById(R.id.medium);
        RadioButton large = findViewById(R.id.large);
        RadioGroup Rgroup = findViewById(R.id.radioGroup);
        CheckBox  pineapple = findViewById(R.id.pineapple);
        CheckBox bacon = findViewById(R.id.bacon);
        CheckBox jalopenos = findViewById(R.id.jalopenos);
        Button submit = findViewById(R.id.outputBTN);
        TextView output = findViewById(R.id.outputLBL);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total=0;
                if(pineapple.isChecked()){
                    total += 100;
//                    activate,message length
                    Toast.makeText(MainActivity.this,"Really?",Toast.LENGTH_SHORT).show();
                }
                if(bacon.isChecked()){
                    total += 1;
//                    activate,message length
                    Toast.makeText(MainActivity.this,"bacon",Toast.LENGTH_SHORT).show();
                }
                if(jalopenos.isChecked()) {
                    total += 10;
//                    activate,message length
                    Toast.makeText(MainActivity.this, "jalop", Toast.LENGTH_SHORT).show();

                }


                onRadioButtonClicked();
                output.setText(Double.toString(total));
                Rgroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int i) {
                        RadioButton rb = (RadioButton) Rgroup.findViewById(i);
                    }
                });

            }

        });

    }

    private void onRadioButtonClicked()
    {
        Log.d("radio clicked","triggerd");

    int pickedID = Rgroup.getCheckedRadioButtonId()        ;
    if(pickedID==-1){
        Toast.makeText(MainActivity.this,"Choose a size",Toast.LENGTH_SHORT).show();
    }
    else{
        RadioButton radioButton = (RadioButton) Rgroup.findViewById(pickedID);
        if(radioButton.getText().equals("Small")){
            total+=5;
        }else if(radioButton.getText().equals("Large")){
            total+=1000;
        }else{
            total+= 50;
        }


















    }



    }}