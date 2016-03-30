package com.example.tsuyoshiokaprofile;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class CustomAdapter extends ArrayAdapter<MemberProfile> {

    //CustomAdapterのコンストラクター
    public CustomAdapter(Context context, List<MemberProfile> objects) {
        super(context, R.layout.custom_list2, R.id.text, objects);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //カスタムレイアウトをviewの中で保持
        View view = super.getView(position, convertView, parent);
        TextView text = (TextView)view.findViewById(R.id.text);
        TextView text2 = (TextView)view.findViewById(R.id.text2);
        ImageView image = (ImageView) view.findViewById(R.id.image);

        MemberProfile memberProfile = getItem(position);

        //
        text.setText(memberProfile.getName());
        text2.setText(memberProfile.getJob());
        image.setImageResource(memberProfile.getImage());


        return view;
    }
}
