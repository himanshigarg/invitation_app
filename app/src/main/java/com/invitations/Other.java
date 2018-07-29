package com.invitations;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Other extends AppCompatActivity {

    ImageButton otr_1,otr_2,otr_3,otr_4,otr_5,otr_6,otr_7,otr_8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other);
        otr_1 = (ImageButton)findViewById(R.id.imbtn1);
        otr_2 = (ImageButton)findViewById(R.id.imbtn2);
        otr_3 = (ImageButton)findViewById(R.id.imbtn3);
        otr_4 = (ImageButton)findViewById(R.id.imbtn4);
        otr_5 = (ImageButton)findViewById(R.id.imbtn5);
        otr_6 = (ImageButton)findViewById(R.id.imbtn6);
        otr_7 = (ImageButton)findViewById(R.id.imbtn7);
        otr_8 = (ImageButton)findViewById(R.id.imbtn8);

        otr_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pack = getPackageName()+".OtherForm";
                Class cls = null;
                try {
                    cls = Class.forName(pack);
                    Intent form = new Intent(Other.this,cls);
                    form.putExtra("slot",v.getId());
                    startActivity(form);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        otr_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pack = getPackageName()+".OtherForm";
                Class cls = null;
                try {
                    cls = Class.forName(pack);
                    Intent form = new Intent(Other.this,cls);
                    form.putExtra("slot",v.getId());
                    startActivity(form);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        otr_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pack = getPackageName()+".OtherForm";
                Class cls = null;
                try {
                    cls = Class.forName(pack);
                    Intent form = new Intent(Other.this,cls);
                    form.putExtra("slot",v.getId());
                    startActivity(form);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        otr_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pack = getPackageName()+".OtherForm";
                Class cls = null;
                try {
                    cls = Class.forName(pack);
                    Intent form = new Intent(Other.this,cls);
                    form.putExtra("slot",v.getId());
                    startActivity(form);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        otr_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pack = getPackageName()+".OtherForm";
                Class cls = null;
                try {
                    cls = Class.forName(pack);
                    Intent form = new Intent(Other.this,cls);
                    form.putExtra("slot",v.getId());
                    startActivity(form);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        otr_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pack = getPackageName()+".OtherForm";
                Class cls = null;
                try {
                    cls = Class.forName(pack);
                    Intent form = new Intent(Other.this,cls);
                    form.putExtra("slot",v.getId());
                    startActivity(form);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        otr_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pack = getPackageName()+".OtherForm";
                Class cls = null;
                try {
                    cls = Class.forName(pack);
                    Intent form = new Intent(Other.this,cls);
                    form.putExtra("slot",v.getId());
                    startActivity(form);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        otr_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pack = getPackageName()+".OtherForm";
                Class cls = null;
                try {
                    cls = Class.forName(pack);
                    Intent form = new Intent(Other.this,cls);
                    form.putExtra("slot",v.getId());
                    startActivity(form);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });


    }
}
