package com.tinder.places.p156a;

import android.content.Context;
import com.tinder.discovery.tooltip.C11145a.C8892a;
import com.tinder.main.tooltip.C9835c;
import com.tinder.main.trigger.Trigger;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.places.a.i */
public final class C8031i implements Factory<Trigger> {
    /* renamed from: a */
    private final C6251e f28686a;
    /* renamed from: b */
    private final Provider<C9835c> f28687b;
    /* renamed from: c */
    private final Provider<C7357l> f28688c;
    /* renamed from: d */
    private final Provider<Context> f28689d;
    /* renamed from: e */
    private final Provider<C8892a> f28690e;

    public /* synthetic */ Object get() {
        return m33956a();
    }

    public C8031i(C6251e c6251e, Provider<C9835c> provider, Provider<C7357l> provider2, Provider<Context> provider3, Provider<C8892a> provider4) {
        this.f28686a = c6251e;
        this.f28687b = provider;
        this.f28688c = provider2;
        this.f28689d = provider3;
        this.f28690e = provider4;
    }

    /* renamed from: a */
    public Trigger m33956a() {
        return C8031i.m33954a(this.f28686a, this.f28687b, this.f28688c, this.f28689d, this.f28690e);
    }

    /* renamed from: a */
    public static Trigger m33954a(C6251e c6251e, Provider<C9835c> provider, Provider<C7357l> provider2, Provider<Context> provider3, Provider<C8892a> provider4) {
        return C8031i.m33953a(c6251e, (C9835c) provider.get(), (C7357l) provider2.get(), (Context) provider3.get(), (C8892a) provider4.get());
    }

    /* renamed from: b */
    public static C8031i m33955b(C6251e c6251e, Provider<C9835c> provider, Provider<C7357l> provider2, Provider<Context> provider3, Provider<C8892a> provider4) {
        return new C8031i(c6251e, provider, provider2, provider3, provider4);
    }

    /* renamed from: a */
    public static Trigger m33953a(C6251e c6251e, C9835c c9835c, C7357l c7357l, Context context, C8892a c8892a) {
        return (Trigger) C15521i.a(c6251e.m26961a(c9835c, c7357l, context, c8892a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
