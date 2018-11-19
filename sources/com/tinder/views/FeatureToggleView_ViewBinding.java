package com.tinder.views;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public class FeatureToggleView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private FeatureToggleView f52901b;

    @UiThread
    public FeatureToggleView_ViewBinding(FeatureToggleView featureToggleView, View view) {
        this.f52901b = featureToggleView;
        featureToggleView.mHeaderContainer = C0761c.a(view, R.id.feature_header_container, "field 'mHeaderContainer'");
        featureToggleView.mFeatureIcon = (ImageView) C0761c.b(view, R.id.feature_icon, "field 'mFeatureIcon'", ImageView.class);
        featureToggleView.mFeatureTitle = (TextView) C0761c.b(view, R.id.feature_title, "field 'mFeatureTitle'", TextView.class);
        featureToggleView.mFeatureDescription = (TextView) C0761c.b(view, R.id.feature_description, "field 'mFeatureDescription'", TextView.class);
        featureToggleView.mFirstFeature = (FeatureRow) C0761c.b(view, R.id.first_feature, "field 'mFirstFeature'", FeatureRow.class);
        featureToggleView.mSecondFeature = (FeatureRow) C0761c.b(view, R.id.second_feature, "field 'mSecondFeature'", FeatureRow.class);
    }

    @CallSuper
    public void unbind() {
        FeatureToggleView featureToggleView = this.f52901b;
        if (featureToggleView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f52901b = null;
        featureToggleView.mHeaderContainer = null;
        featureToggleView.mFeatureIcon = null;
        featureToggleView.mFeatureTitle = null;
        featureToggleView.mFeatureDescription = null;
        featureToggleView.mFirstFeature = null;
        featureToggleView.mSecondFeature = null;
    }
}
