package com.tinder.data.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import org.joda.time.DateTime;
import org.joda.time.format.C19316b;
import org.joda.time.format.C19322g;
import p000a.p001a.C0001a;

/* renamed from: com.tinder.data.adapter.l */
public class C10738l extends C2646o<DateTime, String> {
    @VisibleForTesting
    /* renamed from: a */
    static final C19316b f35131a = C19322g.e();

    @NonNull
    /* renamed from: a */
    public DateTime m43129a(@NonNull String str) {
        try {
            return f35131a.d(str);
        } catch (Exception e) {
            m43130a(str, e);
            return DateTime.a();
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    void m43130a(String str, Exception exception) {
        C0001a.c(exception, "Error parsing date=%s", new Object[]{str});
    }
}
