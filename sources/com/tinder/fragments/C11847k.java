package com.tinder.fragments;

import android.graphics.Bitmap;
import com.tinder.fragments.C13308g.C143101;
import com.tinder.utils.Async.AsyncBg;

/* renamed from: com.tinder.fragments.k */
final /* synthetic */ class C11847k implements AsyncBg {
    /* renamed from: a */
    private final C143101 f38655a;
    /* renamed from: b */
    private final Bitmap f38656b;

    C11847k(C143101 c143101, Bitmap bitmap) {
        this.f38655a = c143101;
        this.f38656b = bitmap;
    }

    public Object doInBg() {
        return this.f38655a.m54422a(this.f38656b);
    }
}
