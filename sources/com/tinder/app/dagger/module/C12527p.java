package com.tinder.app.dagger.module;

import android.content.Context;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.feed.trigger.C11705c;
import com.tinder.main.tooltip.C12012a.C9833a;
import com.tinder.main.tooltip.C9835c;
import com.tinder.main.trigger.Trigger;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import io.reactivex.C15679f;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.p */
public final class C12527p implements Factory<Trigger> {
    /* renamed from: a */
    private final C8253o f40366a;
    /* renamed from: b */
    private final Provider<C9835c> f40367b;
    /* renamed from: c */
    private final Provider<Context> f40368c;
    /* renamed from: d */
    private final Provider<C9833a> f40369d;
    /* renamed from: e */
    private final Provider<C11705c> f40370e;
    /* renamed from: f */
    private final Provider<AbTestUtility> f40371f;
    /* renamed from: g */
    private final Provider<C15679f> f40372g;
    /* renamed from: h */
    private final Provider<C15679f> f40373h;

    public /* synthetic */ Object get() {
        return m49299a();
    }

    public C12527p(C8253o c8253o, Provider<C9835c> provider, Provider<Context> provider2, Provider<C9833a> provider3, Provider<C11705c> provider4, Provider<AbTestUtility> provider5, Provider<C15679f> provider6, Provider<C15679f> provider7) {
        this.f40366a = c8253o;
        this.f40367b = provider;
        this.f40368c = provider2;
        this.f40369d = provider3;
        this.f40370e = provider4;
        this.f40371f = provider5;
        this.f40372g = provider6;
        this.f40373h = provider7;
    }

    /* renamed from: a */
    public Trigger m49299a() {
        return C12527p.m49297a(this.f40366a, this.f40367b, this.f40368c, this.f40369d, this.f40370e, this.f40371f, this.f40372g, this.f40373h);
    }

    /* renamed from: a */
    public static Trigger m49297a(C8253o c8253o, Provider<C9835c> provider, Provider<Context> provider2, Provider<C9833a> provider3, Provider<C11705c> provider4, Provider<AbTestUtility> provider5, Provider<C15679f> provider6, Provider<C15679f> provider7) {
        return C12527p.m49296a(c8253o, (C9835c) provider.get(), (Context) provider2.get(), (C9833a) provider3.get(), (C11705c) provider4.get(), (AbTestUtility) provider5.get(), (C15679f) provider6.get(), (C15679f) provider7.get());
    }

    /* renamed from: b */
    public static C12527p m49298b(C8253o c8253o, Provider<C9835c> provider, Provider<Context> provider2, Provider<C9833a> provider3, Provider<C11705c> provider4, Provider<AbTestUtility> provider5, Provider<C15679f> provider6, Provider<C15679f> provider7) {
        return new C12527p(c8253o, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    /* renamed from: a */
    public static Trigger m49296a(C8253o c8253o, C9835c c9835c, Context context, C9833a c9833a, C11705c c11705c, AbTestUtility abTestUtility, C15679f c15679f, C15679f c15679f2) {
        return (Trigger) C15521i.a(c8253o.m35225a(c9835c, context, c9833a, c11705c, abTestUtility, c15679f, c15679f2), "Cannot return null from a non-@Nullable @Provides method");
    }
}
