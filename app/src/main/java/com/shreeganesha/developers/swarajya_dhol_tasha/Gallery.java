package com.shreeganesha.developers.swarajya_dhol_tasha;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class Gallery extends Activity {

    ProgressBar progressBar;
    WebView gallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        gallery = (WebView)findViewById(R.id.web_Gallery);

        gallery.setWebViewClient(new WebViewClient());
        gallery.setWebChromeClient(new WebChromeClient(){

            public void onProgressChanged(WebView view, int progress){
                progressBar.setVisibility(View.VISIBLE);
                progressBar.setProgress(progress);
                if (progress==100){
                    progressBar.setVisibility(View.GONE);
                }

            }

        });
        progressBar.setVisibility(View.VISIBLE);


        gallery.getSettings().setJavaScriptEnabled(true);
        gallery.setWebViewClient(new WebViewClient());
        gallery.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        gallery.getSettings().setSupportZoom(true);
        gallery.getSettings().setDisplayZoomControls(true);
        gallery.getSettings().getBuiltInZoomControls();
        gallery.loadUrl("https://www.facebook.com/pg/Swarajya-dhol-tasha-pathak-545800985462161/photos/");
    }

    @Override
    public void onBackPressed() {
        if (gallery.canGoBack()){

            gallery.goBack();
        }
        super.onBackPressed();
    }
}
