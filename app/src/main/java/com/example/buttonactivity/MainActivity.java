
package com.example.buttonactivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button superButton = findViewById(R.id.superButton);
        Button btnMessage = findViewById(R.id.btnMessage);
        Button btnExit = findViewById(R.id.btnExit);

        // Function 1: Open Second Activity
        superButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        MainActivity.this,
                        SecondActivity.class
                );
                startActivity(intent);
            }
        });

        // Function 2: Show Message
        btnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        MainActivity.this,
                        "Hello! Button clicked!",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        // Function 3: Exit Activity
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
