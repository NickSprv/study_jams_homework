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



public class Fragment_test_b3 extends Fragment {
    EditText editText_result;
    Button button_bilet3_result;
    Button button_bilet3_share;
    RadioGroup radioGroup_bilet3_v1;
    RadioGroup radioGroup_bilet3_v2;
    RadioGroup radioGroup_bilet3_v3;
    RadioGroup radioGroup_bilet3_v4;
    RadioGroup radioGroup_bilet3_v5;
    RadioGroup radioGroup_bilet3_v6;
    RadioGroup radioGroup_bilet3_v7;
    RadioGroup radioGroup_bilet3_v8;
    RadioGroup radioGroup_bilet3_v9;
    RadioGroup radioGroup_bilet3_v10;
    RadioGroup radioGroup_bilet3_v11;
    RadioGroup radioGroup_bilet3_v12;
    RadioGroup radioGroup_bilet3_v13;
    RadioGroup radioGroup_bilet3_v14;
    RadioGroup radioGroup_bilet3_v15;
    RadioGroup radioGroup_bilet3_v16;
    RadioGroup radioGroup_bilet3_v17;
    RadioGroup radioGroup_bilet3_v18;
    RadioGroup radioGroup_bilet3_v19;
    RadioGroup radioGroup_bilet3_v20;
    int result;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_test_b3, null);

        editText_result=(EditText) v.findViewById(R.id.editText_bilet3_result);
        editText_result.setEnabled(false);

        button_bilet3_result=(Button) v.findViewById(R.id.button_bilet3_result);
        button_bilet3_share=(Button) v.findViewById(R.id.button_share_bilet3);

        radioGroup_bilet3_v1=(RadioGroup) v.findViewById(R.id.radioGroup_bilet3_v1);
        radioGroup_bilet3_v2=(RadioGroup) v.findViewById(R.id.radioGroup_bilet3_v2);
        radioGroup_bilet3_v3=(RadioGroup) v.findViewById(R.id.radioGroup_bilet3_v3);
        radioGroup_bilet3_v4=(RadioGroup) v.findViewById(R.id.radioGroup_bilet3_v4);
        radioGroup_bilet3_v5=(RadioGroup) v.findViewById(R.id.radioGroup_bilet3_v5);
        radioGroup_bilet3_v6=(RadioGroup) v.findViewById(R.id.radioGroup_bilet3_v6);
        radioGroup_bilet3_v7=(RadioGroup) v.findViewById(R.id.radioGroup_bilet3_v7);
        radioGroup_bilet3_v8=(RadioGroup) v.findViewById(R.id.radioGroup_bilet3_v8);
        radioGroup_bilet3_v9=(RadioGroup) v.findViewById(R.id.radioGroup_bilet3_v9);
        radioGroup_bilet3_v10=(RadioGroup) v.findViewById(R.id.radioGroup_bilet3_v10);
        radioGroup_bilet3_v11=(RadioGroup) v.findViewById(R.id.radioGroup_bilet3_v11);
        radioGroup_bilet3_v12=(RadioGroup) v.findViewById(R.id.radioGroup_bilet3_v12);
        radioGroup_bilet3_v13=(RadioGroup) v.findViewById(R.id.radioGroup_bilet3_v13);
        radioGroup_bilet3_v14=(RadioGroup) v.findViewById(R.id.radioGroup_bilet3_v14);
        radioGroup_bilet3_v15=(RadioGroup) v.findViewById(R.id.radioGroup_bilet3_v15);
        radioGroup_bilet3_v16=(RadioGroup) v.findViewById(R.id.radioGroup_bilet3_v16);
        radioGroup_bilet3_v17=(RadioGroup) v.findViewById(R.id.radioGroup_bilet3_v17);
        radioGroup_bilet3_v18=(RadioGroup) v.findViewById(R.id.radioGroup_bilet3_v18);
        radioGroup_bilet3_v19=(RadioGroup) v.findViewById(R.id.radioGroup_bilet3_v19);
        radioGroup_bilet3_v20=(RadioGroup) v.findViewById(R.id.radioGroup_bilet3_v20);

        result=0;

        radioGroup_bilet3_v1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet3_vopros1_p1) result++;
            }
        });

        radioGroup_bilet3_v2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet3_vopros2_p3) result++;
            }
        });

        radioGroup_bilet3_v3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet3_vopros3_p2) result++;
            }
        });

        radioGroup_bilet3_v4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet3_vopros4_p2) result++;
            }
        });

        radioGroup_bilet3_v5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet3_vopros5_p2) result++;
            }
        });

        radioGroup_bilet3_v6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet3_vopros6_p3) result++;
            }
        });

        radioGroup_bilet3_v7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet3_vopros7_p2) result++;
            }
        });

        radioGroup_bilet3_v8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet3_vopros8_p1) result++;
            }
        });

        radioGroup_bilet3_v9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet3_vopros9_p2) result++;
            }
        });

        radioGroup_bilet3_v10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet3_vopros10_p2) result++;
            }
        });

        radioGroup_bilet3_v11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet3_vopros11_p3) result++;
            }
        });

        radioGroup_bilet3_v12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet3_vopros12_p2) result++;
            }
        });

        radioGroup_bilet3_v13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet3_vopros13_p2) result++;
            }
        });

        radioGroup_bilet3_v14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet3_vopros14_p1) result++;
            }
        });

        radioGroup_bilet3_v15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet3_vopros15_p2) result++;
            }
        });

        radioGroup_bilet3_v16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet3_vopros16_p3) result++;
            }
        });

        radioGroup_bilet3_v17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet3_vopros17_p4) result++;
            }
        });

        radioGroup_bilet3_v18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet3_vopros18_p1) result++;
            }
        });

        radioGroup_bilet3_v19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet3_vopros19_p4) result++;
            }
        });

        radioGroup_bilet3_v20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton_bilet3_vopros20_p3) result++;
            }
        });

        button_bilet3_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result>=18) editText_result.setText("Вы успешно прошли тест! " + result + " правильных ответов из 20" );
                else editText_result.setText("Вы не прошли тест! Лишь " + result + " правильных ответов из 20! " + "Советуем прочитать теорию еще разок!");
            }
        });

        button_bilet3_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Тест на знание ПДД, билет №3");
                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT,"Мой результат прохождения теста ПДД " +  result + " правильных ответов из 20");
                startActivity(Intent.createChooser(shareIntent, "Поделиться через:"));
            }
        });


        return v;
    }

}
