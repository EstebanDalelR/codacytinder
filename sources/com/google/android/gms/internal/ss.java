package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.VisibleForTesting;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class ss extends sr {
    /* renamed from: r */
    private static Object f27057r = new Object();
    /* renamed from: s */
    private static final String f27058s = "ss";
    /* renamed from: t */
    private static volatile ub f27059t = null;
    @VisibleForTesting
    /* renamed from: u */
    private static boolean f27060u = false;
    /* renamed from: v */
    private static long f27061v;
    /* renamed from: q */
    protected boolean f27062q = false;
    /* renamed from: w */
    private String f27063w;
    /* renamed from: x */
    private boolean f27064x = false;
    /* renamed from: y */
    private boolean f27065y = false;
    @VisibleForTesting
    /* renamed from: z */
    private xi f27066z;

    protected ss(Context context, String str, boolean z) {
        super(context);
        this.f27063w = str;
        this.f27062q = z;
    }

    /* renamed from: a */
    private static uk m31654a(ub ubVar, MotionEvent motionEvent, DisplayMetrics displayMetrics) throws zzdj {
        Method a = ubVar.m20205a("Qplw2pUqnSpmThNy4cjVdvqrjxx/9Z0jyK1w8BPQVMfA35eh0MC7cXEA3u5Xkcuj", "JqjJogq0azQ/rErdMQn/B0NsEhrIRbxY2b3jvD0/vE8=");
        if (a != null) {
            if (motionEvent != null) {
                try {
                    return new uk((String) a.invoke(null, new Object[]{motionEvent, displayMetrics}));
                } catch (Throwable e) {
                    throw new zzdj(e);
                }
            }
        }
        throw new zzdj();
    }

    /* renamed from: a */
    protected static synchronized void m31655a(Context context, boolean z) {
        synchronized (ss.class) {
            if (!f27060u) {
                f27061v = vk.m20252a().longValue() / 1000;
                f27059t = m31657b(context, z);
                f27060u = true;
            }
        }
    }

    /* renamed from: a */
    private static void m31656a(List<Callable<Void>> list) {
        if (f27059t != null) {
            ExecutorService c = f27059t.m20210c();
            if (!(c == null || list.isEmpty())) {
                try {
                    c.invokeAll(list, ((Long) aja.m19221f().m19334a(alo.bp)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable e) {
                    Log.d(f27058s, String.format("class methods got exception: %s", new Object[]{vk.m20254a(e)}));
                }
            }
        }
    }

    /* renamed from: b */
    private static ub m31657b(Context context, boolean z) {
        if (f27059t == null) {
            synchronized (f27057r) {
                if (f27059t == null) {
                    ub a = ub.m20193a(context, "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", z);
                    if (a.m20209b()) {
                        a.m20207a("VywbbfxE2QuRqZ5xcIwapO7AdSzfVaSWnmJxmUg+0adJ3QBAH5P7EgXr1uzyY+u6", "JgKAyQW0PWqOrZHk4ZNT0IJH02FdSWTXOOjBnF9RRok=", Context.class);
                        a.m20207a("yzGxsS8IwfgINPYaD3TFRjRVH+0Pq4QvVGq15MBf/opCBPnlCr4QHvEcReKXEMs7", "kMEgIGkHy2R1ROJUgud//6gDu/wM35rLhA6gUKrjKq0=", Context.class);
                        a.m20207a("notQcG55r2oh2A1cS/dLfKg9hawk3H86BF0iXzU7AAnhYpfHWl9mq3lZzdkAltxm", "U9ntf5BvZUTabci6TosC4bQNHZ+DOrzvRmpSy4CzkoQ=", Context.class);
                        a.m20207a("2GI4cQuNT2V9TGPC/Z2McvgqRAU80qquJKbm0BMTxLR8WwMEgJwPEKdGCxKNxeUN", "1Kj5K8xXQ2YA9zbG2Rm9FzZtUD9R2drVmZXzLVF7uLA=", Context.class);
                        a.m20207a("ZsnUMRH5gS7aUE0TqnSYS8JWwJCKCL7bH7XFSqbI4dWEEyg2o14AuyyBvtsnwc4D", "SFchXCfZXuuDAwXfTJDosXRUHrZZ0v26SJChYX3rL/o=", Context.class);
                        a.m20207a("lMH30ZU/uP5xaOsdIj/K3/wZfVr7hnOzUHjpO1NWhTJQvW+gY38/OvCWA8Ap4ZOf", "FCjXGcebz7gnog9LMAWyd/isayIV3I84uK1cUtHZ2fI=", Context.class);
                        a.m20207a("oWVj3eW9lsJMixyFq7g0kyuRqYP087mdDp4dCL3paE/7Ut3Ewp3IcEq6P10MPRyy", "siNRngHYHRLjixmg2PEX5OdKhRHe1h8DNRpJp4wC0pk=", Context.class);
                        a.m20207a("yATd8qneW4MlwQIx8jIN6cfiWJ28/zOw6vW7xs0IWvNvim2a85v5X4ZiVD1KK9hX", "0wjmexcQnona3bxO7Nd7FrKMEEoBhOp7s6KivBhMQKU=", Context.class);
                        a.m20207a("Qplw2pUqnSpmThNy4cjVdvqrjxx/9Z0jyK1w8BPQVMfA35eh0MC7cXEA3u5Xkcuj", "JqjJogq0azQ/rErdMQn/B0NsEhrIRbxY2b3jvD0/vE8=", MotionEvent.class, DisplayMetrics.class);
                        a.m20207a("I8ATAvvv3zdNeDvmT5gQ/ekfiNEF+bBdZZ3FGipPSiGHOLI4yQdK3XpX6xFRuejz", "SRWP8PeqaQflId3WUP9WJTho9Un3bF1tLB8c7UP1Ruo=", MotionEvent.class, DisplayMetrics.class, Integer.TYPE);
                        a.m20207a("HYkEKMk8dvMdQrlbFR00sh73U7jSOxxrrxd0BhHmEXYlIfEqe1EzBQsw2kucbDs8", "puD1TaAJX/qcP/8PMgKROAswM+eaSDu4sTUEXpqs2fU=", new Class[0]);
                        a.m20207a("8Hx2xRqW2QZDPiXj7EKgQgzecg5taNOrZe4YkZ9zi7FcQAOy1BO0rYbAdBI9x6Pm", "nJw4XP5tQfSQ6wm+0x6UMq5j2kNiUh+TXa92gyyhaOo=", new Class[0]);
                        a.m20207a("4w5pMN4cUsuXvD3CJ7PKPSwMmWPClIaNSjeM6jtHahV40Q7EiLps1VIbOcEaCSp4", "5XuSFVTSxDkE27CIZHrBIXal5K53Dv1J/UFXKGBFAXY=", new Class[0]);
                        a.m20207a("igTfSDGbP3Q2KSYfnqAL0vFW/zSSX6v+f+5s7NdwuKQgo6M7dQVerLATgNETrLAr", "Wz4eX479PrQ8rGu0gkJoEYqOJ2Dr8sAHE85KoBBz7s4=", new Class[0]);
                        a.m20207a("BiRNVQ0aQHyQJTXKNLbpSFJJy6+rG5ICwTiWxRhS6qdZjM6S9BBOaVfdO1b0Kd8E", "z9Ycw/7CJTzBzg6MPXNZ2oLMXcxWzT8qsF0ig0ITUxc=", new Class[0]);
                        a.m20207a("2glehmg5UKxyaNPdnG06BLa5QbEzBADKVm3lYiT3+JTkguRZEzOA9BDahqC4W8ki", "wM87KVhGHShMaqkZWTxt04VnU6kJHrMxqQyksEW6glI=", new Class[0]);
                        a.m20207a("DGPkHpN6F5DQjFiQDfOpLUfwAMooIPhSFT4YA2aSEj+k+u5Kt4pQoimNrK0aCsHP", "V/2NrZQU5cdFMpqYa0Q9vKRizJ0aHS7vWXQS8vp0qlI=", Context.class, Boolean.TYPE);
                        a.m20207a("hoZ4RlhPWT5MX/I+m/lUD5aYJ9aPmEb2eUGLaeSBLBDs9eDpXoNNJPm6j1dXVkvA", "Z7StFiuQ59x4y88apmlBJn3lPoWOEnuqoEhP2AVUL8A=", StackTraceElement[].class);
                        a.m20207a("peD/v7hHRn46N2uI0dQKpTtMr7rKDQ+Rzb4yluPWMw4TUUwj2SFV9GkdTp0kog66", "XxfDY0AzBkt4iSC5Sim2fww10jQc1evowDldz5+caY4=", View.class, DisplayMetrics.class);
                        a.m20207a("cINMMi7uKicDN2DHSf1rHdgax7DU+CM2mIG3cRQw3SI0nkdhPwdVz1PCbewJpJoO", "VWQmr3p+wsDJ15H20t2tLb975qLEArv8gtHgpBQKEOE=", Context.class, Boolean.TYPE);
                        a.m20207a("6qQh+8GAMu6fM86JkRzoeHiiHD67+MgHO4xhhwcbyPT7CQmAN57q8YytJQRqDjU5", "Qrc1hPZgr+QjlmQtpbdJO1QCxqr2PdTRKIIDeDNdHp8=", View.class, Activity.class);
                        a.m20207a("HBbZPURZUWU/TDYIx99LmOTdgpFP2mdidp6Zk4sZdEVCGaQNYtmNlQBCP3rgXOne", "pdXBsPFh4N2rQp3r0gjTSQiWtas1GOGaKulNSciQTj0=", Long.TYPE);
                    }
                    f27059t = a;
                }
            }
        }
        return f27059t;
    }

    /* renamed from: a */
    protected final long mo6904a(StackTraceElement[] stackTraceElementArr) throws zzdj {
        Method a = f27059t.m20205a("hoZ4RlhPWT5MX/I+m/lUD5aYJ9aPmEb2eUGLaeSBLBDs9eDpXoNNJPm6j1dXVkvA", "Z7StFiuQ59x4y88apmlBJn3lPoWOEnuqoEhP2AVUL8A=");
        if (a != null) {
            if (stackTraceElementArr != null) {
                try {
                    return new tz((String) a.invoke(null, new Object[]{stackTraceElementArr})).f23471a.longValue();
                } catch (Throwable e) {
                    throw new zzdj(e);
                }
            }
        }
        throw new zzdj();
    }

    /* renamed from: a */
    protected final com.google.android.gms.internal.nx mo6905a(android.content.Context r16, android.view.View r17, android.app.Activity r18) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r15 = this;
        r0 = r15;
        r10 = new com.google.android.gms.internal.nx;
        r10.<init>();
        r1 = r0.f27063w;
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 != 0) goto L_0x0012;
    L_0x000e:
        r1 = r0.f27063w;
        r10.f26976b = r1;
    L_0x0012:
        r1 = r0.f27062q;
        r2 = r16;
        r11 = m31657b(r2, r1);
        r1 = r11.m20209b();
        r2 = 0;
        r3 = 1;
        if (r1 != 0) goto L_0x003a;
    L_0x0022:
        r4 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
        r1 = java.lang.Long.valueOf(r4);
        r10.f26985k = r1;
        r1 = new java.util.concurrent.Callable[r3];
        r3 = new com.google.android.gms.internal.aae;
        r3.<init>(r11, r10);
        r1[r2] = r3;
        r1 = java.util.Arrays.asList(r1);
        r12 = r1;
        goto L_0x0393;
    L_0x003a:
        r1 = r0.a;	 Catch:{ zzdj -> 0x005a }
        r4 = r0.p;	 Catch:{ zzdj -> 0x005a }
        r1 = m31654a(r11, r1, r4);	 Catch:{ zzdj -> 0x005a }
        r4 = r1.f23476a;	 Catch:{ zzdj -> 0x005a }
        r10.f26981g = r4;	 Catch:{ zzdj -> 0x005a }
        r4 = r1.f23477b;	 Catch:{ zzdj -> 0x005a }
        r10.f26982h = r4;	 Catch:{ zzdj -> 0x005a }
        r4 = r1.f23478c;	 Catch:{ zzdj -> 0x005a }
        r10.f26983i = r4;	 Catch:{ zzdj -> 0x005a }
        r4 = r0.o;	 Catch:{ zzdj -> 0x005a }
        if (r4 == 0) goto L_0x005a;	 Catch:{ zzdj -> 0x005a }
    L_0x0052:
        r4 = r1.f23479d;	 Catch:{ zzdj -> 0x005a }
        r10.f26995u = r4;	 Catch:{ zzdj -> 0x005a }
        r1 = r1.f23480e;	 Catch:{ zzdj -> 0x005a }
        r10.f26996v = r1;	 Catch:{ zzdj -> 0x005a }
    L_0x005a:
        r1 = new com.google.android.gms.internal.ny;
        r1.<init>();
        r4 = r0.c;
        r6 = 0;
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 <= 0) goto L_0x0143;
    L_0x0067:
        r4 = r0.p;
        r4 = com.google.android.gms.internal.vk.m20255a(r4);
        if (r4 == 0) goto L_0x0143;
    L_0x006f:
        r4 = com.google.android.gms.internal.alo.bu;
        r5 = com.google.android.gms.internal.aja.m19221f();
        r4 = r5.m19334a(r4);
        r4 = (java.lang.Integer) r4;
        r4 = r4.intValue();
        r8 = r0.j;
        r5 = r0.p;
        r8 = com.google.android.gms.internal.vk.m20250a(r8, r4, r5);
        r5 = java.lang.Long.valueOf(r8);
        r1.f27014m = r5;
        r5 = com.google.android.gms.internal.alo.bv;
        r8 = com.google.android.gms.internal.aja.m19221f();
        r5 = r8.m19334a(r5);
        r5 = (java.lang.Boolean) r5;
        r5 = r5.booleanValue();
        if (r5 == 0) goto L_0x00e1;
    L_0x009f:
        r5 = r0.m;
        r8 = r0.k;
        r5 = r5 - r8;
        r8 = (double) r5;
        r5 = r0.p;
        r8 = com.google.android.gms.internal.vk.m20250a(r8, r4, r5);
        r5 = java.lang.Long.valueOf(r8);
        r1.f27015n = r5;
        r5 = r0.n;
        r8 = r0.l;
        r5 = r5 - r8;
        r8 = (double) r5;
        r5 = r0.p;
        r8 = com.google.android.gms.internal.vk.m20250a(r8, r4, r5);
        r5 = java.lang.Long.valueOf(r8);
        r1.f27016o = r5;
        r5 = r0.k;
        r8 = (double) r5;
        r5 = r0.p;
        r8 = com.google.android.gms.internal.vk.m20250a(r8, r4, r5);
        r5 = java.lang.Long.valueOf(r8);
        r1.f27019r = r5;
        r5 = r0.l;
        r8 = (double) r5;
        r5 = r0.p;
        r8 = com.google.android.gms.internal.vk.m20250a(r8, r4, r5);
        r5 = java.lang.Long.valueOf(r8);
        r1.f27020s = r5;
    L_0x00e1:
        r5 = com.google.android.gms.internal.alo.bw;
        r8 = com.google.android.gms.internal.aja.m19221f();
        r5 = r8.m19334a(r5);
        r5 = (java.lang.Boolean) r5;
        r5 = r5.booleanValue();
        if (r5 == 0) goto L_0x0143;
    L_0x00f3:
        r5 = r0.o;
        if (r5 == 0) goto L_0x0143;
    L_0x00f7:
        r5 = r0.a;
        if (r5 == 0) goto L_0x0143;
    L_0x00fb:
        r5 = r0.k;
        r8 = r0.m;
        r5 = r5 - r8;
        r8 = r0.a;
        r8 = r8.getRawX();
        r5 = r5 + r8;
        r8 = r0.a;
        r8 = r8.getX();
        r5 = r5 - r8;
        r8 = (double) r5;
        r5 = r0.p;
        r8 = com.google.android.gms.internal.vk.m20250a(r8, r4, r5);
        r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
        if (r5 == 0) goto L_0x011f;
    L_0x0119:
        r5 = java.lang.Long.valueOf(r8);
        r1.f27017p = r5;
    L_0x011f:
        r5 = r0.l;
        r8 = r0.n;
        r5 = r5 - r8;
        r8 = r0.a;
        r8 = r8.getRawY();
        r5 = r5 + r8;
        r8 = r0.a;
        r8 = r8.getY();
        r5 = r5 - r8;
        r8 = (double) r5;
        r5 = r0.p;
        r4 = com.google.android.gms.internal.vk.m20250a(r8, r4, r5);
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x0143;
    L_0x013d:
        r4 = java.lang.Long.valueOf(r4);
        r1.f27018q = r4;
    L_0x0143:
        r4 = 0;
        r5 = r0.a;	 Catch:{ zzdj -> 0x01ca }
        r5 = r0.mo6907a(r5);	 Catch:{ zzdj -> 0x01ca }
        r8 = r5.f23476a;	 Catch:{ zzdj -> 0x01ca }
        r1.f27002a = r8;	 Catch:{ zzdj -> 0x01ca }
        r8 = r5.f23477b;	 Catch:{ zzdj -> 0x01ca }
        r1.f27003b = r8;	 Catch:{ zzdj -> 0x01ca }
        r8 = r5.f23487l;	 Catch:{ zzdj -> 0x01ca }
        r1.f27021t = r8;	 Catch:{ zzdj -> 0x01ca }
        r8 = r5.f23488m;	 Catch:{ zzdj -> 0x01ca }
        r1.f27022u = r8;	 Catch:{ zzdj -> 0x01ca }
        r8 = r5.f23478c;	 Catch:{ zzdj -> 0x01ca }
        r1.f27009h = r8;	 Catch:{ zzdj -> 0x01ca }
        r8 = r0.o;	 Catch:{ zzdj -> 0x01ca }
        if (r8 == 0) goto L_0x01ca;	 Catch:{ zzdj -> 0x01ca }
    L_0x0162:
        r8 = r5.f23480e;	 Catch:{ zzdj -> 0x01ca }
        r1.f27004c = r8;	 Catch:{ zzdj -> 0x01ca }
        r8 = r5.f23479d;	 Catch:{ zzdj -> 0x01ca }
        r1.f27006e = r8;	 Catch:{ zzdj -> 0x01ca }
        r8 = r5.f23481f;	 Catch:{ zzdj -> 0x01ca }
        r8 = r8.longValue();	 Catch:{ zzdj -> 0x01ca }
        r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));	 Catch:{ zzdj -> 0x01ca }
        if (r12 == 0) goto L_0x0176;	 Catch:{ zzdj -> 0x01ca }
    L_0x0174:
        r8 = 1;	 Catch:{ zzdj -> 0x01ca }
        goto L_0x0177;	 Catch:{ zzdj -> 0x01ca }
    L_0x0176:
        r8 = 0;	 Catch:{ zzdj -> 0x01ca }
    L_0x0177:
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ zzdj -> 0x01ca }
        r1.f27008g = r8;	 Catch:{ zzdj -> 0x01ca }
        r8 = r0.d;	 Catch:{ zzdj -> 0x01ca }
        r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));	 Catch:{ zzdj -> 0x01ca }
        if (r12 <= 0) goto L_0x01af;	 Catch:{ zzdj -> 0x01ca }
    L_0x0183:
        r8 = r0.p;	 Catch:{ zzdj -> 0x01ca }
        r8 = com.google.android.gms.internal.vk.m20255a(r8);	 Catch:{ zzdj -> 0x01ca }
        if (r8 == 0) goto L_0x019b;	 Catch:{ zzdj -> 0x01ca }
    L_0x018b:
        r8 = r0.i;	 Catch:{ zzdj -> 0x01ca }
        r8 = (double) r8;	 Catch:{ zzdj -> 0x01ca }
        r12 = r0.d;	 Catch:{ zzdj -> 0x01ca }
        r12 = (double) r12;	 Catch:{ zzdj -> 0x01ca }
        r8 = r8 / r12;	 Catch:{ zzdj -> 0x01ca }
        r8 = java.lang.Math.round(r8);	 Catch:{ zzdj -> 0x01ca }
        r8 = java.lang.Long.valueOf(r8);	 Catch:{ zzdj -> 0x01ca }
        goto L_0x019c;	 Catch:{ zzdj -> 0x01ca }
    L_0x019b:
        r8 = r4;	 Catch:{ zzdj -> 0x01ca }
    L_0x019c:
        r1.f27005d = r8;	 Catch:{ zzdj -> 0x01ca }
        r8 = r0.h;	 Catch:{ zzdj -> 0x01ca }
        r8 = (double) r8;	 Catch:{ zzdj -> 0x01ca }
        r12 = r0.d;	 Catch:{ zzdj -> 0x01ca }
        r12 = (double) r12;	 Catch:{ zzdj -> 0x01ca }
        r8 = r8 / r12;	 Catch:{ zzdj -> 0x01ca }
        r8 = java.lang.Math.round(r8);	 Catch:{ zzdj -> 0x01ca }
        r8 = java.lang.Long.valueOf(r8);	 Catch:{ zzdj -> 0x01ca }
        r1.f27007f = r8;	 Catch:{ zzdj -> 0x01ca }
    L_0x01af:
        r8 = r5.f23484i;	 Catch:{ zzdj -> 0x01ca }
        r1.f27011j = r8;	 Catch:{ zzdj -> 0x01ca }
        r8 = r5.f23485j;	 Catch:{ zzdj -> 0x01ca }
        r1.f27010i = r8;	 Catch:{ zzdj -> 0x01ca }
        r5 = r5.f23486k;	 Catch:{ zzdj -> 0x01ca }
        r8 = r5.longValue();	 Catch:{ zzdj -> 0x01ca }
        r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));	 Catch:{ zzdj -> 0x01ca }
        if (r5 == 0) goto L_0x01c3;	 Catch:{ zzdj -> 0x01ca }
    L_0x01c1:
        r5 = 1;	 Catch:{ zzdj -> 0x01ca }
        goto L_0x01c4;	 Catch:{ zzdj -> 0x01ca }
    L_0x01c3:
        r5 = 0;	 Catch:{ zzdj -> 0x01ca }
    L_0x01c4:
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ zzdj -> 0x01ca }
        r1.f27012k = r5;	 Catch:{ zzdj -> 0x01ca }
    L_0x01ca:
        r8 = r0.g;
        r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
        if (r5 <= 0) goto L_0x01d8;
    L_0x01d0:
        r8 = r0.g;
        r5 = java.lang.Long.valueOf(r8);
        r1.f27013l = r5;
    L_0x01d8:
        r10.f26961K = r1;
        r8 = r0.c;
        r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
        if (r1 <= 0) goto L_0x01e8;
    L_0x01e0:
        r8 = r0.c;
        r1 = java.lang.Long.valueOf(r8);
        r10.f26999y = r1;
    L_0x01e8:
        r8 = r0.d;
        r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
        if (r1 <= 0) goto L_0x01f6;
    L_0x01ee:
        r8 = r0.d;
        r1 = java.lang.Long.valueOf(r8);
        r10.f26998x = r1;
    L_0x01f6:
        r8 = r0.e;
        r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
        if (r1 <= 0) goto L_0x0204;
    L_0x01fc:
        r8 = r0.e;
        r1 = java.lang.Long.valueOf(r8);
        r10.f26997w = r1;
    L_0x0204:
        r8 = r0.f;
        r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
        if (r1 <= 0) goto L_0x0212;
    L_0x020a:
        r5 = r0.f;
        r1 = java.lang.Long.valueOf(r5);
        r10.f27000z = r1;
    L_0x0212:
        r1 = r0.b;	 Catch:{ zzdj -> 0x0245 }
        r1 = r1.size();	 Catch:{ zzdj -> 0x0245 }
        r1 = r1 - r3;	 Catch:{ zzdj -> 0x0245 }
        if (r1 <= 0) goto L_0x0247;	 Catch:{ zzdj -> 0x0245 }
    L_0x021b:
        r3 = new com.google.android.gms.internal.ny[r1];	 Catch:{ zzdj -> 0x0245 }
        r10.f26962L = r3;	 Catch:{ zzdj -> 0x0245 }
    L_0x021f:
        if (r2 >= r1) goto L_0x0247;	 Catch:{ zzdj -> 0x0245 }
    L_0x0221:
        r3 = f27059t;	 Catch:{ zzdj -> 0x0245 }
        r5 = r0.b;	 Catch:{ zzdj -> 0x0245 }
        r5 = r5.get(r2);	 Catch:{ zzdj -> 0x0245 }
        r5 = (android.view.MotionEvent) r5;	 Catch:{ zzdj -> 0x0245 }
        r6 = r0.p;	 Catch:{ zzdj -> 0x0245 }
        r3 = m31654a(r3, r5, r6);	 Catch:{ zzdj -> 0x0245 }
        r5 = new com.google.android.gms.internal.ny;	 Catch:{ zzdj -> 0x0245 }
        r5.<init>();	 Catch:{ zzdj -> 0x0245 }
        r6 = r3.f23476a;	 Catch:{ zzdj -> 0x0245 }
        r5.f27002a = r6;	 Catch:{ zzdj -> 0x0245 }
        r3 = r3.f23477b;	 Catch:{ zzdj -> 0x0245 }
        r5.f27003b = r3;	 Catch:{ zzdj -> 0x0245 }
        r3 = r10.f26962L;	 Catch:{ zzdj -> 0x0245 }
        r3[r2] = r5;	 Catch:{ zzdj -> 0x0245 }
        r2 = r2 + 1;
        goto L_0x021f;
    L_0x0245:
        r10.f26962L = r4;
    L_0x0247:
        r12 = new java.util.ArrayList;
        r12.<init>();
        r1 = r11.m20210c();
        if (r1 == 0) goto L_0x0393;
    L_0x0252:
        r13 = r11.m20221n();
        r1 = new com.google.android.gms.internal.aae;
        r1.<init>(r11, r10);
        r12.add(r1);
        r8 = new com.google.android.gms.internal.aah;
        r3 = "4w5pMN4cUsuXvD3CJ7PKPSwMmWPClIaNSjeM6jtHahV40Q7EiLps1VIbOcEaCSp4";
        r4 = "5XuSFVTSxDkE27CIZHrBIXal5K53Dv1J/UFXKGBFAXY=";
        r7 = 1;
        r1 = r8;
        r2 = r11;
        r5 = r10;
        r6 = r13;
        r1.<init>(r2, r3, r4, r5, r6, r7);
        r12.add(r8);
        r14 = new com.google.android.gms.internal.aac;
        r3 = "HYkEKMk8dvMdQrlbFR00sh73U7jSOxxrrxd0BhHmEXYlIfEqe1EzBQsw2kucbDs8";
        r4 = "puD1TaAJX/qcP/8PMgKROAswM+eaSDu4sTUEXpqs2fU=";
        r6 = f27061v;
        r9 = 25;
        r1 = r14;
        r8 = r13;
        r1.<init>(r2, r3, r4, r5, r6, r8, r9);
        r12.add(r14);
        r8 = new com.google.android.gms.internal.aab;
        r3 = "igTfSDGbP3Q2KSYfnqAL0vFW/zSSX6v+f+5s7NdwuKQgo6M7dQVerLATgNETrLAr";
        r4 = "Wz4eX479PrQ8rGu0gkJoEYqOJ2Dr8sAHE85KoBBz7s4=";
        r7 = 44;
        r1 = r8;
        r6 = r13;
        r1.<init>(r2, r3, r4, r5, r6, r7);
        r12.add(r8);
        r8 = new com.google.android.gms.internal.aag;
        r3 = "ZsnUMRH5gS7aUE0TqnSYS8JWwJCKCL7bH7XFSqbI4dWEEyg2o14AuyyBvtsnwc4D";
        r4 = "SFchXCfZXuuDAwXfTJDosXRUHrZZ0v26SJChYX3rL/o=";
        r7 = 12;
        r1 = r8;
        r1.<init>(r2, r3, r4, r5, r6, r7);
        r12.add(r8);
        r8 = new com.google.android.gms.internal.aai;
        r3 = "lMH30ZU/uP5xaOsdIj/K3/wZfVr7hnOzUHjpO1NWhTJQvW+gY38/OvCWA8Ap4ZOf";
        r4 = "FCjXGcebz7gnog9LMAWyd/isayIV3I84uK1cUtHZ2fI=";
        r7 = 3;
        r1 = r8;
        r1.<init>(r2, r3, r4, r5, r6, r7);
        r12.add(r8);
        r8 = new com.google.android.gms.internal.aaf;
        r3 = "BiRNVQ0aQHyQJTXKNLbpSFJJy6+rG5ICwTiWxRhS6qdZjM6S9BBOaVfdO1b0Kd8E";
        r4 = "z9Ycw/7CJTzBzg6MPXNZ2oLMXcxWzT8qsF0ig0ITUxc=";
        r7 = 22;
        r1 = r8;
        r1.<init>(r2, r3, r4, r5, r6, r7);
        r12.add(r8);
        r8 = new com.google.android.gms.internal.aaa;
        r3 = "2GI4cQuNT2V9TGPC/Z2McvgqRAU80qquJKbm0BMTxLR8WwMEgJwPEKdGCxKNxeUN";
        r4 = "1Kj5K8xXQ2YA9zbG2Rm9FzZtUD9R2drVmZXzLVF7uLA=";
        r7 = 5;
        r1 = r8;
        r1.<init>(r2, r3, r4, r5, r6, r7);
        r12.add(r8);
        r8 = new com.google.android.gms.internal.aap;
        r3 = "oWVj3eW9lsJMixyFq7g0kyuRqYP087mdDp4dCL3paE/7Ut3Ewp3IcEq6P10MPRyy";
        r4 = "siNRngHYHRLjixmg2PEX5OdKhRHe1h8DNRpJp4wC0pk=";
        r7 = 48;
        r1 = r8;
        r1.<init>(r2, r3, r4, r5, r6, r7);
        r12.add(r8);
        r8 = new com.google.android.gms.internal.zw;
        r3 = "yATd8qneW4MlwQIx8jIN6cfiWJ28/zOw6vW7xs0IWvNvim2a85v5X4ZiVD1KK9hX";
        r4 = "0wjmexcQnona3bxO7Nd7FrKMEEoBhOp7s6KivBhMQKU=";
        r7 = 49;
        r1 = r8;
        r1.<init>(r2, r3, r4, r5, r6, r7);
        r12.add(r8);
        r8 = new com.google.android.gms.internal.aam;
        r3 = "2glehmg5UKxyaNPdnG06BLa5QbEzBADKVm3lYiT3+JTkguRZEzOA9BDahqC4W8ki";
        r4 = "wM87KVhGHShMaqkZWTxt04VnU6kJHrMxqQyksEW6glI=";
        r7 = 51;
        r1 = r8;
        r1.<init>(r2, r3, r4, r5, r6, r7);
        r12.add(r8);
        r9 = new com.google.android.gms.internal.aal;
        r3 = "hoZ4RlhPWT5MX/I+m/lUD5aYJ9aPmEb2eUGLaeSBLBDs9eDpXoNNJPm6j1dXVkvA";
        r4 = "Z7StFiuQ59x4y88apmlBJn3lPoWOEnuqoEhP2AVUL8A=";
        r7 = 45;
        r1 = new java.lang.Throwable;
        r1.<init>();
        r8 = r1.getStackTrace();
        r1 = r9;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8);
        r12.add(r9);
        r9 = new com.google.android.gms.internal.aaq;
        r3 = "peD/v7hHRn46N2uI0dQKpTtMr7rKDQ+Rzb4yluPWMw4TUUwj2SFV9GkdTp0kog66";
        r4 = "XxfDY0AzBkt4iSC5Sim2fww10jQc1evowDldz5+caY4=";
        r7 = 57;
        r1 = r9;
        r8 = r17;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8);
        r12.add(r9);
        r1 = com.google.android.gms.internal.alo.br;
        r2 = com.google.android.gms.internal.aja.m19221f();
        r1 = r2.m19334a(r1);
        r1 = (java.lang.Boolean) r1;
        r1 = r1.booleanValue();
        if (r1 == 0) goto L_0x0345;
    L_0x0333:
        r8 = new com.google.android.gms.internal.aak;
        r3 = "cINMMi7uKicDN2DHSf1rHdgax7DU+CM2mIG3cRQw3SI0nkdhPwdVz1PCbewJpJoO";
        r4 = "VWQmr3p+wsDJ15H20t2tLb975qLEArv8gtHgpBQKEOE=";
        r7 = 61;
        r1 = r8;
        r2 = r11;
        r5 = r10;
        r6 = r13;
        r1.<init>(r2, r3, r4, r5, r6, r7);
        r12.add(r8);
    L_0x0345:
        r1 = com.google.android.gms.internal.alo.bs;
        r2 = com.google.android.gms.internal.aja.m19221f();
        r1 = r2.m19334a(r1);
        r1 = (java.lang.Boolean) r1;
        r1 = r1.booleanValue();
        if (r1 == 0) goto L_0x036d;
    L_0x0357:
        r14 = new com.google.android.gms.internal.zv;
        r3 = "6qQh+8GAMu6fM86JkRzoeHiiHD67+MgHO4xhhwcbyPT7CQmAN57q8YytJQRqDjU5";
        r4 = "Qrc1hPZgr+QjlmQtpbdJO1QCxqr2PdTRKIIDeDNdHp8=";
        r7 = 62;
        r1 = r14;
        r2 = r11;
        r5 = r10;
        r6 = r13;
        r8 = r17;
        r9 = r18;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9);
        r12.add(r14);
    L_0x036d:
        r1 = com.google.android.gms.internal.alo.bt;
        r2 = com.google.android.gms.internal.aja.m19221f();
        r1 = r2.m19334a(r1);
        r1 = (java.lang.Boolean) r1;
        r1 = r1.booleanValue();
        if (r1 == 0) goto L_0x0393;
    L_0x037f:
        r9 = new com.google.android.gms.internal.aan;
        r3 = "HBbZPURZUWU/TDYIx99LmOTdgpFP2mdidp6Zk4sZdEVCGaQNYtmNlQBCP3rgXOne";
        r4 = "pdXBsPFh4N2rQp3r0gjTSQiWtas1GOGaKulNSciQTj0=";
        r7 = 53;
        r8 = r0.f27066z;
        r1 = r9;
        r2 = r11;
        r5 = r10;
        r6 = r13;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8);
        r12.add(r9);
    L_0x0393:
        m31656a(r12);
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ss.a(android.content.Context, android.view.View, android.app.Activity):com.google.android.gms.internal.nx");
    }

    /* renamed from: a */
    protected final nx mo6906a(Context context, na naVar) {
        nx nxVar = new nx();
        if (!TextUtils.isEmpty(this.f27063w)) {
            nxVar.f26976b = this.f27063w;
        }
        ub b = m31657b(context, this.f27062q);
        if (b.m20210c() != null) {
            m31656a(mo7495a(b, nxVar, null));
        }
        return nxVar;
    }

    /* renamed from: a */
    protected final uk mo6907a(MotionEvent motionEvent) throws zzdj {
        Method a = f27059t.m20205a("I8ATAvvv3zdNeDvmT5gQ/ekfiNEF+bBdZZ3FGipPSiGHOLI4yQdK3XpX6xFRuejz", "SRWP8PeqaQflId3WUP9WJTho9Un3bF1tLB8c7UP1Ruo=");
        if (a != null) {
            if (motionEvent != null) {
                try {
                    Object[] objArr = new Object[3];
                    objArr[0] = motionEvent;
                    objArr[1] = this.p;
                    objArr[2] = aja.m19221f().m19334a(alo.bu);
                    return new uk((String) a.invoke(null, objArr));
                } catch (Throwable e) {
                    throw new zzdj(e);
                }
            }
        }
        throw new zzdj();
    }

    /* renamed from: a */
    protected List<Callable<Void>> mo7495a(ub ubVar, nx nxVar, na naVar) {
        int n = ubVar.m20221n();
        List<Callable<Void>> arrayList = new ArrayList();
        if (ubVar.m20209b()) {
            ub ubVar2 = ubVar;
            nx nxVar2 = nxVar;
            arrayList.add(new zy(ubVar2, "DGPkHpN6F5DQjFiQDfOpLUfwAMooIPhSFT4YA2aSEj+k+u5Kt4pQoimNrK0aCsHP", "V/2NrZQU5cdFMpqYa0Q9vKRizJ0aHS7vWXQS8vp0qlI=", nxVar2, n, 27, naVar));
            arrayList.add(new aac(ubVar2, "HYkEKMk8dvMdQrlbFR00sh73U7jSOxxrrxd0BhHmEXYlIfEqe1EzBQsw2kucbDs8", "puD1TaAJX/qcP/8PMgKROAswM+eaSDu4sTUEXpqs2fU=", nxVar2, f27061v, n, 25));
            int i = n;
            arrayList.add(new aah(ubVar2, "4w5pMN4cUsuXvD3CJ7PKPSwMmWPClIaNSjeM6jtHahV40Q7EiLps1VIbOcEaCSp4", "5XuSFVTSxDkE27CIZHrBIXal5K53Dv1J/UFXKGBFAXY=", nxVar2, i, 1));
            arrayList.add(new aaj(ubVar2, "notQcG55r2oh2A1cS/dLfKg9hawk3H86BF0iXzU7AAnhYpfHWl9mq3lZzdkAltxm", "U9ntf5BvZUTabci6TosC4bQNHZ+DOrzvRmpSy4CzkoQ=", nxVar2, i, 31));
            arrayList.add(new aao(ubVar2, "8Hx2xRqW2QZDPiXj7EKgQgzecg5taNOrZe4YkZ9zi7FcQAOy1BO0rYbAdBI9x6Pm", "nJw4XP5tQfSQ6wm+0x6UMq5j2kNiUh+TXa92gyyhaOo=", nxVar2, i, 33));
            arrayList.add(new zx(ubVar2, "yzGxsS8IwfgINPYaD3TFRjRVH+0Pq4QvVGq15MBf/opCBPnlCr4QHvEcReKXEMs7", "kMEgIGkHy2R1ROJUgud//6gDu/wM35rLhA6gUKrjKq0=", nxVar2, i, 29));
            arrayList.add(new aaa(ubVar2, "2GI4cQuNT2V9TGPC/Z2McvgqRAU80qquJKbm0BMTxLR8WwMEgJwPEKdGCxKNxeUN", "1Kj5K8xXQ2YA9zbG2Rm9FzZtUD9R2drVmZXzLVF7uLA=", nxVar2, i, 5));
            arrayList.add(new aag(ubVar2, "ZsnUMRH5gS7aUE0TqnSYS8JWwJCKCL7bH7XFSqbI4dWEEyg2o14AuyyBvtsnwc4D", "SFchXCfZXuuDAwXfTJDosXRUHrZZ0v26SJChYX3rL/o=", nxVar2, i, 12));
            arrayList.add(new aai(ubVar2, "lMH30ZU/uP5xaOsdIj/K3/wZfVr7hnOzUHjpO1NWhTJQvW+gY38/OvCWA8Ap4ZOf", "FCjXGcebz7gnog9LMAWyd/isayIV3I84uK1cUtHZ2fI=", nxVar2, i, 3));
            arrayList.add(new aab(ubVar2, "igTfSDGbP3Q2KSYfnqAL0vFW/zSSX6v+f+5s7NdwuKQgo6M7dQVerLATgNETrLAr", "Wz4eX479PrQ8rGu0gkJoEYqOJ2Dr8sAHE85KoBBz7s4=", nxVar2, i, 44));
            arrayList.add(new aaf(ubVar2, "BiRNVQ0aQHyQJTXKNLbpSFJJy6+rG5ICwTiWxRhS6qdZjM6S9BBOaVfdO1b0Kd8E", "z9Ycw/7CJTzBzg6MPXNZ2oLMXcxWzT8qsF0ig0ITUxc=", nxVar2, i, 22));
            arrayList.add(new aap(ubVar2, "oWVj3eW9lsJMixyFq7g0kyuRqYP087mdDp4dCL3paE/7Ut3Ewp3IcEq6P10MPRyy", "siNRngHYHRLjixmg2PEX5OdKhRHe1h8DNRpJp4wC0pk=", nxVar2, i, 48));
            arrayList.add(new zw(ubVar2, "yATd8qneW4MlwQIx8jIN6cfiWJ28/zOw6vW7xs0IWvNvim2a85v5X4ZiVD1KK9hX", "0wjmexcQnona3bxO7Nd7FrKMEEoBhOp7s6KivBhMQKU=", nxVar2, i, 49));
            arrayList.add(new aam(ubVar2, "2glehmg5UKxyaNPdnG06BLa5QbEzBADKVm3lYiT3+JTkguRZEzOA9BDahqC4W8ki", "wM87KVhGHShMaqkZWTxt04VnU6kJHrMxqQyksEW6glI=", nxVar2, i, 51));
            if (((Boolean) aja.m19221f().m19334a(alo.br)).booleanValue()) {
                arrayList.add(new aak(ubVar, "cINMMi7uKicDN2DHSf1rHdgax7DU+CM2mIG3cRQw3SI0nkdhPwdVz1PCbewJpJoO", "VWQmr3p+wsDJ15H20t2tLb975qLEArv8gtHgpBQKEOE=", nxVar, n, 61));
            }
            return arrayList;
        }
        nxVar.f26985k = Long.valueOf(PlaybackStateCompat.ACTION_PREPARE);
        return arrayList;
    }

    public final void zzb(View view) {
        if (!((Boolean) aja.m19221f().m19334a(alo.bt)).booleanValue()) {
            return;
        }
        if (this.f27066z == null) {
            this.f27066z = new xi(f27059t, view);
        } else {
            this.f27066z.m20266a(view);
        }
    }
}
