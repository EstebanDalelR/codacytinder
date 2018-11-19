package net.danlew.android.joda;

import android.content.Context;
import android.content.IntentFilter;
import org.joda.time.DateTimeZone;

/* renamed from: net.danlew.android.joda.b */
public final class C2669b {
    /* renamed from: a */
    private static boolean f8453a = false;

    /* renamed from: a */
    public static void m10312a(Context context) {
        if (!f8453a) {
            f8453a = true;
            try {
                DateTimeZone.m10329a(new C17639e(context));
                context.getApplicationContext().registerReceiver(new TimeZoneChangedReceiver(), new IntentFilter("android.intent.action.TIMEZONE_CHANGED"));
            } catch (Context context2) {
                throw new RuntimeException("Could not read ZoneInfoMap. You are probably using Proguard wrong.", context2);
            }
        }
    }
}
