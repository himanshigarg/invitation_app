package com.invitations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by HP on 13-10-2017.
 */

public class Wedding_template_final extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int val = getIntent().getIntExtra("finaltemp",0);
        if(val!=0)
        {
            switch(val){
                case R.id.wedding1:{
                    setContentView(R.layout.wedd1);
                    break;
                }
                case R.id.wedding2:{
                    setContentView(R.layout.wedd2);
                    break;
                }
            }
        }
    }



}
