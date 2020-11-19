package com.example.androidstudioptyxiaki;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    private Button Info ;
    public void openInformationActivity(){
        Intent intent = new Intent(this,InformationActivity.class);
        startActivity(intent);
    }


    private Button Info1 ;
    public void openInformationActivity1(){
        Intent intent = new Intent(this,InformationActivity1.class);
        startActivity(intent);
    }

    private Button Info3 ;
    public void openInformationActivity3(){
        Intent intent = new Intent(this,InformationActivity2.class);
        startActivity(intent);
    }

    private Button Info4 ;
    public void openInformationActivity4(){
        Intent intent = new Intent(this,InformationActivity3.class);
        startActivity(intent);
    }

    private Button Info5 ;
    public void openInformationActivity5(){
        Intent intent = new Intent(this,InformationActivity4.class);
        startActivity(intent);
    }

    private Button Info6 ;
    public void openInformationActivity6(){
        Intent intent = new Intent(this,InformationActivity5.class);
        startActivity(intent);
    }

    private Button Info7 ;
    public void openInformationActivity7(){
        Intent intent = new Intent(this,InformationActivity6.class);
        startActivity(intent);
    }

    private Button Info8 ;
    public void openInformationActivity8(){
        Intent intent = new Intent(this,InformationActivity7.class);
        startActivity(intent);
    }

    private Button Info9 ;
    public void openInformationActivity9(){
        Intent intent = new Intent(this,InformationActivity8.class);
        startActivity(intent);
    }

    private Button Info10 ;
    public void openInformationActivity10(){
        Intent intent = new Intent(this,InformationActivity9.class);
        startActivity(intent);
    }

    private Button Info11 ;
    public void openInformationActivity11(){
        Intent intent = new Intent(this,InformationActivity10.class);
        startActivity(intent);
    }

    private Button Info12 ;
    public void openInformationActivity12(){
        Intent intent = new Intent(this,InformationActivity11.class);
        startActivity(intent);
    }

    private Button Info13 ;
    public void openInformationActivity13(){
        Intent intent = new Intent(this,InformationActivity12.class);
        startActivity(intent);
    }

    private Button Info14 ;
    public void openInformationActivity14(){
        Intent intent = new Intent(this,InformationActivity13.class);
        startActivity(intent);
    }

    private Button Info15 ;
    public void openInformationActivity15(){
        Intent intent = new Intent(this,InformationActivity14.class);
        startActivity(intent);
    }



    //   AR BUTTON

    private Button AR ;
    public void openActivityAR(){
        Intent intent = new Intent(this, ActivityQR.class);
        startActivity(intent);
    }

// VR button



    public void openVR1(View view){
        Intent openVR1app = getPackageManager().getLaunchIntentForPackage("net.anasbach.ptixiaki.edu");
        startActivity(openVR1app);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Info=(Button) findViewById(R.id.infoBtn1);
        Info1=(Button) findViewById(R.id.infoBtn2);
        Info3=(Button) findViewById(R.id.infoBtn3);
        Info4=(Button) findViewById(R.id.infoBtn4);
        Info5=(Button) findViewById(R.id.infoBtn5);
        Info6=(Button) findViewById(R.id.infoBtn6);
        Info7=(Button) findViewById(R.id.infoBtn7);
        Info8=(Button) findViewById(R.id.infoBtn8);
        Info9=(Button) findViewById(R.id.infoBtn9);
        Info10=(Button) findViewById(R.id.infoBtn10);
        Info11=(Button) findViewById(R.id.infoBtn11);
        Info12=(Button) findViewById(R.id.infoBtn12);
        Info13=(Button) findViewById(R.id.infoBtn13);
        Info14=(Button) findViewById(R.id.infoBtn14);
        Info15=(Button) findViewById(R.id.infoBtn15);


        AR=(Button) findViewById(R.id.BtnAR);




        Info.setX(320);
        Info.setY(1080);

        Info1.setX(90);
        Info1.setY(1050);

        Info3.setX(60);
        Info3.setY(800);

        Info4.setX(60);
        Info4.setY(500);

        Info5.setX(60);
        Info5.setY(270);

        Info6.setX(60);
        Info6.setY(100);

        Info7.setX(500);
        Info7.setY(70);

        Info8.setX(920);
        Info8.setY(90);

        Info9.setX(950);
        Info9.setY(300);

        Info10.setX(950);
        Info10.setY(500);

        Info11.setX(950);
        Info11.setY(770);

        Info12.setX(500);
        Info12.setY(270);

        Info13.setX(500);
        Info13.setY(470);

        Info14.setX(500);
        Info14.setY(650);

        Info15.setX(500);
        Info15.setY(850);


        Info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info.setBackgroundResource(R.drawable.brdchkinf);
                v.setSelected(true);
                openInformationActivity();
            }
        });

        Info1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info1.setBackgroundResource(R.drawable.animchkinf);
                openInformationActivity1();
            }
        });

        Info3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info3.setBackgroundResource(R.drawable.brdchkinf);
                v.setSelected(true);
                openInformationActivity3();
            }
        });

        Info4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info4.setBackgroundResource(R.drawable.brdchkinf);
                v.setSelected(true);
                openInformationActivity4();
            }
        });

        Info5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info5.setBackgroundResource(R.drawable.animchkinf);
                v.setSelected(true);
                openInformationActivity5();
            }
        });

        Info6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info6.setBackgroundResource(R.drawable.brdchkinf);
                v.setSelected(true);
                openInformationActivity6();
            }
        });

        Info7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info7.setBackgroundResource(R.drawable.animchkinf);
                v.setSelected(true);
                openInformationActivity7();
            }
        });

        Info8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info8.setBackgroundResource(R.drawable.animchkinf);
                v.setSelected(true);
                openInformationActivity8();
            }
        });

        Info9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info9.setBackgroundResource(R.drawable.animchkinf);
                v.setSelected(true);
                openInformationActivity9();
            }
        });

        Info10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info10.setBackgroundResource(R.drawable.brdchkinf);
                v.setSelected(true);
                openInformationActivity10();
            }
        });

        Info11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info11.setBackgroundResource(R.drawable.brdchkinf);
                v.setSelected(true);
                openInformationActivity11();
            }
        });

        Info12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info12.setBackgroundResource(R.drawable.brdchkinf);
                v.setSelected(true);
                openInformationActivity12();
            }
        });

        Info13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info13.setBackgroundResource(R.drawable.brdchkinf);
                v.setSelected(true);
                openInformationActivity13();
            }
        });

        Info14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info14.setBackgroundResource(R.drawable.brdchkinf);
                v.setSelected(true);
                openInformationActivity14();
            }
        });

        Info15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info15.setBackgroundResource(R.drawable.brdchkinf);
                v.setSelected(true);
                openInformationActivity15();
            }
        });





        AR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AR.setBackgroundResource(R.drawable.chkinfo);
                v.setSelected(true);
                openActivityAR();
            }
        });
    }
}
