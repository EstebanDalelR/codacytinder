package com.evernote.android.job.v21;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.evernote.android.job.JobRequest;
import com.evernote.android.job.util.C3142c;
import com.evernote.android.job.v14.PlatformAlarmServiceExact;
import java.util.concurrent.TimeUnit;

@TargetApi(21)
/* renamed from: com.evernote.android.job.v21.b */
final class C1156b {
    /* renamed from: a */
    private static final C3142c f3049a = new C3142c("TransientBundleCompat");

    /* renamed from: a */
    public static void m3948a(@NonNull Context context, @NonNull JobRequest jobRequest) {
        long currentTimeMillis = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(1000);
        ((AlarmManager) context.getSystemService("alarm")).setExact(1, currentTimeMillis, PendingIntent.getService(context, jobRequest.m3765c(), PlatformAlarmServiceExact.m3941a(context, jobRequest.m3765c(), jobRequest.m3755C()), 134217728));
    }

    /* renamed from: b */
    public static boolean m3950b(@NonNull Context context, @NonNull JobRequest jobRequest) {
        PendingIntent service = PendingIntent.getService(context, jobRequest.m3765c(), PlatformAlarmServiceExact.m3941a(context, jobRequest.m3765c(), null), 536870912);
        if (service == null) {
            return false;
        }
        try {
            f3049a.m12116a("Delegating transient job %s to API 14", jobRequest);
            service.send();
            if (!jobRequest.m3771i()) {
                C1156b.m3947a(context, jobRequest.m3765c(), service);
            }
            return true;
        } catch (Throwable e) {
            f3049a.m12117a(e);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m3949a(Context context, int i) {
        return PendingIntent.getService(context, i, PlatformAlarmServiceExact.m3941a(context, i, null), 536870912) != null ? true : null;
    }

    /* renamed from: a */
    public static void m3947a(@NonNull Context context, int i, @Nullable PendingIntent pendingIntent) {
        if (pendingIntent == null) {
            try {
                pendingIntent = PendingIntent.getService(context, i, PlatformAlarmServiceExact.m3941a(context, i, null), 536870912);
                if (pendingIntent == null) {
                    return;
                }
            } catch (Throwable e) {
                f3049a.m12117a(e);
            }
        }
        ((AlarmManager) context.getSystemService("alarm")).cancel(pendingIntent);
        pendingIntent.cancel();
    }
}
