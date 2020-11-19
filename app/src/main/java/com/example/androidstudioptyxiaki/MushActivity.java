package com.example.androidstudioptyxiaki;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MushActivity extends AppCompatActivity {


    private Button Info15 ;
    public void openInformationActivity15(){
        Intent intent = new Intent(this,InformationActivity15.class);
        startActivity(intent);
    }

    private Button Info16 ;
    public void openInformationActivity16(){
        Intent intent = new Intent(this,InformationActivity16.class);
        startActivity(intent);
    }

    private Button Info17 ;
    public void openInformationActivity17(){
        Intent intent = new Intent(this,InformationActivity17.class);
        startActivity(intent);
    }

    private Button Info18 ;
    public void openInformationActivity18(){
        Intent intent = new Intent(this,InformationActivity18.class);
        startActivity(intent);
    }

    private Button Info19 ;
    public void openInformationActivity19(){
        Intent intent = new Intent(this,InformationActivity19.class);
        startActivity(intent);
    }

    private Button Info20 ;
    public void openInformationActivity20(){
        Intent intent = new Intent(this,InformationActivity20.class);
        startActivity(intent);
    }

    private Button Info21 ;
    public void openInformationActivity21(){
        Intent intent = new Intent(this,InformationActivity21.class);
        startActivity(intent);
    }

    private Button Info22 ;
    public void openInformationActivity22(){
        Intent intent = new Intent(this,InformationActivity22.class);
        startActivity(intent);
    }

    private Button Info23 ;
    public void openInformationActivity23(){
        Intent intent = new Intent(this,InformationActivity23.class);
        startActivity(intent);
    }


    //   AR BUTTON

    private Button AR ;
    public void openActivityAR(){
        Intent intent = new Intent(this, ActivityQR.class);
        startActivity(intent);
    }


//    VR BUTTON
public void openVR2(View view){
    Intent openVR2app = getPackageManager().getLaunchIntentForPackage("com.AmpagiEdu.VR2");
    startActivity(openVR2app);
}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mushhome);

        Info15=(Button) findViewById(R.id.infoBtn15);
        Info16=(Button) findViewById(R.id.infoBtn16);
        Info17=(Button) findViewById(R.id.infoBtn17);
        Info18=(Button) findViewById(R.id.infoBtn18);
        Info19=(Button) findViewById(R.id.infoBtn19);
        Info20=(Button) findViewById(R.id.infoBtn20);
        Info21=(Button) findViewById(R.id.infoBtn21);
        Info22=(Button) findViewById(R.id.infoBtn22);
        Info23=(Button) findViewById(R.id.infoBtn23);



        AR=(Button) findViewById(R.id.BtnAR);


        Info15.setX(400);
        Info15.setY(150);

        Info16.setX(400);
        Info16.setY(450);

        Info17.setX(730);
        Info17.setY(200);

        Info18.setX(900);
        Info18.setY(100);

        Info19.setX(730);
        Info19.setY(400);

        Info20.setX(180);
        Info20.setY(300);

        Info21.setX(120);
        Info21.setY(530);

        Info22.setX(100);
        Info22.setY(110);

        Info23.setX(730);
        Info23.setY(780);





        Info15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info15.setBackgroundResource(R.drawable.picchkinf);
                v.setSelected(true);
                openInformationActivity15();
            }
        });


        Info16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info16.setBackgroundResource(R.drawable.mushchkiinf);
                v.setSelected(true);
                openInformationActivity16();
            }
        });

        Info17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info17.setBackgroundResource(R.drawable.picchkinf);
                v.setSelected(true);
                openInformationActivity17();
            }
        });

        Info18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info18.setBackgroundResource(R.drawable.picchkinf);
                v.setSelected(true);
                openInformationActivity18();
            }
        });

        Info19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info19.setBackgroundResource(R.drawable.mushchkiinf);
                v.setSelected(true);
                openInformationActivity19();
            }
        });

        Info20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info20.setBackgroundResource(R.drawable.mushchkiinf);
                v.setSelected(true);
                openInformationActivity20();
            }
        });

        Info21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info21.setBackgroundResource(R.drawable.mushchkiinf);
                v.setSelected(true);
                openInformationActivity21();
            }
        });


        Info22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info22.setBackgroundResource(R.drawable.mushchkiinf);
                v.setSelected(true);
                openInformationActivity22();
            }
        });

        Info23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info23.setBackgroundResource(R.drawable.picchkinf);
                v.setSelected(true);
                openInformationActivity23();
            }
        });








        AR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                AR.setBackgroundResource(R.drawable.chkinfo);
                v.setSelected(true);
                openActivityAR();
            }
        });


    }
}
