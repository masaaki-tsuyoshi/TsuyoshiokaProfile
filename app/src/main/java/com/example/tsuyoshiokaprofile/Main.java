package com.example.tsuyoshiokaprofile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Main extends AppCompatActivity {


    //配列の作成
    private static final String[] profiles = {
            "吉岡 毅 ", "山越さん", "長濱 円", "木滑さん", "黄田さん",
            "かすやさん", "原口さん", "宮原 啓輔", "近藤 房之助", "松苗 大貴",
            "福本 正明","松本さん", "梶谷さん", "渡邊さん", "仲鉢さん", "村山さん",
            "石井さん"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //content.xmlからidを取得
        ListView listView = (ListView)findViewById(R.id.listView1);

        //配列を保持するアダプターのインスタンスと引数を設定
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, profiles);

        //アダプターをリストビューのインスタンスに設定
        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Intent sub = new Intent();
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
