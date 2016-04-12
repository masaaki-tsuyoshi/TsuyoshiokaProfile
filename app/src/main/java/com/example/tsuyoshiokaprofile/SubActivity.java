package com.example.tsuyoshiokaprofile;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class SubActivity extends AppCompatActivity{

    public String name;
    public String job;
    public int image;
    public String comment;
    public TextView text;
    public TextView text2;
    private static final int SUBACTIVITY = 1;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_activity);

        android.support.v7.app.ActionBar actionbar = getSupportActionBar();
        actionbar.setHomeButtonEnabled(true);
        actionbar.setDisplayHomeAsUpEnabled(true);

        text = (TextView) findViewById(R.id.textView);
        text2 = (TextView) findViewById(R.id.textView2);
        TextView text3 = (TextView) findViewById(R.id.textView3);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        ListView listView = (ListView)findViewById(R.id.listView1);

        Intent sub = getIntent();

        name = sub.getStringExtra("list_names");
        job = sub.getStringExtra("list_jobs");
        image = sub.getIntExtra("list_images", R.drawable.human);
        comment = sub.getStringExtra("list_comments");


        text.setText(name);
        text2.setText(job);
        imageView.setImageResource(image);
        text3.setText(comment);


       text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent njIntent = new Intent();
                njIntent.putExtra("LIST_NAMES",name);
                njIntent.putExtra("LIST_JOBS",job);
                njIntent.putExtra("LIST_IMAGE",image);
                njIntent.putExtra("LIST_COMMENT",comment);

               njIntent.setClassName("com.example.tsuyoshiokaprofile", "com.example.tsuyoshiokaprofile.NameJobEditActivity");
               startActivity(njIntent);


          }
       });


        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent njIntent = new Intent();
                njIntent.setClassName("com.example.tsuyoshiokaprofile", "com.example.tsuyoshiokaprofile.NameJobEditActivity");
                startActivity(njIntent);


            }
        });


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent imageEditIntent = new Intent();
                imageEditIntent.setClassName("com.example.tsuyoshiokaprofile", "com.example.tsuyoshiokaprofile.ImageEditActivity");
                startActivity(imageEditIntent);


            }
        });


        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent cmEditIntent = new Intent();
                cmEditIntent.setClassName("com.example.tsuyoshiokaprofile", "com.example.tsuyoshiokaprofile.CommentEditActivity");
                startActivity(cmEditIntent);


            }
        });




    }

    @Override
    protected void onActivityResult (int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);

        text = (TextView) findViewById(R.id.textView);
        text2 = (TextView) findViewById(R.id.textView2);
        Intent njIntent = getIntent();
        String editedName = njIntent.getStringExtra("NAME_INPUT");
        String editedJob = njIntent.getStringExtra("JOB_INPUT");
        text.setText(editedName);
        text2.setText(editedJob);

    }




























    //// TODO: 16/04/11 新メニューレイアウト作る。
    //// TODO: 16/04/11 編集画面にとぶようにintent作る

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        //noinspection SimplifiableIfStatement
        switch(item.getItemId()) {
            case R.id.action_settings:
                Intent setting_intent = new Intent();
                setting_intent.setClassName("com.example.tsuyoshiokaprofile", "com.example.tsuyoshiokaprofile.SettingsActivity");
                startActivity(setting_intent);
                return true;
            case R.id.action_settings2:
                Toast.makeText(getApplicationContext(), "Contact Us", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_settings3:
                Toast.makeText(getApplicationContext(), "Company", Toast.LENGTH_SHORT).show();
                return true;

            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }



}
