package com.primera.appnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

        private Button btntest;
        test_volley test = new test_volley();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);

            btntest = findViewById(R.id.btntest);
            btntest.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    test.recibirJson(MainActivity2.this);
                }
            });

        }



    }