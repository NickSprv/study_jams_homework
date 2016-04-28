package com.example.nickolas.pddmasterv01.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.example.nickolas.pddmasterv01.R;

public class Fragment_test_b1 extends Fragment {
    EditText editText_result;
    Button button_bilet1_result;
    Button button_billet1_share;
    RadioGroup radioGroup_bliet1_v1;
    RadioGroup radioGroup_bliet1_v2;
    RadioGroup radioGroup_bliet1_v3;
    RadioGroup radioGroup_bliet1_v4;
    RadioGroup radioGroup_bliet1_v5;
    RadioGroup radioGroup_bliet1_v6;
    RadioGroup radioGroup_bliet1_v7;
    RadioGroup radioGroup_bliet1_v8;
    RadioGroup radioGroup_bliet1_v9;
    RadioGroup radioGroup_bliet1_v10;
    RadioGroup radioGroup_bliet1_v11;
    RadioGroup radioGroup_bliet1_v12;
    RadioGroup radioGroup_bliet1_v13;
    RadioGroup radioGroup_bliet1_v14;
    RadioGroup radioGroup_bliet1_v15;
    RadioGroup radioGroup_bliet1_v16;
    RadioGroup radioGroup_bliet1_v17;
    RadioGroup radioGroup_bliet1_v18;
    RadioGroup radioGroup_bliet1_v19;
    RadioGroup radioGroup_bliet1_v20;
    int result;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_test_b1, null);
        editText_result=(EditText) v.findViewById(R.id.editText_bilet1_result);
        editText_result.setEnabled(false);

        button_bilet1_result=(Button) v.findViewById(R.id.button_bilet1_result);
        button_billet1_share=(Button) v.findViewById(R.id.button_share_bilet1);

        radioGroup_bliet1_v1=(RadioGroup) v.findViewById(R.id.radioGroup_bilet1_v1);
        radioGroup_bliet1_v2=(RadioGroup) v.findViewById(R.id.radioGroup_bilet1_v2);
        radioGroup_bliet1_v3=(RadioGroup) v.findViewById(R.id.radioGroup_bilet1_v3);
        radioGroup_bliet1_v4=(RadioGroup) v.findViewById(R.id.radioGroup_bilet1_v4);
        radioGroup_bliet1_v5=(RadioGroup) v.findViewById(R.id.radioGroup_bilet1_v5);
        radioGroup_bliet1_v6=(RadioGroup) v.findViewById(R.id.radioGroup_bilet1_v6);
        radioGroup_bliet1_v7=(RadioGroup) v.findViewById(R.id.radioGroup_bilet1_v7);
        radioGroup_bliet1_v8=(RadioGroup) v.findViewById(R.id.radioGroup_bilet1_v8);
        radioGroup_bliet1_v9=(RadioGroup) v.findViewById(R.id.radioGroup_bilet1_v9);
        radioGroup_bliet1_v10=(RadioGroup) v.findViewById(R.id.radioGroup_bilet1_v10);
        radioGroup_bliet1_v11=(RadioGroup) v.findViewById(R.id.radioGroup_bilet1_v11);
        radioGroup_bliet1_v12=(RadioGroup) v.findViewById(R.id.radioGroup_bilet1_v12);
        radioGroup_bliet1_v13=(RadioGroup) v.findViewById(R.id.radioGroup_bilet1_v13);
        radioGroup_bliet1_v14=(RadioGroup) v.findViewById(R.id.radioGroup_bilet1_v14);
        radioGroup_bliet1_v15=(RadioGroup) v.findViewById(R.id.radioGroup_bilet1_v15);
        radioGroup_bliet1_v16=(RadioGroup) v.findViewById(R.id.radioGroup_bilet1_v16);
        radioGroup_bliet1_v17=(RadioGroup) v.findViewById(R.id.radioGroup_bilet1_v17);
        radioGroup_bliet1_v18=(RadioGroup) v.findViewById(R.id.radioGroup_bilet1_v18);
        radioGroup_bliet1_v19=(RadioGroup) v.findViewById(R.id.radioGroup_bilet1_v19);
        radioGroup_bliet1_v20=(RadioGroup) v.findViewById(R.id.radioGroup_bilet1_v20);

        result=0;

        radioGroup_bliet1_v1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet1_vopros1_p2) result++;
            }
        });

        radioGroup_bliet1_v2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet1_vopros2_p2) result++;
            }
        });

        radioGroup_bliet1_v3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet1_vopros3_p3) result++;
            }
        });

        radioGroup_bliet1_v4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet1_vopros4_p3) result++;
            }
        });

        radioGroup_bliet1_v5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet1_vopros5_p3) result++;
            }
        });

        radioGroup_bliet1_v6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet1_vopros6_p2) result++;
            }
        });

        radioGroup_bliet1_v7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet1_vopros7_p3) result++;
            }
        });

        radioGroup_bliet1_v8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet1_vopros8_p2) result++;
            }
        });

        radioGroup_bliet1_v9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet1_vopros9_p1) result++;
            }
        });

        radioGroup_bliet1_v10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet1_vopros10_p3) result++;
            }
        });

        radioGroup_bliet1_v11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet1_vopros11_p1) result++;
            }
        });

        radioGroup_bliet1_v12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet1_vopros12_p1) result++;
            }
        });

        radioGroup_bliet1_v13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet1_vopros13_p1) result++;
            }
        });

        radioGroup_bliet1_v14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet1_vopros14_p2) result++;
            }
        });

        radioGroup_bliet1_v15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet1_vopros15_p3) result++;
            }
        });

        radioGroup_bliet1_v16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet1_vopros16_p4) result++;
            }
        });

        radioGroup_bliet1_v17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet1_vopros17_p3) result++;
            }
        });

        radioGroup_bliet1_v18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet1_vopros18_p4) result++;
            }
        });

        radioGroup_bliet1_v19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet1_vopros19_p3) result++;
            }
        });

        radioGroup_bliet1_v20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet1_vopros20_p2) result++;
            }
        });

        button_bilet1_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result>=18) editText_result.setText("Вы успешно прошли тест! " + result + " правильных ответов из 20" );
                else editText_result.setText("Вы не прошли тест! Лишь " + result + " правильных ответов из 20! " + "Советуем прочитать теорию еще разок!");
            }
        });

        button_billet1_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Тест на знание ПДД, билет №1");
                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT,"Мой результат прохождения теста ПДД " +  result + " правильных ответов из 20");
                startActivity(Intent.createChooser(shareIntent, "Поделиться через:"));
            }
        });

        return v;
    }



}
