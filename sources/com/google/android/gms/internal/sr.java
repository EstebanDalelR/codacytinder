package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.LinkedList;

public abstract class sr implements zzcr {
    /* renamed from: a */
    protected MotionEvent f23441a;
    /* renamed from: b */
    protected LinkedList<MotionEvent> f23442b = new LinkedList();
    /* renamed from: c */
    protected long f23443c = 0;
    /* renamed from: d */
    protected long f23444d = 0;
    /* renamed from: e */
    protected long f23445e = 0;
    /* renamed from: f */
    protected long f23446f = 0;
    /* renamed from: g */
    protected long f23447g = 0;
    /* renamed from: h */
    protected long f23448h = 0;
    /* renamed from: i */
    protected long f23449i = 0;
    /* renamed from: j */
    protected double f23450j;
    /* renamed from: k */
    protected float f23451k;
    /* renamed from: l */
    protected float f23452l;
    /* renamed from: m */
    protected float f23453m;
    /* renamed from: n */
    protected float f23454n;
    /* renamed from: o */
    protected boolean f23455o = false;
    /* renamed from: p */
    protected DisplayMetrics f23456p;
    /* renamed from: q */
    private double f23457q;
    /* renamed from: r */
    private double f23458r;
    /* renamed from: s */
    private boolean f23459s = false;

    protected sr(android.content.Context r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r2.<init>();
        r0 = new java.util.LinkedList;
        r0.<init>();
        r2.f23442b = r0;
        r0 = 0;
        r2.f23443c = r0;
        r2.f23444d = r0;
        r2.f23445e = r0;
        r2.f23446f = r0;
        r2.f23447g = r0;
        r2.f23448h = r0;
        r2.f23449i = r0;
        r0 = 0;
        r2.f23459s = r0;
        r2.f23455o = r0;
        r0 = com.google.android.gms.internal.alo.by;	 Catch:{ Throwable -> 0x0042 }
        r1 = com.google.android.gms.internal.aja.m19221f();	 Catch:{ Throwable -> 0x0042 }
        r0 = r1.m19334a(r0);	 Catch:{ Throwable -> 0x0042 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ Throwable -> 0x0042 }
        r0 = r0.booleanValue();	 Catch:{ Throwable -> 0x0042 }
        if (r0 == 0) goto L_0x0035;	 Catch:{ Throwable -> 0x0042 }
    L_0x0031:
        com.google.android.gms.internal.pp.m20142a();	 Catch:{ Throwable -> 0x0042 }
        goto L_0x0038;	 Catch:{ Throwable -> 0x0042 }
    L_0x0035:
        com.google.android.gms.internal.ps.m20147a();	 Catch:{ Throwable -> 0x0042 }
    L_0x0038:
        r3 = r3.getResources();	 Catch:{ Throwable -> 0x0042 }
        r3 = r3.getDisplayMetrics();	 Catch:{ Throwable -> 0x0042 }
        r2.f23456p = r3;	 Catch:{ Throwable -> 0x0042 }
    L_0x0042:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.sr.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    private final java.lang.String m27463a(android.content.Context r1, java.lang.String r2, boolean r3, android.view.View r4, android.app.Activity r5, byte[] r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = this;
        if (r3 == 0) goto L_0x000a;
    L_0x0002:
        r1 = r0.mo6905a(r1, r4, r5);	 Catch:{ GeneralSecurityException -> 0x0025, GeneralSecurityException -> 0x0025, Throwable -> 0x0023 }
        r3 = 1;	 Catch:{ GeneralSecurityException -> 0x0025, GeneralSecurityException -> 0x0025, Throwable -> 0x0023 }
        r0.f23459s = r3;	 Catch:{ GeneralSecurityException -> 0x0025, GeneralSecurityException -> 0x0025, Throwable -> 0x0023 }
        goto L_0x000f;	 Catch:{ GeneralSecurityException -> 0x0025, GeneralSecurityException -> 0x0025, Throwable -> 0x0023 }
    L_0x000a:
        r3 = 0;	 Catch:{ GeneralSecurityException -> 0x0025, GeneralSecurityException -> 0x0025, Throwable -> 0x0023 }
        r1 = r0.mo6906a(r1, r3);	 Catch:{ GeneralSecurityException -> 0x0025, GeneralSecurityException -> 0x0025, Throwable -> 0x0023 }
    L_0x000f:
        if (r1 == 0) goto L_0x001d;	 Catch:{ GeneralSecurityException -> 0x0025, GeneralSecurityException -> 0x0025, Throwable -> 0x0023 }
    L_0x0011:
        r3 = r1.m19064f();	 Catch:{ GeneralSecurityException -> 0x0025, GeneralSecurityException -> 0x0025, Throwable -> 0x0023 }
        if (r3 != 0) goto L_0x0018;	 Catch:{ GeneralSecurityException -> 0x0025, GeneralSecurityException -> 0x0025, Throwable -> 0x0023 }
    L_0x0017:
        goto L_0x001d;	 Catch:{ GeneralSecurityException -> 0x0025, GeneralSecurityException -> 0x0025, Throwable -> 0x0023 }
    L_0x0018:
        r1 = com.google.android.gms.internal.pp.m20139a(r1, r2);	 Catch:{ GeneralSecurityException -> 0x0025, GeneralSecurityException -> 0x0025, Throwable -> 0x0023 }
        return r1;	 Catch:{ GeneralSecurityException -> 0x0025, GeneralSecurityException -> 0x0025, Throwable -> 0x0023 }
    L_0x001d:
        r1 = 5;	 Catch:{ GeneralSecurityException -> 0x0025, GeneralSecurityException -> 0x0025, Throwable -> 0x0023 }
        r1 = java.lang.Integer.toString(r1);	 Catch:{ GeneralSecurityException -> 0x0025, GeneralSecurityException -> 0x0025, Throwable -> 0x0023 }
        return r1;
    L_0x0023:
        r1 = 3;
        goto L_0x0026;
    L_0x0025:
        r1 = 7;
    L_0x0026:
        r1 = java.lang.Integer.toString(r1);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.sr.a(android.content.Context, java.lang.String, boolean, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    /* renamed from: a */
    protected abstract long mo6904a(StackTraceElement[] stackTraceElementArr) throws zzdj;

    /* renamed from: a */
    protected abstract nx mo6905a(Context context, View view, Activity activity);

    /* renamed from: a */
    protected abstract nx mo6906a(Context context, na naVar);

    /* renamed from: a */
    protected abstract uk mo6907a(MotionEvent motionEvent) throws zzdj;

    public final String zza(Context context) {
        if (vk.m20256b()) {
            if (((Boolean) aja.m19221f().m19334a(alo.bA)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return m27463a(context, null, false, null, null, null);
    }

    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, null);
    }

    public final String zza(Context context, String str, View view, Activity activity) {
        return m27463a(context, str, true, view, activity, null);
    }

    public final void zza(int i, int i2, int i3) {
        MotionEvent obtain;
        if (this.f23441a != null) {
            r0.f23441a.recycle();
        }
        if (r0.f23456p != null) {
            obtain = MotionEvent.obtain(0, (long) i3, 1, r0.f23456p.density * ((float) i), r0.f23456p.density * ((float) i2), 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            obtain = null;
        }
        r0.f23441a = obtain;
        r0.f23455o = false;
    }

    public final void zza(android.view.MotionEvent r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r12 = this;
        r0 = r12.f23459s;
        r1 = 0;
        if (r0 == 0) goto L_0x0035;
    L_0x0005:
        r2 = 0;
        r12.f23446f = r2;
        r12.f23445e = r2;
        r12.f23444d = r2;
        r12.f23443c = r2;
        r12.f23447g = r2;
        r12.f23449i = r2;
        r12.f23448h = r2;
        r0 = r12.f23442b;
        r0 = r0.iterator();
    L_0x001b:
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x002b;
    L_0x0021:
        r2 = r0.next();
        r2 = (android.view.MotionEvent) r2;
        r2.recycle();
        goto L_0x001b;
    L_0x002b:
        r0 = r12.f23442b;
        r0.clear();
        r0 = 0;
        r12.f23441a = r0;
        r12.f23459s = r1;
    L_0x0035:
        r0 = r13.getAction();
        switch(r0) {
            case 0: goto L_0x0062;
            case 1: goto L_0x003d;
            case 2: goto L_0x003d;
            default: goto L_0x003c;
        };
    L_0x003c:
        goto L_0x0074;
    L_0x003d:
        r0 = r13.getRawX();
        r2 = (double) r0;
        r0 = r13.getRawY();
        r4 = (double) r0;
        r6 = r12.f23457q;
        r6 = r2 - r6;
        r8 = r12.f23458r;
        r8 = r4 - r8;
        r10 = r12.f23450j;
        r6 = r6 * r6;
        r8 = r8 * r8;
        r6 = r6 + r8;
        r6 = java.lang.Math.sqrt(r6);
        r10 = r10 + r6;
        r12.f23450j = r10;
        r12.f23457q = r2;
        r12.f23458r = r4;
        goto L_0x0074;
    L_0x0062:
        r2 = 0;
        r12.f23450j = r2;
        r0 = r13.getRawX();
        r2 = (double) r0;
        r12.f23457q = r2;
        r0 = r13.getRawY();
        r2 = (double) r0;
        r12.f23458r = r2;
    L_0x0074:
        r0 = r13.getAction();
        r2 = 1;
        r4 = 1;
        switch(r0) {
            case 0: goto L_0x011a;
            case 1: goto L_0x00e3;
            case 2: goto L_0x0088;
            case 3: goto L_0x0080;
            default: goto L_0x007e;
        };
    L_0x007e:
        goto L_0x014a;
    L_0x0080:
        r0 = r12.f23446f;
        r5 = r0 + r2;
        r12.f23446f = r5;
        goto L_0x014a;
    L_0x0088:
        r2 = r12.f23444d;
        r0 = r13.getHistorySize();
        r0 = r0 + r4;
        r5 = (long) r0;
        r7 = r2 + r5;
        r12.f23444d = r7;
        r13 = r12.mo6907a(r13);	 Catch:{ zzdj -> 0x014a }
        if (r13 == 0) goto L_0x00a4;	 Catch:{ zzdj -> 0x014a }
    L_0x009a:
        r0 = r13.f23479d;	 Catch:{ zzdj -> 0x014a }
        if (r0 == 0) goto L_0x00a4;	 Catch:{ zzdj -> 0x014a }
    L_0x009e:
        r0 = r13.f23482g;	 Catch:{ zzdj -> 0x014a }
        if (r0 == 0) goto L_0x00a4;	 Catch:{ zzdj -> 0x014a }
    L_0x00a2:
        r0 = 1;	 Catch:{ zzdj -> 0x014a }
        goto L_0x00a5;	 Catch:{ zzdj -> 0x014a }
    L_0x00a4:
        r0 = 0;	 Catch:{ zzdj -> 0x014a }
    L_0x00a5:
        if (r0 == 0) goto L_0x00bc;	 Catch:{ zzdj -> 0x014a }
    L_0x00a7:
        r2 = r12.f23448h;	 Catch:{ zzdj -> 0x014a }
        r0 = r13.f23479d;	 Catch:{ zzdj -> 0x014a }
        r5 = r0.longValue();	 Catch:{ zzdj -> 0x014a }
        r0 = r13.f23482g;	 Catch:{ zzdj -> 0x014a }
        r7 = r0.longValue();	 Catch:{ zzdj -> 0x014a }
        r0 = 0;	 Catch:{ zzdj -> 0x014a }
        r9 = r5 + r7;	 Catch:{ zzdj -> 0x014a }
        r5 = r2 + r9;	 Catch:{ zzdj -> 0x014a }
        r12.f23448h = r5;	 Catch:{ zzdj -> 0x014a }
    L_0x00bc:
        r0 = r12.f23456p;	 Catch:{ zzdj -> 0x014a }
        if (r0 == 0) goto L_0x00cb;	 Catch:{ zzdj -> 0x014a }
    L_0x00c0:
        if (r13 == 0) goto L_0x00cb;	 Catch:{ zzdj -> 0x014a }
    L_0x00c2:
        r0 = r13.f23480e;	 Catch:{ zzdj -> 0x014a }
        if (r0 == 0) goto L_0x00cb;	 Catch:{ zzdj -> 0x014a }
    L_0x00c6:
        r0 = r13.f23483h;	 Catch:{ zzdj -> 0x014a }
        if (r0 == 0) goto L_0x00cb;	 Catch:{ zzdj -> 0x014a }
    L_0x00ca:
        r1 = 1;	 Catch:{ zzdj -> 0x014a }
    L_0x00cb:
        if (r1 == 0) goto L_0x014a;	 Catch:{ zzdj -> 0x014a }
    L_0x00cd:
        r0 = r12.f23449i;	 Catch:{ zzdj -> 0x014a }
        r2 = r13.f23480e;	 Catch:{ zzdj -> 0x014a }
        r2 = r2.longValue();	 Catch:{ zzdj -> 0x014a }
        r13 = r13.f23483h;	 Catch:{ zzdj -> 0x014a }
        r5 = r13.longValue();	 Catch:{ zzdj -> 0x014a }
        r13 = 0;	 Catch:{ zzdj -> 0x014a }
        r7 = r2 + r5;	 Catch:{ zzdj -> 0x014a }
        r2 = r0 + r7;	 Catch:{ zzdj -> 0x014a }
        r12.f23449i = r2;	 Catch:{ zzdj -> 0x014a }
        goto L_0x014a;
    L_0x00e3:
        r13 = android.view.MotionEvent.obtain(r13);
        r12.f23441a = r13;
        r13 = r12.f23442b;
        r0 = r12.f23441a;
        r13.add(r0);
        r13 = r12.f23442b;
        r13 = r13.size();
        r0 = 6;
        if (r13 <= r0) goto L_0x0104;
    L_0x00f9:
        r13 = r12.f23442b;
        r13 = r13.remove();
        r13 = (android.view.MotionEvent) r13;
        r13.recycle();
    L_0x0104:
        r0 = r12.f23445e;
        r5 = r0 + r2;
        r12.f23445e = r5;
        r13 = new java.lang.Throwable;	 Catch:{ zzdj -> 0x014a }
        r13.<init>();	 Catch:{ zzdj -> 0x014a }
        r13 = r13.getStackTrace();	 Catch:{ zzdj -> 0x014a }
        r0 = r12.mo6904a(r13);	 Catch:{ zzdj -> 0x014a }
        r12.f23447g = r0;	 Catch:{ zzdj -> 0x014a }
        goto L_0x014a;
    L_0x011a:
        r0 = com.google.android.gms.internal.alo.bv;
        r1 = com.google.android.gms.internal.aja.m19221f();
        r0 = r1.m19334a(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0144;
    L_0x012c:
        r0 = r13.getX();
        r12.f23451k = r0;
        r0 = r13.getY();
        r12.f23452l = r0;
        r0 = r13.getRawX();
        r12.f23453m = r0;
        r13 = r13.getRawY();
        r12.f23454n = r13;
    L_0x0144:
        r0 = r12.f23443c;
        r5 = r0 + r2;
        r12.f23443c = r5;
    L_0x014a:
        r12.f23455o = r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.sr.zza(android.view.MotionEvent):void");
    }

    public void zzb(View view) {
    }
}
