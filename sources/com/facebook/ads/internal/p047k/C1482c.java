package com.facebook.ads.internal.p047k;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.internal.k.c */
public class C1482c {
    /* renamed from: a */
    private static final List<C1481b> f4109a = new ArrayList();

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static java.lang.String m5217a() {
        /*
        r0 = f4109a;
        monitor-enter(r0);
        r1 = f4109a;	 Catch:{ all -> 0x003e }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x003e }
        if (r1 == 0) goto L_0x000f;
    L_0x000b:
        r1 = "";
        monitor-exit(r0);	 Catch:{ all -> 0x003e }
        return r1;
    L_0x000f:
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x003e }
        r2 = f4109a;	 Catch:{ all -> 0x003e }
        r1.<init>(r2);	 Catch:{ all -> 0x003e }
        r2 = f4109a;	 Catch:{ all -> 0x003e }
        r2.clear();	 Catch:{ all -> 0x003e }
        monitor-exit(r0);	 Catch:{ all -> 0x003e }
        r0 = new org.json.JSONArray;
        r0.<init>();
        r1 = r1.iterator();
    L_0x0025:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x0039;
    L_0x002b:
        r2 = r1.next();
        r2 = (com.facebook.ads.internal.p047k.C1481b) r2;
        r2 = r2.m5216a();
        r0.put(r2);
        goto L_0x0025;
    L_0x0039:
        r0 = r0.toString();
        return r0;
    L_0x003e:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x003e }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.k.c.a():java.lang.String");
    }

    /* renamed from: a */
    public static void m5218a(C1481b c1481b) {
        synchronized (f4109a) {
            f4109a.add(c1481b);
        }
    }
}
