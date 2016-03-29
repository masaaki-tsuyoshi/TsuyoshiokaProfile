package com.example.tsuyoshiokaprofile;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class SubActivity extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_activity);



        TextView text = (TextView) findViewById(R.id.textView);
        /*
        TextView text2 = (TextView) findViewById(R.id.textView2);
        TextView text3 = (TextView) findViewById(R.id.textView3);
        ImageView image = (ImageView) findViewById(R.id.imageView);
　　　　　*/

        Intent sub = getIntent();
        String name = sub.getStringExtra("list_names");
        text.setText(name);



    }


}
