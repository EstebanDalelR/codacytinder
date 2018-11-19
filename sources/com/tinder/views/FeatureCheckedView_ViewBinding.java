package com.tinder.views;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public class FeatureCheckedView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private FeatureCheckedView f52899b;

    @UiThread
    public FeatureCheckedView_ViewBinding(FeatureCheckedView featureCheckedView, View view) {
        this.f52899b = featureCheckedView;
        featureCheckedView.mFeatureIcon = (ImageView) C0761c.b(view, R.id.feature_icon, "field 'mFeatureIcon'", ImageView.class);
        featureCheckedView.mFeatureTitle = (TextView) C0761c.b(view, R.id.feature_title, "field 'mFeatureTitle'", TextView.class);
        featureCheckedView.mFeatureDescription = (TextView) C0761c.b(view, R.id.feature_description, "field 'mFeatureDescription'", TextView.class);
        featureCheckedView.mFeaturesContainer = (ViewGroup) C0761c.b(view, R.id.features_container, "field 'mFeaturesContainer'", ViewGroup.class);
        featureCheckedView.mFirstFeature = (FeatureRow) C0761c.b(view, R.id.first_feature, "field 'mFirstFeature'", FeatureRow.class);
        featureCheckedView.mSecondFeature = (FeatureRow) C0761c.b(view, R.id.second_feature, "field 'mSecondFeature'", FeatureRow.class);
        featureCheckedView.mThirdFeature = (FeatureRow) C0761c.b(view, R.id.third_feature, "field 'mThirdFeature'", FeatureRow.class);
    }

    @CallSuper
    public void unbind() {
        FeatureCheckedView featureCheckedView = this.f52899b;
        if (featureCheckedView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f52899b = null;
        featureCheckedView.mFeatureIcon = null;
        featureCheckedView.mFeatureTitle = null;
        featureCheckedView.mFeatureDescription = null;
        featureCheckedView.mFeaturesContainer = null;
        featureCheckedView.mFirstFeature = null;
        featureCheckedView.mSecondFeature = null;
        featureCheckedView.mThirdFeature = null;
    }
}
