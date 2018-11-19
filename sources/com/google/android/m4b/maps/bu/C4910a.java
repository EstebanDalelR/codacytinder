package com.google.android.m4b.maps.bu;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.util.Log;
import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ay.C4728u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.m4b.maps.bu.a */
public final class C4910a {
    /* renamed from: a */
    private final ArrayList<C4911b> f18058a = new ArrayList();
    /* renamed from: b */
    private int f18059b = 0;
    /* renamed from: c */
    private boolean f18060c;
    /* renamed from: d */
    private byte[] f18061d;
    /* renamed from: e */
    private WeakReference<Bitmap> f18062e;
    /* renamed from: f */
    private final CountDownLatch f18063f = new CountDownLatch(1);
    /* renamed from: g */
    private long f18064g;
    /* renamed from: h */
    private long f18065h = -1;

    /* renamed from: a */
    public final void m22018a(boolean z) {
        this.f18060c = z;
    }

    /* renamed from: a */
    public final boolean m22019a() {
        return this.f18060c;
    }

    /* renamed from: b */
    public final boolean m22021b() {
        return (this.f18059b == 0 || this.f18059b == 1) ? false : true;
    }

    /* renamed from: c */
    public final Bitmap m22022c() {
        Bitmap bitmap = this.f18062e != null ? (Bitmap) this.f18062e.get() : null;
        if (bitmap == null && this.f18059b == 2 && this.f18061d != null) {
            synchronized (this) {
                bitmap = this.f18062e != null ? (Bitmap) this.f18062e.get() : null;
                if (bitmap == null && this.f18061d != null) {
                    Options options = new Options();
                    options.inPurgeable = true;
                    options.inInputShareable = true;
                    bitmap = BitmapFactory.decodeByteArray(this.f18061d, 0, this.f18061d.length, options);
                    if (bitmap == null) {
                        this.f18059b = 1;
                        this.f18061d = null;
                    }
                    this.f18062e = new WeakReference(bitmap);
                }
            }
        }
        return bitmap;
    }

    /* renamed from: d */
    public final byte[] m22023d() {
        return this.f18059b == 3 ? this.f18061d : null;
    }

    /* renamed from: e */
    public final long m22024e() {
        return this.f18064g;
    }

    /* renamed from: a */
    public final void m22016a(long j) {
        this.f18065h = j;
    }

    /* renamed from: f */
    public final long m22025f() {
        return this.f18065h;
    }

    /* renamed from: a */
    final void m22017a(C4911b c4911b) {
        synchronized (this.f18058a) {
            this.f18058a.add(c4911b);
        }
    }

    /* renamed from: a */
    public final boolean m22020a(C4662a c4662a) {
        int d = c4662a.m20835d(3);
        String h = c4662a.m20843h(7);
        if (d != Callback.DEFAULT_DRAG_ANIMATION_DURATION || h == null) {
            if (d != 304) {
                this.f18059b = 1;
            }
            return false;
        }
        this.f18064g = c4662a.m20838e(4);
        String toLowerCase = h.toLowerCase();
        if (toLowerCase.startsWith("image/")) {
            this.f18061d = c4662a.m20834c(6);
            this.f18059b = 2;
        } else if (toLowerCase.equals("application/binary")) {
            this.f18061d = c4662a.m20834c(6);
            this.f18059b = 3;
        } else {
            if (C4728u.m21050a("ResourceManager", 3) != null) {
                c4662a = "ResourceManager";
                String str = "Unhandled content-type: ";
                toLowerCase = String.valueOf(toLowerCase);
                Log.d(c4662a, toLowerCase.length() != 0 ? str.concat(toLowerCase) : new String(str));
            }
            this.f18059b = 1;
        }
        return this.f18059b != 1;
    }

    /* renamed from: g */
    final void m22026g() {
        synchronized (this.f18058a) {
            for (int i = 0; i < this.f18058a.size(); i++) {
                ((C4911b) this.f18058a.get(i)).mo5094a(this);
            }
            this.f18058a.clear();
        }
        this.f18063f.countDown();
    }
}
