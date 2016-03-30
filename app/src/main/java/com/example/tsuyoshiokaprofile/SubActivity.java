package com.example.tsuyoshiokaprofile;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;


public class SubActivity extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_activity);



        TextView text = (TextView) findViewById(R.id.textView);
        TextView text2 = (TextView) findViewById(R.id.textView2);
        TextView text3 = (TextView) findViewById(R.id.textView3);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        Intent sub = getIntent();
        //Bundle bundle = Bundle();

        String name = sub.getStringExtra("list_names");
        String job = sub.getStringExtra("list_jobs");
        int image = sub.getIntExtra("list_images",R.drawable.human);

        //String name = bundle.getString("list_names");
        //String job = bundle.getString("list_jobs");
        //int image = bundle.getInt("list_images");

        text.setText(name);
        text2.setText(job);
        imageView.setImageResource(image);



    }


}
