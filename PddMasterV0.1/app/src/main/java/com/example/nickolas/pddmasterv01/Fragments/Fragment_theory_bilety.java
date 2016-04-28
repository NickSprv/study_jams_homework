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


public class Fragment_theory_bilety extends Fragment {
    WebView theory_bilety_view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_theory_bilety, null);
        theory_bilety_view=(WebView) v.findViewById(R.id.webView_theory_bilety);
        // включаем поддержку JavaScript
        theory_bilety_view.getSettings().setJavaScriptEnabled(true);
        //чтобы открывать ссылки внутри WebView
        theory_bilety_view.setWebViewClient(new WebViewClient());
        // указываем страницу загрузки
        theory_bilety_view.loadUrl("file:///android_asset/pdd/bileti.html");

        return v;
    }


}
