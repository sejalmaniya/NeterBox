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

public class Followers_Adapter extends BaseAdapter {
    Activity activity;
    private ArrayList data;
    private LayoutInflater inflater;
    public Resources res;

    public Followers_Adapter(Activity a){
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
        public TextView  titem1,textView1;
        public CircleImageView ifollowersprofile;
        public LinearLayout lsearchfollowersprofile;
        public ImageView followersback;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        View v=view;
        Followers_Adapter.ViewHolder holder;
        if(view==null)
        {
            v=inflater.inflate(R.layout.followerslistitem,null);
            holder=new Followers_Adapter.ViewHolder();
            holder.titem1=(TextView) v.findViewById(R.id.titem1);
            holder.textView1=(TextView) v.findViewById(R.id.textView1);
            holder.ifollowersprofile=(CircleImageView) v.findViewById(R.id.ifollowersprofile);
            holder.lsearchfollowersprofile=(LinearLayout) v.findViewById(R.id.lsearchfollowersprofile);
            holder.followersback=(ImageView) v.findViewById(R.id.followersback);
            v.setTag(holder);
        }
        else
        {
            holder=(Followers_Adapter.ViewHolder)v.getTag();

        }
        return v;
    }
}
