package com.example.nickolas.pddmasterv01.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.nickolas.pddmasterv01.R;


public class Fragment_online_debts extends Fragment {

    // обьявляем WebView
    WebView online_debts_view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_online_debts,null);

        //реализация WebView
        online_debts_view=(WebView) v.findViewById(R.id.online_debts_view);
        // включаем поддержку JavaScript
        online_debts_view.getSettings().setJavaScriptEnabled(true);
        //чтобы открывать ссылки внутри WebView
        online_debts_view.setWebViewClient(new WebViewClient());
        // указываем страницу загрузки
        online_debts_view.loadUrl("http://m.sp-money.yandex.ru/internal/webapps/wizard/?_openstat=yandex;gibddkoldun_m;header");

        return v;
    }




}
