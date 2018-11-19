package com.tinder.managers;

import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;
import rx.Emitter;

final /* synthetic */ class by implements ErrorListener {
    /* renamed from: a */
    private final Emitter f39082a;

    private by(Emitter emitter) {
        this.f39082a = emitter;
    }

    /* renamed from: a */
    static ErrorListener m48076a(Emitter emitter) {
        return new by(emitter);
    }

    public void onErrorResponse(VolleyError volleyError) {
        this.f39082a.onError(volleyError);
    }
}
