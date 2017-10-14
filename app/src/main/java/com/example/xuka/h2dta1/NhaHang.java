package com.example.xuka.h2dta1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class NhaHang extends AppCompatActivity implements View.OnClickListener {
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nha_hang);
        findViewById();
    }


    private void findViewById() {
        imageView1 = (ImageView) findViewById(R.id.img1);
        imageView1.setOnClickListener(this);
        imageView2 = (ImageView) findViewById(R.id.img2);
        imageView2.setOnClickListener(this);
        imageView3 = (ImageView) findViewById(R.id.img3);
        imageView3.setOnClickListener(this);
        imageView4 = (ImageView) findViewById(R.id.img4);
        imageView4.setOnClickListener(this);
        imageView5 = (ImageView) findViewById(R.id.img5);
        imageView5.setOnClickListener(this);
        imageView6 = (ImageView) findViewById(R.id.img6);
        imageView6.setOnClickListener(this);
    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.img1:
                Intent intent = new Intent(this, InfoAloha.class);
                startActivity(intent);
        }
        switch (view.getId()) {
            case R.id.img2:
                Intent intent1 = new Intent(this, InfoApsara.class);
                startActivity(intent1);
        }
        switch (view.getId()) {
            case R.id.img3:
                Intent intent = new Intent(this, InfoNamHoaVien.class);
                startActivity(intent);
        }
        switch (view.getId()) {
            case R.id.img4:
                Intent intent = new Intent(this, InfoTulip.class);
                startActivity(intent);
        }
        switch (view.getId()) {
            case R.id.img5:
                Intent intent = new Intent(this, InfoXienNuongBanjiro.class);
                startActivity(intent);
        }
        switch (view.getId()) {
            case R.id.img6:
                Intent intent = new Intent(this, InfoCoiNguon.class);
                startActivity(intent);
        }

    }
}


