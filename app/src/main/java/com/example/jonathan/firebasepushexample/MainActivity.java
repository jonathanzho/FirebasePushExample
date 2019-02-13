package com.example.jonathan.firebasepushexample;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;

public class MainActivity extends AppCompatActivity {
  private static final String TAG = " FPE MainActivity";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    Log.d(TAG, "onCreate");

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    FirebaseApp.initializeApp(getApplicationContext());

    FirebaseInstanceId.getInstance().getInstanceId()
        .addOnCompleteListener(new OnCompleteListener<InstanceIdResult>() {
          @Override
          public void onComplete(@NonNull Task<InstanceIdResult> task) {
            if (!task.isSuccessful()) {
              Log.w(TAG, "getInstanceId failed", task.getException());
              return;
            }

            // Get new Instance ID token
            String token = task.getResult().getToken();

            // Log and toast
            //String msg = getString(R.string.msg_token_fmt, token);
            String msg = token;
            Log.v(TAG, "msg=[" + msg + "]");
            Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
          }
        });

    Log.v(TAG, "onCreate: end");
  }

  @Override
  protected void onDestroy() {
    Log.d(TAG, "onDestroy");

    super.onDestroy();
  }

  @Override
  protected void onResume() {
    Log.d(TAG, "onResume");

    super.onResume();
  }

  @Override
  protected void onPause() {
    Log.d(TAG, "onPause");

    super.onPause();
  }
}
