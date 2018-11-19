package com.tinder.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.branch.referral.InstallListener;

public class InstallReferrerListener extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        m55968a(context, intent);
    }

    /* renamed from: a */
    private void m55968a(Context context, Intent intent) {
        new InstallListener().onReceive(context, intent);
    }
}
