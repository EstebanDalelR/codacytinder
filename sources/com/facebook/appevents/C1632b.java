package com.facebook.appevents;

import android.content.Context;
import com.facebook.FacebookSdk;
import com.facebook.internal.C1701b;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.facebook.appevents.b */
class C1632b {
    /* renamed from: a */
    private final HashMap<AccessTokenAppIdPair, C1642f> f4519a = new HashMap();

    /* renamed from: a */
    public synchronized void m5551a(PersistedEvents persistedEvents) {
        if (persistedEvents != null) {
            for (AccessTokenAppIdPair accessTokenAppIdPair : persistedEvents.m5540a()) {
                C1642f b = m5547b(accessTokenAppIdPair);
                for (AppEvent a : persistedEvents.m5539a(accessTokenAppIdPair)) {
                    b.m5576a(a);
                }
            }
        }
    }

    /* renamed from: a */
    public synchronized void m5550a(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
        m5547b(accessTokenAppIdPair).m5576a(appEvent);
    }

    /* renamed from: a */
    public synchronized Set<AccessTokenAppIdPair> m5549a() {
        return this.f4519a.keySet();
    }

    /* renamed from: a */
    public synchronized C1642f m5548a(AccessTokenAppIdPair accessTokenAppIdPair) {
        return (C1642f) this.f4519a.get(accessTokenAppIdPair);
    }

    /* renamed from: b */
    public synchronized int m5552b() {
        int i;
        i = 0;
        for (C1642f a : this.f4519a.values()) {
            i += a.m5574a();
        }
        return i;
    }

    /* renamed from: b */
    private synchronized C1642f m5547b(AccessTokenAppIdPair accessTokenAppIdPair) {
        C1642f c1642f;
        c1642f = (C1642f) this.f4519a.get(accessTokenAppIdPair);
        if (c1642f == null) {
            Context e = FacebookSdk.m3994e();
            c1642f = new C1642f(C1701b.m5867a(e), AppEventsLogger.m5521a(e));
        }
        this.f4519a.put(accessTokenAppIdPair, c1642f);
        return c1642f;
    }
}
