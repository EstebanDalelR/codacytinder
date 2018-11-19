package com.tinder.views;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.tinder.views.FeatureRow.FeatureInteractionListener;

/* renamed from: com.tinder.views.h */
final /* synthetic */ class C15461h implements OnCheckedChangeListener {
    /* renamed from: a */
    private final FeatureRow f47893a;
    /* renamed from: b */
    private final FeatureInteractionListener f47894b;

    C15461h(FeatureRow featureRow, FeatureInteractionListener featureInteractionListener) {
        this.f47893a = featureRow;
        this.f47894b = featureInteractionListener;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f47893a.m57853a(this.f47894b, compoundButton, z);
    }
}
