package com.tinder.presenters;

import com.tinder.auth.interactor.C10333h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.presenters.c */
public final class C17743c implements Factory<C17741b> {
    /* renamed from: a */
    private final Provider<C10333h> f55228a;

    public /* synthetic */ Object get() {
        return m64685a();
    }

    /* renamed from: a */
    public C17741b m64685a() {
        return C17743c.m64684a(this.f55228a);
    }

    /* renamed from: a */
    public static C17741b m64684a(Provider<C10333h> provider) {
        return new C17741b((C10333h) provider.get());
    }

    /* renamed from: a */
    public static C17741b m64683a(C10333h c10333h) {
        return new C17741b(c10333h);
    }
}
