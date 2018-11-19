package com.tinder.views;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.tinder.views.j */
final /* synthetic */ class C15463j implements OnClickListener {
    /* renamed from: a */
    private final FeatureToggleView f47896a;
    /* renamed from: b */
    private final boolean f47897b;

    C15463j(FeatureToggleView featureToggleView, boolean z) {
        this.f47896a = featureToggleView;
        this.f47897b = z;
    }

    public void onClick(View view) {
        this.f47896a.m57865b(this.f47897b, view);
    }
}
