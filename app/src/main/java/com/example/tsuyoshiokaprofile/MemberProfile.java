package com.example.tsuyoshiokaprofile;


public class MemberProfile {
    // 宣言
    private String name;
    private String job;
    private int image;
    private String comment;

    //コンストラクタの生成
   public MemberProfile(String name, String job, int image ,String comment){
        super();
        this.name = name;
        this.job = job;
        this.image = image;
        this.comment = comment;
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

    public String getComment(){
        return this.comment;
    }

    

}
