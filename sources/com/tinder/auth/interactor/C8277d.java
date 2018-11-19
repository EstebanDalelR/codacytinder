package com.tinder.auth.interactor;

import android.support.annotation.NonNull;
import javax.inject.Inject;
import rx.Completable;

/* renamed from: com.tinder.auth.interactor.d */
public class C8277d {
    @NonNull
    /* renamed from: a */
    private final C8276b f29526a;

    @Inject
    public C8277d(@NonNull C8276b c8276b) {
        this.f29526a = c8276b;
    }

    @NonNull
    /* renamed from: a */
    public Completable m35334a() {
        C8276b c8276b = this.f29526a;
        c8276b.getClass();
        return Completable.a(C13614e.m53099a(c8276b));
    }
}
