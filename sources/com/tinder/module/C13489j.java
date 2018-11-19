package com.tinder.module;

import android.content.Context;
import com.tinder.addy.Addy;
import com.tinder.addy.tracker.AdUrlTracker.Listener;
import com.tinder.addy.tracker.TrackingUrlsDecorator;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;
import okhttp3.C17692o;

/* renamed from: com.tinder.module.j */
public final class C13489j implements Factory<Addy> {
    /* renamed from: a */
    private final C9940d f43043a;
    /* renamed from: b */
    private final Provider<Context> f43044b;
    /* renamed from: c */
    private final Provider<C17692o> f43045c;
    /* renamed from: d */
    private final Provider<Set<TrackingUrlsDecorator>> f43046d;
    /* renamed from: e */
    private final Provider<Set<Listener>> f43047e;

    public /* synthetic */ Object get() {
        return m52548a();
    }

    public C13489j(C9940d c9940d, Provider<Context> provider, Provider<C17692o> provider2, Provider<Set<TrackingUrlsDecorator>> provider3, Provider<Set<Listener>> provider4) {
        this.f43043a = c9940d;
        this.f43044b = provider;
        this.f43045c = provider2;
        this.f43046d = provider3;
        this.f43047e = provider4;
    }

    /* renamed from: a */
    public Addy m52548a() {
        return C13489j.m52546a(this.f43043a, this.f43044b, this.f43045c, this.f43046d, this.f43047e);
    }

    /* renamed from: a */
    public static Addy m52546a(C9940d c9940d, Provider<Context> provider, Provider<C17692o> provider2, Provider<Set<TrackingUrlsDecorator>> provider3, Provider<Set<Listener>> provider4) {
        return C13489j.m52545a(c9940d, (Context) provider.get(), (C17692o) provider2.get(), (Set) provider3.get(), (Set) provider4.get());
    }

    /* renamed from: b */
    public static C13489j m52547b(C9940d c9940d, Provider<Context> provider, Provider<C17692o> provider2, Provider<Set<TrackingUrlsDecorator>> provider3, Provider<Set<Listener>> provider4) {
        return new C13489j(c9940d, provider, provider2, provider3, provider4);
    }

    /* renamed from: a */
    public static Addy m52545a(C9940d c9940d, Context context, C17692o c17692o, Set<TrackingUrlsDecorator> set, Set<Listener> set2) {
        return (Addy) C15521i.a(c9940d.m40855a(context, c17692o, set, set2), "Cannot return null from a non-@Nullable @Provides method");
    }
}
