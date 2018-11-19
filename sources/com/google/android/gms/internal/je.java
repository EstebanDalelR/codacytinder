package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

@zzzv
abstract class je {
    /* renamed from: a */
    private final WeakReference<View> f16202a;

    public je(View view) {
        this.f16202a = new WeakReference(view);
    }

    /* renamed from: c */
    private final ViewTreeObserver m19938c() {
        View view = (View) this.f16202a.get();
        if (view == null) {
            return null;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        return (viewTreeObserver == null || !viewTreeObserver.isAlive()) ? null : viewTreeObserver;
    }

    /* renamed from: a */
    public final void m19939a() {
        ViewTreeObserver c = m19938c();
        if (c != null) {
            mo4633a(c);
        }
    }

    /* renamed from: a */
    protected abstract void mo4633a(ViewTreeObserver viewTreeObserver);

    /* renamed from: b */
    public final void m19941b() {
        ViewTreeObserver c = m19938c();
        if (c != null) {
            mo4634b(c);
        }
    }

    /* renamed from: b */
    protected abstract void mo4634b(ViewTreeObserver viewTreeObserver);
}
