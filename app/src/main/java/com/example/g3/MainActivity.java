package com.example.g3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText name, password;
    TextView reset;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.et_name);
        password = findViewById(R.id.et_pass);


        reset = findViewById(R.id.tv_reset);

        login = findViewById(R.id.btn_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = name.getText().toString();
                String p = password.getText().toString();
                if(n.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please fill the name field", Toast.LENGTH_SHORT).show();
                }else{
                    if(p.isEmpty()){
                        Toast.makeText(MainActivity.this, "Please fill the password field", Toast.LENGTH_SHORT).show();

                    }else{
                        if(n.equals("SI") && p.equals("1234")){
                            Intent intent = new Intent(MainActivity.this, Welcome.class);
                            startActivity(intent);
                        }else{
                            Toast.makeText(MainActivity.this, "name or password is wrong", Toast.LENGTH_SHORT).show();
                        }
                    }
                }



            }
        });



    }
}