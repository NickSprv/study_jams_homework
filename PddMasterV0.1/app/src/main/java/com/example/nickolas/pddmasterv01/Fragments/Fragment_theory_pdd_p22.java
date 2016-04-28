package com.example.nickolas.pddmasterv01.Fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.nickolas.pddmasterv01.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_theory_pdd_p22 extends Fragment {
    WebView webView_theory_pdd_p22;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_theory_pdd_p22, null);
        webView_theory_pdd_p22=(WebView) v.findViewById(R.id.webView_theory_pdd_22);
        webView_theory_pdd_p22.getSettings().setJavaScriptEnabled(true);
        //чтобы открывать ссылки внутри WebView
        webView_theory_pdd_p22.setWebViewClient(new WebViewClient());
        // указываем страницу загрузки
        webView_theory_pdd_p22.loadUrl("file:///android_asset/pdd/pdd_22.html");
        return v;
    }

}
