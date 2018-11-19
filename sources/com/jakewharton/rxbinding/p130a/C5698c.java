package com.jakewharton.rxbinding.p130a;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.widget.TextView;
import com.jakewharton.rxbinding.internal.C5701a;
import rx.Observable;

/* renamed from: com.jakewharton.rxbinding.a.c */
public final class C5698c {
    @CheckResult
    @NonNull
    /* renamed from: a */
    public static Observable<CharSequence> m24975a(@NonNull TextView textView) {
        C5701a.m24977a(textView, "view == null");
        return Observable.a(new C8214f(textView));
    }

    @CheckResult
    @NonNull
    /* renamed from: b */
    public static Observable<C7014d> m24976b(@NonNull TextView textView) {
        C5701a.m24977a(textView, "view == null");
        return Observable.a(new C8213e(textView));
    }
}
