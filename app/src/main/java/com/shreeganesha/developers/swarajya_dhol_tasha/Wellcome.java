package com.shreeganesha.developers.swarajya_dhol_tasha;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;

public class Wellcome extends Activity {

    public static String TAG = "Wellcome";

    ImageView eng,marathi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellcome);

        eng = (ImageView) findViewById(R.id.eng);
        marathi = (ImageView) findViewById(R.id.mararthi);

        String Token = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG,"Token"+Token);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim_in_pop);

        eng.setAnimation(animation);
        marathi.setAnimation(animation);


        eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Wellcome.this, Home.class);
                startActivity(intent);
                //Toast.makeText(getApplicationContext(),"U Have Clicked Eng", Toast.LENGTH_SHORT).show();
            }
        });

        marathi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Wellcome.this, Marathi_Home.class);
                startActivity(intent);
            }
        });
    }
}
