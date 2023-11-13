package com.uknown.tugasakhir2.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.uknown.tugasakhir2.HalamanDepanActivity;
import com.uknown.tugasakhir2.R;
import com.uknown.tugasakhir2.staff.StaffRegisterActivity;

public class AdminPageActivity extends AppCompatActivity {
    Button addStaff, addStock, logout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_page);
        addStaff = (Button)findViewById(R.id.btn_addstaf);
        addStock = (Button) findViewById(R.id.btn_addstock);
        logout = (Button) findViewById(R.id.btnLogoutAdmin);

        addStaff.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), StaffRegisterActivity.class));
        });


        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), HalamanDepanActivity.class));
            }
        });
    }
}
