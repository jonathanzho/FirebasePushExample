package com.example.jonathan.firebasepushexample;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
  private static final String TAG = " FPE MyFirebaseMessagingService";

  public MyFirebaseMessagingService() {
    super();

    Log.d(TAG, "MyFirebaseMessagingService");
  }

  @Override
  public void onMessageReceived(RemoteMessage remoteMessage) {
    Log.d(TAG, "onMessageReceived");

    super.onMessageReceived(remoteMessage);
  }
}
