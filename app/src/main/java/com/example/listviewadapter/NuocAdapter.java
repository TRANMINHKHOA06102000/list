package com.example.listviewadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NuocAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<Nuoc> nuocList;

    public NuocAdapter(Context context, int layout, List<Nuoc> nuocList) {
        this.context = context;
        this.layout = layout;
        this.nuocList = nuocList;
    }

    @Override
    public int getCount() {
        return nuocList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout,null);
        //convertView = inflater.inflate(layout, null);
//anh xa
        TextView tvTenNuoc = (TextView) convertView.findViewById(R.id.tvTenNuoc);
        TextView tvThuDo = (TextView) convertView.findViewById(R.id.tvThuDo);
        ImageView imgCo = (ImageView) convertView.findViewById(R.id.imgCo);

        //gan gia tri
        tvTenNuoc.setText(nuocList.get(i).tenNuoc);
        tvThuDo.setText(nuocList.get(i).thuDo);
        imgCo.setImageResource(nuocList.get(i).hinhAnh);
        return convertView;
    }
}
