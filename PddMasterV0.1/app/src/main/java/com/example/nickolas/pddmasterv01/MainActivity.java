package com.example.nickolas.pddmasterv01;

import android.app.FragmentTransaction;
import android.app.Notification;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;

import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.support.v4.app.FragmentActivity;

import com.example.nickolas.pddmasterv01.Fragments.Fragment_calculator;
import com.example.nickolas.pddmasterv01.Fragments.Fragment_debts;
import com.example.nickolas.pddmasterv01.Fragments.Fragment_main_screen;
import com.example.nickolas.pddmasterv01.Fragments.Fragment_regions;
import com.example.nickolas.pddmasterv01.Fragments.Fragment_settings;
import com.example.nickolas.pddmasterv01.Fragments.Fragment_statistics;
import com.example.nickolas.pddmasterv01.Fragments.Fragment_tests;
import com.example.nickolas.pddmasterv01.Fragments.Fragment_theory;

import org.xmlpull.v1.XmlPullParser;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    //фрагменты
    Fragment_debts fragment_debts;
    Fragment_regions fragment_regions;
    Fragment_theory fragment_theory;
    Fragment_calculator fragment_calculator;
    Fragment_settings fragment_settings;
    Fragment_statistics fragment_statistics;
    Fragment_main_screen fragment_main_screen;
    Fragment_tests fragment_tests;

    //хранение насторек
    SharedPreferences sharedPreferences;//для хранения настроек и информации о первом запуске приложения

    //кнопки на главном экране
    Button button_test_start;
    Button button_theory_start;
    EditText editText_priv_start;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        //инициализация фрагментов
        fragment_debts=new Fragment_debts(); // фрагмент проверки штрафов
        fragment_regions=new Fragment_regions();//фрагмент поиска по регионам
        fragment_theory=new Fragment_theory();//фрагмент теории
        fragment_calculator=new Fragment_calculator();//фрагмент калькулятора
        fragment_settings=new Fragment_settings();//фрагмент настроек
        fragment_statistics=new Fragment_statistics();//фрагмент со статистикой
        fragment_main_screen=new Fragment_main_screen();//фрагмент вкладки Главная
        fragment_tests=new Fragment_tests();//фрагмент тестов

        // для работы главного экрана
        button_test_start=(Button) findViewById(R.id.button_main_test_start);
        button_theory_start=(Button) findViewById(R.id.button_main_theory_start);
        editText_priv_start=(EditText) findViewById(R.id.editText_main_priv_start);
        editText_priv_start.setEnabled(false);
        sharedPreferences=getPreferences(MODE_PRIVATE);
        String userName=sharedPreferences.getString("USER_NAME","Пользователь");
        editText_priv_start.setText("Добро пожаловать, "+ userName + "!");

        button_theory_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,fragment_theory);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        button_test_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,fragment_tests);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

    }


    // для работы fragmentBackStack переопределяем метод onBackPressed
    @Override
    public void onBackPressed() {
        int count = getFragmentManager().getBackStackEntryCount();
        if (count == 0) {
            super.onBackPressed();
        } else {
            getFragmentManager().popBackStack();
        }
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container,fragment_settings);
            fragmentTransaction.commit();

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        // для вставки и управления фрагментами
        FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();

        if (id == R.id.nav_main) {
            fragmentTransaction.replace(R.id.fragment_container,fragment_main_screen);

        } else if (id == R.id.nav_theory) {
            fragmentTransaction.replace(R.id.fragment_container,fragment_theory);


        } else if (id == R.id.nav_tests) {
            fragmentTransaction.replace(R.id.fragment_container,fragment_tests);

        } else if (id == R.id.nav_debts) {
            fragmentTransaction.replace(R.id.fragment_container,fragment_debts);

        } else if (id == R.id.nav_tax) {
            fragmentTransaction.replace(R.id.fragment_container,fragment_calculator);

        } else if (id == R.id.nav_region) {
            fragmentTransaction.replace(R.id.fragment_container,fragment_regions);

        } else if (id == R.id.nav_settings) {
            fragmentTransaction.replace(R.id.fragment_container,fragment_settings);

        }else if (id == R.id.nav_statistic) {
            fragmentTransaction.replace(R.id.fragment_container,fragment_statistics);

        }
        fragmentTransaction.commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
