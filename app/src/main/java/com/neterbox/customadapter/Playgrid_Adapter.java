package com.neterbox.customadapter;
import android.app.Activity;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.neterbox.R;

import java.util.ArrayList;

/**
 * Created by DeLL on 06-01-2018.
 */

public class Playgrid_Adapter extends BaseAdapter {
    Activity activity;
    private ArrayList data;
    private LayoutInflater inflater;
    public Resources res;

    public Playgrid_Adapter(Activity a) {
        this.activity = a;
        inflater = (LayoutInflater) activity.getSystemService(activity.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return 15;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public static class ViewHolder {

        public TextView tplaygrid_text,tplaygrid_subtext;
        public ImageView iplaygrid_pic,iplaygrid_text;
        public LinearLayout lplaygrid_item,lplaygrid_text;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = view;
        Playgrid_Adapter.ViewHolder holder;

        if (view == null) {
            v = inflater.inflate(R.layout.playgrid_item, null);
            holder = new Playgrid_Adapter.ViewHolder();
            holder.tplaygrid_text = (TextView) v.findViewById(R.id.tplaygrid_text);
            holder.iplaygrid_pic = (ImageView) v.findViewById(R.id.iplaygrid_pic);
            holder.tplaygrid_subtext = (TextView) v.findViewById(R.id.tplaygrid_subtext);
            holder.iplaygrid_text = (ImageView) v.findViewById(R.id.iplaygrid_text);
            holder.lplaygrid_item=(LinearLayout)v.findViewById(R.id.lplaygrid_item);
            holder.lplaygrid_text=(LinearLayout)v.findViewById(R.id.lplaygrid_text);

            v.setTag(holder);
        }
        else
            holder=(Playgrid_Adapter.ViewHolder)v.getTag();

        return v;
    }
}
