package com.cdp.android_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.cdp.android_firebase.Rewards.AdmobRewards;
import com.cdp.android_firebase.Rewards.RewardVideo;
import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button test_crash;
    Button addmob;

    private FirebaseAnalytics mFirebaseAnalytics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this, "oncreate", Toast.LENGTH_SHORT).show();

        UserModel obj = new UserModel("Soni","addresss");

        System.out.println(obj.name);
        obj.setName("priyanka");
        System.out.println(obj.getCombine());
        System.out.println(obj.name + obj.add);

        getData();
       // getArrayLogic();

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        //        test_crash = findViewById(R.id.test_crash);
//        addmob = findViewById(R.id.addmob);
//
//        test_crash.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                //throw new RuntimeException("Test Crash"); // Force a crash
//                Intent intent =  new Intent(MainActivity.this,RemoteConfigActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        addmob.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, AdmobBanner.class);
//                startActivity(intent);
//            }
//        });
//
//        Bundle bundle = new Bundle();
//        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "01");
//        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "android_testing");
//        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "image");
//        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
//
//
////
////        addContentView(test_crash, new ViewGroup.LayoutParams(
////                ViewGroup.LayoutParams.MATCH_PARENT,
////                ViewGroup.LayoutParams.WRAP_CONTENT));
    }

//    private void getArrayLogic() {
//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        System.out.println(cars[0]);
//
//        List<String> cars1 = new ArrayList<>();
//        cars1.add("Volvo");
//        cars1.add("BMW");
//        cars1.add("Ford");
//        cars1.add("Mazda");
//
//        System.out.println(cars1);
//        System.out.println(cars);
//
//        List<UserModel> listmode = new ArrayList<>();
//        UserModel userModelobj = new UserModel("Soni","Cdp");
////        userModelobj.setName("Soni");
////        userModelobj.setAdd("CDP");
//
//        UserModel userModelobj1 = new UserModel("priyanka","virar");
////        userModelobj1.setName("Priyanka");
////        userModelobj1.setAdd("Virar");
//
//
//        listmode.add(userModelobj);
//        listmode.add(userModelobj1);
//
//        System.out.println(listmode.size());
//
//        for(int i=0; i < listmode.size(); i++){
//            UserModel userModel = listmode.get(i);
//            System.out.println("Response"+userModel.getName());
//        }
//    }

    public void openInterstitialActivity(View view) {
        Intent intent = new Intent(MainActivity.this, AdmobInterstitial.class);
        startActivity(intent);
    }

    public void openNativeAdvanceAdActivity(View view) {
        Intent intent = new Intent(MainActivity.this, NativeAdvanceAd.class);
        startActivity(intent);
    }

    public void openRewardAdActivity(View view) {
        Intent intent = new Intent(MainActivity.this, AdmobRewards.class);
        startActivity(intent);
    }

    public void openRewardVideoActivity(View view) {
        Intent intent = new Intent(MainActivity.this, RewardVideo.class);
        startActivity(intent);
    }



    public void openAdaptivebannerActivity(View view) {
        Intent intent = new Intent(MainActivity.this, AdaptiveBanner.class);
        startActivity(intent);
    }

    public void methodtest(View view) {
        Intent intent = new Intent(MainActivity.this, RemoteConfigActivity.class);
        startActivity(intent);
    }


    void getData(){

    }
}



class UserModel{
    String name ;
    String add ;

    public UserModel(String name, String add) {
        this.name = name;
        this.add = add;
    }

    public String getCombine(){
        return  name + add ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
}