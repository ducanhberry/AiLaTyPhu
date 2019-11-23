package com.example.ailatyphu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText editTendangnhap, editMatkhau, editEmail, editXacNhanMatKhau;
    Button  btnDangKy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ki_tai_khoan);
        editTendangnhap = (EditText)findViewById(R.id.edtTenDangNhap);
        editMatkhau = (EditText)findViewById(R.id.edtMatKhau);
        editEmail = (EditText)findViewById(R.id.edtEmail);
        editXacNhanMatKhau = (EditText)findViewById(R.id.edtXacNhanMatKhau);
        btnDangKy = (Button)findViewById(R.id.btnDangKi);
    }




    public void XuLyDangKy(View view) {
        btnDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTendangnhap.getText().toString().length() == 0 && editMatkhau.getText().toString().length() ==0 &&editEmail.getText().toString().length() == 0 && editXacNhanMatKhau.getText().toString().length() ==0){
                    //Toast.makeText(Main2Activity.this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                    editTendangnhap.setError("Vui lòng nhập tên đăng nhập");
                    editEmail.setError("Vui lòng nhập email");
                } else if (editTendangnhap.getText().toString().length() < 5){
                    //Toast.makeText(Main2Activity.this, "Tên đăng nhập phải ít nhất 5 ký tự", Toast.LENGTH_SHORT).show();
                    editTendangnhap.setError("Tên đăng nhập phải hơn 5 kí tự  !");
                } else if (editMatkhau.getText().toString().equals(editMatkhau) != editXacNhanMatKhau.getText().toString().equals(editXacNhanMatKhau)){
                    editXacNhanMatKhau.setError("Mat khau khong hop le");
                }
            }
        });
    }
}
