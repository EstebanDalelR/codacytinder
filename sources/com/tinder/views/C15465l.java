package com.tinder.views;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.tinder.views.l */
final /* synthetic */ class C15465l implements OnClickListener {
    /* renamed from: a */
    private final FeatureToggleView f47899a;
    /* renamed from: b */
    private final boolean f47900b;

    C15465l(FeatureToggleView featureToggleView, boolean z) {
        this.f47899a = featureToggleView;
        this.f47900b = z;
    }

    public void onClick(View view) {
        this.f47899a.m57862a(this.f47900b, view);
    }
}
