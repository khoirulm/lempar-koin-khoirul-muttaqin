package com.kmproject.lemparkoinkhoirulmuttaqin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

import java.util.Random;

public class LemparKoin extends AppCompatActivity {

    Button btnLemparKoin,btnUlang,btnKeluar;
    Random acak;
    TextView tv;
    ImageView iv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lempar_koin);




        acak = new Random();
        btnLemparKoin = findViewById(R.id.btnLemparKoin);
        btnUlang = findViewById(R.id.btnUlangi);
        btnKeluar = findViewById(R.id.btnKeluar);
        tv = findViewById(R.id.textInformation);
        iv = findViewById(R.id.img1);

        iv.setImageResource(R.drawable.question);


        btnLemparKoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("CLICK_EVENT","Lempar button diClick");
                if (acak.nextDouble()< 0.5){
                    tv.setText("Kepala");
                    iv.setImageResource(R.drawable.head);
                }else {
                    tv.setText("Cross");
                    iv.setImageResource(R.drawable.tail);
                }

                btnLemparKoin.setVisibility(View.INVISIBLE);
                btnUlang.setVisibility(View.VISIBLE);
                btnKeluar.setVisibility(View.VISIBLE);
            }
        });

        btnUlang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                iv.setImageResource(R.drawable.question);
                tv.setText("");

                btnLemparKoin.setVisibility(View.VISIBLE);
                btnUlang.setVisibility(View.INVISIBLE);
                btnKeluar.setVisibility(View.INVISIBLE);
            }
        });


        btnKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}