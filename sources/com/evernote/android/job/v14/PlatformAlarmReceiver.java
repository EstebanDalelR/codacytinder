package com.evernote.android.job.v14;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.evernote.android.job.JobProxy.C1127a;

public class PlatformAlarmReceiver extends BroadcastReceiver {
    /* renamed from: a */
    static Intent m3940a(Context context, int i, boolean z, @Nullable Bundle bundle) {
        context = new Intent(context, PlatformAlarmReceiver.class).putExtra("EXTRA_JOB_ID", i).putExtra("EXTRA_JOB_EXACT", z);
        if (bundle != null) {
            context.putExtra("EXTRA_TRANSIENT_EXTRAS", bundle);
        }
        return context;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null && intent.hasExtra("EXTRA_JOB_ID") && intent.hasExtra("EXTRA_JOB_EXACT")) {
            int intExtra = intent.getIntExtra("EXTRA_JOB_ID", -1);
            Bundle bundleExtra = intent.getBundleExtra("EXTRA_TRANSIENT_EXTRAS");
            if (intent.getBooleanExtra("EXTRA_JOB_EXACT", false) != null) {
                C1127a.m3701a(context, PlatformAlarmServiceExact.m3941a(context, intExtra, bundleExtra));
            } else {
                PlatformAlarmService.m12126a(context, intExtra, bundleExtra);
            }
        }
    }
}
