package com.example.nickolas.pddmasterv01.Fragments;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nickolas.pddmasterv01.R;


import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Fragment_regions extends Fragment {
    //элементы
    Button button_find_region;
    EditText text_find_region;
    EditText edit_find_region;
    WebView regions_web_view;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_regions, null);

        final ArrayList<String> listNumbers = new ArrayList<String>();
        final ArrayList<String> listNames = new ArrayList<String>();
// парсим XML файл

            XmlPullParser parser = getResources().getXml(R.xml.regions);

        try {
            while (parser.getEventType()!= XmlPullParser.END_DOCUMENT) {
                if (parser.getEventType() == XmlPullParser.START_TAG
                        && parser.getName().equals("region")) {
                    listNumbers.add(parser.getAttributeValue(0));
                    listNames.add(parser.getAttributeValue(1));

                }
                parser.next();
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        text_find_region=(EditText) v.findViewById(R.id.text_find_region);
        edit_find_region=(EditText) v.findViewById(R.id.edit_find_region);
        button_find_region=(Button) v.findViewById(R.id.button_find_region);

        text_find_region.setEnabled(false);


        //реализация WebView
        regions_web_view=(WebView) v.findViewById(R.id.regions_web_view);
        // включаем поддержку JavaScript
        regions_web_view.getSettings().setJavaScriptEnabled(true);
        //чтобы открывать ссылки внутри WebView
        regions_web_view.setWebViewClient(new WebViewClient());
        // указываем страницу загрузки
        regions_web_view.loadUrl("file:///android_asset/regions.html");

        //кнопка для поиска региона по базе
        button_find_region.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //получаем введенное пользователем значение
                String searchCode=edit_find_region.getText().toString();
                int name=listNumbers.indexOf(searchCode);
                if(name!=-1){
                text_find_region.setText(listNames.get(name));}
                else {text_find_region.setText("Такого региона не существует");
                    Activity activity = getActivity();
                    Toast.makeText(activity, "Такого региона не существует", Toast.LENGTH_SHORT).show();
                    text_find_region.setText("Такого региона не существует");}

            }
    });

        //чтобы автоматически очистить EditText при нажатии на него

        edit_find_region.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_find_region.setText("");
                //для нормальной работы кнопки Done и NEXT
                edit_find_region.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    @Override
                    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                        //что делать при нажатии
                        if ((actionId == EditorInfo.IME_ACTION_NEXT)||(actionId == EditorInfo.IME_ACTION_DONE)) {String searchCode=edit_find_region.getText().toString();

                            searchCode=edit_find_region.getText().toString();
                            int name=listNumbers.indexOf(searchCode);
                            if(name!=-1){
                                text_find_region.setText(listNames.get(name));}
                            else {text_find_region.setText("Такого региона не существует");
                                Activity activity = getActivity();
                                Toast.makeText(activity, "Такого региона не существует", Toast.LENGTH_SHORT).show();
                                text_find_region.setText("Такого региона не существует");}


                        }
                        return false;
                    }
                });

            }});

        return v;


}}
