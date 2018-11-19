package com.tinder.module;

import com.tinder.addy.tracker.AdUrlTracker.Listener;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.Set;

/* renamed from: com.tinder.module.i */
public final class C13488i implements Factory<Set<Listener>> {
    /* renamed from: a */
    private final C9940d f43042a;

    public /* synthetic */ Object get() {
        return m52544a();
    }

    public C13488i(C9940d c9940d) {
        this.f43042a = c9940d;
    }

    /* renamed from: a */
    public Set<Listener> m52544a() {
        return C13488i.m52541a(this.f43042a);
    }

    /* renamed from: a */
    public static Set<Listener> m52541a(C9940d c9940d) {
        return C13488i.m52543c(c9940d);
    }

    /* renamed from: b */
    public static C13488i m52542b(C9940d c9940d) {
        return new C13488i(c9940d);
    }

    /* renamed from: c */
    public static Set<Listener> m52543c(C9940d c9940d) {
        return (Set) C15521i.a(c9940d.m40874d(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
