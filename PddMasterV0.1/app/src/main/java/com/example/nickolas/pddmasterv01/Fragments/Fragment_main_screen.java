package com.example.nickolas.pddmasterv01.Fragments;


import android.app.FragmentTransaction;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.nickolas.pddmasterv01.R;


public class Fragment_main_screen extends Fragment {
    Button button_main_tests;
    Button button_main_theory;
    Fragment_tests fragment_tests;
    Fragment_theory fragment_theory;
    EditText editText_main_priv;
    SharedPreferences sharedPreferences;
    String name;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main_screen, null);

        button_main_tests=(Button) v.findViewById(R.id.button_main_test);
        button_main_theory=(Button) v.findViewById(R.id.button_main_theory);

        editText_main_priv=(EditText) v.findViewById(R.id.editText_main_priv);
        editText_main_priv.setEnabled(false);
        sharedPreferences=getActivity().getPreferences(Context.MODE_PRIVATE);
        name=sharedPreferences.getString("USER_NAME","Пользователь");
        editText_main_priv.setText("Добро пожаловать, "+ name + "!");



        fragment_tests=new Fragment_tests();
        fragment_theory=new Fragment_theory();
        final FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();

        button_main_theory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        button_main_tests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_tests);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        return v;
    }

}
