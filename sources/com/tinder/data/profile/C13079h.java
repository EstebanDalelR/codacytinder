package com.tinder.data.profile;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import io.paperdb.Book;

/* renamed from: com.tinder.data.profile.h */
public final class C13079h implements Factory<Book> {
    /* renamed from: a */
    private final C8760g f41655a;

    public /* synthetic */ Object get() {
        return m50900a();
    }

    public C13079h(C8760g c8760g) {
        this.f41655a = c8760g;
    }

    /* renamed from: a */
    public Book m50900a() {
        return C13079h.m50897a(this.f41655a);
    }

    /* renamed from: a */
    public static Book m50897a(C8760g c8760g) {
        return C13079h.m50899c(c8760g);
    }

    /* renamed from: b */
    public static C13079h m50898b(C8760g c8760g) {
        return new C13079h(c8760g);
    }

    /* renamed from: c */
    public static Book m50899c(C8760g c8760g) {
        return (Book) C15521i.a(c8760g.m37306a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
