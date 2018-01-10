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

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by sejal on 1/5/2018.
 */

public class Search_Friend_Adapter extends BaseAdapter{
    Activity activity;
    private ArrayList data;
    private LayoutInflater inflater;
    public Resources res;

    public Search_Friend_Adapter(Activity a){
        this.activity=a;
        inflater=(LayoutInflater) activity.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
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
    public static class ViewHolder{
        public TextView titem2,textView2;
        public CircleImageView ifriendprofile;
        public LinearLayout lsearchfriendprofile;
        public ImageView friendback;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v=view;
        Search_Friend_Adapter.ViewHolder holder;
        if(view==null)
        {
            v=inflater.inflate(R.layout.friendlistitem,null);
            holder=new Search_Friend_Adapter.ViewHolder();
            holder.titem2=(TextView) v.findViewById(R.id.titem2);
            holder.textView2=(TextView) v.findViewById(R.id.textView2);
            holder.ifriendprofile=(CircleImageView) v.findViewById(R.id.ifriendprofile);
            holder.lsearchfriendprofile=(LinearLayout) v.findViewById(R.id.lsearchfriendprofile);
            holder.friendback=(ImageView) v.findViewById(R.id.friendback);
            v.setTag(holder);
        }
        else
        {
            holder=(Search_Friend_Adapter.ViewHolder)v.getTag();

        }
        return v;
    }
}
