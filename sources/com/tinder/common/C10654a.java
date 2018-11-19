package com.tinder.common;

import android.support.annotation.NonNull;
import p000a.p001a.C0001a.C0000a;

/* renamed from: com.tinder.common.a */
public class C10654a extends C0000a {
    /* renamed from: b */
    private final CrashReporter f34945b;

    /* renamed from: b */
    private boolean m42966b(int i) {
        if (!(i == 5 || i == 6)) {
            if (i != 7) {
                return false;
            }
        }
        return true;
    }

    public C10654a(CrashReporter crashReporter) {
        this.f34945b = crashReporter;
    }

    /* renamed from: a */
    protected void m42968a(int i, String str, String str2, Throwable th) {
        if (!(m42966b(i) == 0 || this.f34945b.isInitialized() == 0)) {
            if (str2 == null) {
                str2 = "No message supplied";
            }
            m42965a(m42964a(str, str2));
            if (th != null) {
                m42967d(th);
            }
        }
    }

    @NonNull
    /* renamed from: a */
    private String m42964a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(": ");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private void m42965a(@NonNull String str) {
        this.f34945b.log(str);
    }

    /* renamed from: d */
    private void m42967d(@NonNull Throwable th) {
        this.f34945b.logException(th);
    }
}
