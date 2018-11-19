package com.google.android.gms.internal;

import android.graphics.Point;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@zzzv
public final class ani extends anu implements OnClickListener, OnTouchListener, OnGlobalLayoutListener, OnScrollChangedListener {
    /* renamed from: a */
    static final String[] f26742a = new String[]{"2011", "1009"};
    /* renamed from: b */
    private final Object f26743b = new Object();
    /* renamed from: c */
    private final WeakReference<View> f26744c;
    /* renamed from: d */
    private final Map<String, WeakReference<View>> f26745d = new HashMap();
    /* renamed from: e */
    private final Map<String, WeakReference<View>> f26746e = new HashMap();
    /* renamed from: f */
    private final Map<String, WeakReference<View>> f26747f = new HashMap();
    @Nullable
    /* renamed from: g */
    private zzos f26748g;
    @Nullable
    /* renamed from: h */
    private View f26749h;
    /* renamed from: i */
    private Point f26750i = new Point();
    /* renamed from: j */
    private Point f26751j = new Point();
    @Nullable
    /* renamed from: k */
    private WeakReference<aga> f26752k = new WeakReference(null);

    public ani(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        ar.y();
        jb.m19936a(view, (OnGlobalLayoutListener) this);
        ar.y();
        jb.m19937a(view, (OnScrollChangedListener) this);
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        this.f26744c = new WeakReference(view);
        m31470a((Map) hashMap);
        this.f26747f.putAll(this.f26745d);
        m31473b(hashMap2);
        this.f26747f.putAll(this.f26746e);
        alo.m19337a(view.getContext());
    }

    /* renamed from: a */
    private final int m31466a(int i) {
        synchronized (this.f26743b) {
            aja.m19216a();
            i = hn.m19871b(this.f26748g.getContext(), i);
        }
        return i;
    }

    /* renamed from: a */
    private final void m31467a(@Nullable View view) {
        synchronized (this.f26743b) {
            if (this.f26748g != null) {
                zzos b = this.f26748g instanceof amu ? ((amu) this.f26748g).m31455b() : this.f26748g;
                if (b != null) {
                    b.zzk(view);
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final void m31468a(com.google.android.gms.internal.amv r7) {
        /*
        r6 = this;
        r0 = r6.f26743b;
        monitor-enter(r0);
        r1 = f26742a;	 Catch:{ all -> 0x003b }
        r2 = r1.length;	 Catch:{ all -> 0x003b }
        r3 = 0;
    L_0x0007:
        if (r3 >= r2) goto L_0x001f;
    L_0x0009:
        r4 = r1[r3];	 Catch:{ all -> 0x003b }
        r5 = r6.f26747f;	 Catch:{ all -> 0x003b }
        r4 = r5.get(r4);	 Catch:{ all -> 0x003b }
        r4 = (java.lang.ref.WeakReference) r4;	 Catch:{ all -> 0x003b }
        if (r4 == 0) goto L_0x001c;
    L_0x0015:
        r1 = r4.get();	 Catch:{ all -> 0x003b }
        r1 = (android.view.View) r1;	 Catch:{ all -> 0x003b }
        goto L_0x0020;
    L_0x001c:
        r3 = r3 + 1;
        goto L_0x0007;
    L_0x001f:
        r1 = 0;
    L_0x0020:
        r2 = r1 instanceof android.widget.FrameLayout;	 Catch:{ all -> 0x003b }
        if (r2 != 0) goto L_0x0029;
    L_0x0024:
        r7.zzki();	 Catch:{ all -> 0x003b }
        monitor-exit(r0);	 Catch:{ all -> 0x003b }
        return;
    L_0x0029:
        r2 = new com.google.android.gms.internal.ank;	 Catch:{ all -> 0x003b }
        r2.<init>(r6, r1);	 Catch:{ all -> 0x003b }
        r3 = r7 instanceof com.google.android.gms.internal.amu;	 Catch:{ all -> 0x003b }
        if (r3 == 0) goto L_0x0036;
    L_0x0032:
        r7.m27154a(r1, r2);	 Catch:{ all -> 0x003b }
        goto L_0x0039;
    L_0x0036:
        r7.zza(r1, r2);	 Catch:{ all -> 0x003b }
    L_0x0039:
        monitor-exit(r0);	 Catch:{ all -> 0x003b }
        return;
    L_0x003b:
        r7 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x003b }
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ani.a(com.google.android.gms.internal.amv):void");
    }

    /* renamed from: a */
    private final void m31470a(Map<String, View> map) {
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            View view = (View) entry.getValue();
            if (view != null) {
                this.f26745d.put(str, new WeakReference(view));
                if (!"1098".equals(str)) {
                    view.setOnTouchListener(this);
                    view.setClickable(true);
                    view.setOnClickListener(this);
                }
            }
        }
    }

    /* renamed from: a */
    private final boolean m31472a(String[] strArr) {
        for (Object obj : strArr) {
            if (this.f26745d.get(obj) != null) {
                return true;
            }
        }
        for (Object obj2 : strArr) {
            if (this.f26746e.get(obj2) != null) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m31473b(Map<String, View> map) {
        for (Entry entry : map.entrySet()) {
            View view = (View) entry.getValue();
            if (view != null) {
                this.f26746e.put((String) entry.getKey(), new WeakReference(view));
                view.setOnTouchListener(this);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
        r8 = this;
        r0 = r8.f26743b;
        monitor-enter(r0);
        r1 = r8.f26748g;	 Catch:{ all -> 0x0090 }
        if (r1 != 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r0);	 Catch:{ all -> 0x0090 }
        return;
    L_0x0009:
        r1 = r8.f26744c;	 Catch:{ all -> 0x0090 }
        r1 = r1.get();	 Catch:{ all -> 0x0090 }
        r7 = r1;
        r7 = (android.view.View) r7;	 Catch:{ all -> 0x0090 }
        if (r7 != 0) goto L_0x0016;
    L_0x0014:
        monitor-exit(r0);	 Catch:{ all -> 0x0090 }
        return;
    L_0x0016:
        r5 = new android.os.Bundle;	 Catch:{ all -> 0x0090 }
        r5.<init>();	 Catch:{ all -> 0x0090 }
        r1 = "x";
        r2 = r8.f26750i;	 Catch:{ all -> 0x0090 }
        r2 = r2.x;	 Catch:{ all -> 0x0090 }
        r2 = r8.m31466a(r2);	 Catch:{ all -> 0x0090 }
        r2 = (float) r2;	 Catch:{ all -> 0x0090 }
        r5.putFloat(r1, r2);	 Catch:{ all -> 0x0090 }
        r1 = "y";
        r2 = r8.f26750i;	 Catch:{ all -> 0x0090 }
        r2 = r2.y;	 Catch:{ all -> 0x0090 }
        r2 = r8.m31466a(r2);	 Catch:{ all -> 0x0090 }
        r2 = (float) r2;	 Catch:{ all -> 0x0090 }
        r5.putFloat(r1, r2);	 Catch:{ all -> 0x0090 }
        r1 = "start_x";
        r2 = r8.f26751j;	 Catch:{ all -> 0x0090 }
        r2 = r2.x;	 Catch:{ all -> 0x0090 }
        r2 = r8.m31466a(r2);	 Catch:{ all -> 0x0090 }
        r2 = (float) r2;	 Catch:{ all -> 0x0090 }
        r5.putFloat(r1, r2);	 Catch:{ all -> 0x0090 }
        r1 = "start_y";
        r2 = r8.f26751j;	 Catch:{ all -> 0x0090 }
        r2 = r2.y;	 Catch:{ all -> 0x0090 }
        r2 = r8.m31466a(r2);	 Catch:{ all -> 0x0090 }
        r2 = (float) r2;	 Catch:{ all -> 0x0090 }
        r5.putFloat(r1, r2);	 Catch:{ all -> 0x0090 }
        r1 = r8.f26749h;	 Catch:{ all -> 0x0090 }
        if (r1 == 0) goto L_0x0087;
    L_0x0057:
        r1 = r8.f26749h;	 Catch:{ all -> 0x0090 }
        r1 = r1.equals(r9);	 Catch:{ all -> 0x0090 }
        if (r1 == 0) goto L_0x0087;
    L_0x005f:
        r1 = r8.f26748g;	 Catch:{ all -> 0x0090 }
        r1 = r1 instanceof com.google.android.gms.internal.amu;	 Catch:{ all -> 0x0090 }
        if (r1 == 0) goto L_0x0080;
    L_0x0065:
        r1 = r8.f26748g;	 Catch:{ all -> 0x0090 }
        r1 = (com.google.android.gms.internal.amu) r1;	 Catch:{ all -> 0x0090 }
        r1 = r1.m31455b();	 Catch:{ all -> 0x0090 }
        if (r1 == 0) goto L_0x008e;
    L_0x006f:
        r1 = r8.f26748g;	 Catch:{ all -> 0x0090 }
        r1 = (com.google.android.gms.internal.amu) r1;	 Catch:{ all -> 0x0090 }
        r2 = r1.m31455b();	 Catch:{ all -> 0x0090 }
        r4 = "1007";
        r6 = r8.f26747f;	 Catch:{ all -> 0x0090 }
    L_0x007b:
        r3 = r9;
        r2.zza(r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0090 }
        goto L_0x008e;
    L_0x0080:
        r2 = r8.f26748g;	 Catch:{ all -> 0x0090 }
        r4 = "1007";
        r6 = r8.f26747f;	 Catch:{ all -> 0x0090 }
        goto L_0x007b;
    L_0x0087:
        r1 = r8.f26748g;	 Catch:{ all -> 0x0090 }
        r2 = r8.f26747f;	 Catch:{ all -> 0x0090 }
        r1.zza(r9, r2, r5, r7);	 Catch:{ all -> 0x0090 }
    L_0x008e:
        monitor-exit(r0);	 Catch:{ all -> 0x0090 }
        return;
    L_0x0090:
        r9 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0090 }
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ani.onClick(android.view.View):void");
    }

    public final void onGlobalLayout() {
        synchronized (this.f26743b) {
            if (this.f26748g != null) {
                View view = (View) this.f26744c.get();
                if (view != null) {
                    this.f26748g.zzc(view, this.f26747f);
                }
            }
        }
    }

    public final void onScrollChanged() {
        synchronized (this.f26743b) {
            if (this.f26748g != null) {
                View view = (View) this.f26744c.get();
                if (view != null) {
                    this.f26748g.zzc(view, this.f26747f);
                }
            }
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.f26743b) {
            if (this.f26748g == null) {
                return false;
            }
            View view2 = (View) this.f26744c.get();
            if (view2 == null) {
                return false;
            }
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            Point point = new Point((int) (motionEvent.getRawX() - ((float) iArr[0])), (int) (motionEvent.getRawY() - ((float) iArr[1])));
            this.f26750i = point;
            if (motionEvent.getAction() == 0) {
                this.f26751j = point;
            }
            motionEvent = MotionEvent.obtain(motionEvent);
            motionEvent.setLocation((float) point.x, (float) point.y);
            this.f26748g.zzd(motionEvent);
            motionEvent.recycle();
            return false;
        }
    }

    public final void unregisterNativeAd() {
        synchronized (this.f26743b) {
            this.f26749h = null;
            this.f26748g = null;
            this.f26750i = null;
            this.f26751j = null;
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper) {
        synchronized (this.f26743b) {
            ViewGroup viewGroup = null;
            m31467a(null);
            Object a = C4296b.a(iObjectWrapper);
            if (a instanceof amv) {
                amv amv = (amv) a;
                if (amv.zzkd()) {
                    View view;
                    View view2 = (View) this.f26744c.get();
                    if (!(this.f26748g == null || view2 == null)) {
                        if (((Boolean) aja.m19221f().m19334a(alo.bM)).booleanValue()) {
                            this.f26748g.zzb(view2, this.f26747f);
                        }
                    }
                    synchronized (this.f26743b) {
                        if (this.f26748g instanceof amv) {
                            amv amv2 = (amv) this.f26748g;
                            View view3 = (View) this.f26744c.get();
                            if (!(amv2 == null || amv2.getContext() == null || view3 == null || !ar.z().m19602c(view3.getContext()))) {
                                zzgt d = amv2.m27156d();
                                if (d != null) {
                                    d.m27281a(false);
                                }
                                aga aga = (aga) this.f26752k.get();
                                if (!(aga == null || d == null)) {
                                    aga.m19111b(d);
                                }
                            }
                        }
                    }
                    if ((this.f26748g instanceof amu) && ((amu) this.f26748g).m31454a()) {
                        ((amu) this.f26748g).m31453a(amv);
                    } else {
                        this.f26748g = amv;
                        if (amv instanceof amu) {
                            ((amu) amv).m31453a(null);
                        }
                    }
                    WeakReference weakReference = (WeakReference) this.f26747f.get("1098");
                    if (weakReference == null) {
                        hx.m19916e("Ad choices asset view is not provided.");
                    } else {
                        view = (View) weakReference.get();
                        if (view instanceof ViewGroup) {
                            viewGroup = (ViewGroup) view;
                        }
                        if (viewGroup != null) {
                            this.f26749h = amv.zza((OnClickListener) this, true);
                            if (this.f26749h != null) {
                                this.f26747f.put("1007", new WeakReference(this.f26749h));
                                this.f26745d.put("1007", new WeakReference(this.f26749h));
                                viewGroup.removeAllViews();
                                viewGroup.addView(this.f26749h);
                            }
                        }
                    }
                    amv.mo6848a(view2, this.f26745d, this.f26746e, (OnTouchListener) this, (OnClickListener) this);
                    fk.f16060a.post(new anj(this, amv));
                    m31467a(view2);
                    this.f26748g.zzi(view2);
                    synchronized (this.f26743b) {
                        if (this.f26748g instanceof amv) {
                            amv amv3 = (amv) this.f26748g;
                            view = (View) this.f26744c.get();
                            if (!(amv3 == null || amv3.getContext() == null || view == null || !ar.z().m19602c(view.getContext()))) {
                                aga aga2 = (aga) this.f26752k.get();
                                if (aga2 == null) {
                                    aga2 = new aga(view.getContext(), view);
                                    this.f26752k = new WeakReference(aga2);
                                }
                                aga2.m19110a(amv3.m27156d());
                            }
                        }
                    }
                    return;
                }
                hx.m19913c("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
                return;
            }
            hx.m19916e("Not an instance of native engine. This is most likely a transient error");
        }
    }
}
