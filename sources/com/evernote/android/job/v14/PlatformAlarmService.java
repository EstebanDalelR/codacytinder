package com.evernote.android.job.v14;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.JobIntentService;
import com.evernote.android.job.JobProxy.C1127a;
import com.evernote.android.job.JobRequest;
import com.evernote.android.job.util.C3142c;

public final class PlatformAlarmService extends JobIntentService {
    /* renamed from: j */
    private static final C3142c f9692j = new C3142c("PlatformAlarmService");

    /* renamed from: a */
    public static void m12126a(Context context, int i, @Nullable Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtra("EXTRA_JOB_ID", i);
        if (bundle != null) {
            intent.putExtra("EXTRA_TRANSIENT_EXTRAS", bundle);
        }
        JobIntentService.m1387a(context, PlatformAlarmService.class, 2147480001, intent);
    }

    /* renamed from: a */
    protected void mo1534a(@NonNull Intent intent) {
        m12127a(intent, (Service) this, f9692j);
    }

    /* renamed from: a */
    static void m12127a(@Nullable Intent intent, @NonNull Service service, @NonNull C3142c c3142c) {
        if (intent == null) {
            c3142c.m12115a("Delivered intent is null");
            return;
        }
        int intExtra = intent.getIntExtra("EXTRA_JOB_ID", -1);
        Bundle bundleExtra = intent.getBundleExtra("EXTRA_TRANSIENT_EXTRAS");
        C1127a c1127a = new C1127a(service, c3142c, intExtra);
        JobRequest a = c1127a.m3713a(true, true);
        if (a != null) {
            c1127a.m3712a(a, bundleExtra);
        }
    }
}
