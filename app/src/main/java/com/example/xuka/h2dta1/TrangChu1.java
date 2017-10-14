package com.example.xuka.h2dta1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class TrangChu1 extends AppCompatActivity implements View.OnClickListener {
    ImageView imageView1;
    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu1);


        findViewById();


    }

    private void findViewById() {
        imageView1 = (ImageView) findViewById(R.id.imgbt1);
        imageView1.setOnClickListener(this);
        imageView = (ImageView) findViewById(R.id.imge2);
        imageView.setOnClickListener(this);
        imageView2 = (ImageView) findViewById(R.id.imageN);
        imageView2.setOnClickListener(this);
        imageView3 = (ImageView) findViewById(R.id.imageH);
        imageView3.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imgbt1:
                Intent intent = new Intent(this, NhaHang.class);
                startActivity(intent);
        }
        switch (view.getId()){
            case R.id.imge2:
                Intent intent = new Intent(this, CaPhe.class);
                startActivity(intent);
        }
        switch (view.getId()){
            case R.id.imageN:
                Intent intent = new Intent(this, XuKa.class);
                startActivity(intent);
        }
        switch (view.getId()){
            case R.id.imageH:
                Intent intent = new Intent(this, Nobita.class);
                startActivity(intent);
        }
    }


    }










