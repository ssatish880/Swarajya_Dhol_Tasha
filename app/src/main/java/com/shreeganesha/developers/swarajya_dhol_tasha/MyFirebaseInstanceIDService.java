package com.shreeganesha.developers.swarajya_dhol_tasha;

import android.annotation.SuppressLint;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Shree Ganesha on 6/2/2017.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    public static final String TAG = "MyFirebaseInstanceIDService";

    @SuppressLint("LongLogTag")
    @Override
    public void onTokenRefresh() {
        String onTokenRefresh = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG,"New Token"+onTokenRefresh);
    }
}
