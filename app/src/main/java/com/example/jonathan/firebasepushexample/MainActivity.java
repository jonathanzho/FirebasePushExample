package com.example.jonathan.firebasepushexample;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;

import java.util.Objects;

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
              Log.w(TAG, "onComplete: getInstanceId failed. task.exception=[" +
                  task.getException() +"]");
              return;
            }

            // Get new Instance ID token
            String token = Objects.requireNonNull(task.getResult()).getToken();

            // Log and toast
            String msg = getString(R.string.msg_token_fmt, token);
            Log.v(TAG, "onComplete: msg=[" + msg + "]");
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
