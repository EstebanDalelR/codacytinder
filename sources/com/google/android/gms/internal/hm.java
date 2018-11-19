package com.google.android.gms.internal;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.ar;

@zzzv
public final class hm {
    /* renamed from: a */
    private final View f16150a;
    /* renamed from: b */
    private Activity f16151b;
    /* renamed from: c */
    private boolean f16152c;
    /* renamed from: d */
    private boolean f16153d;
    /* renamed from: e */
    private boolean f16154e;
    /* renamed from: f */
    private OnGlobalLayoutListener f16155f;
    /* renamed from: g */
    private OnScrollChangedListener f16156g;

    public hm(Activity activity, View view, OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        this.f16151b = activity;
        this.f16150a = view;
        this.f16155f = onGlobalLayoutListener;
        this.f16156g = onScrollChangedListener;
    }

    /* renamed from: e */
    private final void m19854e() {
        if (!this.f16152c) {
            if (this.f16155f != null) {
                if (this.f16151b != null) {
                    ar.e();
                    fk.m19694a(this.f16151b, this.f16155f);
                }
                ar.y();
                jb.m19936a(this.f16150a, this.f16155f);
            }
            if (this.f16156g != null) {
                if (this.f16151b != null) {
                    ar.e();
                    fk.m19695a(this.f16151b, this.f16156g);
                }
                ar.y();
                jb.m19937a(this.f16150a, this.f16156g);
            }
            this.f16152c = true;
        }
    }

    /* renamed from: f */
    private final void m19855f() {
        if (this.f16151b != null && this.f16152c) {
            if (!(this.f16155f == null || this.f16151b == null)) {
                ar.g().mo7621a(this.f16151b, this.f16155f);
            }
            if (!(this.f16156g == null || this.f16151b == null)) {
                ar.e();
                fk.m19715b(this.f16151b, this.f16156g);
            }
            this.f16152c = false;
        }
    }

    /* renamed from: a */
    public final void m19856a() {
        this.f16154e = true;
        if (this.f16153d) {
            m19854e();
        }
    }

    /* renamed from: a */
    public final void m19857a(Activity activity) {
        this.f16151b = activity;
    }

    /* renamed from: b */
    public final void m19858b() {
        this.f16154e = false;
        m19855f();
    }

    /* renamed from: c */
    public final void m19859c() {
        this.f16153d = true;
        if (this.f16154e) {
            m19854e();
        }
    }

    /* renamed from: d */
    public final void m19860d() {
        this.f16153d = false;
        m19855f();
    }
}
