package com.invitations;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Anniversary extends AppCompatActivity {

    ImageButton Ann_1,Ann_2,Ann_3,Ann_4,Ann_5,Ann_6,Ann_7,Ann_8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anniversary);
        Ann_1 = (ImageButton)findViewById(R.id.imbtn1);
        Ann_2 = (ImageButton)findViewById(R.id.imbtn2);
        Ann_3 = (ImageButton)findViewById(R.id.imbtn3);
        Ann_4 = (ImageButton)findViewById(R.id.imbtn4);
        Ann_5 = (ImageButton)findViewById(R.id.imbtn5);
        Ann_6 = (ImageButton)findViewById(R.id.imbtn6);
        Ann_7 = (ImageButton)findViewById(R.id.imbtn7);
        Ann_8 = (ImageButton)findViewById(R.id.imbtn8);

        Ann_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pack = getPackageName()+".AnniversaryForm";
                Class cls = null;
                try {
                    cls = Class.forName(pack);
                    Intent form = new Intent(Anniversary.this,cls);
                    form.putExtra("slot",v.getId());
                    startActivity(form);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        Ann_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pack = getPackageName()+".AnniversaryForm";
                Class cls = null;
                try {
                    cls = Class.forName(pack);
                    Intent form = new Intent(Anniversary.this,cls);
                    form.putExtra("slot",v.getId());
                    startActivity(form);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        Ann_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pack = getPackageName()+".AnniversaryForm";
                Class cls = null;
                try {
                    cls = Class.forName(pack);
                    Intent form = new Intent(Anniversary.this,cls);
                    form.putExtra("slot",v.getId());
                    startActivity(form);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        Ann_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pack = getPackageName()+".AnniversaryForm";
                Class cls = null;
                try {
                    cls = Class.forName(pack);
                    Intent form = new Intent(Anniversary.this,cls);
                    form.putExtra("slot",v.getId());
                    startActivity(form);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        Ann_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pack = getPackageName()+".AnniversaryForm";
                Class cls = null;
                try {
                    cls = Class.forName(pack);
                    Intent form = new Intent(Anniversary.this,cls);
                    form.putExtra("slot",v.getId());
                    startActivity(form);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        Ann_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pack = getPackageName()+".AnniversaryForm";
                Class cls = null;
                try {
                    cls = Class.forName(pack);
                    Intent form = new Intent(Anniversary.this,cls);
                    form.putExtra("slot",v.getId());
                    startActivity(form);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        Ann_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pack = getPackageName()+".AnniversaryForm";
                Class cls = null;
                try {
                    cls = Class.forName(pack);
                    Intent form = new Intent(Anniversary.this,cls);
                    form.putExtra("slot",v.getId());
                    startActivity(form);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        Ann_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pack = getPackageName()+".AnniversaryForm";
                Class cls = null;
                try {
                    cls = Class.forName(pack);
                    Intent form = new Intent(Anniversary.this,cls);
                    form.putExtra("slot",v.getId());
                    startActivity(form);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
