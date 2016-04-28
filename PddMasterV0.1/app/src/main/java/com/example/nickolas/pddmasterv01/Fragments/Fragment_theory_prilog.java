package com.example.nickolas.pddmasterv01.Fragments;


import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.nickolas.pddmasterv01.R;


public class Fragment_theory_prilog extends Fragment {
    Button button1_prilog;
    Button button2_prilog;
    Button button3_prilog;

    Fragment_theory_prilog_p1 fragment_theory_prilog_p1;
    Fragment_theory_prilog_p2 fragment_theory_prilog_p2;
    Fragment_theory_prilog_p3 fragment_theory_prilog_p3;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_theory_prilog, null);

        button1_prilog=(Button) v.findViewById(R.id.button1_prilog);
        button2_prilog=(Button) v.findViewById(R.id.button2_prilog);
        button3_prilog=(Button) v.findViewById(R.id.button3_prilog);

        fragment_theory_prilog_p1=new Fragment_theory_prilog_p1();
        fragment_theory_prilog_p2=new Fragment_theory_prilog_p2();
        fragment_theory_prilog_p3=new Fragment_theory_prilog_p3();

        final FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();

        button1_prilog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_prilog_p1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        button2_prilog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_prilog_p2);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        button3_prilog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_prilog_p3);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });



        return v;
    }

}
