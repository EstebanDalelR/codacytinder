package com.tinder.data.profile;

import dagger.internal.Factory;
import io.paperdb.Book;
import javax.inject.Provider;

/* renamed from: com.tinder.data.profile.p */
public final class C13082p implements Factory<C10959o> {
    /* renamed from: a */
    private final Provider<Book> f41683a;

    public /* synthetic */ Object get() {
        return m50909a();
    }

    public C13082p(Provider<Book> provider) {
        this.f41683a = provider;
    }

    /* renamed from: a */
    public C10959o m50909a() {
        return C13082p.m50907a(this.f41683a);
    }

    /* renamed from: a */
    public static C10959o m50907a(Provider<Book> provider) {
        return new C10959o((Book) provider.get());
    }

    /* renamed from: b */
    public static C13082p m50908b(Provider<Book> provider) {
        return new C13082p(provider);
    }
}
