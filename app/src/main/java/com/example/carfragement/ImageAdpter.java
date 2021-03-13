package com.example.carfragement;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;

public class ImageAdpter extends BaseAdapter {
    Context mcontext;
    String cname;
    private Integer[] swift={
            R.drawable.swift1,
            R.drawable.swift2,
            R.drawable.swift3,
            R.drawable.swift4,
    };
    private Integer[] baleno={
        R.drawable.swift4
    };
    private Integer[] breeza={
            R.drawable.breeza1,
            R.drawable.breeza2,
            R.drawable.breeza3,
    };
    private Integer[] nexon={
            R.drawable.nexon1,
            R.drawable.nexon2,
            R.drawable.nexon3,
            R.drawable.nexon4,
    };
    public ImageAdpter(Context context,String name)
    {
        mcontext=context;
        cname=name;
    }


    @Override
    public int getCount() {
        if(cname.equals("swift"))
        {
            return swift.length;
        }
        if(cname.equals("breeza"))
        {
            return breeza.length;
        }
        if(cname.equals("nexon"))
        {
            return nexon.length;
        }
        else
        {
            return baleno.length;
        }
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if(convertView==null)
        {
            imageView=new ImageView(mcontext);
            imageView.setPadding(5,5,5,5);
            imageView.setLayoutParams(new GridView.LayoutParams(100,100));
        }
        else
        {
            imageView=(ImageView)convertView;
        }

        if(cname.equals("swift"))
        {
            imageView.setImageResource(swift[position]);
        }
        else if(cname.equals("breeza"))
        {
            imageView.setImageResource(breeza[position]);
        }
        else if(cname.equals("nexon"))
        {
            imageView.setImageResource(nexon[position]);
        }
        else
        {
                imageView.setImageResource(baleno[position]);
        }
        return imageView;
    }
}
