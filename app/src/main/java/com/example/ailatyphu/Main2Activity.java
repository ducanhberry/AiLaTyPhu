package com.example.ailatyphu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText editTendangnhap, editMatkhau, editEmail, editXacNhanMatKhau;
    Button btnDangNhap, btnDangKy, btnQuenMatKhau;
    String tentk, mk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ki_tai_khoan);
        editTendangnhap = (EditText)findViewById(R.id.edtTenDangNhap);
        editMatkhau = (EditText)findViewById(R.id.edtMatKhau);
        editEmail = (EditText)findViewById(R.id.edtEmail);
        editXacNhanMatKhau = (EditText)findViewById(R.id.edtXacNhanMatKhau);
        btnDangNhap = (Button)findViewById(R.id.btnDangNhap);
    }


    public void DangKy(View view) {
        String user = editTendangnhap.getText().toString().trim();
        Toast.makeText(this,user,Toast.LENGTH_LONG).show();
    }
}
