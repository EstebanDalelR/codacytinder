package com.facebook.accountkit.ui;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class KeyboardObserver {
    /* renamed from: a */
    private static final int f3406a = ((VERSION.SDK_INT >= 21 ? 48 : 0) + 100);
    /* renamed from: b */
    private boolean f3407b = false;
    /* renamed from: c */
    private final Rect f3408c = new Rect();
    /* renamed from: d */
    private final Rect f3409d = new Rect();
    /* renamed from: e */
    private OnVisibleFrameChangedListener f3410e;
    /* renamed from: f */
    private final Rect f3411f = new Rect();

    public interface OnVisibleFrameChangedListener {
        void onVisibleFrameChanged(Rect rect);
    }

    public KeyboardObserver(View view) {
        m4560a(view);
    }

    /* renamed from: a */
    public void m4563a(@Nullable OnVisibleFrameChangedListener onVisibleFrameChangedListener) {
        this.f3410e = onVisibleFrameChangedListener;
        if (this.f3407b && onVisibleFrameChangedListener != null) {
            onVisibleFrameChangedListener.onVisibleFrameChanged(this.f3408c);
        }
    }

    /* renamed from: a */
    private void m4560a(final View view) {
        if (view != null) {
            final View rootView = view.getRootView();
            if (rootView != null) {
                rootView.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener(this) {
                    /* renamed from: c */
                    final /* synthetic */ KeyboardObserver f3405c;

                    public void onGlobalLayout() {
                        this.f3405c.m4561a(view, rootView);
                    }
                });
                m4561a(view, rootView);
            }
        }
    }

    /* renamed from: a */
    private void m4561a(View view, View view2) {
        int a = ag.m4591a(view2.getContext(), f3406a);
        view2.getWindowVisibleDisplayFrame(this.f3411f);
        if ((view2.getHeight() - (this.f3411f.bottom - this.f3411f.top) >= a ? true : null) != null && this.f3411f.equals(this.f3409d) == null) {
            this.f3409d.set(this.f3411f);
            view.getGlobalVisibleRect(this.f3408c);
            this.f3407b = true;
            if (this.f3410e != null) {
                this.f3410e.onVisibleFrameChanged(this.f3408c);
            }
        }
    }
}
