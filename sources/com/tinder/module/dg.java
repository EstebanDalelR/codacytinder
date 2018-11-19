package com.tinder.module;

import com.tinder.data.places.provider.PlacesConfigExpansionProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class dg implements Factory<PlacesConfigExpansionProvider> {
    /* renamed from: a */
    private final bs f42911a;

    public /* synthetic */ Object get() {
        return m52357a();
    }

    public dg(bs bsVar) {
        this.f42911a = bsVar;
    }

    /* renamed from: a */
    public PlacesConfigExpansionProvider m52357a() {
        return m52354a(this.f42911a);
    }

    /* renamed from: a */
    public static PlacesConfigExpansionProvider m52354a(bs bsVar) {
        return m52356c(bsVar);
    }

    /* renamed from: b */
    public static dg m52355b(bs bsVar) {
        return new dg(bsVar);
    }

    /* renamed from: c */
    public static PlacesConfigExpansionProvider m52356c(bs bsVar) {
        return (PlacesConfigExpansionProvider) C15521i.a(bsVar.m40838f(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
