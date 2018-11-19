package com.tinder.module;

import com.tinder.p071a.C2602d;
import com.tinder.p071a.C3868l;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class dy implements Factory<C3868l> {
    /* renamed from: a */
    private final dx f42952a;
    /* renamed from: b */
    private final Provider<C2602d> f42953b;

    public /* synthetic */ Object get() {
        return m52425a();
    }

    public dy(dx dxVar, Provider<C2602d> provider) {
        this.f42952a = dxVar;
        this.f42953b = provider;
    }

    /* renamed from: a */
    public C3868l m52425a() {
        return m52423a(this.f42952a, this.f42953b);
    }

    /* renamed from: a */
    public static C3868l m52423a(dx dxVar, Provider<C2602d> provider) {
        return m52422a(dxVar, (C2602d) provider.get());
    }

    /* renamed from: b */
    public static dy m52424b(dx dxVar, Provider<C2602d> provider) {
        return new dy(dxVar, provider);
    }

    /* renamed from: a */
    public static C3868l m52422a(dx dxVar, C2602d c2602d) {
        return (C3868l) C15521i.a(dxVar.m40876b(c2602d), "Cannot return null from a non-@Nullable @Provides method");
    }
}
