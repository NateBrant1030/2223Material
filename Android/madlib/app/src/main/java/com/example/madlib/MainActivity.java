package com.example.madlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int picked = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mad1 = findViewById(R.id.mad1);
        Button mad2 = findViewById(R.id.mad2);
        Button mad3 = findViewById(R.id.mad3);
        Button ran = findViewById(R.id.Random);
        TextView box1 = findViewById(R.id.box1);
        TextView box2 = findViewById(R.id.box2);
        TextView box3 = findViewById(R.id.box3);
        TextView box4 = findViewById(R.id.box4);
        TextView box5 = findViewById(R.id.box5);
        TextView box6 = findViewById(R.id.box6);
        TextView box7 = findViewById(R.id.box7);
        TextView box8 = findViewById(R.id.box8);
        TextView box9 = findViewById(R.id.box9);
        TextView box10 = findViewById(R.id.box10);
        TextView box11 = findViewById(R.id.box11);
        TextView box12 = findViewById(R.id.box12);
        Button submit = findViewById(R.id.submit);
        TextView out = findViewById(R.id.out);
        ArrayList<TextView> boxs = new ArrayList<TextView>(Arrays.asList(box1, box2, box3, box4, box5, box6, box7, box8, box9, box10, box11, box12));
        for (int i = 0; i < 12; i++) {
            boxs.get(i).setVisibility(View.GONE);

        }
        mad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                madlib1(boxs);
            }

            ;

        });
        mad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                madlib2(boxs);
            }
        });
        mad3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                madlib3(boxs);

            }
        });
        ran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                picked = random.nextInt(3) + 1;
                System.out.println(picked);
                if (picked == 1) {
                    madlib1(boxs);
                }
                else if (picked == 2) {
                    madlib2(boxs);
                } else {
                    madlib3(boxs);
                }
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < 12; i++) {
                    boxs.get(i).setVisibility(View.GONE);

                }
//http://www.redkid.net/madlibs/ where i got madlibs
                if (picked == 1) {
                    out.setText(String.format("Driving a car can be fun if you follow this %s.advice: When approaching a %s.on the right, always blow your %s. Before making a %s.turn, always stick your %s.out of the window. Every 2000 miles, have your %s.inspected and your %s.checked. When approaching a school, watch out for %s.%s. Above all, drive %s. The %s.you save may be your own!", box1.getText(), box5.getText(), box6.getText(), box2.getText(), box7.getText(), box8.getText(), box9.getText(), box3.getText(), box11.getText(), box4.getText(), box10.getText()));
                } else if (picked == 2) {
                    out.setText(String.format("Farmers work very hard planting wheat and %s. They begin by plowing their %s, and if they don't have a tractor, they use %s. Then they plant %s seeds, and by the next Fall, they have many acres of %s. Tomatoes are harder to raise. They grow on %s .bushes and the farmer sprays them with %s.to keep the bugs off. The easiest things to grow are green %s, but the farmer must be careful to make sure worms dont get into his %s. Farmers also raise onions, cabbages, lettuce, and %s. But no matter what they grow, farmers really lead a %s .life."
                            , box6.getText(), box4.getText(), box7.getText(), box1.getText(), box8.getText(), box2.getText(), box11.getText(), box9.getText(), box5.getText(), box10.getText(), box3.getText()));
                } else if (picked == 3) {
                    out.setText(String.format("Young people today would rather listen to a good rock music concert than to Johann Sebastian %s.or to Ludvig von %s. Rock music is played by %s.groups of young men who wear their hair below their %s. They also wear very odd and colorful %s.and often have beards.The groups have attractive names such as The %s or %s.and The Three %s. They usually play electric %s. One member of the group usually sits on a raised platform and sets the rhythm by beating his %s.The songs are mostly about some fellow who has been rejected by his %s. They are very sad and when young girls hear them, they often get tears in their %s.", box3.getText(), box4.getText(), box1.getText(), box8.getText(), box9.getText(), box7.getText(), box2.getText(), box10.getText(), box11.getText(), box5.getText(), box6.getText(), box12.getText()
                    ));
                }
            }
        });


    }

    public void madlib1(ArrayList<TextView> boxs) {
        picked = 1;
        for (int i = 0; i < 12; i++) {
            boxs.get(i).setVisibility(View.GONE);

        }
        for (int i = 0; i < 11; i++) {
            boxs.get(i).setVisibility(View.VISIBLE);

        }
//
        boxs.get(0).setHint("Adjective #1");
        boxs.get(1).setHint("Adjective #2");
        boxs.get(2).setHint("Adjective #3");
        boxs.get(3).setHint("Adverb");
        boxs.get(4).setHint("Noun #1");
        boxs.get(5).setHint("Noun #2");
        boxs.get(6).setHint("Noun #3");
        boxs.get(7).setHint("Noun #4");
        boxs.get(8).setHint("Noun #5");
        boxs.get(9).setHint("Noun #6");
        boxs.get(10).setHint("Plural Noun");

    }

    ;

    public void madlib2(ArrayList<TextView> boxs) {
        picked = 2;
        for (int i = 0; i < 12; i++) {
            boxs.get(i).setVisibility(View.GONE);

        }
        for (int i = 0; i < 11; i++) {
            boxs.get(i).setVisibility(View.VISIBLE);

        }
//
        boxs.get(0).setHint("Adjective #1");
        boxs.get(1).setHint("Adjective #2");
        boxs.get(2).setHint("Adjective #3");
        boxs.get(3).setHint("Noun #1");
        boxs.get(4).setHint("Noun #2");
        boxs.get(5).setHint("Plural Noun #1");
        boxs.get(6).setHint("Plural Noun #2");
        boxs.get(7).setHint("Plural Noun #3");
        boxs.get(8).setHint("Plural Noun #4");
        boxs.get(9).setHint("Plural Noun #5");
        boxs.get(10).setHint("Type of Liquid");


    }

    public void madlib3(ArrayList<TextView> boxs) {

        picked = 3;
        for (int i = 0; i < 12; i++) {
            boxs.get(i).setVisibility(View.GONE);

        }
        for (int i = 0; i < 12; i++) {
            boxs.get(i).setVisibility(View.VISIBLE);

        }
//
        boxs.get(0).setHint("Adjective");
        boxs.get(1).setHint("Celebrity");
        boxs.get(2).setHint("Last Name");
        boxs.get(3).setHint("Last Name");
        boxs.get(4).setHint("Noun #1");
        boxs.get(5).setHint("Noun #2");
        boxs.get(6).setHint("Plural Animal");
        boxs.get(7).setHint("Plural Noun #1");
        boxs.get(8).setHint("Plural Noun #2");
        boxs.get(9).setHint("Plural Noun #3");
        boxs.get(10).setHint("Plural Noun #4");
        boxs.get(11).setHint("Plural Noun #5");
    }

    ;
}
