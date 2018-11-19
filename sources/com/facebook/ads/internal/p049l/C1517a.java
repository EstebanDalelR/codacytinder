package com.facebook.ads.internal.p049l;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.p047k.C1490h;
import com.facebook.ads.internal.p047k.ao;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.l.a */
public class C1517a {
    /* renamed from: a */
    private static final String f4203a = "a";
    /* renamed from: b */
    private final View f4204b;
    /* renamed from: c */
    private final int f4205c;
    /* renamed from: d */
    private final int f4206d;
    /* renamed from: e */
    private final C1516a f4207e;
    /* renamed from: f */
    private final Handler f4208f;
    /* renamed from: g */
    private final boolean f4209g;
    /* renamed from: h */
    private Runnable f4210h;
    /* renamed from: i */
    private int f4211i;
    /* renamed from: j */
    private int f4212j;
    /* renamed from: k */
    private boolean f4213k;
    /* renamed from: l */
    private C1518b f4214l;
    /* renamed from: m */
    private Map<String, Integer> f4215m;
    /* renamed from: n */
    private long f4216n;
    /* renamed from: o */
    private int f4217o;

    /* renamed from: com.facebook.ads.internal.l.a$a */
    public static abstract class C1516a {
        /* renamed from: a */
        public abstract void mo1681a();

        /* renamed from: b */
        public void mo1829b() {
        }
    }

    /* renamed from: com.facebook.ads.internal.l.a$b */
    private static final class C3321b extends ao<C1517a> {
        C3321b(C1517a c1517a) {
            super(c1517a);
        }

        public void run() {
            C1517a c1517a = (C1517a) m5207a();
            if (c1517a != null) {
                View a = c1517a.f4204b;
                C1516a b = c1517a.f4207e;
                if (a != null && b != null) {
                    C1518b a2 = C1517a.m5330a(a, c1517a.f4205c);
                    int i = 0;
                    if (a2.m5354a()) {
                        c1517a.f4217o = c1517a.f4217o + 1;
                    } else {
                        c1517a.f4217o = 0;
                    }
                    Object obj = c1517a.f4217o > c1517a.f4206d ? 1 : null;
                    Object obj2 = (c1517a.f4214l == null || !c1517a.f4214l.m5354a()) ? null : 1;
                    if (!(obj == null && a2.m5354a())) {
                        c1517a.f4214l = a2;
                    }
                    String valueOf = String.valueOf(a2.m5355b());
                    synchronized (c1517a) {
                        if (c1517a.f4215m.containsKey(valueOf)) {
                            i = ((Integer) c1517a.f4215m.get(valueOf)).intValue();
                        }
                        c1517a.f4215m.put(valueOf, Integer.valueOf(i + 1));
                    }
                    if (obj != null && obj2 == null) {
                        c1517a.f4216n = System.currentTimeMillis();
                        b.mo1681a();
                        if (!c1517a.f4209g) {
                            return;
                        }
                    } else if (obj == null && obj2 != null) {
                        b.mo1829b();
                    }
                    if (!(c1517a.f4213k || c1517a.f4210h == null)) {
                        c1517a.f4208f.postDelayed(c1517a.f4210h, (long) c1517a.f4212j);
                    }
                }
            }
        }
    }

    public C1517a(View view, int i, int i2, boolean z, C1516a c1516a) {
        this.f4208f = new Handler();
        this.f4211i = 0;
        this.f4212j = AdError.NETWORK_ERROR_CODE;
        this.f4213k = true;
        this.f4214l = new C1518b(C1519c.UNKNOWN);
        this.f4215m = new HashMap();
        this.f4216n = 0;
        this.f4217o = 0;
        this.f4204b = view;
        this.f4205c = i;
        this.f4207e = c1516a;
        this.f4209g = z;
        if (i2 < 0) {
            i2 = 0;
        }
        this.f4206d = i2;
    }

    public C1517a(View view, int i, C1516a c1516a) {
        this(view, i, 0, false, c1516a);
    }

    public C1517a(View view, int i, boolean z, C1516a c1516a) {
        this(view, i, 0, z, c1516a);
    }

    /* renamed from: a */
    private static int m5326a(Vector<Rect> vector) {
        int size = vector.size();
        int i = size * 2;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        boolean[][] zArr = (boolean[][]) Array.newInstance(boolean.class, new int[]{i, i});
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < size) {
            Rect rect = (Rect) vector.elementAt(i2);
            int i5 = i3 + 1;
            iArr[i3] = rect.left;
            i3 = i4 + 1;
            iArr2[i4] = rect.bottom;
            i4 = i5 + 1;
            iArr[i5] = rect.right;
            i5 = i3 + 1;
            iArr2[i3] = rect.top;
            i2++;
            i3 = i4;
            i4 = i5;
        }
        Arrays.sort(iArr);
        Arrays.sort(iArr2);
        for (i2 = 0; i2 < size; i2++) {
            Rect rect2 = (Rect) vector.elementAt(i2);
            i4 = C1517a.m5327a(iArr, rect2.left);
            int a = C1517a.m5327a(iArr, rect2.right);
            i5 = C1517a.m5327a(iArr2, rect2.top);
            i3 = C1517a.m5327a(iArr2, rect2.bottom);
            for (i4++; i4 <= a; i4++) {
                for (int i6 = i5 + 1; i6 <= i3; i6++) {
                    zArr[i4][i6] = true;
                }
            }
        }
        int i7 = 0;
        size = 0;
        while (i7 < i) {
            i2 = size;
            for (size = 0; size < i; size++) {
                i2 += zArr[i7][size] ? (iArr[i7] - iArr[i7 - 1]) * (iArr2[size] - iArr2[size - 1]) : 0;
            }
            i7++;
            size = i2;
        }
        return size;
    }

    /* renamed from: a */
    private static int m5327a(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = ((length - i2) / 2) + i2;
            if (iArr[i3] == i) {
                return i3;
            }
            if (iArr[i3] > i) {
                length = i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static com.facebook.ads.internal.p049l.C1518b m5330a(android.view.View r17, int r18) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = r17;
        r1 = 0;
        if (r0 != 0) goto L_0x0013;
    L_0x0005:
        r0 = 0;
        r2 = "adView is null.";
        com.facebook.ads.internal.p049l.C1517a.m5333a(r0, r1, r2);
        r0 = new com.facebook.ads.internal.l.b;
        r1 = com.facebook.ads.internal.p049l.C1519c.AD_IS_NULL;
        r0.<init>(r1);
        return r0;
    L_0x0013:
        r2 = r17.getParent();
        if (r2 != 0) goto L_0x0026;
    L_0x0019:
        r2 = "adView has no parent.";
        com.facebook.ads.internal.p049l.C1517a.m5333a(r0, r1, r2);
        r0 = new com.facebook.ads.internal.l.b;
        r1 = com.facebook.ads.internal.p049l.C1519c.INVALID_PARENT;
        r0.<init>(r1);
        return r0;
    L_0x0026:
        r2 = r17.isShown();
        if (r2 != 0) goto L_0x0039;
    L_0x002c:
        r2 = "adView parent is not set to VISIBLE.";
        com.facebook.ads.internal.p049l.C1517a.m5333a(r0, r1, r2);
        r0 = new com.facebook.ads.internal.l.b;
        r1 = com.facebook.ads.internal.p049l.C1519c.INVALID_PARENT;
        r0.<init>(r1);
        return r0;
    L_0x0039:
        r2 = r17.getWindowVisibility();
        if (r2 == 0) goto L_0x004c;
    L_0x003f:
        r2 = "adView window is not set to VISIBLE.";
        com.facebook.ads.internal.p049l.C1517a.m5333a(r0, r1, r2);
        r0 = new com.facebook.ads.internal.l.b;
        r1 = com.facebook.ads.internal.p049l.C1519c.INVALID_WINDOW;
        r0.<init>(r1);
        return r0;
    L_0x004c:
        r2 = r17.getMeasuredWidth();
        if (r2 <= 0) goto L_0x01d7;
    L_0x0052:
        r2 = r17.getMeasuredHeight();
        if (r2 > 0) goto L_0x005a;
    L_0x0058:
        goto L_0x01d7;
    L_0x005a:
        r2 = r17.getAlpha();
        r3 = 1063675494; // 0x3f666666 float:0.9 double:5.2552552E-315;
        r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r2 >= 0) goto L_0x0072;
    L_0x0065:
        r2 = "adView is too transparent.";
        com.facebook.ads.internal.p049l.C1517a.m5333a(r0, r1, r2);
        r0 = new com.facebook.ads.internal.l.b;
        r1 = com.facebook.ads.internal.p049l.C1519c.AD_IS_TRANSPARENT;
        r0.<init>(r1);
        return r0;
    L_0x0072:
        r2 = r17.getWidth();
        r3 = r17.getHeight();
        r4 = 2;
        r5 = new int[r4];
        r0.getLocationOnScreen(r5);	 Catch:{ NullPointerException -> 0x01ca }
        r6 = new android.graphics.Rect;
        r6.<init>();
        r7 = r0.getGlobalVisibleRect(r6);
        if (r7 != 0) goto L_0x0093;
    L_0x008b:
        r0 = new com.facebook.ads.internal.l.b;
        r1 = com.facebook.ads.internal.p049l.C1519c.AD_IS_NOT_VISIBLE;
        r0.<init>(r1);
        return r0;
    L_0x0093:
        r7 = r17.getContext();
        r8 = r7.getResources();
        r8 = r8.getDisplayMetrics();
        r9 = 0;
        r10 = com.facebook.ads.internal.C1418g.m4945p(r7);
        r11 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r12 = 1;
        if (r10 == 0) goto L_0x00d2;
    L_0x00a9:
        r6 = new android.graphics.Rect;
        r10 = r8.widthPixels;
        r13 = r8.heightPixels;
        r6.<init>(r1, r1, r10, r13);
        r10 = r5[r1];
        r13 = r5[r12];
        r14 = r5[r1];
        r14 = r14 + r2;
        r15 = r5[r12];
        r15 = r15 + r3;
        r10 = r6.intersect(r10, r13, r14, r15);
        if (r10 == 0) goto L_0x00f2;
    L_0x00c2:
        r9 = r6.width();
        r6 = r6.height();
        r9 = r9 * r6;
        r6 = (float) r9;
        r6 = r6 * r11;
        r9 = r2 * r3;
        goto L_0x00ef;
    L_0x00d2:
        r9 = com.facebook.ads.internal.p049l.C1517a.m5332a(r17);
        r10 = com.facebook.ads.internal.p049l.C1517a.m5326a(r9);
        r9.add(r6);
        r6 = com.facebook.ads.internal.p049l.C1517a.m5326a(r9);
        r6 = r6 - r10;
        r9 = r17.getMeasuredHeight();
        r10 = r17.getMeasuredWidth();
        r9 = r9 * r10;
        r6 = (float) r6;
        r6 = r6 * r11;
    L_0x00ef:
        r9 = (float) r9;
        r9 = r6 / r9;
    L_0x00f2:
        r6 = com.facebook.ads.internal.C1418g.m4943n(r7);
        r10 = com.facebook.ads.internal.C1418g.m4944o(r7);
        if (r6 == 0) goto L_0x0126;
    L_0x00fc:
        r2 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        r9 = r9 * r2;
        r2 = (float) r10;
        r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x016d;
    L_0x0105:
        r2 = java.util.Locale.US;
        r3 = "adView visible area is too small [%.2f%% visible, current threshold %d%%]";
        r4 = new java.lang.Object[r4];
        r5 = java.lang.Float.valueOf(r9);
        r4[r1] = r5;
        r5 = java.lang.Integer.valueOf(r10);
        r4[r12] = r5;
        r2 = java.lang.String.format(r2, r3, r4);
        com.facebook.ads.internal.p049l.C1517a.m5333a(r0, r1, r2);
        r0 = new com.facebook.ads.internal.l.b;
        r1 = com.facebook.ads.internal.p049l.C1519c.AD_INSUFFICIENT_VISIBLE_AREA;
        r0.<init>(r1, r9);
        return r0;
    L_0x0126:
        r4 = r5[r1];
        if (r4 < 0) goto L_0x01bd;
    L_0x012a:
        r4 = r8.widthPixels;
        r6 = r5[r1];
        r4 = r4 - r6;
        if (r4 >= r2) goto L_0x0133;
    L_0x0131:
        goto L_0x01bd;
    L_0x0133:
        r10 = (double) r3;
        r2 = r18;
        r13 = (double) r2;
        r15 = 4636737291354636288; // 0x4059000000000000 float:0.0 double:100.0;
        r13 = r15 - r13;
        r10 = r10 * r13;
        r10 = r10 / r15;
        r2 = (int) r10;
        r4 = r5[r12];
        if (r4 >= 0) goto L_0x0158;
    L_0x0143:
        r4 = r5[r12];
        r4 = java.lang.Math.abs(r4);
        if (r4 <= r2) goto L_0x0158;
    L_0x014b:
        r2 = "adView is not visible from the top.";
        com.facebook.ads.internal.p049l.C1517a.m5333a(r0, r1, r2);
        r0 = new com.facebook.ads.internal.l.b;
        r1 = com.facebook.ads.internal.p049l.C1519c.AD_OFFSCREEN_TOP;
        r0.<init>(r1, r9);
        return r0;
    L_0x0158:
        r4 = r5[r12];
        r4 = r4 + r3;
        r3 = r8.heightPixels;
        r4 = r4 - r3;
        if (r4 <= r2) goto L_0x016d;
    L_0x0160:
        r2 = "adView is not visible from the bottom.";
        com.facebook.ads.internal.p049l.C1517a.m5333a(r0, r1, r2);
        r0 = new com.facebook.ads.internal.l.b;
        r1 = com.facebook.ads.internal.p049l.C1519c.AD_OFFSCREEN_BOTTOM;
        r0.<init>(r1, r9);
        return r0;
    L_0x016d:
        r2 = com.facebook.ads.internal.p047k.C1504q.m5295b(r7);
        if (r2 != 0) goto L_0x0180;
    L_0x0173:
        r2 = "Screen is not interactive.";
        com.facebook.ads.internal.p049l.C1517a.m5333a(r0, r1, r2);
        r0 = new com.facebook.ads.internal.l.b;
        r1 = com.facebook.ads.internal.p049l.C1519c.SCREEN_NOT_INTERACTIVE;
        r0.<init>(r1, r9);
        return r0;
    L_0x0180:
        r2 = com.facebook.ads.internal.p047k.ap.m5208a(r7);
        r3 = com.facebook.ads.internal.p047k.ap.m5209a(r2);
        if (r3 == 0) goto L_0x0197;
    L_0x018a:
        r2 = "Keyguard is obstructing view.";
        com.facebook.ads.internal.p049l.C1517a.m5333a(r0, r1, r2);
        r0 = new com.facebook.ads.internal.l.b;
        r1 = com.facebook.ads.internal.p049l.C1519c.AD_IS_OBSTRUCTED_BY_KEYGUARD;
        r0.<init>(r1, r9);
        return r0;
    L_0x0197:
        r3 = com.facebook.ads.internal.C1418g.m4932c(r7);
        if (r3 == 0) goto L_0x01b0;
    L_0x019d:
        r3 = com.facebook.ads.internal.p047k.ap.m5211b(r2);
        if (r3 == 0) goto L_0x01b0;
    L_0x01a3:
        r3 = "Ad is on top of the Lockscreen.";
        com.facebook.ads.internal.p049l.C1517a.m5333a(r0, r1, r3);
        r0 = new com.facebook.ads.internal.l.b;
        r1 = com.facebook.ads.internal.p049l.C1519c.AD_IN_LOCKSCREEN;
        r0.<init>(r1, r9, r2);
        return r0;
    L_0x01b0:
        r1 = "adView is visible.";
        com.facebook.ads.internal.p049l.C1517a.m5333a(r0, r12, r1);
        r0 = new com.facebook.ads.internal.l.b;
        r1 = com.facebook.ads.internal.p049l.C1519c.IS_VIEWABLE;
        r0.<init>(r1, r9, r2);
        return r0;
    L_0x01bd:
        r2 = "adView is not fully on screen horizontally.";
        com.facebook.ads.internal.p049l.C1517a.m5333a(r0, r1, r2);
        r0 = new com.facebook.ads.internal.l.b;
        r1 = com.facebook.ads.internal.p049l.C1519c.AD_OFFSCREEN_HORIZONTALLY;
        r0.<init>(r1, r9);
        return r0;
    L_0x01ca:
        r2 = "Cannot get location on screen.";
        com.facebook.ads.internal.p049l.C1517a.m5333a(r0, r1, r2);
        r0 = new com.facebook.ads.internal.l.b;
        r1 = com.facebook.ads.internal.p049l.C1519c.INVALID_DIMENSIONS;
        r0.<init>(r1);
        return r0;
    L_0x01d7:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "adView has invisible dimensions (w=";
        r2.append(r3);
        r3 = r17.getMeasuredWidth();
        r2.append(r3);
        r3 = ", h=";
        r2.append(r3);
        r3 = r17.getMeasuredHeight();
        r2.append(r3);
        r2 = r2.toString();
        com.facebook.ads.internal.p049l.C1517a.m5333a(r0, r1, r2);
        r0 = new com.facebook.ads.internal.l.b;
        r1 = com.facebook.ads.internal.p049l.C1519c.INVALID_DIMENSIONS;
        r0.<init>(r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.l.a.a(android.view.View, int):com.facebook.ads.internal.l.b");
    }

    /* renamed from: a */
    private static Vector<Rect> m5332a(View view) {
        Vector<Rect> vector = new Vector();
        if (!(view.getParent() instanceof ViewGroup)) {
            return vector;
        }
        View view2 = (ViewGroup) view.getParent();
        int indexOfChild = view2.indexOfChild(view);
        while (true) {
            indexOfChild++;
            if (indexOfChild < view2.getChildCount()) {
                vector.addAll(C1517a.m5335b(view2.getChildAt(indexOfChild)));
            } else {
                vector.addAll(C1517a.m5332a(view2));
                return vector;
            }
        }
    }

    /* renamed from: a */
    private static void m5333a(View view, boolean z, String str) {
    }

    /* renamed from: b */
    private static Vector<Rect> m5335b(View view) {
        Vector<Rect> vector = new Vector();
        if (!view.isShown() || (VERSION.SDK_INT >= 11 && view.getAlpha() <= 0.0f)) {
            return vector;
        }
        if ((view instanceof ViewGroup) && C1517a.m5337c(view)) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                vector.addAll(C1517a.m5335b(viewGroup.getChildAt(i)));
            }
            return vector;
        }
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            vector.add(rect);
        }
        return vector;
    }

    /* renamed from: c */
    private static boolean m5337c(View view) {
        if (view.getBackground() != null) {
            if (VERSION.SDK_INT < 19 || view.getBackground().getAlpha() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void m5348a() {
        if (this.f4210h != null) {
            m5351b();
        }
        this.f4210h = new C3321b(this);
        this.f4208f.postDelayed(this.f4210h, (long) this.f4211i);
        this.f4213k = false;
        this.f4217o = 0;
        this.f4214l = new C1518b(C1519c.UNKNOWN);
        this.f4215m = new HashMap();
    }

    /* renamed from: a */
    public void m5349a(int i) {
        this.f4211i = i;
    }

    /* renamed from: a */
    public void m5350a(Map<String, String> map) {
        map.put("vrc", String.valueOf(this.f4214l.m5355b()));
        map.put("vp", String.valueOf(this.f4214l.m5356c()));
        map.put("vh", new JSONObject(this.f4215m).toString());
        map.put("vt", C1490h.m5242a(this.f4216n));
        map.putAll(this.f4214l.m5357d());
    }

    /* renamed from: b */
    public void m5351b() {
        this.f4208f.removeCallbacks(this.f4210h);
        this.f4210h = null;
        this.f4213k = true;
        this.f4217o = 0;
    }

    /* renamed from: b */
    public void m5352b(int i) {
        this.f4212j = i;
    }

    /* renamed from: c */
    public String m5353c() {
        C1519c c1519c = C1519c.values()[this.f4214l.m5355b()];
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c1519c.toString());
        stringBuilder.append(String.format(" (%.1f%%)", new Object[]{Float.valueOf(this.f4214l.m5356c() * 100.0f)}));
        return stringBuilder.toString();
    }
}
