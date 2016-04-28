package com.example.nickolas.pddmasterv01.Fragments;


import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.nickolas.pddmasterv01.R;


public class Fragment_tests extends Fragment {
    Button button_test_bilet1;
    Button button_test_bilet2;
    Button button_test_bilet3;
    Button button_test_bilet4;
    Button button_test_bilet5;
    Fragment_test_b1 fragment_test_b1;
    Fragment_test_b2 fragment_test_b2;
    Fragment_test_b3 fragment_test_b3;
    Fragment_test_b4 fragment_test_b4;
    Fragment_test_b5 fragment_test_b5;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tests, null);
        fragment_test_b1=new Fragment_test_b1();
        fragment_test_b2=new Fragment_test_b2();
        fragment_test_b3=new Fragment_test_b3();
        fragment_test_b4=new Fragment_test_b4();
        fragment_test_b5=new Fragment_test_b5();

        button_test_bilet1=(Button) v.findViewById(R.id.button_test_bilet1);
        button_test_bilet2=(Button) v.findViewById(R.id.button_test_bilet2);
        button_test_bilet3=(Button) v.findViewById(R.id.button_test_bilet3);
        button_test_bilet4=(Button) v.findViewById(R.id.button_test_bilet4);
        button_test_bilet5=(Button) v.findViewById(R.id.button_test_bilet5);

        button_test_bilet1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,fragment_test_b1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        button_test_bilet2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,fragment_test_b2);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        button_test_bilet3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,fragment_test_b3);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        button_test_bilet4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,fragment_test_b4);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        button_test_bilet5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,fragment_test_b5);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        return v;
    }

}
