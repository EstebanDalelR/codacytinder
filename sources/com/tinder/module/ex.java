package com.tinder.module;

import com.tinder.places.main.view.PlacesView$Decorator;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class ex implements Factory<PlacesView$Decorator> {
    /* renamed from: a */
    private final ew f43002a;

    public /* synthetic */ Object get() {
        return m52498a();
    }

    /* renamed from: a */
    public PlacesView$Decorator m52498a() {
        return m52496a(this.f43002a);
    }

    /* renamed from: a */
    public static PlacesView$Decorator m52496a(ew ewVar) {
        return m52497b(ewVar);
    }

    /* renamed from: b */
    public static PlacesView$Decorator m52497b(ew ewVar) {
        return (PlacesView$Decorator) C15521i.a(ewVar.m40893a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
