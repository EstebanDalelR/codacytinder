package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import java.lang.ref.WeakReference;

@zzzv
final class jd extends je implements OnScrollChangedListener {
    /* renamed from: a */
    private final WeakReference<OnScrollChangedListener> f23345a;

    public jd(View view, OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.f23345a = new WeakReference(onScrollChangedListener);
    }

    /* renamed from: a */
    protected final void mo4633a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    /* renamed from: b */
    protected final void mo4634b(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }

    public final void onScrollChanged() {
        OnScrollChangedListener onScrollChangedListener = (OnScrollChangedListener) this.f23345a.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
        } else {
            m19941b();
        }
    }
}
