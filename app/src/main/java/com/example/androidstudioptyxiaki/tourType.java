package com.example.androidstudioptyxiaki;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tourType extends AppCompatActivity {



    private Button srtRt1 ;
    public void openMainActivity(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    private Button srtRt2 ;
    public void openMushActivity(){
        Intent intent = new Intent(this,MushActivity.class);
        startActivity(intent);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_type);


        srtRt1=(Button) findViewById(R.id.route1);
        srtRt2=(Button) findViewById(R.id.route2);

        srtRt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                srtRt1.setBackgroundResource(R.drawable.chkinfo);
                v.setSelected(true);
                openMainActivity();
            }
        });


        srtRt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                srtRt2.setBackgroundResource(R.drawable.chkinfo);
                v.setSelected(true);
                openMushActivity();
            }
        });

    }
}
