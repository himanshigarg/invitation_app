package com.invitations;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ANUJ KD on 10/10/2017.
 */

public class FormActivity extends Activity implements View.OnClickListener{
    public EditText bride,groom,date,time,venue,description;
    TextView tv1;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        int catbuttonId = getIntent().getIntExtra("slot",0);
//        switch (catbuttonId){
//            case R.id.imageButton:
//                setContentView(R.layout.activity_form_wedding);
//        }
        setContentView(R.layout.activity_form__wedding);
        bride = (EditText)findViewById(R.id.bride);
        groom =(EditText)findViewById(R.id.groom);
        venue = (EditText)findViewById(R.id.time);
        time = (EditText)findViewById(R.id.time);
        date = (EditText)findViewById(R.id.date);
        description = (EditText)findViewById(R.id.description);
        submit =(Button)findViewById(R.id.crt_but);
        submit.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        try {
            Intent i = new Intent(FormActivity.this, Wedding_template.class);
            int buttonId = getIntent().getIntExtra("slot", 0);
            i.putExtra("slot1", buttonId);
            i.putExtra("bride", bride.getText().toString());
            i.putExtra("groom", groom.getText().toString());
            i.putExtra("time", time.getText().toString());
            i.putExtra("venue", venue.getText().toString());
            i.putExtra("date", date.getText().toString());
            i.putExtra("description", description.getText().toString());
            startActivity(i);
        }
        catch (Exception e)
        {
            Toast.makeText(this,e.getMessage(), Toast.LENGTH_LONG).show();
        }
        Toast.makeText(this,"hello", Toast.LENGTH_LONG).show();
    }
}
