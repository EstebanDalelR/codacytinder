package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.gms.ads.internal.ar;
import java.lang.ref.WeakReference;

@zzzv
final class jc extends je implements OnGlobalLayoutListener {
    /* renamed from: a */
    private final WeakReference<OnGlobalLayoutListener> f23344a;

    public jc(View view, OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f23344a = new WeakReference(onGlobalLayoutListener);
    }

    /* renamed from: a */
    protected final void mo4633a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    /* renamed from: b */
    protected final void mo4634b(ViewTreeObserver viewTreeObserver) {
        ar.g().mo7623a(viewTreeObserver, (OnGlobalLayoutListener) this);
    }

    public final void onGlobalLayout() {
        OnGlobalLayoutListener onGlobalLayoutListener = (OnGlobalLayoutListener) this.f23344a.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            m19941b();
        }
    }
}
