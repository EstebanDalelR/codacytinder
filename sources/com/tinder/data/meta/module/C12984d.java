package com.tinder.data.meta.module;

import com.tinder.data.meta.store.MetaStore;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import io.paperdb.Book;
import javax.inject.Provider;

/* renamed from: com.tinder.data.meta.module.d */
public final class C12984d implements Factory<MetaStore> {
    /* renamed from: a */
    private final C8702a f41566a;
    /* renamed from: b */
    private final Provider<Book> f41567b;

    public /* synthetic */ Object get() {
        return m50740a();
    }

    public C12984d(C8702a c8702a, Provider<Book> provider) {
        this.f41566a = c8702a;
        this.f41567b = provider;
    }

    /* renamed from: a */
    public MetaStore m50740a() {
        return C12984d.m50738a(this.f41566a, this.f41567b);
    }

    /* renamed from: a */
    public static MetaStore m50738a(C8702a c8702a, Provider<Book> provider) {
        return C12984d.m50737a(c8702a, (Book) provider.get());
    }

    /* renamed from: b */
    public static C12984d m50739b(C8702a c8702a, Provider<Book> provider) {
        return new C12984d(c8702a, provider);
    }

    /* renamed from: a */
    public static MetaStore m50737a(C8702a c8702a, Book book) {
        return (MetaStore) C15521i.a(c8702a.m37164a(book), "Cannot return null from a non-@Nullable @Provides method");
    }
}
