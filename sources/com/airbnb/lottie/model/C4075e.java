package com.airbnb.lottie.model;

import android.content.res.Resources;
import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.C0788c.C0787a;
import com.airbnb.lottie.OnCompositionLoadedListener;
import java.io.InputStream;

/* renamed from: com.airbnb.lottie.model.e */
public final class C4075e extends C2985b<InputStream> {
    /* renamed from: a */
    private final Resources f12924a;
    /* renamed from: b */
    private final OnCompositionLoadedListener f12925b;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m15896a((InputStream[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m15897a((C0788c) obj);
    }

    public C4075e(Resources resources, OnCompositionLoadedListener onCompositionLoadedListener) {
        this.f12924a = resources;
        this.f12925b = onCompositionLoadedListener;
    }

    /* renamed from: a */
    protected C0788c m15896a(InputStream... inputStreamArr) {
        return C0787a.m2781a(this.f12924a, inputStreamArr[0]);
    }

    /* renamed from: a */
    protected void m15897a(C0788c c0788c) {
        this.f12925b.onCompositionLoaded(c0788c);
    }
}
