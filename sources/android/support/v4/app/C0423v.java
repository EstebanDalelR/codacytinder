package android.support.v4.app;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: android.support.v4.app.v */
class C0423v implements OnAttachStateChangeListener, OnPreDrawListener {
    /* renamed from: a */
    private final View f1422a;
    /* renamed from: b */
    private ViewTreeObserver f1423b;
    /* renamed from: c */
    private final Runnable f1424c;

    private C0423v(View view, Runnable runnable) {
        this.f1422a = view;
        this.f1423b = view.getViewTreeObserver();
        this.f1424c = runnable;
    }

    /* renamed from: a */
    public static C0423v m1579a(View view, Runnable runnable) {
        C0423v c0423v = new C0423v(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(c0423v);
        view.addOnAttachStateChangeListener(c0423v);
        return c0423v;
    }

    public boolean onPreDraw() {
        m1580a();
        this.f1424c.run();
        return true;
    }

    /* renamed from: a */
    public void m1580a() {
        if (this.f1423b.isAlive()) {
            this.f1423b.removeOnPreDrawListener(this);
        } else {
            this.f1422a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f1422a.removeOnAttachStateChangeListener(this);
    }

    public void onViewAttachedToWindow(View view) {
        this.f1423b = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        m1580a();
    }
}
