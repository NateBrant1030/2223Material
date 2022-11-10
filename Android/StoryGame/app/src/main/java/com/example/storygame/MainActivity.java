package com.example.storygame;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    String weapon;double dam;
    int step = 1;
    String at = "";
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
                else if(step%5==0){
                       step=shop(out,step,you,input,at);


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
        ArrayList<String> inv;
        public person(){
            this.name= "";this.dam=0;this.hp=0;this.maxhp=0;this.coin=0; this.inv= new ArrayList<String>();
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
                    input.setVisibility(View.VISIBLE);

                    you.coin+=(enemy.persent*100);
                    coins.setText(String.format("Coins: %d",(int)you.coin));
                }else if(you.hp<=1){
                    out.setText(String.format("You Dead!! %d HP remain",(int)you.hp));
                }

            }
        });


    }

    public static int shop(TextView out,int step,person you, TextView input,String at){
        out.setText("You find a shop the shop keep ask if you would like to (shop),(upgrade),(leave)");
        if(!at.equals("shop")) {
            at = String.valueOf(input.getText());
            System.out.println("changed at" + at);
        }
        if(at.equals("leave")) {
            out.setText("Goodbye -Shop keeper");
            step++;
        }
        else if(at.equals("shop")){
            if (you.inv.isEmpty()){
                out.setText(String.format("looks like you just unlocked your items!!\n You get an space of 5 items in your bag each item can be used when exploring\n type list at any point to see your inv and use to use them"));
                for (int i = 0; i <5 ; i++) {
                    you.inv.add("empty");
                }
            }else{
                out.setText(String.format("Welcome! What would you like to quit or buy\n Apple +5%%HP :50g\n  Bread +10%%HP :75g\n Sandwich +15%%HP :100g \n VinLite +25%%HP :150g"));
                for (int i = 0; i < you.inv.size() ; i++) {
                    if(you.inv.get(i).equals("Empty")){
                        if(String.valueOf(input.getText()).equals("Apple")){
                            System.out.println("appel");
                            you.coin -= 50;
                            you.inv.set(i,"Apple +5%HP");
                            out.setText(String.format("got an apple"));

                        }
                        else if(String.valueOf(input.getText()).equals("Bread")){
                            you.coin -= 75;
                            you.inv.set(i,"Bread +10%HP");
                        }
                        else if(String.valueOf(input.getText()).equals("Sandwich")){
                            you.coin -= 100;
                            you.inv.set(i,"Sandwich +15%HP");
                        }
                        else if(String.valueOf(input.getText()).equals("VinLite")){
                            you.coin -= 150;
                            you.inv.set(i,"VinLite +25%HP");
                        }
                    }
                }
            }
        }
        input.setText("");
        step--;
        return step;

    }

}