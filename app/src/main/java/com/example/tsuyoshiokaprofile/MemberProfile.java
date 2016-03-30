package com.example.tsuyoshiokaprofile;


import android.graphics.Bitmap;

public class MemberProfile {
    // 宣言
    private String name;
    private String job;
    private int image;

    //コンストラクタの生成
   public MemberProfile(String name, String job, int image){
        super();
        this.name = name;
        this.job = job;
        this.image = image;
    }

    //ゲッターの設定
    public String getName(){
        return this.name;
    }

    public String getJob(){
        return this.job;
    }

    public int getImage() {
        return image;
    }



}
