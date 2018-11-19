package com.tinder.module;

import android.content.ContentResolver;
import android.content.Context;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class cd implements Factory<ContentResolver> {
    /* renamed from: a */
    private final bs f42853a;
    /* renamed from: b */
    private final Provider<Context> f42854b;

    public /* synthetic */ Object get() {
        return m52244a();
    }

    public cd(bs bsVar, Provider<Context> provider) {
        this.f42853a = bsVar;
        this.f42854b = provider;
    }

    /* renamed from: a */
    public ContentResolver m52244a() {
        return m52242a(this.f42853a, this.f42854b);
    }

    /* renamed from: a */
    public static ContentResolver m52242a(bs bsVar, Provider<Context> provider) {
        return m52241a(bsVar, (Context) provider.get());
    }

    /* renamed from: b */
    public static cd m52243b(bs bsVar, Provider<Context> provider) {
        return new cd(bsVar, provider);
    }

    /* renamed from: a */
    public static ContentResolver m52241a(bs bsVar, Context context) {
        return (ContentResolver) C15521i.a(bsVar.m40843i(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
