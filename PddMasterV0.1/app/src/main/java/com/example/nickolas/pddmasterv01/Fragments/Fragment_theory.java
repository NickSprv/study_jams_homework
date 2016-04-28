package com.example.nickolas.pddmasterv01.Fragments;

import android.app.FragmentTransaction;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.nickolas.pddmasterv01.R;


public class Fragment_theory extends Fragment {

    // прописываем элементы
    Button theory_pdd_button;
    Button theory_znaki_button;
    Button theory_razmetka_button;
    Button theory_bilet_button;
    Button theory_prilog_button;

    // прописываем фрагменты
    Fragment_theory_pdd fragment_theory_pdd;
    Fragment_theory_znaki fragment_theory_znaki;
    Fragment_theory_razmetka fragment_theory_razmetka;
    Fragment_theory_bilety fragment_theory_bilety;
    Fragment_theory_prilog fragment_theory_prilog;


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_theory, null);
        //  кнопки
        theory_pdd_button=(Button) v.findViewById(R.id.theory_pdd);
        theory_znaki_button=(Button) v.findViewById(R.id.theory_znaki);
        theory_razmetka_button=(Button) v.findViewById(R.id.theroy_razmetka);
        theory_bilet_button=(Button) v.findViewById(R.id.theory_bilet);
        theory_prilog_button=(Button) v.findViewById(R.id.theory_prilog);
        // фрагменты
        fragment_theory_pdd=new Fragment_theory_pdd();
        fragment_theory_znaki=new Fragment_theory_znaki();
        fragment_theory_razmetka=new Fragment_theory_razmetka();
        fragment_theory_bilety=new Fragment_theory_bilety();
        fragment_theory_prilog=new Fragment_theory_prilog();

        final FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();

        theory_pdd_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             fragmentTransaction.replace(R.id.fragment_container,fragment_theory_pdd);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

       theory_znaki_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_znaki);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        theory_razmetka_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_razmetka);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        theory_bilet_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_bilety);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        theory_prilog_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_prilog);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        return v;
    }



}