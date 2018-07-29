package com.invitations;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by HP on 07-10-2017.
 */

public class categories extends AppCompatActivity {

    Button wed,rec,ani,part,birth,others;
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        rec=(Button)findViewById(R.id.button10);
        wed=(Button)findViewById(R.id.button11);
        part=(Button)findViewById(R.id.button8);
        birth=(Button)findViewById(R.id.button7);
        others=(Button)findViewById(R.id.button1);
        ani=(Button)findViewById(R.id.button9);
        birth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Birthday.class);
                startActivity(i);
            }
        });
        wed.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent i=new Intent(getApplicationContext(),Wedding.class);
              startActivity(i);
          }
      });

         ani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Anniversary.class);
                startActivity(i);
            }
        });

        rec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Reception.class);
                startActivity(i);
            }
        });

        part.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Party.class);
                startActivity(i);
            }
        });



        others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Other.class);
                startActivity(i);
            }
        });


    }

}
