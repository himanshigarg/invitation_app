package com.invitations;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by HP on 08-10-2017.
 */

public class Wedding extends AppCompatActivity implements View.OnClickListener {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wedding_temp);
        ImageButton wed1;
        wed1=(ImageButton)findViewById(R.id.imbtn1);

        wed1.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        String pack = getPackageName()+".FormActivity";
        Class cls = null;
        try {
            cls = Class.forName(pack);
            Intent form = new Intent(Wedding.this,cls);
            form.putExtra("slot",v.getId());
            startActivity(form);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }



}
