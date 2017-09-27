package com.shreeganesha.developers.swarajya_dhol_tasha;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class Home extends Activity {

    ImageView home, admission,social ,devloper,gallery,contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        home = (ImageView) findViewById(R.id.Home);
        admission = (ImageView) findViewById(R.id.Adms);
        social = (ImageView) findViewById(R.id.Soc);
        gallery = (ImageView) findViewById(R.id.gallary);
        contact = (ImageView) findViewById(R.id.Cont);
        devloper = (ImageView) findViewById(R.id.Devloper);

        final Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim_in_pop);
        home.setAnimation(animation);
        admission.setAnimation(animation);
        social.setAnimation(animation);
        gallery.setAnimation(animation);
        contact.setAnimation(animation);
        devloper.setAnimation(animation);




        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "U Clicked Home Button", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Home.this,Eng_Swarajya.class);
                startActivity(intent);
            }
        });

        admission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "U Clicked Admission Button", Toast.LENGTH_SHORT).show();
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,Contact_Us.class);
                startActivity(intent);
            }
        });
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Home.this,Gallery.class);
                startActivity(intent);
            }
        });

        social.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,Social_Media.class);
                startActivity(intent);
            }
        });

        devloper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,Devloper.class);
                startActivity(intent);
            }
        });

        admission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,Admission_form.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.Acton_share){

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
