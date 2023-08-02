package com.example.email;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Spinner spinner;
    AutoCompleteTextView actv;

    GridView gridView;
    String data[]={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve"};
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        spinner=findViewById(R.id.spinner);
        actv=findViewById(R.id.actv);
        gridView=findViewById(R.id.gridview);
        adapter=new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,data);
        listView.setAdapter(adapter);
        spinner.setAdapter(adapter);
        actv.setAdapter(adapter);
        gridView.setAdapter(adapter);
    }
}
