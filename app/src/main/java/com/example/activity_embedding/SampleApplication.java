package com.example.activity_embedding;

import android.app.Application;
import android.util.Log;

import androidx.window.embedding.RuleController;
import androidx.window.embedding.SplitController;

public class SampleApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (SplitController.getInstance(this).getSplitSupportStatus() ==
                SplitController.SplitSupportStatus.SPLIT_AVAILABLE) {
            // Device supports split activity features.
            Log.e("mxw","SPLIT_AVAILABLE");
        }else {
            Log.e("mxw","SPLIT_UNAVAILABLE");
        }
//        RuleController.getInstance(this)
//                .setRules(RuleController.parseRules(this, R.xml.main_split_config));

        SplitManager.createSplit(this);
    }
}