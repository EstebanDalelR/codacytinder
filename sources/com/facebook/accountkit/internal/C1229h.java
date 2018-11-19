package com.facebook.accountkit.internal;

import android.support.annotation.NonNull;
import android.util.Log;
import com.facebook.accountkit.AccountKit;
import com.facebook.accountkit.LoggingBehavior;

/* renamed from: com.facebook.accountkit.internal.h */
final class C1229h {
    /* renamed from: a */
    private final LoggingBehavior f3292a;
    /* renamed from: b */
    private StringBuilder f3293b = new StringBuilder();
    /* renamed from: c */
    private final String f3294c;

    /* renamed from: a */
    public static void m4343a(LoggingBehavior loggingBehavior, String str, String str2, Object... objArr) {
        C1229h.m4342a(loggingBehavior, (int) 3, str, String.format(str2, objArr));
    }

    /* renamed from: a */
    private static void m4342a(LoggingBehavior loggingBehavior, int i, String str, String str2) {
        if (AccountKit.m4109a().m4130a(loggingBehavior)) {
            if (!str.startsWith("AccountKitSDK.")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("AccountKitSDK.");
                stringBuilder.append(str);
                str = stringBuilder.toString();
            }
            Log.println(i, str, str2);
            if (loggingBehavior == LoggingBehavior.DEVELOPER_ERRORS) {
                new Exception().printStackTrace();
            }
        }
    }

    C1229h(LoggingBehavior loggingBehavior, @NonNull String str) {
        this.f3292a = loggingBehavior;
        loggingBehavior = new StringBuilder();
        loggingBehavior.append("AccountKitSDK.");
        loggingBehavior.append(str);
        this.f3294c = loggingBehavior.toString();
    }

    /* renamed from: a */
    public void m4346a() {
        C1229h.m4342a(this.f3292a, 3, this.f3294c, this.f3293b.toString());
        this.f3293b = new StringBuilder();
    }

    /* renamed from: a */
    void m4347a(String str) {
        if (m4345b()) {
            StringBuilder stringBuilder = this.f3293b;
            stringBuilder.append(str);
            stringBuilder.append("\n");
        }
    }

    /* renamed from: a */
    private void m4344a(String str, Object... objArr) {
        if (m4345b()) {
            this.f3293b.append(String.format(str, objArr));
        }
    }

    /* renamed from: a */
    void m4348a(String str, Object obj) {
        m4344a("  %s:\t%s\n", str, obj);
    }

    /* renamed from: b */
    private boolean m4345b() {
        return AccountKit.m4109a().m4130a(this.f3292a);
    }
}
