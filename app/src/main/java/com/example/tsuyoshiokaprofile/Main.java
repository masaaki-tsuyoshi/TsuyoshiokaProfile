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
import android.widget.TextView;


public class Main extends AppCompatActivity {


    //配列の作成
    private static final String[] profiles = {
            "浜田ブリトニー ", "武田徳弘", "横井軍平", "小島さん", "西田さん",
            "ケヴィンマッケンロー", "原口さん", "得意さん", "室町さん", "久住さん",
            "安藤みき","松本さん", "飯田霞", "渡邊さん", "佐藤さん", "村山さん",
            "石井さん"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //変遷後のアクティヴィティからidを取得
        //final TextView text = (TextView) findViewById(R.id.textView);
        final TextView text2 = (TextView) findViewById(R.id.textView2);
        final TextView text3 = (TextView) findViewById(R.id.textView3);
       // ImageView image = findViewById(R.id.imageView)


        //content.xmlからidを取得
        final ListView listView = (ListView)findViewById(R.id.listView1);

        //配列を保持するアダプターのインスタンスと引数を設定
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, profiles);

        //アダプターをリストビューのインスタンスに設定
        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Intent sub = new Intent();
                sub.setClassName("com.example.tsuyoshiokaprofile", "com.example.tsuyoshiokaprofile.SubActivity");

                //次のインテントに渡す　　　　　リストビューのタップされた部分を取得
                sub.putExtra("list_names", listView.getItemAtPosition(position).toString());
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
