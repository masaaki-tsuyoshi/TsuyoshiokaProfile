package com.example.tsuyoshiokaprofile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class NameJobEditActivity extends AppCompatActivity{

    EditText editName;
    EditText editJob;
    Button button;
    String editedName;
    String editedJob;
    Intent njIntent;
    String subName;
    String subJob;
    private static final int SUBACTIVITY = 1;

    String subText;
    String subText2;
    int subImage;
    String subComment;



   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.name_job_edit);

       editName = (EditText) findViewById(R.id.editName);
       editJob = (EditText) findViewById(R.id.editJob);
       button = (Button) findViewById(R.id.button);



       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               //Inputされたのを取得
               editedName = editName.getText().toString();
               editedJob = editJob.getText().toString();
               //保存を押すと、subに戻る。
               Intent intent = new Intent();
               intent.setClassName("com.example.tsuyoshiokaprofile", "com.example.tsuyoshiokaprofile.SubActivity");
               //intentに入力された文字列を詰める
               intent.putExtra("NAME_INPUT",editedName);
               intent.putExtra("JOB_INPUT",editedJob);

               //値を詰めたものをSubに渡して画面遷移する
               startActivityForResult(intent, SUBACTIVITY);


            }
        });

   }

}
