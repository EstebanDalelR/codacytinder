package com.tinder.video.injection.p448a;

import android.content.Context;
import com.google.android.exoplayer2.upstream.DataSource;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.video.injection.a.c */
public final class C18292c implements Factory<DataSource.Factory> {
    /* renamed from: a */
    private final C15414a f56636a;
    /* renamed from: b */
    private final Provider<Context> f56637b;

    public /* synthetic */ Object get() {
        return m66244a();
    }

    public C18292c(C15414a c15414a, Provider<Context> provider) {
        this.f56636a = c15414a;
        this.f56637b = provider;
    }

    /* renamed from: a */
    public DataSource.Factory m66244a() {
        return C18292c.m66242a(this.f56636a, this.f56637b);
    }

    /* renamed from: a */
    public static DataSource.Factory m66242a(C15414a c15414a, Provider<Context> provider) {
        return C18292c.m66241a(c15414a, (Context) provider.get());
    }

    /* renamed from: b */
    public static C18292c m66243b(C15414a c15414a, Provider<Context> provider) {
        return new C18292c(c15414a, provider);
    }

    /* renamed from: a */
    public static DataSource.Factory m66241a(C15414a c15414a, Context context) {
        return (DataSource.Factory) C15521i.m58001a(c15414a.m57797a(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
