package com.shreeganesha.developers.swarajya_dhol_tasha;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class Admission_form extends Activity {

    WebView admission;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admission_form);

        admission = (WebView) findViewById(R.id.admission);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);

        admission.setWebViewClient(new WebViewClient());
        admission.setWebChromeClient(new WebChromeClient(){

            public void onProgressChanged(WebView view, int progress){
                progressBar.setVisibility(View.VISIBLE);
                progressBar.setProgress(progress);
                if (progress==100){
                    progressBar.setVisibility(View.GONE);
                }

            }

        });
        progressBar.setVisibility(View.VISIBLE);


        admission.getSettings().setJavaScriptEnabled(true);
        admission.setWebViewClient(new WebViewClient());
        admission.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        admission.getSettings().setSupportZoom(true);
        admission.getSettings().setDisplayZoomControls(true);
        admission.getSettings().getBuiltInZoomControls();
        admission.loadUrl("https://goo.gl/forms/fiqBmZN4dmQWajTp1");



    }


    @Override
    public void onBackPressed() {

        if (admission.canGoBack()){
            admission.goBack();
        }
        super.onBackPressed();
    }
}

