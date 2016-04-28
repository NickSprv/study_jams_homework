package com.example.nickolas.pddmasterv01.Fragments;


import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.nickolas.pddmasterv01.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_theory_znaki extends Fragment {
    Button theory_znaki_p1;
    Button theory_znaki_p2;
    Button theory_znaki_p3;
    Button theory_znaki_p3_1;
    Button theory_znaki_p3_2;
    Button theory_znaki_p4;
    Button theory_znaki_p5;

    Fragment_theory_znaki_p1 fragment_theory_znaki_p1;
    Fragment_theory_znaki_p2 fragment_theory_znaki_p2;
    Fragment_theory_znaki_p3 fragment_theory_znaki_p3;
    Fragment_theory_znaki_p3_1 fragment_theory_znaki_p3_1;
    Fragment_theory_znaki_p3_2 fragment_theory_znaki_p3_2;
    Fragment_theory_znaki_p4 fragment_theory_znaki_p4;
    Fragment_theory_znaki_p5 fragment_theory_znaki_p5;



    public Fragment_theory_znaki() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_theory_znaki, null);

        theory_znaki_p1=(Button) v.findViewById(R.id.button1_znaki);
        theory_znaki_p2=(Button) v.findViewById(R.id.button2_znaki);
        theory_znaki_p3=(Button) v.findViewById(R.id.button3_znaki);
        theory_znaki_p3_1=(Button) v.findViewById(R.id.button4_znaki);
        theory_znaki_p3_2=(Button) v.findViewById(R.id.button5_znaki);
        theory_znaki_p4=(Button) v.findViewById(R.id.button6_znaki);
        theory_znaki_p5=(Button) v.findViewById(R.id.button7_znaki);

        fragment_theory_znaki_p1=new Fragment_theory_znaki_p1();
        fragment_theory_znaki_p2=new Fragment_theory_znaki_p2();
        fragment_theory_znaki_p3=new Fragment_theory_znaki_p3();
        fragment_theory_znaki_p3_1=new Fragment_theory_znaki_p3_1();
        fragment_theory_znaki_p3_2=new Fragment_theory_znaki_p3_2();
        fragment_theory_znaki_p4=new Fragment_theory_znaki_p4();
        fragment_theory_znaki_p5=new Fragment_theory_znaki_p5();

        final FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();

        theory_znaki_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_znaki_p1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        theory_znaki_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_znaki_p2);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        theory_znaki_p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_znaki_p3);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        theory_znaki_p3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_znaki_p3_1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        theory_znaki_p3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_znaki_p3_2);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        theory_znaki_p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_znaki_p4);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        theory_znaki_p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_znaki_p5);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        return v;
    }

}
