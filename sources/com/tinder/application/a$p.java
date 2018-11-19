package com.tinder.application;

import com.tinder.places.injection.C10213b;
import com.tinder.places.injection.C10215g;
import com.tinder.places.injection.PlacesComponent;
import com.tinder.places.injection.PlacesComponent.Builder;
import com.tinder.places.main.view.PlacesView;
import dagger.internal.C15521i;

final class a$p implements Builder {
    /* renamed from: a */
    final /* synthetic */ C4423a f33661a;
    /* renamed from: b */
    private C10213b f33662b;
    /* renamed from: c */
    private C10215g f33663c;
    /* renamed from: d */
    private PlacesView f33664d;

    private a$p(C4423a c4423a) {
        this.f33661a = c4423a;
    }

    public /* synthetic */ Builder placesView(PlacesView placesView) {
        return m41987a(placesView);
    }

    public PlacesComponent build() {
        if (this.f33662b == null) {
            this.f33662b = new C10213b();
        }
        if (this.f33663c == null) {
            this.f33663c = new C10215g();
        }
        if (this.f33664d != null) {
            return new a$q(this.f33661a, this, null);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(PlacesView.class.getCanonicalName());
        stringBuilder.append(" must be set");
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    public a$p m41987a(PlacesView placesView) {
        this.f33664d = (PlacesView) C15521i.a(placesView);
        return this;
    }
}
