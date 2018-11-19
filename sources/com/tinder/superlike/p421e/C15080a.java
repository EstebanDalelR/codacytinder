package com.tinder.superlike.p421e;

import android.support.annotation.NonNull;
import com.tinder.superlike.p420c.C15073b;
import javax.inject.Singleton;
import rx.subjects.C19785a;

@Singleton
/* renamed from: com.tinder.superlike.e.a */
public class C15080a {
    /* renamed from: a */
    private final C19785a<C15073b> f46931a = C19785a.f(C15073b.m56826b());

    @NonNull
    /* renamed from: a */
    public C15073b m56828a() {
        return (C15073b) this.f46931a.A();
    }

    /* renamed from: a */
    public void m56829a(@NonNull C15073b c15073b) {
        this.f46931a.onNext(c15073b);
    }
}
