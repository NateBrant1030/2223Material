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
        TextView coins = findViewById(R.id.Coins);
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
                    you.dam=dam;you.name=weapon;you.hp=dam*10;you.maxhp=you.hp;
                }
                else{
                    out.setText(String.format("With your weapon you go out to explore and encounter something"));
                    fight(you,new enemy(you,.1 + (double) (Math.random() * ((.5 - .1) + .1))
                    ),out,input,attack,submit,coins);
                }



                System.out.println(step);
                step++;
            }
        });
    }
    class person{
        String name;double dam;double hp;double maxhp;double coin;
        public person(){
            this.name= "";this.dam=0;this.hp=0;this.maxhp=0;this.coin=0;
        }
    }
    class enemy{
        String name;double dam;double hp;double maxhp; double persent;
        public enemy(person you,double persent){
            this.dam= (you.dam*persent);this.hp=(you.hp*persent);this.maxhp=(you.hp*persent);this.persent=persent;
        }
    }
    public static void fight(person you,enemy enemy,TextView out,TextView input,Button fight,Button submit,TextView coins){
        fight.setVisibility(View.VISIBLE);
        submit.setVisibility(View.INVISIBLE);
        input.setVisibility(View.INVISIBLE);

        fight.setOnClickListener(new View.OnClickListener() {
            int turn=0;
            @Override
            public void onClick(View view) {
                if((int)enemy.hp>0 && (int)you.hp >0){

                    if(turn%2==0){
                        enemy.hp-= you.dam;
                    out.setText(String.format("Your turn, you deal %d, %d/%d HP left.",(int)you.dam,(int)enemy.hp,(int)enemy.maxhp));

                }else{
                    you.hp -= enemy.dam;
                    out.setText(String.format("Their turn, they deal %d and you remain with %d/%d HP.",(int)enemy.dam,(int)you.hp,(int)you.maxhp));
                }
                    turn+=1;
                    System.out.println(turn);

                }else if(enemy.hp<=1){
                    out.setText(String.format("You won!! %d HP remain",(int)you.hp));
                    fight.setVisibility(View.INVISIBLE);
                    submit.setVisibility(View.VISIBLE);
                    submit.setVisibility(View.VISIBLE);
                    you.coin+=(enemy.persent*100);
                    coins.setText(String.format("Coins: %d",(int)you.coin));
                }else if(you.hp<=1){
                    out.setText(String.format("You Dead!! %d HP remain",(int)you.hp));
                }

            }
        });


    }



}