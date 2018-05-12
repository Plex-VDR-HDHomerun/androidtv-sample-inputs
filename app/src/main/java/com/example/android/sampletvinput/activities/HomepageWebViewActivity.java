package com.example.android.sampletvinput.activities;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.android.sampletvinput.R;
import com.example.android.sampletvinput.tv.activities.LeanbackActivity;

/**
 * Created by Nick on 9/4/2016.
 */

public class HomepageWebViewActivity extends LeanbackActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView webView = new WebView(this);
        webView.loadUrl(getString(R.string.website_url));
        setContentView(webView);
        getActionBar().hide();
    }
}
