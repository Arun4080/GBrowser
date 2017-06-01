package com.arunverma.www.proxysite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
import android.widget.EditText;
import android.view.View;

public class Proxy_site extends AppCompatActivity {
    private WebView mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy_site);

        Intent intent = new Intent(this, Service1.class);
        startService(intent);

        mWebView = (WebView) findViewById(R.id.activity_main_webview);
        mWebView.loadUrl("https://www.google.com");

        mWebView.setWebViewClient(new WebViewClient());

        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    protected void Search(View view){
        EditText e = (EditText) findViewById(R.id.editText);
        String c = "https://"+e.getText().toString();
     this.app(c);

    }

    protected void Refress(View view){
        this.Search(view);
    }

    protected void app(String x){
        mWebView = (WebView) findViewById(R.id.activity_main_webview);
        mWebView.loadUrl(x);

        mWebView.setWebViewClient(new WebViewClient());

        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
