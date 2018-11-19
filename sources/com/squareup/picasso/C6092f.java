package com.squareup.picasso;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: com.squareup.picasso.f */
class C6092f implements OnPreDrawListener {
    /* renamed from: a */
    final C6105p f22374a;
    /* renamed from: b */
    final WeakReference<ImageView> f22375b;
    /* renamed from: c */
    Callback f22376c;

    C6092f(C6105p c6105p, ImageView imageView, Callback callback) {
        this.f22374a = c6105p;
        this.f22375b = new WeakReference(imageView);
        this.f22376c = callback;
        imageView.getViewTreeObserver().addOnPreDrawListener(this);
    }

    public boolean onPreDraw() {
        ImageView imageView = (ImageView) this.f22375b.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0) {
            if (height > 0) {
                viewTreeObserver.removeOnPreDrawListener(this);
                this.f22374a.m26526a().m26528a(width, height).m26530a(imageView, this.f22376c);
                return true;
            }
        }
        return true;
    }

    /* renamed from: a */
    void m26477a() {
        this.f22376c = null;
        ImageView imageView = (ImageView) this.f22375b.get();
        if (imageView != null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }
    }
}
