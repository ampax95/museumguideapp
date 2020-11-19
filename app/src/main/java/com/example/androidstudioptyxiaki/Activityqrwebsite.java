package com.example.androidstudioptyxiaki;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class Activityqrwebsite extends AppCompatActivity {

    WebView webView;

    @Nullable
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityqrwebsite);

        webView = (WebView) findViewById(R.id.webview);

        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDomStorageEnabled(true); //Trial mode - latest change


        Intent intent = getIntent();
        String url = intent.getStringExtra(ActivityQR.EXTRA_TEXT);

        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);



}}
