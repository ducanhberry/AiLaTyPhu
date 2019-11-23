package com.example.ailatyphu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     EditText eduser ;
     EditText edmatkhau;
     Button btnDangNhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap );
        Anhxa();
    }

    private void Anhxa() {
        eduser = (EditText)findViewById(R.id.edtTenDangNhap);
        edmatkhau = (EditText)findViewById(R.id.edtMatKhau);
        btnDangNhap = (Button)findViewById(R.id.btnDangNhap);

    }

    public void XuLiDangKi(View view) {
        startActivity(new Intent(this,Main2Activity.class));
    }

    public void XuLiQuenMatKhau(View view) {
        startActivity(new Intent(this,act_quen_mat_khau.class));
    }


    public void XuLiDangNhap(View view) {
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(eduser.getText().length() != 0 && edmatkhau.getText().length() != 0){
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    if(eduser.getText().toString().equals("ducanh") && edmatkhau.getText().toString().equals("aaa"))
                    Toast.makeText(MainActivity.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,act_dang_nhap.class);
                    startActivity(intent);
                } else {
                    //Toast.makeText(MainActivity.this, "Bạn vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                    eduser.setError("Vui lòng nhập tên đăng nhập");
                    edmatkhau.setError("Vui lòng nhập mật khẩu");
                }
            }
        });



    }


}
