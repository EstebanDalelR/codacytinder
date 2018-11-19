package com.tinder.boost.provider;

import android.support.annotation.NonNull;
import com.tinder.boost.model.C8345b;
import javax.inject.Singleton;
import rx.Observable;
import rx.subjects.C19785a;

@Singleton
/* renamed from: com.tinder.boost.provider.a */
public class C8349a {
    /* renamed from: a */
    private final C19785a<C8345b> f29662a = C19785a.f(C8345b.m35519d());

    @NonNull
    /* renamed from: a */
    public C8345b m35551a() {
        return (C8345b) this.f29662a.A();
    }

    /* renamed from: b */
    public Observable<C8345b> m35553b() {
        return this.f29662a.e();
    }

    /* renamed from: a */
    public void m35552a(@NonNull C8345b c8345b) {
        this.f29662a.onNext(c8345b);
    }
}
