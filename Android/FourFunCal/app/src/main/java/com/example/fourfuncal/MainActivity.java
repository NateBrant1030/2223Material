package com.example.fourfuncal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button add =findViewById(R.id.add);
        Button sub =findViewById(R.id.subtract);
        Button mult =findViewById(R.id.mult);
        Button div =findViewById(R.id.div);
        TextView output =findViewById(R.id.output);
        Button enter =findViewById(R.id.enter);
        Button clear = findViewById((R.id.clear));
        Button b0 =findViewById(R.id.btns0);
        Button b1 =findViewById(R.id.btn1);
        Button b2 =findViewById(R.id.btn2);
        Button b3 =findViewById(R.id.btn3);
        Button b4 =findViewById(R.id.btn4);
        Button b5 =findViewById(R.id.btn5);
        Button b6 =findViewById(R.id.btn6);
        Button b7 =findViewById(R.id.btn7);
        Button b8 =findViewById(R.id.btn8);
        Button b9 =findViewById(R.id.btn9);

        ArrayList<Button> bList = new ArrayList<>(Arrays.asList(b0,b1,b2,b3,b4,b5,b6,b7,b8,b9));


        for (int i = 0; i < 10; i++) {
            int a = i;
            bList.get(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    output.setText(String.format(String.valueOf(output.getText())+String.valueOf(bList.get(a).getText())));
                    System.out.println(String.valueOf(output.getText())+String.valueOf(bList.get(a).getText()));
                }
            });
        }


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                output.setText(String.format(String.valueOf(output.getText())+"+"));

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(String.format(String.valueOf(output.getText())+"-"));

            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(String.format(String.valueOf(output.getText())+"*"));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(String.format(String.valueOf(output.getText())+"/"));

            }
        });
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(String.format(String.valueOf(eval(String.valueOf(output.getText())))));
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText("");
            }
        });

    }
// https://www.youtube.com/watch?v=8sGtJN9_F9k
//    used the video to show who to add expressions to android studios
    public static double eval( String str) {
       ExpressionBuilder builder = new ExpressionBuilder(str);
       Expression expression = builder.build();
       return expression.evaluate();

}}