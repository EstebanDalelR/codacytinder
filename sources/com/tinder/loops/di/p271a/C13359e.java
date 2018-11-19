package com.tinder.loops.di.p271a;

import com.tinder.common.reactivex.schedulers.Schedulers;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.loops.di.a.e */
public final class C13359e implements Factory<Schedulers> {
    /* renamed from: a */
    private final C9767a f42366a;

    public /* synthetic */ Object get() {
        return m51681a();
    }

    /* renamed from: a */
    public Schedulers m51681a() {
        return C13359e.m51679a(this.f42366a);
    }

    /* renamed from: a */
    public static Schedulers m51679a(C9767a c9767a) {
        return C13359e.m51680b(c9767a);
    }

    /* renamed from: b */
    public static Schedulers m51680b(C9767a c9767a) {
        return (Schedulers) C15521i.a(c9767a.m40311b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
