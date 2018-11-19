package com.tinder.toppicks.notifications;

import android.content.res.Resources;
import com.tinder.pushnotifications.C14550a;
import com.tinder.pushnotifications.p380a.C14548a;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.jvm.functions.Function0;
import org.joda.time.DateTime;

/* renamed from: com.tinder.toppicks.notifications.i */
public final class C18238i implements Factory<C17047h> {
    /* renamed from: a */
    private final Provider<Resources> f56529a;
    /* renamed from: b */
    private final Provider<Function0<DateTime>> f56530b;
    /* renamed from: c */
    private final Provider<C14548a> f56531c;
    /* renamed from: d */
    private final Provider<C14550a> f56532d;

    public /* synthetic */ Object get() {
        return m66100a();
    }

    public C18238i(Provider<Resources> provider, Provider<Function0<DateTime>> provider2, Provider<C14548a> provider3, Provider<C14550a> provider4) {
        this.f56529a = provider;
        this.f56530b = provider2;
        this.f56531c = provider3;
        this.f56532d = provider4;
    }

    /* renamed from: a */
    public C17047h m66100a() {
        return C18238i.m66098a(this.f56529a, this.f56530b, this.f56531c, this.f56532d);
    }

    /* renamed from: a */
    public static C17047h m66098a(Provider<Resources> provider, Provider<Function0<DateTime>> provider2, Provider<C14548a> provider3, Provider<C14550a> provider4) {
        return new C17047h((Resources) provider.get(), (Function0) provider2.get(), (C14548a) provider3.get(), (C14550a) provider4.get());
    }

    /* renamed from: b */
    public static C18238i m66099b(Provider<Resources> provider, Provider<Function0<DateTime>> provider2, Provider<C14548a> provider3, Provider<C14550a> provider4) {
        return new C18238i(provider, provider2, provider3, provider4);
    }
}
