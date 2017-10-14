package com.example.xuka.h2dta1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class CaPhe extends AppCompatActivity implements View.OnClickListener {
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ca_phe);
        findViewById();
    }

    private void findViewById() {
        imageView1 = (ImageView) findViewById(R.id.imge1);
        imageView1.setOnClickListener(this);
        imageView2 = (ImageView) findViewById(R.id.imge2);
        imageView2.setOnClickListener(this);
        imageView3 = (ImageView) findViewById(R.id.imge3);
        imageView3.setOnClickListener(this);
        imageView4 = (ImageView) findViewById(R.id.imge4);
        imageView4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imge1:
                Intent intent = new Intent(this, InfoAlacarte.class);
                startActivity(intent);
        }
        switch (view.getId()) {
            case R.id.imge2:
                Intent intent = new Intent(this, InfoCong.class);
                startActivity(intent);
        }
        switch (view.getId()) {
            case R.id.imge3:
                Intent intent = new Intent(this, InfoGreenPlaza.class);
                startActivity(intent);
        }
        switch (view.getId()) {
            case R.id.imge4:
                Intent intent = new Intent(this, InfoDlune.class);
                startActivity(intent);
        }
    }
}
