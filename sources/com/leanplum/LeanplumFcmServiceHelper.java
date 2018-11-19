package com.leanplum;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

public class LeanplumFcmServiceHelper extends IntentService {
    protected void onHandleIntent(@Nullable Intent intent) {
    }

    public LeanplumFcmServiceHelper() {
        super("LeanplumFcmServiceHelper");
    }
}
