package com.homecook.android.app.feed;

import android.os.Bundle;

import com.homecook.android.app.R;
import com.homecook.android.app.common.LoggedInActivity;

/**
 * @author rohansaigaonkar
 */
public class FeedActivity extends LoggedInActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
    }
}