package com.tinder.application;

import com.tinder.domain.recs.model.RecSource;
import com.tinder.places.injection.C10215g;
import com.tinder.places.injection.PlacesRecsComponent;
import com.tinder.places.injection.PlacesRecsComponent.Builder;
import dagger.internal.C15521i;

final class a$v implements Builder {
    /* renamed from: a */
    final /* synthetic */ C4423a f33679a;
    /* renamed from: b */
    private C10215g f33680b;
    /* renamed from: c */
    private RecSource f33681c;

    private a$v(C4423a c4423a) {
        this.f33679a = c4423a;
    }

    public /* synthetic */ Builder bindRecSource(RecSource recSource) {
        return m42055a(recSource);
    }

    public PlacesRecsComponent build() {
        if (this.f33680b == null) {
            this.f33680b = new C10215g();
        }
        if (this.f33681c != null) {
            return new a$w(this.f33679a, this, null);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(RecSource.class.getCanonicalName());
        stringBuilder.append(" must be set");
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    public a$v m42055a(RecSource recSource) {
        this.f33681c = (RecSource) C15521i.a(recSource);
        return this;
    }
}
