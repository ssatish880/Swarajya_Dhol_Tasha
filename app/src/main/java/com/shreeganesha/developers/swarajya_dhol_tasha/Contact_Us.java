package com.shreeganesha.developers.swarajya_dhol_tasha;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class Contact_Us extends Activity {

    ImageView pratik,rahul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact__us);

        pratik = (ImageView) findViewById(R.id.imgPratik);
        rahul = (ImageView) findViewById(R.id.imgRahul);
        ImageView home = findViewById(R.id.imageView2);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        home.setAnimation(animation);
        Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim_in_pop);
        pratik.setAnimation(animation2);
        rahul.setAnimation(animation2);

        pratik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9762521521"));
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Calling Pratik Vichare", Toast.LENGTH_SHORT).show();

            }
        });

        rahul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9881665441"));
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Calling Rahul Datir", Toast.LENGTH_SHORT).show();

            }
        });
    }

}
