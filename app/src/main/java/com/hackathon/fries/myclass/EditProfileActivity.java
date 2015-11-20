package com.hackathon.fries.myclass;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.hackathon.fries.myclass.helper.SQLiteHandler;


public class EditProfileActivity extends Activity {
    private EditText edtName, edtEmail, edtLopKhoaHoc;
    private Button btnDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editprofile);

        initViews();
    }

    private void initViews() {
        edtName = (EditText) findViewById(R.id.edt_editname);
        edtEmail = (EditText) findViewById(R.id.edt_editemail);
        edtLopKhoaHoc = (EditText) findViewById(R.id.edt_editlop);

        //Get intent from MainActivity
        Intent mIntent = getIntent();
        edtName.setText(mIntent.getStringExtra("name"));
        edtEmail.setText(mIntent.getStringExtra("email"));
        edtLopKhoaHoc.setText(mIntent.getStringExtra("lop"));

        btnDone = (Button) findViewById(R.id.btn_editdone);

        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                String lop = edtLopKhoaHoc.getText().toString();

                if (!name.equalsIgnoreCase("") && !lop.equalsIgnoreCase("")) {

                    //Tra intent ve MainActivity
                    Intent mIntent = new Intent();
                    mIntent.putExtra(SQLiteHandler.KEY_NAME, name);
                    mIntent.putExtra(SQLiteHandler.KEY_LOP_KHOA_HOC, lop);
                    setResult(RESULT_OK, mIntent);

                    Toast.makeText(getApplicationContext(), "Cập nhật thông tin thành công :)", Toast.LENGTH_LONG).show();
                    finish();
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        setResult(RESULT_CANCELED);
        super.onBackPressed();
    }
}
