package com.shreeganesha.developers.swarajya_dhol_tasha;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Swarajya extends Activity {
    TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swarajya);

        info = (TextView) findViewById(R.id.textView);

        Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/shivaji5.ttf");
        info.setTypeface(typeface);
    }
}
