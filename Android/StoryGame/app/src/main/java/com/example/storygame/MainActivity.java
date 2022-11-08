package com.example.storygame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    String weapon;double dam;
    int step = 1;
    person you = new person();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView input = findViewById(R.id.input);
        Button submit = findViewById(R.id.main);
        Button attack = findViewById(R.id.attack);

        TextView out = findViewById(R.id.output);
        Scanner ui = new Scanner(System.in);
        out.setText("Try naming your weapon(this will have impact)");

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                weapon = String.valueOf(input.getText());
                dam= input.length()+1;
                if(step==1){
                    out.setText(String.format("your weapon %s, now dose %f Damage",weapon,dam));
                    input.setText("");
                    you.dam=dam;you.name=weapon;you.hp=dam*10;
                }
                else if(step == 2){
                    out.setText(String.format("With your weapon you go out to explore and encounter something"));
                    fight(you,new enemy(you),out,input,attack);
                }
                step++;
                System.out.println(step);
            }
        });
    }
    class person{
        String name;double dam;double hp;
        public person(){
            this.name= "";this.dam=0;this.hp=0;
        }
    }
    class enemy{
        String name;double dam;double hp;
        public enemy(person you){
            this.dam= (you.dam*Math.random());this.hp=(you.hp*Math.random());
        }
    }
    public static void fight(person you,enemy enemy,TextView out,TextView input,Button fight){
        fight.setVisibility(View.VISIBLE);
        fight.setOnClickListener(new View.OnClickListener() {
            int turn=0;
            @Override
            public void onClick(View view) {
                if(enemy.hp>0 && you.hp >0){

                    if(turn%2==0){
                    enemy.hp-= you.dam;
                    out.setText(String.format("Your turn Fight you deal %f, %f remain",you.dam,enemy.hp));

                }else{
                    you.hp -= enemy.dam;
                    out.setText(String.format("There turn they deal %f and you remain with %f hp",enemy.dam,you.hp));
                }
                    turn+=1;
                    System.out.println(turn);

                }
            }
        });


    }



}