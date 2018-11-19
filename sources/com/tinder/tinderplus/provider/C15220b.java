package com.tinder.tinderplus.provider;

import android.support.annotation.NonNull;
import com.tinder.tinderplus.model.C15214d;
import javax.inject.Singleton;
import rx.subjects.C19785a;

@Singleton
/* renamed from: com.tinder.tinderplus.provider.b */
public class C15220b {
    /* renamed from: a */
    private final C19785a<C15214d> f47302a = C19785a.f(C15214d.m57178f());

    @NonNull
    /* renamed from: a */
    public C15214d m57278a() {
        return (C15214d) this.f47302a.A();
    }

    /* renamed from: a */
    public void m57279a(@NonNull C15214d c15214d) {
        this.f47302a.onNext(c15214d);
    }
}
