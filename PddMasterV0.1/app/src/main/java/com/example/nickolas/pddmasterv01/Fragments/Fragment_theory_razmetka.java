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


public class Fragment_theory_razmetka extends Fragment {
    WebView theory_razmetka_view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_theory_razmetka, null);
        theory_razmetka_view=(WebView) v.findViewById(R.id.webView_theory_razmetka);
        // включаем поддержку JavaScript
        theory_razmetka_view.getSettings().setJavaScriptEnabled(true);
        //чтобы открывать ссылки внутри WebView
        theory_razmetka_view.setWebViewClient(new WebViewClient());
        // указываем страницу загрузки
        theory_razmetka_view.loadUrl("file:///android_asset/znaki/pdd_razmetka.html");

        return v;
    }


}
