package com.uknown.tugasakhir2.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.uknown.tugasakhir2.R;

public class AdminLoginActivity extends AppCompatActivity {

    String username = "admin";
    String password = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_login);

        EditText nameAdmin = findViewById(R.id.nameAdmin);
        EditText pwAdmin = findViewById(R.id.pwAdmin);
        Button lgnAdmin = findViewById(R.id.lgnAdmin);

        lgnAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nameAdmin.getText().toString().equalsIgnoreCase(username) && pwAdmin.getText().toString().equalsIgnoreCase(password)){
                    startActivity(new Intent(AdminLoginActivity.this,AdminPageActivity.class));
                }else{
                    Toast.makeText(AdminLoginActivity.this,"Incorrect Username/Password",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
