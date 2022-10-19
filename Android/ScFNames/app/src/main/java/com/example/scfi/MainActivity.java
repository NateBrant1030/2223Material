package com.example.scfi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;
import androidx.appcompat.app.AppCompatActivity;

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
        String first=String.valueOf(firstNameTXT.getText());
        String last=String.valueOf(lastNameTXT.getText());
        String city=String.valueOf(cityTXT.getText());
        String school=String.valueOf(schoolTXT.getText());
        String bro=String.valueOf(broTXT.getText());
        String sis=String.valueOf(sisTXT.getText());
    try{
        Random random= new Random();
        int rf = random.nextInt(first.length());
        int rl = random.nextInt(last.length());
        int rc = random.nextInt(city.length());
        int s = random.nextInt(school.length());
        int rb = random.nextInt(bro.length());
        int rs = random.nextInt(sis.length());

        String scifiFirst = first.substring(0,rf) + last.substring(last.length()-rl);
        String scifiLast = city.substring(0,rc)+school.substring(school.length()-s);
        String scifiHome = bro.substring(0,rb)+sis.substring(sis.length()-rs);
        output.setText(String.format("Welcome!, %s  %s from %s",scifiFirst,scifiLast,scifiHome));}
        catch (Exception e){output.setText(String.format("to short of words"));}


    }
}