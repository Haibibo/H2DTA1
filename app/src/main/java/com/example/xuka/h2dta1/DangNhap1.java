package com.example.xuka.h2dta1;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DangNhap1 extends AppCompatActivity {
    Button buttondangnhap, buttondangky, buttonthoat;
    EditText edtTK, edtMK;
    String taikhoan, matkhau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap1);

        AnhXa();
        ControlButton();
    }


    private void ControlButton() {
        buttonthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DangNhap1.this, android.R.style.Theme_DeviceDefault_Light_Dialog);
                builder.setTitle("Bạn có muốn thoát khỏi app");
                builder.setMessage("Hãy lựa chọn bên dưới");
                builder.setIcon(android.R.drawable.alert_light_frame);
                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        onBackPressed();
                    }
                });
                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builder.show();
            }
        });
        buttondangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(DangNhap1.this);
                dialog.setTitle("Hộp thoại xử lý");
                dialog.setCancelable(false);
                dialog.setContentView(R.layout.dang_ky);
                final EditText editTK = (EditText) findViewById(R.id.editTK);
                final EditText editMK = (EditText) findViewById(R.id.editMK);
                Button buttonHuy = (Button) dialog.findViewById(R.id.buttonHuy);
                Button buttonDongy = (Button) dialog.findViewById(R.id.buttonDongy);
                buttonDongy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        taikhoan = editTK.getText().toString().trim();
                        matkhau = editMK.getText().toString().trim();
                        edtTK.setText(taikhoan);
                        edtMK.setText(matkhau);
                        dialog.cancel();
                    }
                });
                buttonHuy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.cancel();
                    }
                });
                dialog.show();
            }
        });
        buttondangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtTK.getText().length()!=0&&edtMK.getText().length()!=0){
                    if (edtTK.getText().toString().equals(taikhoan)&&edtTK.getText().toString().equals(matkhau)){
                        Toast.makeText(DangNhap1.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(DangNhap1.this, TrangChu1.class);
                        startActivity(intent);
                    }else if ((edtTK.getText().toString().equals("Hai") && edtMK.getText().toString().equals("123"))|| (edtTK.getText().toString().equals("Hieu") && edtMK.getText().toString().equals("123"))){
                        Toast.makeText(DangNhap1.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(DangNhap1.this, TrangChu1.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(DangNhap1.this, "Bạn đã đăng nhập thất bại", Toast.LENGTH_LONG).show();
                    }
                }else {
                    Toast.makeText(DangNhap1.this, "Hãy nhập đầy đủ thông tin", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void AnhXa() {
        edtTK = (EditText) findViewById(R.id.edituser);
        edtMK = (EditText) findViewById(R.id.editpw);
        buttondangky = (Button) findViewById(R.id.btndk);
        buttondangnhap = (Button) findViewById(R.id.btndn);
        buttonthoat = (Button) findViewById(R.id.btnt);
    }

}
