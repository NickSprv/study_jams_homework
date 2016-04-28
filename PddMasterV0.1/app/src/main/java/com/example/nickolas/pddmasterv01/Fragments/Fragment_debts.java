package com.example.nickolas.pddmasterv01.Fragments;

import android.app.FragmentTransaction;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nickolas.pddmasterv01.R;

public class Fragment_debts extends Fragment {
    //прописываем фргаменты и view элементы
    Fragment_online_debts fragment_online_debts;
    Button button_online_debts;
    WebView debts_web_view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_debts, null);

        //реализация WebView
        debts_web_view=(WebView) v.findViewById(R.id.debts_web_view);
        // включаем поддержку JavaScript
        debts_web_view.getSettings().setJavaScriptEnabled(true);
        //чтобы открывать ссылки внутри WebView
        debts_web_view.setWebViewClient(new WebViewClient());
        // указываем страницу загрузки
        debts_web_view.loadUrl("file:///android_asset/shtraf.html");

        //для работы кнопки онлайн проверки штрафов
        button_online_debts=(Button) v.findViewById(R.id.button_debts);
        button_online_debts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // загружаем фрагмент онлайн проверки штрафов

              FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragment_online_debts=new Fragment_online_debts();
                fragmentTransaction.replace(R.id.fragment_container,fragment_online_debts);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        return v;
    }


}
