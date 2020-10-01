package com.example.listviewadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<Nuoc> arrayList;
    NuocAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lv =(ListView) findViewById(R.id.lvNuoc);
        arrayList = new ArrayList<>();

        arrayList.add(new Nuoc("Việt Nam","Hà Nội",R.drawable.vietnam));
        arrayList.add(new Nuoc("Pháp","Pari",R.drawable.phap));
        arrayList.add(new Nuoc("Ấn Độ","New Delhi",R.drawable.ando));
        arrayList.add(new Nuoc("Mỹ","Washington DC",R.drawable.my));
        arrayList.add(new Nuoc("Thái Lan","Bangkok",R.drawable.thailan));
        arrayList.add(new Nuoc("Nhật Bản","TôkyO",R.drawable.nhatban));
        arrayList.add(new Nuoc("Thụy Điển","Xtoc-Khôm",R.drawable.thuydien));
        arrayList.add(new Nuoc("Canada","Ốt-ta-goa",R.drawable.canada));
        adapter = new NuocAdapter(this,R.layout.dong_nuoc,arrayList);
        lv.setAdapter(adapter);

    }
}