package com.tinder.module;

import com.tinder.domain.places.logging.PlacesLogger;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class ey implements Factory<PlacesLogger> {
    /* renamed from: a */
    private final ew f43003a;

    public /* synthetic */ Object get() {
        return m52502a();
    }

    public ey(ew ewVar) {
        this.f43003a = ewVar;
    }

    /* renamed from: a */
    public PlacesLogger m52502a() {
        return m52499a(this.f43003a);
    }

    /* renamed from: a */
    public static PlacesLogger m52499a(ew ewVar) {
        return m52501c(ewVar);
    }

    /* renamed from: b */
    public static ey m52500b(ew ewVar) {
        return new ey(ewVar);
    }

    /* renamed from: c */
    public static PlacesLogger m52501c(ew ewVar) {
        return (PlacesLogger) C15521i.a(ewVar.m40894b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
