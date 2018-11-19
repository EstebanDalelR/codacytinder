package com.airbnb.lottie.model;

import android.content.res.Resources;
import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.C0788c.C0787a;
import com.airbnb.lottie.OnCompositionLoadedListener;
import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.model.h */
public final class C4076h extends C2985b<JSONObject> {
    /* renamed from: a */
    private final Resources f12926a;
    /* renamed from: b */
    private final OnCompositionLoadedListener f12927b;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m15898a((JSONObject[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m15899a((C0788c) obj);
    }

    public C4076h(Resources resources, OnCompositionLoadedListener onCompositionLoadedListener) {
        this.f12926a = resources;
        this.f12927b = onCompositionLoadedListener;
    }

    /* renamed from: a */
    protected C0788c m15898a(JSONObject... jSONObjectArr) {
        return C0787a.m2782a(this.f12926a, jSONObjectArr[0]);
    }

    /* renamed from: a */
    protected void m15899a(C0788c c0788c) {
        this.f12927b.onCompositionLoaded(c0788c);
    }
}
