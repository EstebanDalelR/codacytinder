package com.evernote.android.job.util;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: com.evernote.android.job.util.e */
public final class C1150e {
    /* renamed from: a */
    private static final ThreadLocal<SimpleDateFormat> f3019a = new ThreadLocal();
    /* renamed from: b */
    private static final long f3020b = TimeUnit.DAYS.toMillis(1);
    /* renamed from: c */
    private static final C3142c f3021c = new C3142c("JobUtil");

    /* renamed from: a */
    public static String m3891a(long j) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) f3019a.get();
        if (simpleDateFormat == null) {
            simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.US);
            f3019a.set(simpleDateFormat);
        }
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String format = simpleDateFormat.format(new Date(j));
        j /= f3020b;
        if (j == 1) {
            j = new StringBuilder();
            j.append(format);
            j.append(" (+1 day)");
            return j.toString();
        } else if (j <= 1) {
            return format;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(format);
            stringBuilder.append(" (+");
            stringBuilder.append(j);
            stringBuilder.append(" days)");
            return stringBuilder.toString();
        }
    }

    /* renamed from: a */
    public static boolean m3892a(Context context) {
        return C1150e.m3893a(context, "android.permission.RECEIVE_BOOT_COMPLETED", 0);
    }

    /* renamed from: b */
    public static boolean m3894b(Context context) {
        return C1150e.m3893a(context, "android.permission.WAKE_LOCK", 0);
    }

    /* renamed from: a */
    private static boolean m3893a(Context context, String str, int i) {
        boolean z = false;
        try {
            if (context.getPackageManager().checkPermission(str, context.getPackageName()) == 0) {
                z = true;
            }
            return z;
        } catch (Throwable e) {
            f3021c.m12117a(e);
            if (i < 1 && C1150e.m3893a(context.getApplicationContext(), str, i + 1) != null) {
                z = true;
            }
            return z;
        }
    }
}
