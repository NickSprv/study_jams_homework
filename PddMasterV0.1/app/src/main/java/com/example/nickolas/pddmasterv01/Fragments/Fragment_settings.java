package com.example.nickolas.pddmasterv01.Fragments;


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

public class Fragment_settings extends Fragment {
    Button button_settings_name;
    EditText editText_settings_name;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_settings, null);

        button_settings_name=(Button) v.findViewById(R.id.button_settings_name);
        editText_settings_name=(EditText) v.findViewById(R.id.editText_settings_name);
        button_settings_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name;
                name=editText_settings_name.getText().toString();
                SharedPreferences sharedPreferences;
                sharedPreferences=getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor preferencesEditor=sharedPreferences.edit();
                preferencesEditor.putString("USER_NAME",name);
                preferencesEditor.commit();
            }
        });

        return v;
    }

}
