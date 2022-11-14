package com.example.navdrawtest.ui.Dice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.navdrawtest.R;
import com.example.navdrawtest.databinding.FragmentDiceBinding;
import com.example.navdrawtest.databinding.FragmentGalleryBinding;

import java.util.zip.Inflater;

public class DiceFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_dice,container,false);

        dice = rootView.findViewById(R.id.diceIMG);

        dice.setOnClickListener(new )


        return rootView;
    }


}