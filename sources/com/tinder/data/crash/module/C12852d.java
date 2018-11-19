package com.tinder.data.crash.module;

import com.tinder.data.crash.p214b.C8638a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import io.paperdb.Book;
import javax.inject.Provider;

/* renamed from: com.tinder.data.crash.module.d */
public final class C12852d implements Factory<C8638a> {
    /* renamed from: a */
    private final C8639a f41290a;
    /* renamed from: b */
    private final Provider<Book> f41291b;

    public /* synthetic */ Object get() {
        return m50473a();
    }

    public C12852d(C8639a c8639a, Provider<Book> provider) {
        this.f41290a = c8639a;
        this.f41291b = provider;
    }

    /* renamed from: a */
    public C8638a m50473a() {
        return C12852d.m50471a(this.f41290a, this.f41291b);
    }

    /* renamed from: a */
    public static C8638a m50471a(C8639a c8639a, Provider<Book> provider) {
        return C12852d.m50470a(c8639a, (Book) provider.get());
    }

    /* renamed from: b */
    public static C12852d m50472b(C8639a c8639a, Provider<Book> provider) {
        return new C12852d(c8639a, provider);
    }

    /* renamed from: a */
    public static C8638a m50470a(C8639a c8639a, Book book) {
        return (C8638a) C15521i.a(c8639a.m36795a(book), "Cannot return null from a non-@Nullable @Provides method");
    }
}
