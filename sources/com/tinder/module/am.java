package com.tinder.module;

import android.content.Context;
import com.tinder.analytics.fireworks.data.C6229j;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class am implements Factory<C6229j> {
    /* renamed from: a */
    private final aa f42771a;
    /* renamed from: b */
    private final Provider<Context> f42772b;

    public /* synthetic */ Object get() {
        return m52098a();
    }

    public am(aa aaVar, Provider<Context> provider) {
        this.f42771a = aaVar;
        this.f42772b = provider;
    }

    /* renamed from: a */
    public C6229j m52098a() {
        return m52096a(this.f42771a, this.f42772b);
    }

    /* renamed from: a */
    public static C6229j m52096a(aa aaVar, Provider<Context> provider) {
        return m52095a(aaVar, (Context) provider.get());
    }

    /* renamed from: b */
    public static am m52097b(aa aaVar, Provider<Context> provider) {
        return new am(aaVar, provider);
    }

    /* renamed from: a */
    public static C6229j m52095a(aa aaVar, Context context) {
        return (C6229j) C15521i.a(aaVar.m40767a(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
