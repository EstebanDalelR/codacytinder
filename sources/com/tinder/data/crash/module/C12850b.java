package com.tinder.data.crash.module;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import io.paperdb.Book;

/* renamed from: com.tinder.data.crash.module.b */
public final class C12850b implements Factory<Book> {
    /* renamed from: a */
    private final C8639a f41287a;

    public /* synthetic */ Object get() {
        return m50465a();
    }

    public C12850b(C8639a c8639a) {
        this.f41287a = c8639a;
    }

    /* renamed from: a */
    public Book m50465a() {
        return C12850b.m50462a(this.f41287a);
    }

    /* renamed from: a */
    public static Book m50462a(C8639a c8639a) {
        return C12850b.m50464c(c8639a);
    }

    /* renamed from: b */
    public static C12850b m50463b(C8639a c8639a) {
        return new C12850b(c8639a);
    }

    /* renamed from: c */
    public static Book m50464c(C8639a c8639a) {
        return (Book) C15521i.a(c8639a.m36797a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
