package com.tinder.module;

import com.crashlytics.android.beta.Beta;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class bo implements Factory<Beta> {
    /* renamed from: a */
    private final bl f42821a;

    public /* synthetic */ Object get() {
        return m52185a();
    }

    public bo(bl blVar) {
        this.f42821a = blVar;
    }

    /* renamed from: a */
    public Beta m52185a() {
        return m52182a(this.f42821a);
    }

    /* renamed from: a */
    public static Beta m52182a(bl blVar) {
        return m52184c(blVar);
    }

    /* renamed from: b */
    public static bo m52183b(bl blVar) {
        return new bo(blVar);
    }

    /* renamed from: c */
    public static Beta m52184c(bl blVar) {
        return (Beta) C15521i.a(blVar.m40794b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
