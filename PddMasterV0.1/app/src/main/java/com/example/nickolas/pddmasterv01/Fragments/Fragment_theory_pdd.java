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
public class Fragment_theory_pdd extends Fragment {

    Button button_pdd_p1, button_pdd_p2, button_pdd_p3, button_pdd_p4, button_pdd_p5, button_pdd_p6,
            button_pdd_p7,    button_pdd_p8,    button_pdd_p9, button_pdd_p10, button_pdd_p11,
            button_pdd_p12,    button_pdd_p13,    button_pdd_p14,  button_pdd_p15, button_pdd_p16,
            button_pdd_p17,    button_pdd_p18,    button_pdd_p19,  button_pdd_p20, button_pdd_p21,
            button_pdd_p22,    button_pdd_p23,    button_pdd_p24,    button_pdd_p25;

    Fragment_theory_pdd_p1 fragment_theory_pdd_p1;
    Fragment_theory_pdd_p2 fragment_theory_pdd_p2;
    Fragment_theory_pdd_p3 fragment_theory_pdd_p3;
    Fragment_theory_pdd_p4 fragment_theory_pdd_p4;
    Fragment_theory_pdd_p5 fragment_theory_pdd_p5;
    Fragment_theory_pdd_p6 fragment_theory_pdd_p6;
    Fragment_theory_pdd_p7 fragment_theory_pdd_p7;
    Fragment_theory_pdd_p8 fragment_theory_pdd_p8;
    Fragment_theory_pdd_p9 fragment_theory_pdd_p9;
    Fragment_theory_pdd_p10 fragment_theory_pdd_p10;
    Fragment_theory_pdd_p11 fragment_theory_pdd_p11;
    Fragment_theory_pdd_p12 fragment_theory_pdd_p12;
    Fragment_theory_pdd_p13 fragment_theory_pdd_p13;
    Fragment_theory_pdd_p14 fragment_theory_pdd_p14;
    Fragment_theory_pdd_p15 fragment_theory_pdd_p15;
    Fragment_theory_pdd_p16 fragment_theory_pdd_p16;
    Fragment_theory_pdd_p17 fragment_theory_pdd_p17;
    Fragment_theory_pdd_p18 fragment_theory_pdd_p18;
    Fragment_theory_pdd_p19 fragment_theory_pdd_p19;
    Fragment_theory_pdd_p20 fragment_theory_pdd_p20;
    Fragment_theory_pdd_p21 fragment_theory_pdd_p21;
    Fragment_theory_pdd_p22 fragment_theory_pdd_p22;
    Fragment_theory_pdd_p23 fragment_theory_pdd_p23;
    Fragment_theory_pdd_p24 fragment_theory_pdd_p24;
    Fragment_theory_pdd_p25 fragment_theory_pdd_p25;








    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_theory_pdd, null);
        fragment_theory_pdd_p1=new Fragment_theory_pdd_p1();
        fragment_theory_pdd_p2=new Fragment_theory_pdd_p2();
        fragment_theory_pdd_p3=new Fragment_theory_pdd_p3();
        fragment_theory_pdd_p4=new Fragment_theory_pdd_p4();
        fragment_theory_pdd_p5=new Fragment_theory_pdd_p5();
        fragment_theory_pdd_p6=new Fragment_theory_pdd_p6();
        fragment_theory_pdd_p7=new Fragment_theory_pdd_p7();
        fragment_theory_pdd_p8=new Fragment_theory_pdd_p8();
        fragment_theory_pdd_p9=new Fragment_theory_pdd_p9();
       fragment_theory_pdd_p10=new Fragment_theory_pdd_p10();
       fragment_theory_pdd_p11=new Fragment_theory_pdd_p11();
       fragment_theory_pdd_p12=new Fragment_theory_pdd_p12();
       fragment_theory_pdd_p13=new Fragment_theory_pdd_p13();
       fragment_theory_pdd_p14=new Fragment_theory_pdd_p14();
       fragment_theory_pdd_p15=new Fragment_theory_pdd_p15();
       fragment_theory_pdd_p16=new Fragment_theory_pdd_p16();
       fragment_theory_pdd_p17=new Fragment_theory_pdd_p17();
       fragment_theory_pdd_p18=new Fragment_theory_pdd_p18();
       fragment_theory_pdd_p19=new Fragment_theory_pdd_p19();
       fragment_theory_pdd_p20=new Fragment_theory_pdd_p20();
       fragment_theory_pdd_p21=new Fragment_theory_pdd_p21();
       fragment_theory_pdd_p22=new Fragment_theory_pdd_p22();
       fragment_theory_pdd_p23=new Fragment_theory_pdd_p23();
       fragment_theory_pdd_p24=new Fragment_theory_pdd_p24();
       fragment_theory_pdd_p25=new Fragment_theory_pdd_p25();

        button_pdd_p1=(Button) v.findViewById(R.id.button1_pdd);
        button_pdd_p2=(Button) v.findViewById(R.id.button2_pdd);
        button_pdd_p3=(Button) v.findViewById(R.id.button3_pdd);
        button_pdd_p4=(Button) v.findViewById(R.id.button4_pdd);
        button_pdd_p5=(Button) v.findViewById(R.id.button5_pdd);
        button_pdd_p6=(Button) v.findViewById(R.id.button6_pdd);
        button_pdd_p7=(Button) v.findViewById(R.id.button7_pdd);
        button_pdd_p8=(Button) v.findViewById(R.id.button8_pdd);
        button_pdd_p9=(Button) v.findViewById(R.id.button9_pdd);
        button_pdd_p10=(Button) v.findViewById(R.id.button10_pdd);
        button_pdd_p11=(Button) v.findViewById(R.id.button11_pdd);
        button_pdd_p12=(Button) v.findViewById(R.id.button12_pdd);
        button_pdd_p13=(Button) v.findViewById(R.id.button13_pdd);
        button_pdd_p14=(Button) v.findViewById(R.id.button14_pdd);
        button_pdd_p15=(Button) v.findViewById(R.id.button15_pdd);
        button_pdd_p16=(Button) v.findViewById(R.id.button16_pdd);
        button_pdd_p17=(Button) v.findViewById(R.id.button17_pdd);
        button_pdd_p18=(Button) v.findViewById(R.id.button18_pdd);
        button_pdd_p19=(Button) v.findViewById(R.id.button19_pdd);
        button_pdd_p20=(Button) v.findViewById(R.id.button20_pdd);
        button_pdd_p21=(Button) v.findViewById(R.id.button21_pdd);
        button_pdd_p22=(Button) v.findViewById(R.id.button22_pdd);
        button_pdd_p23=(Button) v.findViewById(R.id.button23_pdd);
        button_pdd_p24=(Button) v.findViewById(R.id.button24_pdd);
        button_pdd_p25=(Button) v.findViewById(R.id.button25_pdd);

        final FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();

        button_pdd_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 fragmentTransaction.replace(R.id.fragment_container,fragment_theory_pdd_p1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        button_pdd_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_pdd_p2);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        button_pdd_p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_pdd_p3);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        button_pdd_p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_pdd_p4);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        button_pdd_p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_pdd_p5);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        button_pdd_p6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_pdd_p7);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        button_pdd_p7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_pdd_p8);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        button_pdd_p8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_pdd_p6);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        button_pdd_p9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_pdd_p9);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        button_pdd_p10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_pdd_p10);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        button_pdd_p11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_pdd_p11);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        button_pdd_p12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_pdd_p12);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        button_pdd_p13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_pdd_p13);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        button_pdd_p14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_pdd_p14);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        button_pdd_p15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_pdd_p15);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        button_pdd_p16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_pdd_p16);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        button_pdd_p17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_pdd_p17);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        button_pdd_p18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_pdd_p18);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        button_pdd_p19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_pdd_p19);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        button_pdd_p20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_pdd_p20);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        button_pdd_p21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_pdd_p21);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        button_pdd_p22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_pdd_p22);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        button_pdd_p23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_pdd_p23);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        button_pdd_p24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_pdd_p24);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        button_pdd_p25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory_pdd_p25);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });




        return v;
    }

}
