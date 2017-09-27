package com.shreeganesha.developers.swarajya_dhol_tasha;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Devloper extends Activity {

    ImageView call,facebook,insta,twitter,satish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devloper);

        call = (ImageView) findViewById(R.id.call);
        facebook = (ImageView) findViewById(R.id.dev_fb);
        twitter  = (ImageView) findViewById(R.id.dev_twitter);
        insta = (ImageView) findViewById(R.id.dev_insta);
        satish = findViewById(R.id.Satish);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim_in_pop);
        Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        satish.setAnimation(animation);
        facebook.setAnimation(animation2);
        twitter.setAnimation(animation2);
        insta.setAnimation(animation2);
        call.setAnimation(animation2);


        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 9762257535"));
                startActivity(intent);
            }
        });

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.instagram.com/satish_sonwale"));
                startActivity(intent);
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.twitter.com/satish_sonwale"));
                startActivity(intent);
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent facebookIntent = new Intent(Intent.ACTION_VIEW);
                String facebookUrl = getFacebookPageURL(Devloper.this);
                facebookIntent.setData(Uri.parse(facebookUrl));
                startActivity(facebookIntent);
            }
        });


    }

    public static String FACEBOOK_URL = "https://www.facebook.com/satish.sonwale.334";

    //method to get the right URL to use in the intent
    public String getFacebookPageURL(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            int versionCode = packageManager.getPackageInfo("com.facebook.katana", 0).versionCode;
            if (versionCode >= 3002850) { //newer versions of fb app
                return "fb://facewebmodal/f?href=" + FACEBOOK_URL;
            } else { //older versions of fb app
                return FACEBOOK_URL;
            }
        } catch (PackageManager.NameNotFoundException e) {
            return FACEBOOK_URL; //normal web url
        }
    }

}
