package com.example.tsuyoshiokaprofile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class Main extends AppCompatActivity {


    private ListView listView;
    ArrayList<MemberProfile> memberProfilesList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView1);

        //アレイリストのインスタンスを作成　
        memberProfilesList = new ArrayList<>();
        memberProfilesList.add(new MemberProfile(getString(R.string.name1),getString(R.string.job1),R.drawable.human,getString(R.string.comment1)));
        memberProfilesList.add(new MemberProfile(getString(R.string.name2),getString(R.string.job2),R.drawable.human1,getString(R.string.comment2)));
        memberProfilesList.add(new MemberProfile(getString(R.string.name3),getString(R.string.job3),R.drawable.human2,getString(R.string.comment3)));
        memberProfilesList.add(new MemberProfile(getString(R.string.name4),getString(R.string.job4),R.drawable.human3,getString(R.string.comment4)));
        memberProfilesList.add(new MemberProfile(getString(R.string.name5),getString(R.string.job5),R.drawable.human4,getString(R.string.comment5)));
        memberProfilesList.add(new MemberProfile(getString(R.string.name6),getString(R.string.job6),R.drawable.human5,getString(R.string.comment6)));
        memberProfilesList.add(new MemberProfile(getString(R.string.name7),getString(R.string.job7),R.drawable.human6,getString(R.string.comment7)));
        memberProfilesList.add(new MemberProfile(getString(R.string.name8),getString(R.string.job8),R.drawable.human7,getString(R.string.comment8)));
        memberProfilesList.add(new MemberProfile(getString(R.string.name9),getString(R.string.job9),R.drawable.human8,getString(R.string.comment9)));
        memberProfilesList.add(new MemberProfile(getString(R.string.name1),getString(R.string.job1),R.drawable.human,getString(R.string.comment1)));
        memberProfilesList.add(new MemberProfile(getString(R.string.name1),getString(R.string.job1),R.drawable.human,getString(R.string.comment1)));
        memberProfilesList.add(new MemberProfile(getString(R.string.name1),getString(R.string.job1),R.drawable.human,getString(R.string.comment1)));
        memberProfilesList.add(new MemberProfile(getString(R.string.name1),getString(R.string.job1),R.drawable.human,getString(R.string.comment1)));
        memberProfilesList.add(new MemberProfile(getString(R.string.name1),getString(R.string.job1),R.drawable.human,getString(R.string.comment1)));
        memberProfilesList.add(new MemberProfile(getString(R.string.name1),getString(R.string.job1),R.drawable.human,getString(R.string.comment1)));
        memberProfilesList.add(new MemberProfile(getString(R.string.name1),getString(R.string.job1),R.drawable.human,getString(R.string.comment1)));
        memberProfilesList.add(new MemberProfile(getString(R.string.name1),getString(R.string.job1),R.drawable.human,getString(R.string.comment1)));



        //配列を保持するアダプターのインスタンスと引数を設定
        //ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, profiles);

        CustomAdapter customAdapter = new CustomAdapter(this, memberProfilesList);


        //アダプターをリストビューのインスタンスに設定
        listView.setAdapter(customAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                MemberProfile memberProfile = (MemberProfile)listView.getItemAtPosition(position);

                Intent sub = new Intent();
                sub.putExtra("list_names", memberProfile.getName());
                sub.putExtra("list_jobs",memberProfile.getJob());
                sub.putExtra("list_images",memberProfile.getImage());
                sub.putExtra("list_comments",memberProfile.getComment());


                sub.setClassName("com.example.tsuyoshiokaprofile", "com.example.tsuyoshiokaprofile.SubActivity");
                startActivity(sub);

            }
        });



    }

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
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent setting_intent = new Intent();
            setting_intent.setClassName("com.example.tsuyoshiokaprofile", "com.example.tsuyoshiokaprofile.SettingsActivity");
            startActivity(setting_intent);
            return true;
        }
        else if (id == R.id.action_settings2) {
            Toast.makeText(getApplicationContext(), "Contact Us", Toast.LENGTH_SHORT).show();
            return true;

        }
        else if (id == R.id.action_settings3) {
            Toast.makeText(getApplicationContext(), "Company", Toast.LENGTH_SHORT).show();
            return true;

        }

        return super.onOptionsItemSelected(item);
    }
}
