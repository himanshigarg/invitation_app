package com.invitations;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Party extends AppCompatActivity {

    ImageButton Par_1,Par_2,Par_3,Par_4,Par_5,Par_6,Par_7,Par_8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_party);
        Par_1 = (ImageButton)findViewById(R.id.imbtn1);
        Par_2 = (ImageButton)findViewById(R.id.imbtn2);
        Par_3 = (ImageButton)findViewById(R.id.imbtn3);
        Par_4 = (ImageButton)findViewById(R.id.imbtn4);
        Par_5 = (ImageButton)findViewById(R.id.imbtn5);
        Par_6 = (ImageButton)findViewById(R.id.imbtn6);
        Par_7 = (ImageButton)findViewById(R.id.imbtn7);
        Par_8 = (ImageButton)findViewById(R.id.imbtn8);

        Par_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pack = getPackageName()+".PartyForm";
                Class cls = null;
                try {
                    cls = Class.forName(pack);
                    Intent form = new Intent(Party.this,cls);
                    form.putExtra("slot",v.getId());
                    startActivity(form);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        Par_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pack = getPackageName()+".PartyForm";
                Class cls = null;
                try {
                    cls = Class.forName(pack);
                    Intent form = new Intent(Party.this,cls);
                    form.putExtra("slot",v.getId());
                    startActivity(form);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        Par_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pack = getPackageName()+".PartyForm";
                Class cls = null;
                try {
                    cls = Class.forName(pack);
                    Intent form = new Intent(Party.this,cls);
                    form.putExtra("slot",v.getId());
                    startActivity(form);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        Par_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pack = getPackageName()+".PartyForm";
                Class cls = null;
                try {
                    cls = Class.forName(pack);
                    Intent form = new Intent(Party.this,cls);
                    form.putExtra("slot",v.getId());
                    startActivity(form);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        Par_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pack = getPackageName()+".PartyForm";
                Class cls = null;
                try {
                    cls = Class.forName(pack);
                    Intent form = new Intent(Party.this,cls);
                    form.putExtra("slot",v.getId());
                    startActivity(form);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        Par_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pack = getPackageName()+".PartyForm";
                Class cls = null;
                try {
                    cls = Class.forName(pack);
                    Intent form = new Intent(Party.this,cls);
                    form.putExtra("slot",v.getId());
                    startActivity(form);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        Par_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pack = getPackageName()+".PartyForm";
                Class cls = null;
                try {
                    cls = Class.forName(pack);
                    Intent form = new Intent(Party.this,cls);
                    form.putExtra("slot",v.getId());
                    startActivity(form);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        Par_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pack = getPackageName()+".PartyForm";
                Class cls = null;
                try {
                    cls = Class.forName(pack);
                    Intent form = new Intent(Party.this,cls);
                    form.putExtra("slot",v.getId());
                    startActivity(form);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
