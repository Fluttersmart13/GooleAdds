package com.cdp.android_firebase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

import java.util.List;

public class RemoteConfigActivity extends AppCompatActivity {
    private FirebaseRemoteConfig fbRemoteConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remote_config);

//        fbRemoteConfig = FirebaseRemoteConfig.getInstance();
//        fbRemoteConfig.setDefaults(R.xml.remote_config_params);
//
//        fbRemoteConfig.setConfigSettings(
//                new FirebaseRemoteConfigSettings.Builder()
//                        .setDeveloperModeEnabled(true)
//                        .build());

        //applyConfig();
//        List<Config_Menu_Items> list = new ConfigHelper(FirebaseRemoteConfig.getInstance()).getSampleTest();
//
//        if(list!= null){
//            Toast.makeText(this, ""+list.size(), Toast.LENGTH_SHORT).show();
//        }

        String data = new ConfigHelper(FirebaseRemoteConfig.getInstance()).getTestData();
        Toast.makeText(this, ""+data, Toast.LENGTH_SHORT).show();


    }

    protected void applyConfig() {

        LinearLayout layout = (LinearLayout) findViewById(R.id.layout);
        TextView textView = (TextView) findViewById(R.id.welcomeText);

        String bg_color = fbRemoteConfig.getString("main_background_color");
        layout.setBackgroundColor(Color.parseColor(bg_color));
        textView.setTextSize(fbRemoteConfig.getLong("welcome_font_size"));
        textView.setText(fbRemoteConfig.getString("welcome_text"));

    }
}