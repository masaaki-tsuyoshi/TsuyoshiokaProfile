package com.example.tsuyoshiokaprofile;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

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
        memberProfilesList.add(new MemberProfile("吉田拓郎","農家",BitmapFactory.decodeResource(getResources(), R.drawable.human)));
        memberProfilesList.add(new MemberProfile("藤井ふみか","社長",BitmapFactory.decodeResource(getResources(), R.drawable.human1)));
        memberProfilesList.add(new MemberProfile("ケイティ・スチュワート","広報",BitmapFactory.decodeResource(getResources(), R.drawable.human2)));
        memberProfilesList.add(new MemberProfile("木田武蔵","アプリ開発事業部",BitmapFactory.decodeResource(getResources(), R.drawable.human3)));
        memberProfilesList.add(new MemberProfile("歩兵巡査","特殊部隊所属",BitmapFactory.decodeResource(getResources(), R.drawable.human4)));
        memberProfilesList.add(new MemberProfile("サラリーマン金太郎","課長",BitmapFactory.decodeResource(getResources(), R.drawable.human5)));
        memberProfilesList.add(new MemberProfile("メガネ男子","メガネ部員",BitmapFactory.decodeResource(getResources(), R.drawable.human6)));
        memberProfilesList.add(new MemberProfile("おかえくみこ","パンケーキサークル部長",BitmapFactory.decodeResource(getResources(), R.drawable.human7)));
        memberProfilesList.add(new MemberProfile("ふわふわ女子","ふわふわしてる",BitmapFactory.decodeResource(getResources(), R.drawable.human8)));
        memberProfilesList.add(new MemberProfile("吉田拓郎","アプリ開発事業部",BitmapFactory.decodeResource(getResources(), R.drawable.human)));
        memberProfilesList.add(new MemberProfile("吉田拓郎","アプリ開発事業部",BitmapFactory.decodeResource(getResources(), R.drawable.human)));

        

        //配列を保持するアダプターのインスタンスと引数を設定
        //ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, profiles);

        CustomAdapter customAdapter = new CustomAdapter(this, memberProfilesList);


        //アダプターをリストビューのインスタンスに設定
        listView.setAdapter(customAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent sub = new Intent();
                sub.setClassName("com.example.tsuyoshiokaprofile", "com.example.tsuyoshiokaprofile.SubActivity");


                MemberProfile memberProfile = (MemberProfile)listView.getItemAtPosition(position);
                sub.putExtra("list_names", memberProfile.getName());
                sub.putExtra("list_jobs",memberProfile.getJob());
                sub.putExtra("list_images",memberProfile.getBitmap());
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
