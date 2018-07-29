package com.invitations;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;

import static com.invitations.R.id.Save;

/**
 * Created by HP on 13-10-2017.
 */

public class Party_template extends Activity {
    Bitmap bitmap;
    LinearLayout weddv;
    TextView tv1,tv2,tv3,tv4,tv5;
    Button save,share;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ProcessingTemplate();
//        SaveTemplate();



    }
    private void ProcessingTemplate() {
        Bundle bundle = getIntent().getExtras();
        int intValue = getIntent().getIntExtra("slot1", 0);
        if (intValue != 0) {
            if(intValue!=0)
            {
                if(intValue == R.id.imbtn1){
                    setContentView(R.layout.par_1);
                }
                if(intValue == R.id.imbtn2){
                    setContentView(R.layout.par_2);
                }
                if(intValue == R.id.imbtn3){
                    setContentView(R.layout.par_3);
                }
                if(intValue == R.id.imbtn4){
                    setContentView(R.layout.par_4);
                }
                if(intValue == R.id.imbtn5){
                    setContentView(R.layout.par_5);
                }
                if(intValue == R.id.imbtn6){
                    setContentView(R.layout.par_6);
                }
                if(intValue == R.id.imbtn7){
                    setContentView(R.layout.par_7);
                }
                if(intValue == R.id.imbtn8){
                    setContentView(R.layout.par_8);
                }


            }
            save =(Button)findViewById(Save);
            share = (Button)findViewById(R.id.Share);
            tv1 = (TextView)findViewById(R.id.textView1);
            tv2 = (TextView)findViewById(R.id.textView2);
            tv3 = (TextView)findViewById(R.id.textView3);
            tv4 = (TextView)findViewById(R.id.textView4);



            String descriptionString = bundle.getString("description");
            tv1.setText(descriptionString);
            String dateString = bundle.getString("date");
            tv2.setText(dateString);
            String timeString  = bundle.getString("time");
            tv3.setText(timeString);
            String venueString  = bundle.getString("venue");
            tv3.setText(venueString);
        }
    }


    public void Save(View view)
    {
        LinearLayout layout  = (LinearLayout)findViewById(R.id.par);
        Bitmap bitmap = getBitmapFromView(layout);


        String ImagePath = MediaStore.Images.Media.insertImage(
                getContentResolver(),
                bitmap,
                "demo_image",
                "demo_image"
        );

        Uri URI = Uri.parse(ImagePath);

        Toast.makeText(Party_template.this, "Image Saved Successfully", Toast.LENGTH_LONG).show();
    }

    public void Share(View view)
    {
        LinearLayout layout  = (LinearLayout)findViewById(R.id.par);
        Bitmap b = getBitmapFromView(layout);
        Intent share = new Intent(Intent.ACTION_SEND);
        share.setType("image/jpeg");
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        b.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
        String path = MediaStore.Images.Media.insertImage(getContentResolver(),
                b, "Title", null);
        Uri imageUri =  Uri.parse(path);
        share.putExtra(Intent.EXTRA_STREAM, imageUri);
        startActivity(Intent.createChooser(share, "Select"));
    }

    public static Bitmap getBitmapFromView(View view) {
        //Define a bitmap with the same size as the view
        Bitmap returnedBitmap = Bitmap.createBitmap(view.getWidth(),view.getHeight(), Bitmap.Config.ARGB_8888);
        //Bind a canvas to it
        Canvas canvas = new Canvas(returnedBitmap);
        //Get the view's background
        Drawable bgDrawable = view.getBackground();
        if (bgDrawable != null)
            //has background drawable, then draw it on the canvas
            bgDrawable.draw(canvas);
        else
            //does not have background drawable, then draw white background on the canvas
            canvas.drawColor(Color.WHITE);
        // draw the view on the canvas
        view.draw(canvas);
        //return the bitmap
        return returnedBitmap;
    }

}
