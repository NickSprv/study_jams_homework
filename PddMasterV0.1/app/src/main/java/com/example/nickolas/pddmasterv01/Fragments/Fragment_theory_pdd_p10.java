package com.example.nickolas.pddmasterv01.Fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.nickolas.pddmasterv01.R;


public class Fragment_theory_pdd_p10 extends Fragment {
WebView webView_theory_pdd_p10;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_theory_pdd_p10, null);
        webView_theory_pdd_p10=(WebView) v.findViewById(R.id.webView_theory_pdd_10);
        webView_theory_pdd_p10.getSettings().setJavaScriptEnabled(true);
        //чтобы открывать ссылки внутри WebView
        webView_theory_pdd_p10.setWebViewClient(new WebViewClient());
        // указываем страницу загрузки
        webView_theory_pdd_p10.loadUrl("file:///android_asset/pdd/pdd_10.html");
        return v;
    }

}
