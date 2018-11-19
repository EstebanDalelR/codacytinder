package com.tinder.data.meta.module;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import io.paperdb.Book;

/* renamed from: com.tinder.data.meta.module.b */
public final class C12982b implements Factory<Book> {
    /* renamed from: a */
    private final C8702a f41563a;

    public /* synthetic */ Object get() {
        return m50732a();
    }

    public C12982b(C8702a c8702a) {
        this.f41563a = c8702a;
    }

    /* renamed from: a */
    public Book m50732a() {
        return C12982b.m50729a(this.f41563a);
    }

    /* renamed from: a */
    public static Book m50729a(C8702a c8702a) {
        return C12982b.m50731c(c8702a);
    }

    /* renamed from: b */
    public static C12982b m50730b(C8702a c8702a) {
        return new C12982b(c8702a);
    }

    /* renamed from: c */
    public static Book m50731c(C8702a c8702a) {
        return (Book) C15521i.a(c8702a.m37166a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
