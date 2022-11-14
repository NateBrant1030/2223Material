package com.example.navd.ui.Dice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.navd.R;
import com.example.navd.R;
import com.example.navd.databinding.FragmentDiceBinding;
import com.example.navd.databinding.FragmentGalleryBinding;

public class DiceFragment extends Fragment {

     ImageView dice;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_dice,container,false);

        dice = rootView.findViewById(R.id.DiceImg);

        dice.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                rollDice(1 + (int)(Math.random() * ((7 - 1) + 1)),dice);
            }
        });

        return rootView;
    }

    public static  void rollDice(int randomNum,ImageView dice){

        switch(randomNum){
        case 0:
            dice.setImageResource(R.drawable.dice1);

        case 1:
            dice.setImageResource(R.drawable.dice2);

        case 2:
            dice.setImageResource(R.drawable.dice3);

        case 3:
            dice.setImageResource(R.drawable.dice4);

        case 4:
            dice.setImageResource(R.drawable.dice5);
        case 5:
            dice.setImageResource(R.drawable.dice6);
            case 6:
                dice.setImageResource(R.drawable.dice7);


    }}
}