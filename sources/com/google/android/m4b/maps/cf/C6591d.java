package com.google.android.m4b.maps.cf;

import com.google.android.m4b.maps.aa.bo;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.m4b.maps.cf.d */
public final class C6591d implements C5102c {
    /* renamed from: c */
    private static boolean f24723c = false;
    /* renamed from: a */
    private int f24724a;
    /* renamed from: b */
    private int f24725b;

    /* renamed from: a */
    public final void mo5292a(C5101b c5101b, C5124w c5124w) {
        C5571j.m24293a((Object) c5101b, (Object) c5124w);
        Object obj = null;
        switch (c5124w.f19031a) {
            case NEXT_FRAME:
                synchronized (obj) {
                    obj.add(c5101b);
                }
                return;
            case BEHAVIOR_RUN:
                synchronized (obj) {
                    C6597x c6597x = (C6597x) c5124w;
                    if (obj.containsKey(obj) != null) {
                        ((Set) obj.get(obj)).add(c5101b);
                    } else {
                        obj.put(obj, bo.m20653a(c5101b));
                    }
                }
                return;
            default:
                throw new IllegalArgumentException("Unimplemented WakeUpCondition");
        }
    }

    /* renamed from: a */
    final void m29458a(C5101b c5101b) {
        f24723c = true;
        try {
            c5101b.mo5289a(this);
        } finally {
            f24723c = false;
        }
    }

    /* renamed from: b */
    final void m29460b(C5101b c5101b) {
        f24723c = true;
        Map map = null;
        try {
            synchronized (map) {
                map.remove(c5101b);
            }
            synchronized (map) {
                map.remove(c5101b);
                for (C5101b c5101b2 : map.keySet()) {
                    ((Set) map.get(c5101b2)).remove(c5101b);
                }
            }
            f24723c = false;
        } catch (Throwable th) {
            f24723c = false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    final void m29457a() {
        /*
        r9 = this;
        r0 = 0;
        monitor-enter(r0);
        r1 = r9.f24724a;	 Catch:{ all -> 0x00fe }
        r9.f24725b = r1;	 Catch:{ all -> 0x00fe }
        r1 = r9.f24724a;	 Catch:{ all -> 0x00fe }
        r2 = 1;
        r1 = r1 + r2;
        r1 = r1 % 2;
        r9.f24724a = r1;	 Catch:{ all -> 0x00fe }
        r0.clear();	 Catch:{ all -> 0x00fe }
        monitor-exit(r0);	 Catch:{ all -> 0x00fe }
        r1 = com.google.android.m4b.maps.aa.au.m20530b(r0);
        r3 = r0.iterator();
    L_0x001a:
        r4 = r3.hasNext();
        r5 = 0;
        if (r4 == 0) goto L_0x002f;
    L_0x0021:
        r4 = r3.next();
        r4 = (com.google.android.m4b.maps.cf.C5101b) r4;
        r5 = java.lang.Integer.valueOf(r5);
        r0.put(r4, r5);
        goto L_0x001a;
    L_0x002f:
        r3 = r1.isEmpty();
        if (r3 != 0) goto L_0x0085;
    L_0x0035:
        r3 = r1.pop();
        r3 = (com.google.android.m4b.maps.cf.C5101b) r3;
        r4 = r0.get(r3);
        r4 = (java.lang.Integer) r4;
        r4 = r4.intValue();
        monitor-enter(r0);
        r3 = r0.remove(r3);	 Catch:{ all -> 0x0082 }
        r3 = (java.util.Set) r3;	 Catch:{ all -> 0x0082 }
        monitor-exit(r0);	 Catch:{ all -> 0x0082 }
        if (r3 == 0) goto L_0x002f;
    L_0x004f:
        r3 = r3.iterator();
    L_0x0053:
        r6 = r3.hasNext();
        if (r6 == 0) goto L_0x002f;
    L_0x0059:
        r6 = r3.next();
        r6 = (com.google.android.m4b.maps.cf.C5101b) r6;
        r7 = r4 + 1;
        r8 = r0.containsKey(r6);
        if (r8 == 0) goto L_0x0072;
    L_0x0067:
        r8 = r0.get(r6);
        r8 = (java.lang.Integer) r8;
        r8 = r8.intValue();
        goto L_0x0073;
    L_0x0072:
        r8 = r7;
    L_0x0073:
        if (r8 >= r7) goto L_0x0076;
    L_0x0075:
        goto L_0x0077;
    L_0x0076:
        r7 = r8;
    L_0x0077:
        r7 = java.lang.Integer.valueOf(r7);
        r0.put(r6, r7);
        r1.push(r6);
        goto L_0x0053;
    L_0x0082:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0082 }
        throw r1;
    L_0x0085:
        r1 = r0.keySet();
        r1 = r1.iterator();
    L_0x008d:
        r3 = r1.hasNext();
        if (r3 == 0) goto L_0x009d;
    L_0x0093:
        r3 = r1.next();
        r3 = (com.google.android.m4b.maps.cf.C5101b) r3;
        r0.add(r3);
        goto L_0x008d;
    L_0x009d:
        r1 = r0.isEmpty();
        if (r1 == 0) goto L_0x00a5;
    L_0x00a3:
        r1 = 0;
        goto L_0x00b3;
    L_0x00a5:
        r1 = r0.peek();
        r1 = r0.get(r1);
        r1 = (java.lang.Integer) r1;
        r1 = r1.intValue();
    L_0x00b3:
        r3 = r0.isEmpty();
        if (r3 != 0) goto L_0x00fa;
    L_0x00b9:
        r3 = r0.poll();
        r3 = (com.google.android.m4b.maps.cf.C5101b) r3;
        r0.add(r3);
        r3 = r0.peek();
        r3 = (com.google.android.m4b.maps.cf.C5101b) r3;
        if (r3 == 0) goto L_0x00da;
    L_0x00ca:
        r3 = r0.get(r3);
        r3 = (java.lang.Integer) r3;
        r3 = r3.intValue();
        if (r3 == r1) goto L_0x00d8;
    L_0x00d6:
        r1 = r3;
        goto L_0x00da;
    L_0x00d8:
        r1 = r3;
        goto L_0x00b9;
    L_0x00da:
        f24723c = r2;
        r3 = r0.iterator();	 Catch:{ all -> 0x00f6 }
    L_0x00e0:
        r4 = r3.hasNext();	 Catch:{ all -> 0x00f6 }
        if (r4 == 0) goto L_0x00f0;
    L_0x00e6:
        r4 = r3.next();	 Catch:{ all -> 0x00f6 }
        r4 = (com.google.android.m4b.maps.cf.C5101b) r4;	 Catch:{ all -> 0x00f6 }
        r4.mo5290b(r9);	 Catch:{ all -> 0x00f6 }
        goto L_0x00e0;
    L_0x00f0:
        f24723c = r5;
        r0.clear();
        goto L_0x00b3;
    L_0x00f6:
        r0 = move-exception;
        f24723c = r5;
        throw r0;
    L_0x00fa:
        r0.clear();
        return;
    L_0x00fe:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00fe }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cf.d.a():void");
    }

    /* renamed from: b */
    static void m29456b() {
        if (!f24723c) {
            throw new RuntimeException("Attempt to update live data from outside a Behavior");
        }
    }
}
