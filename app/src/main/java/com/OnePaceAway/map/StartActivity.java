package com.OnePaceAway.map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;

/**
 * Created by admin on 2017/7/13.
 */

public class StartActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.start);

        Intent intent = new Intent(StartActivity.this,WelcomeActivity.class);
        startActivity(intent);
        finish();
    }
}
