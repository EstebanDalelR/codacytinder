package com.tinder.paywall.paywallflow;

import android.app.Activity;
import rx.functions.Action1;

/* renamed from: com.tinder.paywall.paywallflow.x */
final /* synthetic */ class C14130x implements Action1 {
    /* renamed from: a */
    private final C10079r f44837a;
    /* renamed from: b */
    private final Activity f44838b;

    C14130x(C10079r c10079r, Activity activity) {
        this.f44837a = c10079r;
        this.f44838b = activity;
    }

    public void call(Object obj) {
        this.f44837a.m41189a(this.f44838b, (Throwable) obj);
    }
}
