package com.android.internal.app;

import android.app.Activity;
import android.os.Bundle;

public class FakeLicenseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Tell the calling app that the "License Check" was successful
        setResult(Activity.RESULT_OK); 
        finish(); // Close immediately so the user never sees it
    }
}
