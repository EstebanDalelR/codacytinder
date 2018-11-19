package com.google.android.gms.internal;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.common.util.C2520d;
import java.util.Set;

@zzzv
public final class atl extends atv {
    /* renamed from: a */
    private static Set<String> f23129a = C2520d.a(new String[]{"top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"});
    /* renamed from: b */
    private String f23130b = "top-right";
    /* renamed from: c */
    private boolean f23131c = true;
    /* renamed from: d */
    private int f23132d = 0;
    /* renamed from: e */
    private int f23133e = 0;
    /* renamed from: f */
    private int f23134f = -1;
    /* renamed from: g */
    private int f23135g = 0;
    /* renamed from: h */
    private int f23136h = 0;
    /* renamed from: i */
    private int f23137i = -1;
    /* renamed from: j */
    private final Object f23138j = new Object();
    /* renamed from: k */
    private final zzanh f23139k;
    /* renamed from: l */
    private final Activity f23140l;
    /* renamed from: m */
    private mb f23141m;
    /* renamed from: n */
    private ImageView f23142n;
    /* renamed from: o */
    private LinearLayout f23143o;
    /* renamed from: p */
    private zzxc f23144p;
    /* renamed from: q */
    private PopupWindow f23145q;
    /* renamed from: r */
    private RelativeLayout f23146r;
    /* renamed from: s */
    private ViewGroup f23147s;

    public atl(zzanh zzanh, zzxc zzxc) {
        super(zzanh, "resize");
        this.f23139k = zzanh;
        this.f23140l = zzanh.zzsi();
        this.f23144p = zzxc;
    }

    /* renamed from: b */
    private final void m27242b(int i, int i2) {
        m19486a(i, i2 - ar.e().m19758c(this.f23140l)[0], this.f23137i, this.f23134f);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private final int[] m27243b() {
        /*
        r9 = this;
        r0 = com.google.android.gms.ads.internal.ar.e();
        r1 = r9.f23140l;
        r0 = r0.m19756b(r1);
        r1 = com.google.android.gms.ads.internal.ar.e();
        r2 = r9.f23140l;
        r1 = r1.m19758c(r2);
        r2 = 0;
        r3 = r0[r2];
        r4 = 1;
        r0 = r0[r4];
        r5 = r9.f23137i;
        r6 = 2;
        r7 = 50;
        if (r5 < r7) goto L_0x00fd;
    L_0x0021:
        r5 = r9.f23137i;
        if (r5 <= r3) goto L_0x0027;
    L_0x0025:
        goto L_0x00fd;
    L_0x0027:
        r5 = r9.f23134f;
        if (r5 < r7) goto L_0x00fa;
    L_0x002b:
        r5 = r9.f23134f;
        if (r5 <= r0) goto L_0x0031;
    L_0x002f:
        goto L_0x00fa;
    L_0x0031:
        r5 = r9.f23134f;
        if (r5 != r0) goto L_0x003d;
    L_0x0035:
        r0 = r9.f23137i;
        if (r0 != r3) goto L_0x003d;
    L_0x0039:
        r0 = "Cannot resize to a full-screen ad.";
        goto L_0x00ff;
    L_0x003d:
        r0 = r9.f23131c;
        if (r0 == 0) goto L_0x00f8;
    L_0x0041:
        r0 = r9.f23130b;
        r5 = -1;
        r8 = r0.hashCode();
        switch(r8) {
            case -1364013995: goto L_0x007e;
            case -1012429441: goto L_0x0074;
            case -655373719: goto L_0x006a;
            case 1163912186: goto L_0x0060;
            case 1288627767: goto L_0x0056;
            case 1755462605: goto L_0x004c;
            default: goto L_0x004b;
        };
    L_0x004b:
        goto L_0x0088;
    L_0x004c:
        r8 = "top-center";
        r0 = r0.equals(r8);
        if (r0 == 0) goto L_0x0088;
    L_0x0054:
        r0 = 1;
        goto L_0x0089;
    L_0x0056:
        r8 = "bottom-center";
        r0 = r0.equals(r8);
        if (r0 == 0) goto L_0x0088;
    L_0x005e:
        r0 = 4;
        goto L_0x0089;
    L_0x0060:
        r8 = "bottom-right";
        r0 = r0.equals(r8);
        if (r0 == 0) goto L_0x0088;
    L_0x0068:
        r0 = 5;
        goto L_0x0089;
    L_0x006a:
        r8 = "bottom-left";
        r0 = r0.equals(r8);
        if (r0 == 0) goto L_0x0088;
    L_0x0072:
        r0 = 3;
        goto L_0x0089;
    L_0x0074:
        r8 = "top-left";
        r0 = r0.equals(r8);
        if (r0 == 0) goto L_0x0088;
    L_0x007c:
        r0 = 0;
        goto L_0x0089;
    L_0x007e:
        r8 = "center";
        r0 = r0.equals(r8);
        if (r0 == 0) goto L_0x0088;
    L_0x0086:
        r0 = 2;
        goto L_0x0089;
    L_0x0088:
        r0 = -1;
    L_0x0089:
        switch(r0) {
            case 0: goto L_0x00e3;
            case 1: goto L_0x00d7;
            case 2: goto L_0x00c0;
            case 3: goto L_0x00b1;
            case 4: goto L_0x00a5;
            case 5: goto L_0x009b;
            default: goto L_0x008c;
        };
    L_0x008c:
        r0 = r9.f23132d;
        r5 = r9.f23135g;
        r0 = r0 + r5;
        r5 = r9.f23137i;
        r0 = r0 + r5;
        r0 = r0 - r7;
    L_0x0095:
        r5 = r9.f23133e;
        r8 = r9.f23136h;
        r5 = r5 + r8;
        goto L_0x00e9;
    L_0x009b:
        r0 = r9.f23132d;
        r5 = r9.f23135g;
        r0 = r0 + r5;
        r5 = r9.f23137i;
        r0 = r0 + r5;
        r0 = r0 - r7;
        goto L_0x00b6;
    L_0x00a5:
        r0 = r9.f23132d;
        r5 = r9.f23135g;
        r0 = r0 + r5;
        r5 = r9.f23137i;
        r5 = r5 / r6;
        r0 = r0 + r5;
        r0 = r0 + -25;
        goto L_0x00b6;
    L_0x00b1:
        r0 = r9.f23132d;
        r5 = r9.f23135g;
        r0 = r0 + r5;
    L_0x00b6:
        r5 = r9.f23133e;
        r8 = r9.f23136h;
        r5 = r5 + r8;
        r8 = r9.f23134f;
        r5 = r5 + r8;
        r5 = r5 - r7;
        goto L_0x00e9;
    L_0x00c0:
        r0 = r9.f23132d;
        r5 = r9.f23135g;
        r0 = r0 + r5;
        r5 = r9.f23137i;
        r5 = r5 / r6;
        r0 = r0 + r5;
        r0 = r0 + -25;
        r5 = r9.f23133e;
        r8 = r9.f23136h;
        r5 = r5 + r8;
        r8 = r9.f23134f;
        r8 = r8 / r6;
        r5 = r5 + r8;
        r5 = r5 + -25;
        goto L_0x00e9;
    L_0x00d7:
        r0 = r9.f23132d;
        r5 = r9.f23135g;
        r0 = r0 + r5;
        r5 = r9.f23137i;
        r5 = r5 / r6;
        r0 = r0 + r5;
        r0 = r0 + -25;
        goto L_0x0095;
    L_0x00e3:
        r0 = r9.f23132d;
        r5 = r9.f23135g;
        r0 = r0 + r5;
        goto L_0x0095;
    L_0x00e9:
        if (r0 < 0) goto L_0x0102;
    L_0x00eb:
        r0 = r0 + r7;
        if (r0 > r3) goto L_0x0102;
    L_0x00ee:
        r0 = r1[r2];
        if (r5 < r0) goto L_0x0102;
    L_0x00f2:
        r5 = r5 + r7;
        r0 = r1[r4];
        if (r5 <= r0) goto L_0x00f8;
    L_0x00f7:
        goto L_0x0102;
    L_0x00f8:
        r0 = 1;
        goto L_0x0103;
    L_0x00fa:
        r0 = "Height is too small or too large.";
        goto L_0x00ff;
    L_0x00fd:
        r0 = "Width is too small or too large.";
    L_0x00ff:
        com.google.android.gms.internal.hx.m19916e(r0);
    L_0x0102:
        r0 = 0;
    L_0x0103:
        if (r0 != 0) goto L_0x0107;
    L_0x0105:
        r0 = 0;
        return r0;
    L_0x0107:
        r0 = r9.f23131c;
        if (r0 == 0) goto L_0x011c;
    L_0x010b:
        r0 = new int[r6];
        r1 = r9.f23132d;
        r3 = r9.f23135g;
        r1 = r1 + r3;
        r0[r2] = r1;
        r1 = r9.f23133e;
        r2 = r9.f23136h;
        r1 = r1 + r2;
        r0[r4] = r1;
        return r0;
    L_0x011c:
        r0 = com.google.android.gms.ads.internal.ar.e();
        r1 = r9.f23140l;
        r0 = r0.m19756b(r1);
        r1 = com.google.android.gms.ads.internal.ar.e();
        r3 = r9.f23140l;
        r1 = r1.m19758c(r3);
        r0 = r0[r2];
        r3 = r9.f23132d;
        r5 = r9.f23135g;
        r3 = r3 + r5;
        r5 = r9.f23133e;
        r7 = r9.f23136h;
        r5 = r5 + r7;
        if (r3 >= 0) goto L_0x0140;
    L_0x013e:
        r0 = 0;
        goto L_0x014a;
    L_0x0140:
        r7 = r9.f23137i;
        r7 = r7 + r3;
        if (r7 <= r0) goto L_0x0149;
    L_0x0145:
        r3 = r9.f23137i;
        r0 = r0 - r3;
        goto L_0x014a;
    L_0x0149:
        r0 = r3;
    L_0x014a:
        r3 = r1[r2];
        if (r5 >= r3) goto L_0x0151;
    L_0x014e:
        r5 = r1[r2];
        goto L_0x015e;
    L_0x0151:
        r3 = r9.f23134f;
        r3 = r3 + r5;
        r7 = r1[r4];
        if (r3 <= r7) goto L_0x015e;
    L_0x0158:
        r1 = r1[r4];
        r3 = r9.f23134f;
        r5 = r1 - r3;
    L_0x015e:
        r1 = new int[r6];
        r1[r2] = r0;
        r1[r4] = r5;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.atl.b():int[]");
    }

    /* renamed from: a */
    public final void m27244a(int i, int i2) {
        this.f23132d = i;
        this.f23133e = i2;
    }

    /* renamed from: a */
    public final void m27245a(int i, int i2, boolean z) {
        synchronized (this.f23138j) {
            this.f23132d = i;
            this.f23133e = i2;
            if (this.f23145q != null && z) {
                int[] b = m27243b();
                if (b != null) {
                    PopupWindow popupWindow = this.f23145q;
                    aja.m19216a();
                    int a = hn.m19861a(this.f23140l, b[0]);
                    aja.m19216a();
                    popupWindow.update(a, hn.m19861a(this.f23140l, b[1]), this.f23145q.getWidth(), this.f23145q.getHeight());
                    m27242b(b[0], b[1]);
                } else {
                    m27247a(true);
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void m27246a(java.util.Map<java.lang.String, java.lang.String> r15) {
        /*
        r14 = this;
        r0 = r14.f23138j;
        monitor-enter(r0);
        r1 = r14.f23140l;	 Catch:{ all -> 0x031e }
        if (r1 != 0) goto L_0x000e;
    L_0x0007:
        r15 = "Not an activity context. Cannot resize.";
        r14.m19488a(r15);	 Catch:{ all -> 0x031e }
        monitor-exit(r0);	 Catch:{ all -> 0x031e }
        return;
    L_0x000e:
        r1 = r14.f23139k;	 Catch:{ all -> 0x031e }
        r1 = r1.zzsx();	 Catch:{ all -> 0x031e }
        if (r1 != 0) goto L_0x001d;
    L_0x0016:
        r15 = "Webview is not yet available, size is not set.";
        r14.m19488a(r15);	 Catch:{ all -> 0x031e }
        monitor-exit(r0);	 Catch:{ all -> 0x031e }
        return;
    L_0x001d:
        r1 = r14.f23139k;	 Catch:{ all -> 0x031e }
        r1 = r1.zzsx();	 Catch:{ all -> 0x031e }
        r1 = r1.m20048d();	 Catch:{ all -> 0x031e }
        if (r1 == 0) goto L_0x0030;
    L_0x0029:
        r15 = "Is interstitial. Cannot resize an interstitial.";
        r14.m19488a(r15);	 Catch:{ all -> 0x031e }
        monitor-exit(r0);	 Catch:{ all -> 0x031e }
        return;
    L_0x0030:
        r1 = r14.f23139k;	 Catch:{ all -> 0x031e }
        r1 = r1.zztc();	 Catch:{ all -> 0x031e }
        if (r1 == 0) goto L_0x003f;
    L_0x0038:
        r15 = "Cannot resize an expanded banner.";
        r14.m19488a(r15);	 Catch:{ all -> 0x031e }
        monitor-exit(r0);	 Catch:{ all -> 0x031e }
        return;
    L_0x003f:
        r1 = "width";
        r1 = r15.get(r1);	 Catch:{ all -> 0x031e }
        r1 = (java.lang.CharSequence) r1;	 Catch:{ all -> 0x031e }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x031e }
        if (r1 != 0) goto L_0x005e;
    L_0x004d:
        com.google.android.gms.ads.internal.ar.e();	 Catch:{ all -> 0x031e }
        r1 = "width";
        r1 = r15.get(r1);	 Catch:{ all -> 0x031e }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x031e }
        r1 = com.google.android.gms.internal.fk.m19711b(r1);	 Catch:{ all -> 0x031e }
        r14.f23137i = r1;	 Catch:{ all -> 0x031e }
    L_0x005e:
        r1 = "height";
        r1 = r15.get(r1);	 Catch:{ all -> 0x031e }
        r1 = (java.lang.CharSequence) r1;	 Catch:{ all -> 0x031e }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x031e }
        if (r1 != 0) goto L_0x007d;
    L_0x006c:
        com.google.android.gms.ads.internal.ar.e();	 Catch:{ all -> 0x031e }
        r1 = "height";
        r1 = r15.get(r1);	 Catch:{ all -> 0x031e }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x031e }
        r1 = com.google.android.gms.internal.fk.m19711b(r1);	 Catch:{ all -> 0x031e }
        r14.f23134f = r1;	 Catch:{ all -> 0x031e }
    L_0x007d:
        r1 = "offsetX";
        r1 = r15.get(r1);	 Catch:{ all -> 0x031e }
        r1 = (java.lang.CharSequence) r1;	 Catch:{ all -> 0x031e }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x031e }
        if (r1 != 0) goto L_0x009c;
    L_0x008b:
        com.google.android.gms.ads.internal.ar.e();	 Catch:{ all -> 0x031e }
        r1 = "offsetX";
        r1 = r15.get(r1);	 Catch:{ all -> 0x031e }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x031e }
        r1 = com.google.android.gms.internal.fk.m19711b(r1);	 Catch:{ all -> 0x031e }
        r14.f23135g = r1;	 Catch:{ all -> 0x031e }
    L_0x009c:
        r1 = "offsetY";
        r1 = r15.get(r1);	 Catch:{ all -> 0x031e }
        r1 = (java.lang.CharSequence) r1;	 Catch:{ all -> 0x031e }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x031e }
        if (r1 != 0) goto L_0x00bb;
    L_0x00aa:
        com.google.android.gms.ads.internal.ar.e();	 Catch:{ all -> 0x031e }
        r1 = "offsetY";
        r1 = r15.get(r1);	 Catch:{ all -> 0x031e }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x031e }
        r1 = com.google.android.gms.internal.fk.m19711b(r1);	 Catch:{ all -> 0x031e }
        r14.f23136h = r1;	 Catch:{ all -> 0x031e }
    L_0x00bb:
        r1 = "allowOffscreen";
        r1 = r15.get(r1);	 Catch:{ all -> 0x031e }
        r1 = (java.lang.CharSequence) r1;	 Catch:{ all -> 0x031e }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x031e }
        if (r1 != 0) goto L_0x00d7;
    L_0x00c9:
        r1 = "allowOffscreen";
        r1 = r15.get(r1);	 Catch:{ all -> 0x031e }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x031e }
        r1 = java.lang.Boolean.parseBoolean(r1);	 Catch:{ all -> 0x031e }
        r14.f23131c = r1;	 Catch:{ all -> 0x031e }
    L_0x00d7:
        r1 = "customClosePosition";
        r15 = r15.get(r1);	 Catch:{ all -> 0x031e }
        r15 = (java.lang.String) r15;	 Catch:{ all -> 0x031e }
        r1 = android.text.TextUtils.isEmpty(r15);	 Catch:{ all -> 0x031e }
        if (r1 != 0) goto L_0x00e7;
    L_0x00e5:
        r14.f23130b = r15;	 Catch:{ all -> 0x031e }
    L_0x00e7:
        r15 = r14.f23137i;	 Catch:{ all -> 0x031e }
        r1 = 0;
        r2 = 1;
        if (r15 < 0) goto L_0x00f3;
    L_0x00ed:
        r15 = r14.f23134f;	 Catch:{ all -> 0x031e }
        if (r15 < 0) goto L_0x00f3;
    L_0x00f1:
        r15 = 1;
        goto L_0x00f4;
    L_0x00f3:
        r15 = 0;
    L_0x00f4:
        if (r15 != 0) goto L_0x00fd;
    L_0x00f6:
        r15 = "Invalid width and height options. Cannot resize.";
        r14.m19488a(r15);	 Catch:{ all -> 0x031e }
        monitor-exit(r0);	 Catch:{ all -> 0x031e }
        return;
    L_0x00fd:
        r15 = r14.f23140l;	 Catch:{ all -> 0x031e }
        r15 = r15.getWindow();	 Catch:{ all -> 0x031e }
        if (r15 == 0) goto L_0x0317;
    L_0x0105:
        r3 = r15.getDecorView();	 Catch:{ all -> 0x031e }
        if (r3 != 0) goto L_0x010d;
    L_0x010b:
        goto L_0x0317;
    L_0x010d:
        r3 = r14.m27243b();	 Catch:{ all -> 0x031e }
        if (r3 != 0) goto L_0x011a;
    L_0x0113:
        r15 = "Resize location out of screen or close button is not visible.";
        r14.m19488a(r15);	 Catch:{ all -> 0x031e }
        monitor-exit(r0);	 Catch:{ all -> 0x031e }
        return;
    L_0x011a:
        com.google.android.gms.internal.aja.m19216a();	 Catch:{ all -> 0x031e }
        r4 = r14.f23140l;	 Catch:{ all -> 0x031e }
        r5 = r14.f23137i;	 Catch:{ all -> 0x031e }
        r4 = com.google.android.gms.internal.hn.m19861a(r4, r5);	 Catch:{ all -> 0x031e }
        com.google.android.gms.internal.aja.m19216a();	 Catch:{ all -> 0x031e }
        r5 = r14.f23140l;	 Catch:{ all -> 0x031e }
        r6 = r14.f23134f;	 Catch:{ all -> 0x031e }
        r5 = com.google.android.gms.internal.hn.m19861a(r5, r6);	 Catch:{ all -> 0x031e }
        r6 = r14.f23139k;	 Catch:{ all -> 0x031e }
        r7 = 0;
        if (r6 != 0) goto L_0x0136;
    L_0x0135:
        throw r7;	 Catch:{ all -> 0x031e }
    L_0x0136:
        r6 = (android.view.View) r6;	 Catch:{ all -> 0x031e }
        r6 = r6.getParent();	 Catch:{ all -> 0x031e }
        if (r6 == 0) goto L_0x0310;
    L_0x013e:
        r8 = r6 instanceof android.view.ViewGroup;	 Catch:{ all -> 0x031e }
        if (r8 == 0) goto L_0x0310;
    L_0x0142:
        r8 = r6;
        r8 = (android.view.ViewGroup) r8;	 Catch:{ all -> 0x031e }
        r9 = r14.f23139k;	 Catch:{ all -> 0x031e }
        if (r9 != 0) goto L_0x014a;
    L_0x0149:
        throw r7;	 Catch:{ all -> 0x031e }
    L_0x014a:
        r9 = (android.view.View) r9;	 Catch:{ all -> 0x031e }
        r8.removeView(r9);	 Catch:{ all -> 0x031e }
        r8 = r14.f23145q;	 Catch:{ all -> 0x031e }
        if (r8 != 0) goto L_0x0183;
    L_0x0153:
        r6 = (android.view.ViewGroup) r6;	 Catch:{ all -> 0x031e }
        r14.f23147s = r6;	 Catch:{ all -> 0x031e }
        com.google.android.gms.ads.internal.ar.e();	 Catch:{ all -> 0x031e }
        r6 = r14.f23139k;	 Catch:{ all -> 0x031e }
        if (r6 != 0) goto L_0x015f;
    L_0x015e:
        throw r7;	 Catch:{ all -> 0x031e }
    L_0x015f:
        r6 = (android.view.View) r6;	 Catch:{ all -> 0x031e }
        r6 = com.google.android.gms.internal.fk.m19679a(r6);	 Catch:{ all -> 0x031e }
        r8 = new android.widget.ImageView;	 Catch:{ all -> 0x031e }
        r9 = r14.f23140l;	 Catch:{ all -> 0x031e }
        r8.<init>(r9);	 Catch:{ all -> 0x031e }
        r14.f23142n = r8;	 Catch:{ all -> 0x031e }
        r8 = r14.f23142n;	 Catch:{ all -> 0x031e }
        r8.setImageBitmap(r6);	 Catch:{ all -> 0x031e }
        r6 = r14.f23139k;	 Catch:{ all -> 0x031e }
        r6 = r6.zzsx();	 Catch:{ all -> 0x031e }
        r14.f23141m = r6;	 Catch:{ all -> 0x031e }
        r6 = r14.f23147s;	 Catch:{ all -> 0x031e }
        r8 = r14.f23142n;	 Catch:{ all -> 0x031e }
        r6.addView(r8);	 Catch:{ all -> 0x031e }
        goto L_0x0188;
    L_0x0183:
        r6 = r14.f23145q;	 Catch:{ all -> 0x031e }
        r6.dismiss();	 Catch:{ all -> 0x031e }
    L_0x0188:
        r6 = new android.widget.RelativeLayout;	 Catch:{ all -> 0x031e }
        r8 = r14.f23140l;	 Catch:{ all -> 0x031e }
        r6.<init>(r8);	 Catch:{ all -> 0x031e }
        r14.f23146r = r6;	 Catch:{ all -> 0x031e }
        r6 = r14.f23146r;	 Catch:{ all -> 0x031e }
        r6.setBackgroundColor(r1);	 Catch:{ all -> 0x031e }
        r6 = r14.f23146r;	 Catch:{ all -> 0x031e }
        r8 = new android.view.ViewGroup$LayoutParams;	 Catch:{ all -> 0x031e }
        r8.<init>(r4, r5);	 Catch:{ all -> 0x031e }
        r6.setLayoutParams(r8);	 Catch:{ all -> 0x031e }
        com.google.android.gms.ads.internal.ar.e();	 Catch:{ all -> 0x031e }
        r6 = r14.f23146r;	 Catch:{ all -> 0x031e }
        r6 = com.google.android.gms.internal.fk.m19683a(r6, r4, r5, r1);	 Catch:{ all -> 0x031e }
        r14.f23145q = r6;	 Catch:{ all -> 0x031e }
        r6 = r14.f23145q;	 Catch:{ all -> 0x031e }
        r6.setOutsideTouchable(r2);	 Catch:{ all -> 0x031e }
        r6 = r14.f23145q;	 Catch:{ all -> 0x031e }
        r6.setTouchable(r2);	 Catch:{ all -> 0x031e }
        r6 = r14.f23145q;	 Catch:{ all -> 0x031e }
        r8 = r14.f23131c;	 Catch:{ all -> 0x031e }
        r8 = r8 ^ r2;
        r6.setClippingEnabled(r8);	 Catch:{ all -> 0x031e }
        r6 = r14.f23146r;	 Catch:{ all -> 0x031e }
        r8 = r14.f23139k;	 Catch:{ all -> 0x031e }
        if (r8 != 0) goto L_0x01c4;
    L_0x01c3:
        throw r7;	 Catch:{ all -> 0x031e }
    L_0x01c4:
        r8 = (android.view.View) r8;	 Catch:{ all -> 0x031e }
        r9 = -1;
        r6.addView(r8, r9, r9);	 Catch:{ all -> 0x031e }
        r6 = new android.widget.LinearLayout;	 Catch:{ all -> 0x031e }
        r8 = r14.f23140l;	 Catch:{ all -> 0x031e }
        r6.<init>(r8);	 Catch:{ all -> 0x031e }
        r14.f23143o = r6;	 Catch:{ all -> 0x031e }
        r6 = new android.widget.RelativeLayout$LayoutParams;	 Catch:{ all -> 0x031e }
        com.google.android.gms.internal.aja.m19216a();	 Catch:{ all -> 0x031e }
        r8 = r14.f23140l;	 Catch:{ all -> 0x031e }
        r10 = 50;
        r8 = com.google.android.gms.internal.hn.m19861a(r8, r10);	 Catch:{ all -> 0x031e }
        com.google.android.gms.internal.aja.m19216a();	 Catch:{ all -> 0x031e }
        r11 = r14.f23140l;	 Catch:{ all -> 0x031e }
        r10 = com.google.android.gms.internal.hn.m19861a(r11, r10);	 Catch:{ all -> 0x031e }
        r6.<init>(r8, r10);	 Catch:{ all -> 0x031e }
        r8 = r14.f23130b;	 Catch:{ all -> 0x031e }
        r10 = r8.hashCode();	 Catch:{ all -> 0x031e }
        switch(r10) {
            case -1364013995: goto L_0x0228;
            case -1012429441: goto L_0x021e;
            case -655373719: goto L_0x0214;
            case 1163912186: goto L_0x020a;
            case 1288627767: goto L_0x0200;
            case 1755462605: goto L_0x01f6;
            default: goto L_0x01f5;
        };	 Catch:{ all -> 0x031e }
    L_0x01f5:
        goto L_0x0232;
    L_0x01f6:
        r10 = "top-center";
        r8 = r8.equals(r10);	 Catch:{ all -> 0x031e }
        if (r8 == 0) goto L_0x0232;
    L_0x01fe:
        r8 = 1;
        goto L_0x0233;
    L_0x0200:
        r10 = "bottom-center";
        r8 = r8.equals(r10);	 Catch:{ all -> 0x031e }
        if (r8 == 0) goto L_0x0232;
    L_0x0208:
        r8 = 4;
        goto L_0x0233;
    L_0x020a:
        r10 = "bottom-right";
        r8 = r8.equals(r10);	 Catch:{ all -> 0x031e }
        if (r8 == 0) goto L_0x0232;
    L_0x0212:
        r8 = 5;
        goto L_0x0233;
    L_0x0214:
        r10 = "bottom-left";
        r8 = r8.equals(r10);	 Catch:{ all -> 0x031e }
        if (r8 == 0) goto L_0x0232;
    L_0x021c:
        r8 = 3;
        goto L_0x0233;
    L_0x021e:
        r10 = "top-left";
        r8 = r8.equals(r10);	 Catch:{ all -> 0x031e }
        if (r8 == 0) goto L_0x0232;
    L_0x0226:
        r8 = 0;
        goto L_0x0233;
    L_0x0228:
        r10 = "center";
        r8 = r8.equals(r10);	 Catch:{ all -> 0x031e }
        if (r8 == 0) goto L_0x0232;
    L_0x0230:
        r8 = 2;
        goto L_0x0233;
    L_0x0232:
        r8 = -1;
    L_0x0233:
        r9 = 9;
        r10 = 14;
        r11 = 11;
        r12 = 12;
        r13 = 10;
        switch(r8) {
            case 0: goto L_0x0263;
            case 1: goto L_0x025f;
            case 2: goto L_0x0259;
            case 3: goto L_0x0252;
            case 4: goto L_0x024b;
            case 5: goto L_0x0244;
            default: goto L_0x0240;
        };	 Catch:{ all -> 0x031e }
    L_0x0240:
        r6.addRule(r13);	 Catch:{ all -> 0x031e }
        goto L_0x0247;
    L_0x0244:
        r6.addRule(r12);	 Catch:{ all -> 0x031e }
    L_0x0247:
        r6.addRule(r11);	 Catch:{ all -> 0x031e }
        goto L_0x0267;
    L_0x024b:
        r6.addRule(r12);	 Catch:{ all -> 0x031e }
    L_0x024e:
        r6.addRule(r10);	 Catch:{ all -> 0x031e }
        goto L_0x0267;
    L_0x0252:
        r6.addRule(r12);	 Catch:{ all -> 0x031e }
    L_0x0255:
        r6.addRule(r9);	 Catch:{ all -> 0x031e }
        goto L_0x0267;
    L_0x0259:
        r8 = 13;
        r6.addRule(r8);	 Catch:{ all -> 0x031e }
        goto L_0x0267;
    L_0x025f:
        r6.addRule(r13);	 Catch:{ all -> 0x031e }
        goto L_0x024e;
    L_0x0263:
        r6.addRule(r13);	 Catch:{ all -> 0x031e }
        goto L_0x0255;
    L_0x0267:
        r8 = r14.f23143o;	 Catch:{ all -> 0x031e }
        r9 = new com.google.android.gms.internal.atm;	 Catch:{ all -> 0x031e }
        r9.<init>(r14);	 Catch:{ all -> 0x031e }
        r8.setOnClickListener(r9);	 Catch:{ all -> 0x031e }
        r8 = r14.f23143o;	 Catch:{ all -> 0x031e }
        r9 = "Close button";
        r8.setContentDescription(r9);	 Catch:{ all -> 0x031e }
        r8 = r14.f23146r;	 Catch:{ all -> 0x031e }
        r9 = r14.f23143o;	 Catch:{ all -> 0x031e }
        r8.addView(r9, r6);	 Catch:{ all -> 0x031e }
        r6 = r14.f23145q;	 Catch:{ RuntimeException -> 0x02c6 }
        r15 = r15.getDecorView();	 Catch:{ RuntimeException -> 0x02c6 }
        com.google.android.gms.internal.aja.m19216a();	 Catch:{ RuntimeException -> 0x02c6 }
        r8 = r14.f23140l;	 Catch:{ RuntimeException -> 0x02c6 }
        r9 = r3[r1];	 Catch:{ RuntimeException -> 0x02c6 }
        r8 = com.google.android.gms.internal.hn.m19861a(r8, r9);	 Catch:{ RuntimeException -> 0x02c6 }
        com.google.android.gms.internal.aja.m19216a();	 Catch:{ RuntimeException -> 0x02c6 }
        r9 = r14.f23140l;	 Catch:{ RuntimeException -> 0x02c6 }
        r10 = r3[r2];	 Catch:{ RuntimeException -> 0x02c6 }
        r9 = com.google.android.gms.internal.hn.m19861a(r9, r10);	 Catch:{ RuntimeException -> 0x02c6 }
        r6.showAtLocation(r15, r1, r8, r9);	 Catch:{ RuntimeException -> 0x02c6 }
        r15 = r3[r1];	 Catch:{ all -> 0x031e }
        r6 = r3[r2];	 Catch:{ all -> 0x031e }
        r7 = r14.f23144p;	 Catch:{ all -> 0x031e }
        if (r7 == 0) goto L_0x02af;
    L_0x02a6:
        r7 = r14.f23144p;	 Catch:{ all -> 0x031e }
        r8 = r14.f23137i;	 Catch:{ all -> 0x031e }
        r9 = r14.f23134f;	 Catch:{ all -> 0x031e }
        r7.zza(r15, r6, r8, r9);	 Catch:{ all -> 0x031e }
    L_0x02af:
        r15 = r14.f23139k;	 Catch:{ all -> 0x031e }
        r4 = com.google.android.gms.internal.mb.m20044a(r4, r5);	 Catch:{ all -> 0x031e }
        r15.zza(r4);	 Catch:{ all -> 0x031e }
        r15 = r3[r1];	 Catch:{ all -> 0x031e }
        r1 = r3[r2];	 Catch:{ all -> 0x031e }
        r14.m27242b(r15, r1);	 Catch:{ all -> 0x031e }
        r15 = "resized";
        r14.m19491c(r15);	 Catch:{ all -> 0x031e }
        monitor-exit(r0);	 Catch:{ all -> 0x031e }
        return;
    L_0x02c6:
        r15 = move-exception;
        r1 = "Cannot show popup window: ";
        r15 = r15.getMessage();	 Catch:{ all -> 0x031e }
        r15 = java.lang.String.valueOf(r15);	 Catch:{ all -> 0x031e }
        r2 = r15.length();	 Catch:{ all -> 0x031e }
        if (r2 == 0) goto L_0x02dc;
    L_0x02d7:
        r15 = r1.concat(r15);	 Catch:{ all -> 0x031e }
        goto L_0x02e1;
    L_0x02dc:
        r15 = new java.lang.String;	 Catch:{ all -> 0x031e }
        r15.<init>(r1);	 Catch:{ all -> 0x031e }
    L_0x02e1:
        r14.m19488a(r15);	 Catch:{ all -> 0x031e }
        r15 = r14.f23146r;	 Catch:{ all -> 0x031e }
        r1 = r14.f23139k;	 Catch:{ all -> 0x031e }
        if (r1 != 0) goto L_0x02eb;
    L_0x02ea:
        throw r7;	 Catch:{ all -> 0x031e }
    L_0x02eb:
        r1 = (android.view.View) r1;	 Catch:{ all -> 0x031e }
        r15.removeView(r1);	 Catch:{ all -> 0x031e }
        r15 = r14.f23147s;	 Catch:{ all -> 0x031e }
        if (r15 == 0) goto L_0x030e;
    L_0x02f4:
        r15 = r14.f23147s;	 Catch:{ all -> 0x031e }
        r1 = r14.f23142n;	 Catch:{ all -> 0x031e }
        r15.removeView(r1);	 Catch:{ all -> 0x031e }
        r15 = r14.f23147s;	 Catch:{ all -> 0x031e }
        r1 = r14.f23139k;	 Catch:{ all -> 0x031e }
        if (r1 != 0) goto L_0x0302;
    L_0x0301:
        throw r7;	 Catch:{ all -> 0x031e }
    L_0x0302:
        r1 = (android.view.View) r1;	 Catch:{ all -> 0x031e }
        r15.addView(r1);	 Catch:{ all -> 0x031e }
        r15 = r14.f23139k;	 Catch:{ all -> 0x031e }
        r1 = r14.f23141m;	 Catch:{ all -> 0x031e }
        r15.zza(r1);	 Catch:{ all -> 0x031e }
    L_0x030e:
        monitor-exit(r0);	 Catch:{ all -> 0x031e }
        return;
    L_0x0310:
        r15 = "Webview is detached, probably in the middle of a resize or expand.";
        r14.m19488a(r15);	 Catch:{ all -> 0x031e }
        monitor-exit(r0);	 Catch:{ all -> 0x031e }
        return;
    L_0x0317:
        r15 = "Activity context is not ready, cannot get window or decor view.";
        r14.m19488a(r15);	 Catch:{ all -> 0x031e }
        monitor-exit(r0);	 Catch:{ all -> 0x031e }
        return;
    L_0x031e:
        r15 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x031e }
        throw r15;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.atl.a(java.util.Map):void");
    }

    /* renamed from: a */
    public final void m27247a(boolean z) {
        synchronized (this.f23138j) {
            if (this.f23145q != null) {
                this.f23145q.dismiss();
                RelativeLayout relativeLayout = this.f23146r;
                zzanh zzanh = this.f23139k;
                if (zzanh == null) {
                    throw null;
                }
                relativeLayout.removeView((View) zzanh);
                if (this.f23147s != null) {
                    this.f23147s.removeView(this.f23142n);
                    ViewGroup viewGroup = this.f23147s;
                    zzanh = this.f23139k;
                    if (zzanh == null) {
                        throw null;
                    }
                    viewGroup.addView((View) zzanh);
                    this.f23139k.zza(this.f23141m);
                }
                if (z) {
                    m19491c("default");
                    if (this.f23144p != null) {
                        this.f23144p.zzcu();
                    }
                }
                this.f23145q = null;
                this.f23146r = null;
                this.f23147s = null;
                this.f23143o = null;
            }
        }
    }

    /* renamed from: a */
    public final boolean m27248a() {
        boolean z;
        synchronized (this.f23138j) {
            z = this.f23145q != null;
        }
        return z;
    }
}
