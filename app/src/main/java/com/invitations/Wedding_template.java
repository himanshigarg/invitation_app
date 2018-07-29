package com.invitations;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by HP on 13-10-2017.
 */

public class Wedding_template extends Activity implements View.OnClickListener{
    Bitmap bitmap;
    LinearLayout weddv;
    TextView tv1,tv2,tv3,tv4;
    Button save;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ProcessingTemplate();
//        SaveTemplate();
        save.setOnClickListener(this);

    }
    private void ProcessingTemplate() {
        Bundle bundle = getIntent().getExtras();
        int intValue = getIntent().getIntExtra("slot1", 0);
        if (intValue != 0) {
            if(intValue!=0)
            {
                if(intValue == R.id.imbtn1){
                    setContentView(R.layout.wedd1);
                    weddv=(LinearLayout)findViewById(R.id.wedding1);
                }

            }
            save =(Button)findViewById(R.id.Save);
            tv1 = (TextView)findViewById(R.id.textView1);
            tv2 = (TextView)findViewById(R.id.textView2);
            tv3 = (TextView)findViewById(R.id.textView3);
            tv4 = (TextView)findViewById(R.id.textView4);

            String groomString = bundle.getString("groom");
            tv1.setText(groomString);
            String brideString = bundle.getString("bride");
            tv2.setText(brideString);
            String dateString = bundle.getString("date");
            tv3.setText(dateString);
            String timeString = bundle.getString("time");
            tv4.setText(timeString);
        }
    }
    @Override
    public void onClick(View V) {

    }
}
