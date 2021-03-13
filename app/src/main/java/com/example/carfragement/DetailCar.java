package com.example.carfragement;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

public class DetailCar extends Fragment {
    private ImageSwitcher sw;
    private Button b1,b2;
    private String name;
    private int position=0;
    private int post;
    private  int len;
    private String[] date={"April-2002","May-2016","Jan-20010","Aug-2003"};
    private String[] company={"Suzuki","TATA","Suzuki","Toyota"};
    public String[] error={"No Images found"};
    private Integer[] swift={
            R.drawable.swift1,
            R.drawable.swift2,
            R.drawable.swift3,
            R.drawable.swift4,
    };
    private Integer[] baleno={

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
    public DetailCar() {
        // Required empty public constructor
    }
    public DetailCar(String cname,int pos) {
        name=cname;
        post=pos;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_detail_car, container, false);
        //GridView gv=(GridView)view.findViewById(R.id.carimg);
        b1 = (Button)view.findViewById(R.id.button);
        b2 = (Button)view.findViewById(R.id.button2);
        TextView n=(TextView)view.findViewById(R.id.name);
        TextView d=(TextView) view.findViewById(R.id.date);
        TextView c=(TextView)view.findViewById(R.id.company);
        sw = (ImageSwitcher)view.findViewById(R.id.imageSwitcher);
        sw.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView myView = new ImageView(getContext());
                myView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                myView.setLayoutParams(new ImageSwitcher.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                return myView;
            }
        });
        if(name.equals("swift")) {
            sw.setImageResource(swift[0]);
            len=swift.length;
        }
        else if(name.equals("nexon"))
        {
            sw.setImageResource(nexon[0]);
            len=nexon.length;
        }
        else if(name.equals("breeza"))
        {
            sw.setImageResource(breeza[0]);
            len=breeza.length;
        }
        else {
            len=baleno.length;
            if(len==0){
                b1.setVisibility(View.INVISIBLE);
                b2.setVisibility(View.INVISIBLE);
                Toast.makeText(getContext(),"No Image",Toast.LENGTH_LONG).show();
            }
            else {
                sw.setImageResource(baleno[0]);
            }
        }
        n.setText(name);
        d.setText(date[post]);
        c.setText(company[post]);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name.equals("swift") )
                {
                    if(position>0 && position<len) {
                        position--;
                        sw.setImageResource(swift[position]);
                    }
                }
                else if(name.equals("nexon"))
                {
                    if(position>0 && position<len) {
                        position--;
                        sw.setImageResource(nexon[position]);
                    }
                }
                else if(name.equals("breeza"))
                {
                    if(position>0 && position<len) {
                        position--;
                        sw.setImageResource(breeza[position]);
                    }
                }
                else if(name.equals("baleno"))
                {
                    if(position>0 && position<len) {
                        position--;
                        sw.setImageResource(baleno[position]);
                    }
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name.equals("swift"))
                {
                    if(position>=0 && position<len-1) {
                        position++;
                        sw.setImageResource(swift[position]);
                    }
                }
                else if(name.equals("nexon"))
                {
                    if(position>=0 && position<len-1) {
                        position++;
                        sw.setImageResource(nexon[position]);
                    }
                }
                else if(name.equals("breeza"))
                {
                    if(position>=0 && position<len-1) {
                        position++;
                        sw.setImageResource(breeza[position]);
                    }
                }
                else if(name.equals("baleno"))
                {
                    if(position>=0 && position<len-1) {
                        position++;
                        sw.setImageResource(baleno[position]);
                    }
                }
            }
        });

        return view;
    }
}