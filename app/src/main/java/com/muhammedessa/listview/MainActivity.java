package com.muhammedessa.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.listView);
        textView=(TextView)findViewById(R.id.textView);

        //Map
        ArrayList<Provinces> provincesList = new ArrayList<>();
        //Add countries
        provincesList.add(new Provinces("14", "Kirkuk"));
        provincesList.add(new Provinces("35", "Basra"));
        provincesList.add(new Provinces("12", "Mosul"));
        provincesList.add(new Provinces("25", "Karbala"));

        final ArrayAdapter<Provinces> adapter = new ArrayAdapter<Provinces>(this,
                android.R.layout.simple_list_item_1,  provincesList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // TODO Auto-generated method stub

                Provinces provinces = (Provinces) adapter.getItem(position);
                Toast.makeText(getApplicationContext(),
                        "Provinces ID: "+ provinces.getId()+
                                ",  Provinces Name : "+ provinces.getName(),
                        Toast.LENGTH_SHORT).show();

            }
        });
    }
}














//listItem = getResources().getStringArray(R.array.array_technology);
//String listItem [] = {"Kirkuk" , "Basra" , "Diyala"};


//                String value=adapter.getItem(position);
//                Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();

//String[] listItem;

