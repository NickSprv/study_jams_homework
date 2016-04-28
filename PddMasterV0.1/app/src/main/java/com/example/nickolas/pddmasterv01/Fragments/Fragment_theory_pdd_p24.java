package com.example.nickolas.pddmasterv01.Fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.nickolas.pddmasterv01.R;


public class Fragment_theory_pdd_p24 extends Fragment {
    WebView webView_theory_pdd_p24;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_theory_pdd_p24, null);
        webView_theory_pdd_p24=(WebView) v.findViewById(R.id.webView_theory_pdd_24);
        webView_theory_pdd_p24.getSettings().setJavaScriptEnabled(true);
        //чтобы открывать ссылки внутри WebView
        webView_theory_pdd_p24.setWebViewClient(new WebViewClient());
        // указываем страницу загрузки
        webView_theory_pdd_p24.loadUrl("file:///android_asset/pdd/pdd_24.html");
        return v;
    }

}
