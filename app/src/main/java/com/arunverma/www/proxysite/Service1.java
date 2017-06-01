package com.arunverma.www.proxysite;

import android.app.IntentService;
import android.content.Intent;
import android.widget.Toast;
import android.content.Context;

public class Service1 extends IntentService{
Context context;
    public Service1() {
        super("Service1");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
  ////Add code here for background download and processes
    }
}
