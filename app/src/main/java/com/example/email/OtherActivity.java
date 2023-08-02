package com.example.email;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

public class OtherActivity extends AppCompatActivity {

    ListView listView;

    ImageButton btn;
    CustomAdapter adapter;
    String name[]={"Angel One","BSE INVESTOR","Catherine Robinson","Dropbox","Elegant Pharma","Filatex Fashion","G Claridge","Hindustan Finst","ICES Software","JSW Steel Ltd","Kotak Bank "};
    String num[]={"Issuance of Credit Cards","Information for Investors","Nomination details","30+ new jobs in India","8 new jobs for ‘rapido job’","Payment overdue fo "," Please pay immediately","5 new jobs","Pansuriya"," Tough to manage","daily expenses "};
    int imgArr[]={R.drawable.img,R.drawable.img_1, R.drawable.img_2,
            R.drawable.img_3,R.drawable.img_4,R.drawable.img_5,
            R.drawable.img_6,R.drawable.img_7, R.drawable.img_8,
            R.drawable.img_9,R.drawable.img_10};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        listView=findViewById(R.id.other_Listview);
        adapter=new CustomAdapter(OtherActivity.this,name,num,imgArr);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                System.out.println("Position="+position);
                Toast.makeText(OtherActivity.this, "Item Clicked="+position, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(OtherActivity.this,FullScreen_Activity.class);
                intent.putExtra("pos",position);
                intent.putExtra("name",name);
                intent.putExtra("num",num);
                intent.putExtra("img",imgArr);
                startActivity(intent);

            }
        });
//        listView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                System.out.println("Position=");
//            }
//        });
    }
}