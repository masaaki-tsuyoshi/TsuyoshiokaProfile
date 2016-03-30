package com.example.tsuyoshiokaprofile;


import android.content.Intent;
import android.graphics.Bitmap;
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
        //TextView text3 = (TextView) findViewById(R.id.textView3);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        Intent sub = getIntent();
        String name = sub.getStringExtra("list_names");
        String job = sub.getStringExtra("list_jobs");
        Bitmap image = sub.getParcelableExtra("list_images");

        text.setText(name);
        text2.setText(job);
        imageView.setImageBitmap(image);



    }


}
