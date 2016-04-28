package com.example.nickolas.pddmasterv01.Fragments;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.nickolas.pddmasterv01.R;

public class Fragment_calculator extends Fragment {
    Button button_calculate;
    Button button_share;
    EditText editText_power;
    EditText editText_result;
    RadioGroup radioGroup_cost;
    RadioGroup radioGroup_years;
    int power;
    int radioButton1_index;
    int radioButton2_index;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_calculator, null);

        button_calculate=(Button) v.findViewById(R.id.button_calculate);
        button_share=(Button) v.findViewById(R.id.button_calc_share);

        editText_power=(EditText) v.findViewById(R.id.editText_calculator_power);
        editText_result=(EditText) v.findViewById(R.id.editText_calculate);

        editText_result.setEnabled(false);


        radioGroup_cost=(RadioGroup) v.findViewById(R.id.radioGroup_cost);
        radioGroup_years=(RadioGroup) v.findViewById(R.id.radioGroup_years);

       radioGroup_cost.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup group, int checkedId) {
               switch (checkedId){

                   case R.id.radioButton_less_3m:
                       radioButton1_index=1;
                       break;
                   case R.id.radioButton_3m_5m:
                       radioButton1_index=2;
                       break;
                   case R.id.radioButton_5m_10m:
                       radioButton1_index=3;
                       break;
                   case R.id.radioButton_10m_15m:
                       radioButton1_index=4;
                       break;
                   case R.id.radioButton_more_15m:
                       radioButton1_index=5;
                       break;
                   default:
                       radioButton1_index=-1;
               }
           }
       });

        radioGroup_years.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radioButton_years_1:
                        radioButton2_index=1;
                        break;
                    case R.id.radioButton_years_1_2:
                        radioButton2_index=2;
                        break;
                    case R.id.radioButton_years_2_3:
                        radioButton2_index=3;
                        break;
                    case R.id.radioButton_years_5:
                        radioButton2_index=4;
                        break;
                    case R.id.radioButton_years_10:
                        radioButton2_index=5;
                        break;
                    case R.id.radioButton_years_15:
                        radioButton2_index=6;
                        break;
                    default:radioButton2_index=-1;

                }
            }
        });

        button_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double koef=1;

                double tax;
                double result;
                //на цену
                if(editText_power.getText().toString().equals("")){
                    editText_result.setText("Введите значение для мощности");

                }
                else {
                    power= Integer.parseInt(editText_power.getText().toString());

                if(radioButton1_index==2&&radioButton2_index==1) koef=1.5;
                if(radioButton1_index==2&&radioButton2_index==2) koef=1.3;
                if(radioButton1_index==2&&radioButton2_index==3) koef=1.1;

                if(radioButton1_index==3&&(radioButton2_index==4||radioButton2_index==3||radioButton2_index==2||radioButton2_index==1))
                    koef=2;
                if(radioButton1_index==4&&(radioButton2_index==5||radioButton2_index==4||radioButton2_index==3||radioButton2_index==2||radioButton2_index==1)) koef=3;
                if(radioButton1_index==5&&(radioButton2_index==6||radioButton2_index==5||radioButton2_index==4||radioButton2_index==3||radioButton2_index==2||radioButton2_index==1)) koef=3;
                //налоговый коэффицент по мощности
                if(power<45)tax=13.5;
                else if(power<100) tax=22.5;
                else if(power<150) tax=31.5;
                else if(power<200) tax=45;
                else if(power<250) tax=75;
                else tax=150;

                result=power*tax*koef;
                String res= String.valueOf(result);

                editText_result.setText(res + " рублей");}





            }
        });

        button_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Калькулятор транспортного налога");
                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT,"Транспортный налог на мой автомобиль составляет " + editText_result.getText().toString());
                startActivity(Intent.createChooser(shareIntent, "Поделиться через:"));

            }
        });



        return v;
    }

}
