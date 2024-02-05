package com.example.isip21_1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    String[] countries = {"Аргентина", "Бразилия", "Чили", "Колумбия", "Уругвай", "Обо мне"};

    AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            switch (position) {
                case 0:
                    Intent intent_ag = new Intent(MainActivity.this, com.example.isip21_1.Argentina.class);
                    startActivity(intent_ag);
                    Toast.makeText(getApplicationContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
                    break;
                case 1:
                    Intent intent_bz = new Intent(MainActivity.this, Brazil.class);
                    startActivity(intent_bz);
                    Toast.makeText(getApplicationContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
                    break;
                case 2:
                    Intent intent_ch = new Intent(MainActivity.this, Chile.class);
                    startActivity(intent_ch);
                    Toast.makeText(getApplicationContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
                    break;
                case 3:
                    Intent intent_co = new Intent(MainActivity.this, Columbia.class);
                    startActivity(intent_co);
                    Toast.makeText(getApplicationContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
                    break;
                case 4:
                    Intent intent_ug = new Intent(MainActivity.this, Uruguay.class);
                    startActivity(intent_ug);
                    Toast.makeText(getApplicationContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
                    break;
                case 5:
                    Intent intent_us = new Intent(MainActivity.this, AboutUs.class);
                    startActivity(intent_us);
                    Toast.makeText(getApplicationContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countries);

        setListAdapter(mAdapter);
        getListView().setOnItemClickListener(itemClickListener);
    }
}