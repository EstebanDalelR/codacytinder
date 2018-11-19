package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.common.util.C2526k;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@zzzv
public final class anf extends anr implements OnClickListener, OnTouchListener, OnGlobalLayoutListener, OnScrollChangedListener {
    /* renamed from: b */
    private static String[] f26729b = new String[]{"2011", "1009"};
    @Nullable
    /* renamed from: a */
    FrameLayout f26730a;
    /* renamed from: c */
    private final Object f26731c = new Object();
    /* renamed from: d */
    private final FrameLayout f26732d;
    /* renamed from: e */
    private View f26733e;
    /* renamed from: f */
    private final boolean f26734f;
    /* renamed from: g */
    private Map<String, WeakReference<View>> f26735g = Collections.synchronizedMap(new HashMap());
    @Nullable
    /* renamed from: h */
    private View f26736h;
    @Nullable
    /* renamed from: i */
    private zzos f26737i;
    /* renamed from: j */
    private boolean f26738j = false;
    /* renamed from: k */
    private Point f26739k = new Point();
    /* renamed from: l */
    private Point f26740l = new Point();
    /* renamed from: m */
    private WeakReference<aga> f26741m = new WeakReference(null);

    @TargetApi(21)
    public anf(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.f26732d = frameLayout;
        this.f26730a = frameLayout2;
        ar.y();
        jb.m19936a(this.f26732d, (OnGlobalLayoutListener) this);
        ar.y();
        jb.m19937a(this.f26732d, (OnScrollChangedListener) this);
        this.f26732d.setOnTouchListener(this);
        this.f26732d.setOnClickListener(this);
        if (frameLayout2 != null && C2526k.g()) {
            frameLayout2.setElevation(Float.MAX_VALUE);
        }
        alo.m19337a(this.f26732d.getContext());
        this.f26734f = ((Boolean) aja.m19221f().m19334a(alo.bU)).booleanValue();
    }

    /* renamed from: a */
    private final int m31457a(int i) {
        aja.m19216a();
        return hn.m19871b(this.f26737i.getContext(), i);
    }

    /* renamed from: a */
    private final void m31459a() {
        synchronized (this.f26731c) {
            if (!this.f26734f && this.f26738j) {
                int measuredWidth = this.f26732d.getMeasuredWidth();
                int measuredHeight = this.f26732d.getMeasuredHeight();
                if (!(measuredWidth == 0 || measuredHeight == 0 || this.f26730a == null)) {
                    this.f26730a.setLayoutParams(new LayoutParams(measuredWidth, measuredHeight));
                    this.f26738j = false;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m31460a(@Nullable View view) {
        if (this.f26737i != null) {
            zzos b = this.f26737i instanceof amu ? ((amu) this.f26737i).m31455b() : this.f26737i;
            if (b != null) {
                b.zzk(view);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final void m31461a(com.google.android.gms.internal.amv r7) {
        /*
        r6 = this;
        r0 = r6.f26731c;
        monitor-enter(r0);
        r1 = r6.f26735g;	 Catch:{ all -> 0x0044 }
        r7.m27153a(r1);	 Catch:{ all -> 0x0044 }
        r1 = r6.f26735g;	 Catch:{ all -> 0x0044 }
        if (r1 == 0) goto L_0x0028;
    L_0x000c:
        r1 = f26729b;	 Catch:{ all -> 0x0044 }
        r2 = r1.length;	 Catch:{ all -> 0x0044 }
        r3 = 0;
    L_0x0010:
        if (r3 >= r2) goto L_0x0028;
    L_0x0012:
        r4 = r1[r3];	 Catch:{ all -> 0x0044 }
        r5 = r6.f26735g;	 Catch:{ all -> 0x0044 }
        r4 = r5.get(r4);	 Catch:{ all -> 0x0044 }
        r4 = (java.lang.ref.WeakReference) r4;	 Catch:{ all -> 0x0044 }
        if (r4 == 0) goto L_0x0025;
    L_0x001e:
        r1 = r4.get();	 Catch:{ all -> 0x0044 }
        r1 = (android.view.View) r1;	 Catch:{ all -> 0x0044 }
        goto L_0x0029;
    L_0x0025:
        r3 = r3 + 1;
        goto L_0x0010;
    L_0x0028:
        r1 = 0;
    L_0x0029:
        r2 = r1 instanceof android.widget.FrameLayout;	 Catch:{ all -> 0x0044 }
        if (r2 != 0) goto L_0x0032;
    L_0x002d:
        r7.zzki();	 Catch:{ all -> 0x0044 }
        monitor-exit(r0);	 Catch:{ all -> 0x0044 }
        return;
    L_0x0032:
        r2 = new com.google.android.gms.internal.anh;	 Catch:{ all -> 0x0044 }
        r2.<init>(r6, r1);	 Catch:{ all -> 0x0044 }
        r3 = r7 instanceof com.google.android.gms.internal.amu;	 Catch:{ all -> 0x0044 }
        if (r3 == 0) goto L_0x003f;
    L_0x003b:
        r7.m27154a(r1, r2);	 Catch:{ all -> 0x0044 }
        goto L_0x0042;
    L_0x003f:
        r7.zza(r1, r2);	 Catch:{ all -> 0x0044 }
    L_0x0042:
        monitor-exit(r0);	 Catch:{ all -> 0x0044 }
        return;
    L_0x0044:
        r7 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0044 }
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.anf.a(com.google.android.gms.internal.amv):void");
    }

    public final void destroy() {
        synchronized (this.f26731c) {
            if (this.f26730a != null) {
                this.f26730a.removeAllViews();
            }
            this.f26730a = null;
            this.f26735g = null;
            this.f26736h = null;
            this.f26737i = null;
            this.f26739k = null;
            this.f26740l = null;
            this.f26741m = null;
            this.f26733e = null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r8) {
        /*
        r7 = this;
        r0 = r7.f26731c;
        monitor-enter(r0);
        r1 = r7.f26737i;	 Catch:{ all -> 0x0089 }
        if (r1 != 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r0);	 Catch:{ all -> 0x0089 }
        return;
    L_0x0009:
        r4 = new android.os.Bundle;	 Catch:{ all -> 0x0089 }
        r4.<init>();	 Catch:{ all -> 0x0089 }
        r1 = "x";
        r2 = r7.f26739k;	 Catch:{ all -> 0x0089 }
        r2 = r2.x;	 Catch:{ all -> 0x0089 }
        r2 = r7.m31457a(r2);	 Catch:{ all -> 0x0089 }
        r2 = (float) r2;	 Catch:{ all -> 0x0089 }
        r4.putFloat(r1, r2);	 Catch:{ all -> 0x0089 }
        r1 = "y";
        r2 = r7.f26739k;	 Catch:{ all -> 0x0089 }
        r2 = r2.y;	 Catch:{ all -> 0x0089 }
        r2 = r7.m31457a(r2);	 Catch:{ all -> 0x0089 }
        r2 = (float) r2;	 Catch:{ all -> 0x0089 }
        r4.putFloat(r1, r2);	 Catch:{ all -> 0x0089 }
        r1 = "start_x";
        r2 = r7.f26740l;	 Catch:{ all -> 0x0089 }
        r2 = r2.x;	 Catch:{ all -> 0x0089 }
        r2 = r7.m31457a(r2);	 Catch:{ all -> 0x0089 }
        r2 = (float) r2;	 Catch:{ all -> 0x0089 }
        r4.putFloat(r1, r2);	 Catch:{ all -> 0x0089 }
        r1 = "start_y";
        r2 = r7.f26740l;	 Catch:{ all -> 0x0089 }
        r2 = r2.y;	 Catch:{ all -> 0x0089 }
        r2 = r7.m31457a(r2);	 Catch:{ all -> 0x0089 }
        r2 = (float) r2;	 Catch:{ all -> 0x0089 }
        r4.putFloat(r1, r2);	 Catch:{ all -> 0x0089 }
        r1 = r7.f26736h;	 Catch:{ all -> 0x0089 }
        if (r1 == 0) goto L_0x007e;
    L_0x004a:
        r1 = r7.f26736h;	 Catch:{ all -> 0x0089 }
        r1 = r1.equals(r8);	 Catch:{ all -> 0x0089 }
        if (r1 == 0) goto L_0x007e;
    L_0x0052:
        r1 = r7.f26737i;	 Catch:{ all -> 0x0089 }
        r1 = r1 instanceof com.google.android.gms.internal.amu;	 Catch:{ all -> 0x0089 }
        if (r1 == 0) goto L_0x0075;
    L_0x0058:
        r1 = r7.f26737i;	 Catch:{ all -> 0x0089 }
        r1 = (com.google.android.gms.internal.amu) r1;	 Catch:{ all -> 0x0089 }
        r1 = r1.m31455b();	 Catch:{ all -> 0x0089 }
        if (r1 == 0) goto L_0x0087;
    L_0x0062:
        r1 = r7.f26737i;	 Catch:{ all -> 0x0089 }
        r1 = (com.google.android.gms.internal.amu) r1;	 Catch:{ all -> 0x0089 }
        r1 = r1.m31455b();	 Catch:{ all -> 0x0089 }
        r3 = "1007";
        r5 = r7.f26735g;	 Catch:{ all -> 0x0089 }
        r6 = r7.f26732d;	 Catch:{ all -> 0x0089 }
    L_0x0070:
        r2 = r8;
        r1.zza(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x0089 }
        goto L_0x0087;
    L_0x0075:
        r1 = r7.f26737i;	 Catch:{ all -> 0x0089 }
        r3 = "1007";
        r5 = r7.f26735g;	 Catch:{ all -> 0x0089 }
        r6 = r7.f26732d;	 Catch:{ all -> 0x0089 }
        goto L_0x0070;
    L_0x007e:
        r1 = r7.f26737i;	 Catch:{ all -> 0x0089 }
        r2 = r7.f26735g;	 Catch:{ all -> 0x0089 }
        r3 = r7.f26732d;	 Catch:{ all -> 0x0089 }
        r1.zza(r8, r2, r4, r3);	 Catch:{ all -> 0x0089 }
    L_0x0087:
        monitor-exit(r0);	 Catch:{ all -> 0x0089 }
        return;
    L_0x0089:
        r8 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0089 }
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.anf.onClick(android.view.View):void");
    }

    public final void onGlobalLayout() {
        synchronized (this.f26731c) {
            m31459a();
            if (this.f26737i != null) {
                this.f26737i.zzc(this.f26732d, this.f26735g);
            }
        }
    }

    public final void onScrollChanged() {
        synchronized (this.f26731c) {
            if (this.f26737i != null) {
                this.f26737i.zzc(this.f26732d, this.f26735g);
            }
            m31459a();
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.f26731c) {
            if (this.f26737i == null) {
                return false;
            }
            int[] iArr = new int[2];
            this.f26732d.getLocationOnScreen(iArr);
            Point point = new Point((int) (motionEvent.getRawX() - ((float) iArr[0])), (int) (motionEvent.getRawY() - ((float) iArr[1])));
            this.f26739k = point;
            if (motionEvent.getAction() == 0) {
                this.f26740l = point;
            }
            motionEvent = MotionEvent.obtain(motionEvent);
            motionEvent.setLocation((float) point.x, (float) point.y);
            this.f26737i.zzd(motionEvent);
            motionEvent.recycle();
            return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.dynamic.IObjectWrapper r11) {
        /*
        r10 = this;
        r0 = r10.f26731c;
        monitor-enter(r0);
        r1 = 0;
        r10.m31460a(r1);	 Catch:{ all -> 0x01ae }
        r11 = com.google.android.gms.dynamic.C4296b.a(r11);	 Catch:{ all -> 0x01ae }
        r2 = r11 instanceof com.google.android.gms.internal.amv;	 Catch:{ all -> 0x01ae }
        if (r2 != 0) goto L_0x0016;
    L_0x000f:
        r11 = "Not an instance of native engine. This is most likely a transient error";
        com.google.android.gms.internal.hx.m19916e(r11);	 Catch:{ all -> 0x01ae }
        monitor-exit(r0);	 Catch:{ all -> 0x01ae }
        return;
    L_0x0016:
        r2 = r10.f26734f;	 Catch:{ all -> 0x01ae }
        r3 = 0;
        if (r2 != 0) goto L_0x002e;
    L_0x001b:
        r2 = r10.f26730a;	 Catch:{ all -> 0x01ae }
        if (r2 == 0) goto L_0x002e;
    L_0x001f:
        r2 = r10.f26730a;	 Catch:{ all -> 0x01ae }
        r4 = new android.widget.FrameLayout$LayoutParams;	 Catch:{ all -> 0x01ae }
        r4.<init>(r3, r3);	 Catch:{ all -> 0x01ae }
        r2.setLayoutParams(r4);	 Catch:{ all -> 0x01ae }
        r2 = r10.f26732d;	 Catch:{ all -> 0x01ae }
        r2.requestLayout();	 Catch:{ all -> 0x01ae }
    L_0x002e:
        r2 = 1;
        r10.f26738j = r2;	 Catch:{ all -> 0x01ae }
        r11 = (com.google.android.gms.internal.amv) r11;	 Catch:{ all -> 0x01ae }
        r4 = r10.f26737i;	 Catch:{ all -> 0x01ae }
        if (r4 == 0) goto L_0x0052;
    L_0x0037:
        r4 = com.google.android.gms.internal.alo.bM;	 Catch:{ all -> 0x01ae }
        r5 = com.google.android.gms.internal.aja.m19221f();	 Catch:{ all -> 0x01ae }
        r4 = r5.m19334a(r4);	 Catch:{ all -> 0x01ae }
        r4 = (java.lang.Boolean) r4;	 Catch:{ all -> 0x01ae }
        r4 = r4.booleanValue();	 Catch:{ all -> 0x01ae }
        if (r4 == 0) goto L_0x0052;
    L_0x0049:
        r4 = r10.f26737i;	 Catch:{ all -> 0x01ae }
        r5 = r10.f26732d;	 Catch:{ all -> 0x01ae }
        r6 = r10.f26735g;	 Catch:{ all -> 0x01ae }
        r4.zzb(r5, r6);	 Catch:{ all -> 0x01ae }
    L_0x0052:
        r4 = r10.f26737i;	 Catch:{ all -> 0x01ae }
        r4 = r4 instanceof com.google.android.gms.internal.amv;	 Catch:{ all -> 0x01ae }
        if (r4 == 0) goto L_0x008c;
    L_0x0058:
        r4 = r10.f26737i;	 Catch:{ all -> 0x01ae }
        r4 = (com.google.android.gms.internal.amv) r4;	 Catch:{ all -> 0x01ae }
        if (r4 == 0) goto L_0x008c;
    L_0x005e:
        r5 = r4.getContext();	 Catch:{ all -> 0x01ae }
        if (r5 == 0) goto L_0x008c;
    L_0x0064:
        r5 = com.google.android.gms.ads.internal.ar.z();	 Catch:{ all -> 0x01ae }
        r6 = r10.f26732d;	 Catch:{ all -> 0x01ae }
        r6 = r6.getContext();	 Catch:{ all -> 0x01ae }
        r5 = r5.m19602c(r6);	 Catch:{ all -> 0x01ae }
        if (r5 == 0) goto L_0x008c;
    L_0x0074:
        r4 = r4.m27156d();	 Catch:{ all -> 0x01ae }
        if (r4 == 0) goto L_0x007d;
    L_0x007a:
        r4.m27281a(r3);	 Catch:{ all -> 0x01ae }
    L_0x007d:
        r5 = r10.f26741m;	 Catch:{ all -> 0x01ae }
        r5 = r5.get();	 Catch:{ all -> 0x01ae }
        r5 = (com.google.android.gms.internal.aga) r5;	 Catch:{ all -> 0x01ae }
        if (r5 == 0) goto L_0x008c;
    L_0x0087:
        if (r4 == 0) goto L_0x008c;
    L_0x0089:
        r5.m19111b(r4);	 Catch:{ all -> 0x01ae }
    L_0x008c:
        r4 = r10.f26737i;	 Catch:{ all -> 0x01ae }
        r4 = r4 instanceof com.google.android.gms.internal.amu;	 Catch:{ all -> 0x01ae }
        if (r4 == 0) goto L_0x00a4;
    L_0x0092:
        r4 = r10.f26737i;	 Catch:{ all -> 0x01ae }
        r4 = (com.google.android.gms.internal.amu) r4;	 Catch:{ all -> 0x01ae }
        r4 = r4.m31454a();	 Catch:{ all -> 0x01ae }
        if (r4 == 0) goto L_0x00a4;
    L_0x009c:
        r4 = r10.f26737i;	 Catch:{ all -> 0x01ae }
        r4 = (com.google.android.gms.internal.amu) r4;	 Catch:{ all -> 0x01ae }
        r4.m31453a(r11);	 Catch:{ all -> 0x01ae }
        goto L_0x00b0;
    L_0x00a4:
        r10.f26737i = r11;	 Catch:{ all -> 0x01ae }
        r4 = r11 instanceof com.google.android.gms.internal.amu;	 Catch:{ all -> 0x01ae }
        if (r4 == 0) goto L_0x00b0;
    L_0x00aa:
        r4 = r11;
        r4 = (com.google.android.gms.internal.amu) r4;	 Catch:{ all -> 0x01ae }
        r4.m31453a(r1);	 Catch:{ all -> 0x01ae }
    L_0x00b0:
        r4 = r10.f26730a;	 Catch:{ all -> 0x01ae }
        if (r4 != 0) goto L_0x00b6;
    L_0x00b4:
        monitor-exit(r0);	 Catch:{ all -> 0x01ae }
        return;
    L_0x00b6:
        r4 = com.google.android.gms.internal.alo.bM;	 Catch:{ all -> 0x01ae }
        r5 = com.google.android.gms.internal.aja.m19221f();	 Catch:{ all -> 0x01ae }
        r4 = r5.m19334a(r4);	 Catch:{ all -> 0x01ae }
        r4 = (java.lang.Boolean) r4;	 Catch:{ all -> 0x01ae }
        r4 = r4.booleanValue();	 Catch:{ all -> 0x01ae }
        if (r4 == 0) goto L_0x00cd;
    L_0x00c8:
        r4 = r10.f26730a;	 Catch:{ all -> 0x01ae }
        r4.setClickable(r3);	 Catch:{ all -> 0x01ae }
    L_0x00cd:
        r4 = r10.f26730a;	 Catch:{ all -> 0x01ae }
        r4.removeAllViews();	 Catch:{ all -> 0x01ae }
        r4 = r11.zzkc();	 Catch:{ all -> 0x01ae }
        if (r4 == 0) goto L_0x00f7;
    L_0x00d8:
        r5 = r10.f26735g;	 Catch:{ all -> 0x01ae }
        if (r5 == 0) goto L_0x00f7;
    L_0x00dc:
        r5 = r10.f26735g;	 Catch:{ all -> 0x01ae }
        r6 = "1098";
        r5 = r5.get(r6);	 Catch:{ all -> 0x01ae }
        r5 = (java.lang.ref.WeakReference) r5;	 Catch:{ all -> 0x01ae }
        if (r5 == 0) goto L_0x00ef;
    L_0x00e8:
        r5 = r5.get();	 Catch:{ all -> 0x01ae }
        r5 = (android.view.View) r5;	 Catch:{ all -> 0x01ae }
        goto L_0x00f0;
    L_0x00ef:
        r5 = r1;
    L_0x00f0:
        r6 = r5 instanceof android.view.ViewGroup;	 Catch:{ all -> 0x01ae }
        if (r6 == 0) goto L_0x00f7;
    L_0x00f4:
        r1 = r5;
        r1 = (android.view.ViewGroup) r1;	 Catch:{ all -> 0x01ae }
    L_0x00f7:
        if (r4 == 0) goto L_0x00fc;
    L_0x00f9:
        if (r1 == 0) goto L_0x00fc;
    L_0x00fb:
        goto L_0x00fd;
    L_0x00fc:
        r2 = 0;
    L_0x00fd:
        r3 = r11.zza(r10, r2);	 Catch:{ all -> 0x01ae }
        r10.f26736h = r3;	 Catch:{ all -> 0x01ae }
        r3 = r10.f26736h;	 Catch:{ all -> 0x01ae }
        if (r3 == 0) goto L_0x0144;
    L_0x0107:
        r3 = r10.f26735g;	 Catch:{ all -> 0x01ae }
        if (r3 == 0) goto L_0x0119;
    L_0x010b:
        r3 = r10.f26735g;	 Catch:{ all -> 0x01ae }
        r4 = "1007";
        r5 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x01ae }
        r6 = r10.f26736h;	 Catch:{ all -> 0x01ae }
        r5.<init>(r6);	 Catch:{ all -> 0x01ae }
        r3.put(r4, r5);	 Catch:{ all -> 0x01ae }
    L_0x0119:
        if (r2 == 0) goto L_0x0124;
    L_0x011b:
        r1.removeAllViews();	 Catch:{ all -> 0x01ae }
        r2 = r10.f26736h;	 Catch:{ all -> 0x01ae }
        r1.addView(r2);	 Catch:{ all -> 0x01ae }
        goto L_0x0144;
    L_0x0124:
        r1 = r11.getContext();	 Catch:{ all -> 0x01ae }
        r2 = new com.google.android.gms.ads.formats.a;	 Catch:{ all -> 0x01ae }
        r2.<init>(r1);	 Catch:{ all -> 0x01ae }
        r1 = new android.widget.FrameLayout$LayoutParams;	 Catch:{ all -> 0x01ae }
        r3 = -1;
        r1.<init>(r3, r3);	 Catch:{ all -> 0x01ae }
        r2.setLayoutParams(r1);	 Catch:{ all -> 0x01ae }
        r1 = r10.f26736h;	 Catch:{ all -> 0x01ae }
        r2.addView(r1);	 Catch:{ all -> 0x01ae }
        r1 = r10.f26730a;	 Catch:{ all -> 0x01ae }
        if (r1 == 0) goto L_0x0144;
    L_0x013f:
        r1 = r10.f26730a;	 Catch:{ all -> 0x01ae }
        r1.addView(r2);	 Catch:{ all -> 0x01ae }
    L_0x0144:
        r5 = r10.f26732d;	 Catch:{ all -> 0x01ae }
        r6 = r10.f26735g;	 Catch:{ all -> 0x01ae }
        r7 = 0;
        r4 = r11;
        r8 = r10;
        r9 = r10;
        r4.mo6848a(r5, r6, r7, r8, r9);	 Catch:{ all -> 0x01ae }
        r1 = com.google.android.gms.internal.fk.f16060a;	 Catch:{ all -> 0x01ae }
        r2 = new com.google.android.gms.internal.ang;	 Catch:{ all -> 0x01ae }
        r2.<init>(r10, r11);	 Catch:{ all -> 0x01ae }
        r1.post(r2);	 Catch:{ all -> 0x01ae }
        r11 = r10.f26732d;	 Catch:{ all -> 0x01ae }
        r10.m31460a(r11);	 Catch:{ all -> 0x01ae }
        r11 = r10.f26737i;	 Catch:{ all -> 0x01ae }
        r1 = r10.f26732d;	 Catch:{ all -> 0x01ae }
        r11.zzi(r1);	 Catch:{ all -> 0x01ae }
        r11 = r10.f26737i;	 Catch:{ all -> 0x01ae }
        r11 = r11 instanceof com.google.android.gms.internal.amv;	 Catch:{ all -> 0x01ae }
        if (r11 == 0) goto L_0x01ac;
    L_0x016b:
        r11 = r10.f26737i;	 Catch:{ all -> 0x01ae }
        r11 = (com.google.android.gms.internal.amv) r11;	 Catch:{ all -> 0x01ae }
        if (r11 == 0) goto L_0x01ac;
    L_0x0171:
        r1 = r11.getContext();	 Catch:{ all -> 0x01ae }
        if (r1 == 0) goto L_0x01ac;
    L_0x0177:
        r1 = com.google.android.gms.ads.internal.ar.z();	 Catch:{ all -> 0x01ae }
        r2 = r10.f26732d;	 Catch:{ all -> 0x01ae }
        r2 = r2.getContext();	 Catch:{ all -> 0x01ae }
        r1 = r1.m19602c(r2);	 Catch:{ all -> 0x01ae }
        if (r1 == 0) goto L_0x01ac;
    L_0x0187:
        r1 = r10.f26741m;	 Catch:{ all -> 0x01ae }
        r1 = r1.get();	 Catch:{ all -> 0x01ae }
        r1 = (com.google.android.gms.internal.aga) r1;	 Catch:{ all -> 0x01ae }
        if (r1 != 0) goto L_0x01a5;
    L_0x0191:
        r1 = new com.google.android.gms.internal.aga;	 Catch:{ all -> 0x01ae }
        r2 = r10.f26732d;	 Catch:{ all -> 0x01ae }
        r2 = r2.getContext();	 Catch:{ all -> 0x01ae }
        r3 = r10.f26732d;	 Catch:{ all -> 0x01ae }
        r1.<init>(r2, r3);	 Catch:{ all -> 0x01ae }
        r2 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x01ae }
        r2.<init>(r1);	 Catch:{ all -> 0x01ae }
        r10.f26741m = r2;	 Catch:{ all -> 0x01ae }
    L_0x01a5:
        r11 = r11.m27156d();	 Catch:{ all -> 0x01ae }
        r1.m19110a(r11);	 Catch:{ all -> 0x01ae }
    L_0x01ac:
        monitor-exit(r0);	 Catch:{ all -> 0x01ae }
        return;
    L_0x01ae:
        r11 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x01ae }
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.anf.zza(com.google.android.gms.dynamic.IObjectWrapper):void");
    }

    public final IObjectWrapper zzal(String str) {
        synchronized (this.f26731c) {
            Object obj = null;
            if (this.f26735g == null) {
                return null;
            }
            WeakReference weakReference = (WeakReference) this.f26735g.get(str);
            if (weakReference != null) {
                obj = (View) weakReference.get();
            }
            IObjectWrapper a = C4296b.a(obj);
            return a;
        }
    }

    public final void zzb(IObjectWrapper iObjectWrapper, int i) {
        if (ar.z().m19602c(this.f26732d.getContext()) && this.f26741m != null) {
            aga aga = (aga) this.f26741m.get();
            if (aga != null) {
                aga.m19109a();
            }
        }
        m31459a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzb(java.lang.String r4, com.google.android.gms.dynamic.IObjectWrapper r5) {
        /*
        r3 = this;
        r5 = com.google.android.gms.dynamic.C4296b.a(r5);
        r5 = (android.view.View) r5;
        r0 = r3.f26731c;
        monitor-enter(r0);
        r1 = r3.f26735g;	 Catch:{ all -> 0x0037 }
        if (r1 != 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r0);	 Catch:{ all -> 0x0037 }
        return;
    L_0x000f:
        if (r5 != 0) goto L_0x0017;
    L_0x0011:
        r5 = r3.f26735g;	 Catch:{ all -> 0x0037 }
        r5.remove(r4);	 Catch:{ all -> 0x0037 }
        goto L_0x0035;
    L_0x0017:
        r1 = r3.f26735g;	 Catch:{ all -> 0x0037 }
        r2 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x0037 }
        r2.<init>(r5);	 Catch:{ all -> 0x0037 }
        r1.put(r4, r2);	 Catch:{ all -> 0x0037 }
        r1 = "1098";
        r4 = r1.equals(r4);	 Catch:{ all -> 0x0037 }
        if (r4 == 0) goto L_0x002b;
    L_0x0029:
        monitor-exit(r0);	 Catch:{ all -> 0x0037 }
        return;
    L_0x002b:
        r5.setOnTouchListener(r3);	 Catch:{ all -> 0x0037 }
        r4 = 1;
        r5.setClickable(r4);	 Catch:{ all -> 0x0037 }
        r5.setOnClickListener(r3);	 Catch:{ all -> 0x0037 }
    L_0x0035:
        monitor-exit(r0);	 Catch:{ all -> 0x0037 }
        return;
    L_0x0037:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0037 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.anf.zzb(java.lang.String, com.google.android.gms.dynamic.IObjectWrapper):void");
    }
}
