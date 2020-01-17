package com.anugrah.cablecms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class adminLogin extends AppCompatActivity {

    Button button;
    EditText id, pass;
    String adminId, adminPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        id = (EditText) findViewById(R.id.adminidet);
        pass = (EditText) findViewById(R.id.adminpasset);
        button = (Button) findViewById(R.id.adminloginbt);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                adminId = id.getText().toString();
                adminPass = pass.getText().toString();

                if (adminId.equals("1234") && adminPass.equals("1234"))
                {
                    Toast.makeText(getApplicationContext(),"Login Success",Toast.LENGTH_LONG);
                    Intent intent=new Intent(getApplicationContext(),adminPage.class);
                    startActivity(intent);


                }
                else{

                    Toast.makeText(getApplicationContext(),"Login fail",Toast.LENGTH_LONG);
                }


            }


        });
    }

}