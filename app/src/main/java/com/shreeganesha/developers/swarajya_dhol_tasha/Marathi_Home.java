package com.shreeganesha.developers.swarajya_dhol_tasha;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Marathi_Home extends Activity {

    TextView home,admission, contact,social,share,devloper;
    ImageView imgHome,imgAdms,imgContact,imgSocial,imgGallery,imgDevloper;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marathi__home);


        home = (TextView) findViewById(R.id.mTV_Home);
        admission = (TextView) findViewById(R.id.mTV_Adms);
        contact = (TextView) findViewById(R.id.mTV_Contact);
        social = (TextView) findViewById(R.id.mTV_Social);
        share = (TextView) findViewById(R.id.mTV_Share);
        devloper = (TextView) findViewById(R.id.mTV_Devloper);

        final Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim_in_pop);



        Typeface font = Typeface.createFromAsset(getAssets(),"fonts/shivaji5.ttf");

        home.setTypeface(font);
        admission.setTypeface(font);
        contact.setTypeface(font);
        social.setTypeface(font);
        share.setTypeface(font);
        devloper.setTypeface(font);

        imgHome = (ImageView) findViewById(R.id.mHome);
        imgAdms = (ImageView) findViewById(R.id.mAdms);
        imgContact = (ImageView) findViewById(R.id.mCont);
        imgSocial = (ImageView) findViewById(R.id.mSoc);
        imgGallery = (ImageView) findViewById(R.id.mGallery);
        imgDevloper = (ImageView) findViewById(R.id.mDevloper);


        imgHome.setAnimation(animation);
        imgAdms.setAnimation(animation);
        imgSocial.setAnimation(animation);
        imgContact.setAnimation(animation);
        imgGallery.setAnimation(animation);
        imgDevloper.setAnimation(animation);


        imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Marathi_Home.this, Swarajya.class);
                startActivity(intent);
            }
        });

        imgContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Marathi_Home.this, mContact_Us.class);
                startActivity(i);

            }
        });


        imgGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Marathi_Home.this,Gallery.class);
                startActivity(intent);
            }
        });

        imgSocial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Marathi_Home.this,mSocial_media.class);
                startActivity(intent);
            }
        });

        imgDevloper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Marathi_Home.this,Devloper.class);
                startActivity(intent);
            }
        });

        imgAdms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Marathi_Home.this,Admission_form.class);
                startActivity(intent);
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_marathi,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        if (item.getItemId()== R.id.Acton_share){

            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            String shareBody = "https://play.google.com/store/apps/details?id=com.shreeganesha.developers.swarajya_dhol_tasha";
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Swarajya Dol Tasha Pathak");
            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
            startActivity(Intent.createChooser(sharingIntent, "Share via"));
        }

        return true;
    }
}
