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

public class Fragment_test_b4 extends Fragment {
    EditText editText_result;
    Button button_bilet4_result;
    Button button_bilet4_share;
    RadioGroup radioGroup_bilet4_v1;
    RadioGroup radioGroup_bilet4_v2;
    RadioGroup radioGroup_bilet4_v3;
    RadioGroup radioGroup_bilet4_v4;
    RadioGroup radioGroup_bilet4_v5;
    RadioGroup radioGroup_bilet4_v6;
    RadioGroup radioGroup_bilet4_v7;
    RadioGroup radioGroup_bilet4_v8;
    RadioGroup radioGroup_bilet4_v9;
    RadioGroup radioGroup_bilet4_v10;
    RadioGroup radioGroup_bilet4_v11;
    RadioGroup radioGroup_bilet4_v12;
    RadioGroup radioGroup_bilet4_v13;
    RadioGroup radioGroup_bilet4_v14;
    RadioGroup radioGroup_bilet4_v15;
    RadioGroup radioGroup_bilet4_v16;
    RadioGroup radioGroup_bilet4_v17;
    RadioGroup radioGroup_bilet4_v18;
    RadioGroup radioGroup_bilet4_v19;
    RadioGroup radioGroup_bilet4_v20;
    int result;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_test_b4, null);
        editText_result=(EditText) v.findViewById(R.id.editText_bilet4_result);
        editText_result.setEnabled(false);

        button_bilet4_result=(Button) v.findViewById(R.id.button_bilet4_result);
        button_bilet4_share=(Button) v.findViewById(R.id.button_share_bilet4);

        radioGroup_bilet4_v1=(RadioGroup) v.findViewById(R.id.radioGroup_bilet4_v1);
        radioGroup_bilet4_v2=(RadioGroup) v.findViewById(R.id.radioGroup_bilet4_v2);
        radioGroup_bilet4_v3=(RadioGroup) v.findViewById(R.id.radioGroup_bilet4_v3);
        radioGroup_bilet4_v4=(RadioGroup) v.findViewById(R.id.radioGroup_bilet4_v4);
        radioGroup_bilet4_v5=(RadioGroup) v.findViewById(R.id.radioGroup_bilet4_v5);
        radioGroup_bilet4_v6=(RadioGroup) v.findViewById(R.id.radioGroup_bilet4_v6);
        radioGroup_bilet4_v7=(RadioGroup) v.findViewById(R.id.radioGroup_bilet4_v7);
        radioGroup_bilet4_v8=(RadioGroup) v.findViewById(R.id.radioGroup_bilet4_v8);
        radioGroup_bilet4_v9=(RadioGroup) v.findViewById(R.id.radioGroup_bilet4_v9);
        radioGroup_bilet4_v10=(RadioGroup) v.findViewById(R.id.radioGroup_bilet4_v10);
        radioGroup_bilet4_v11=(RadioGroup) v.findViewById(R.id.radioGroup_bilet4_v11);
        radioGroup_bilet4_v12=(RadioGroup) v.findViewById(R.id.radioGroup_bilet4_v12);
        radioGroup_bilet4_v13=(RadioGroup) v.findViewById(R.id.radioGroup_bilet4_v13);
        radioGroup_bilet4_v14=(RadioGroup) v.findViewById(R.id.radioGroup_bilet4_v14);
        radioGroup_bilet4_v15=(RadioGroup) v.findViewById(R.id.radioGroup_bilet4_v15);
        radioGroup_bilet4_v16=(RadioGroup) v.findViewById(R.id.radioGroup_bilet4_v16);
        radioGroup_bilet4_v17=(RadioGroup) v.findViewById(R.id.radioGroup_bilet4_v17);
        radioGroup_bilet4_v18=(RadioGroup) v.findViewById(R.id.radioGroup_bilet4_v18);
        radioGroup_bilet4_v19=(RadioGroup) v.findViewById(R.id.radioGroup_bilet4_v19);
        radioGroup_bilet4_v20=(RadioGroup) v.findViewById(R.id.radioGroup_bilet4_v20);

        result=0;

        radioGroup_bilet4_v1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet4_vopros1_p2) result++;
            }
        });

        radioGroup_bilet4_v2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet4_vopros2_p2) result++;
            }
        });

        radioGroup_bilet4_v3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet4_vopros3_p1) result++;
            }
        });

        radioGroup_bilet4_v4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet4_vopros4_p2) result++;
            }
        });

        radioGroup_bilet4_v5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet4_vopros5_p2) result++;
            }
        });

        radioGroup_bilet4_v6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet4_vopros6_p2) result++;
            }
        });

        radioGroup_bilet4_v7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet4_vopros7_p1) result++;
            }
        });

        radioGroup_bilet4_v8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet4_vopros8_p2) result++;
            }
        });

        radioGroup_bilet4_v9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet4_vopros9_p2) result++;
            }
        });

        radioGroup_bilet4_v10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet4_vopros10_p1) result++;
            }
        });

        radioGroup_bilet4_v11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet4_vopros11_p1) result++;
            }
        });

        radioGroup_bilet4_v12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet4_vopros12_p2) result++;
            }
        });

        radioGroup_bilet4_v13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet4_vopros13_p3) result++;
            }
        });

        radioGroup_bilet4_v14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet4_vopros14_p2) result++;
            }
        });

        radioGroup_bilet4_v15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet4_vopros15_p1) result++;
            }
        });

        radioGroup_bilet4_v16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet4_vopros16_p4) result++;
            }
        });

        radioGroup_bilet4_v17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet4_vopros17_p1) result++;
            }
        });

        radioGroup_bilet4_v18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet4_vopros18_p4) result++;
            }
        });

        radioGroup_bilet4_v19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet4_vopros19_p1) result++;
            }
        });

        radioGroup_bilet4_v20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet4_vopros20_p2) result++;
            }
        });

        button_bilet4_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result>=18) editText_result.setText("Вы успешно прошли тест! " + result + " правильных ответов из 20" );
                else editText_result.setText("Вы не прошли тест! Лишь " + result + " правильных ответов из 20! " + "Советуем прочитать теорию еще разок!");
            }
        });

        button_bilet4_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Тест на знание ПДД, билет №4");
                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT,"Мой результат прохождения теста ПДД " +  result + " правильных ответов из 20");
                startActivity(Intent.createChooser(shareIntent, "Поделиться через:"));
            }
        });



        return v;
    }

}
