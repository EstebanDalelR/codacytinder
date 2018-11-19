package com.tinder.views;

import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public class FeatureRow_ViewBinding implements Unbinder {
    /* renamed from: b */
    private FeatureRow f52900b;

    @UiThread
    public FeatureRow_ViewBinding(FeatureRow featureRow, View view) {
        this.f52900b = featureRow;
        featureRow.mFeatureTitle = (TextView) C0761c.b(view, R.id.feature_title, "field 'mFeatureTitle'", TextView.class);
        featureRow.mFeatureDescription = (TextView) C0761c.b(view, R.id.feature_description, "field 'mFeatureDescription'", TextView.class);
        featureRow.mFeatureSwitch = (SwitchCompat) C0761c.b(view, R.id.feature_switch, "field 'mFeatureSwitch'", SwitchCompat.class);
        featureRow.mFeatureCheck = (ImageView) C0761c.b(view, R.id.feature_check, "field 'mFeatureCheck'", ImageView.class);
        view = view.getContext();
        Resources resources = view.getResources();
        featureRow.mWhite = C0432b.c(view, R.color.white);
        featureRow.mRedColorFilter = C0432b.c(view, R.color.red_check_mark);
        featureRow.mPadding = resources.getDimensionPixelSize(R.dimen.padding_med);
        featureRow.mBottomPadding = resources.getDimensionPixelSize(R.dimen.margin_xsmall);
    }

    @CallSuper
    public void unbind() {
        FeatureRow featureRow = this.f52900b;
        if (featureRow == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f52900b = null;
        featureRow.mFeatureTitle = null;
        featureRow.mFeatureDescription = null;
        featureRow.mFeatureSwitch = null;
        featureRow.mFeatureCheck = null;
    }
}
