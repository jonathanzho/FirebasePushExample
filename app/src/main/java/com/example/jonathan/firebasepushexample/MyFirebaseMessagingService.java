package com.example.jonathan.firebasepushexample;

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
  public void onNewToken(String s) {
    Log.d(TAG, "onNewToken: s=[" + s + "]");

    super.onNewToken(s);
  }

  @Override
  public void onMessageReceived(RemoteMessage remoteMessage) {
    Log.d(TAG, "onMessageReceived: remoteMessage.type=[" + remoteMessage.getMessageType() + "]");

    super.onMessageReceived(remoteMessage);
  }
}

