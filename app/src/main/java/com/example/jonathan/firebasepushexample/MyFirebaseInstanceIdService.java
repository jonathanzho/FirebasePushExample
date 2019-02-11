package com.example.jonathan.firebasepushexample;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {
  private static final String TAG = "FPE MyFirebaseInstanceIdService";

  @Override
  public void onTokenRefresh() {
    Log.d(TAG, "onTokenRefresh");

    super.onTokenRefresh();

    String token = FirebaseInstanceId.getInstance().getToken();

    Log.v(TAG, "onTokenRefresh: token=[" + token + "]");
  }
}