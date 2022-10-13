package com.cdp.android_firebase;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

public class ConfigHelper {

    private FirebaseRemoteConfig remoteConfig;
    public Gson gson = new Gson();
    public ConfigHelper(FirebaseRemoteConfig remoteConfig) {
        this.remoteConfig = remoteConfig;
    }
    public final String KEY_SAMPLE_TEST = "sample_test_data";


    public List<Config_Menu_Items> getSampleTest(){
        Type collectionType = new TypeToken<Collection<Config_Menu_Items>>() {
        }.getType();
        Collection<Config_Menu_Items> officesList = gson.fromJson(remoteConfig.getString(KEY_SAMPLE_TEST), collectionType);

        return (List<Config_Menu_Items>) officesList;
    }

    public String getTestData(){
        return remoteConfig.getString("demo");
    }

}
