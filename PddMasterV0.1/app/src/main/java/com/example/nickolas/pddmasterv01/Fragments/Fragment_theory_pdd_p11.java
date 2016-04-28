package com.example.nickolas.pddmasterv01.Fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.nickolas.pddmasterv01.R;

import java.util.zip.Inflater;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_theory_pdd_p11 extends Fragment {
    WebView webView_theory_pdd_p11;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_theory_pdd_p11, null);
        webView_theory_pdd_p11=(WebView) v.findViewById(R.id.webView_theory_pdd_11);
        webView_theory_pdd_p11.getSettings().setJavaScriptEnabled(true);
        //чтобы открывать ссылки внутри WebView
        webView_theory_pdd_p11.setWebViewClient(new WebViewClient());
        // указываем страницу загрузки
        webView_theory_pdd_p11.loadUrl("file:///android_asset/pdd/pdd_11.html");

        return v;
    }

}
