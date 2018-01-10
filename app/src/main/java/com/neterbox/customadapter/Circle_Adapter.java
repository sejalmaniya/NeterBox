package com.neterbox.customadapter;

import android.app.Activity;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.neterbox.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;


/**
 * Created by sejal on 1/6/2018.
 */

public class Circle_Adapter extends BaseAdapter {
    Activity activity;
    private ArrayList data;
    private LayoutInflater inflater;
    public Resources res;

    public Circle_Adapter(Activity a){
        this.activity=a;
        inflater=(LayoutInflater) activity.getSystemService(activity.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
    public static class ViewHolder{
        public TextView tcircletext;
        public CircleImageView icircleprofile;
        public LinearLayout lcircleitem;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v=view;
        Circle_Adapter.ViewHolder holder;
        if(view==null)
        {
            v=inflater.inflate(R.layout.circlesgriditem,null);
            holder=new Circle_Adapter.ViewHolder();
            holder.tcircletext=(TextView) v.findViewById(R.id.tcircletext);
            holder.icircleprofile=(CircleImageView) v.findViewById(R.id.icircleprofile);
            holder.lcircleitem=(LinearLayout) v.findViewById(R.id.lcircleitem);

            v.setTag(holder);
        }
        else
        {
            holder=(Circle_Adapter.ViewHolder)v.getTag();

        }
        return v;

    }
}
