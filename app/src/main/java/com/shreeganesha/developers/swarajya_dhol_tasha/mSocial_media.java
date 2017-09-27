package com.shreeganesha.developers.swarajya_dhol_tasha;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class mSocial_media extends Activity {

    ImageView facebook,insta,youtube,subscribe;
    TextView follow,instruct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_social_media);


        facebook = (ImageView) findViewById(R.id.facebook);
        insta = (ImageView) findViewById(R.id.insta);
        youtube = (ImageView) findViewById(R.id.myoutube);
        subscribe = (ImageView) findViewById(R.id.subscribe);

        follow = (TextView) findViewById(R.id.follow);
        instruct = (TextView) findViewById(R.id.click_to_Follow);

        Typeface font = Typeface.createFromAsset(getAssets(),"fonts/shivaji5.ttf");
        follow.setTypeface(font);
        instruct.setTypeface(font);

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                String facbookURL = "https://www.facebook.com/Swarajya-dhol-tasha-pathak-545800985462161";
                i.setData(Uri.parse(facbookURL));
                startActivity(i);
            }
        });

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                String facbookURL = "https://www.instagram.com/swarajya011/";
                i.setData(Uri.parse(facbookURL));
                startActivity(i);
            }
        });

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/channel/UCuMTh9ESt5APl-yE1QUTLBQ"));
                startActivity(intent);
            }
        });

        subscribe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/channel/UCuMTh9ESt5APl-yE1QUTLBQ"));
                startActivity(intent);
            }
        });
    }

}
