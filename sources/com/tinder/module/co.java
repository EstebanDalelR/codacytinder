package com.tinder.module;

import android.content.Context;
import com.bumptech.glide.RequestManager;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class co implements Factory<RequestManager> {
    /* renamed from: a */
    private final bs f42875a;
    /* renamed from: b */
    private final Provider<Context> f42876b;

    public /* synthetic */ Object get() {
        return m52287a();
    }

    public co(bs bsVar, Provider<Context> provider) {
        this.f42875a = bsVar;
        this.f42876b = provider;
    }

    /* renamed from: a */
    public RequestManager m52287a() {
        return m52285a(this.f42875a, this.f42876b);
    }

    /* renamed from: a */
    public static RequestManager m52285a(bs bsVar, Provider<Context> provider) {
        return m52284a(bsVar, (Context) provider.get());
    }

    /* renamed from: b */
    public static co m52286b(bs bsVar, Provider<Context> provider) {
        return new co(bsVar, provider);
    }

    /* renamed from: a */
    public static RequestManager m52284a(bs bsVar, Context context) {
        return (RequestManager) C15521i.a(bsVar.m40845j(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
