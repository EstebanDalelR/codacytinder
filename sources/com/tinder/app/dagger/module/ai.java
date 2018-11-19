package com.tinder.app.dagger.module;

import com.tinder.activities.MainActivity;
import com.tinder.main.tooltip.C9835c;
import com.tinder.main.trigger.Trigger;
import com.tinder.verification.C15388c.C15387a;
import com.tinder.verification.usecase.C15390a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import io.reactivex.C15679f;
import javax.inject.Provider;

public final class ai implements Factory<Trigger> {
    /* renamed from: a */
    private final ad f40179a;
    /* renamed from: b */
    private final Provider<C9835c> f40180b;
    /* renamed from: c */
    private final Provider<C15387a> f40181c;
    /* renamed from: d */
    private final Provider<C15390a> f40182d;
    /* renamed from: e */
    private final Provider<C15679f> f40183e;
    /* renamed from: f */
    private final Provider<C15679f> f40184f;
    /* renamed from: g */
    private final Provider<MainActivity> f40185g;

    public /* synthetic */ Object get() {
        return m48989a();
    }

    public ai(ad adVar, Provider<C9835c> provider, Provider<C15387a> provider2, Provider<C15390a> provider3, Provider<C15679f> provider4, Provider<C15679f> provider5, Provider<MainActivity> provider6) {
        this.f40179a = adVar;
        this.f40180b = provider;
        this.f40181c = provider2;
        this.f40182d = provider3;
        this.f40183e = provider4;
        this.f40184f = provider5;
        this.f40185g = provider6;
    }

    /* renamed from: a */
    public Trigger m48989a() {
        return m48987a(this.f40179a, this.f40180b, this.f40181c, this.f40182d, this.f40183e, this.f40184f, this.f40185g);
    }

    /* renamed from: a */
    public static Trigger m48987a(ad adVar, Provider<C9835c> provider, Provider<C15387a> provider2, Provider<C15390a> provider3, Provider<C15679f> provider4, Provider<C15679f> provider5, Provider<MainActivity> provider6) {
        return m48986a(adVar, (C9835c) provider.get(), (C15387a) provider2.get(), (C15390a) provider3.get(), (C15679f) provider4.get(), (C15679f) provider5.get(), (MainActivity) provider6.get());
    }

    /* renamed from: b */
    public static ai m48988b(ad adVar, Provider<C9835c> provider, Provider<C15387a> provider2, Provider<C15390a> provider3, Provider<C15679f> provider4, Provider<C15679f> provider5, Provider<MainActivity> provider6) {
        return new ai(adVar, provider, provider2, provider3, provider4, provider5, provider6);
    }

    /* renamed from: a */
    public static Trigger m48986a(ad adVar, C9835c c9835c, C15387a c15387a, C15390a c15390a, C15679f c15679f, C15679f c15679f2, MainActivity mainActivity) {
        return (Trigger) C15521i.a(adVar.m35151a(c9835c, c15387a, c15390a, c15679f, c15679f2, mainActivity), "Cannot return null from a non-@Nullable @Provides method");
    }
}
