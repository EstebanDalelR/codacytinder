package com.tinder.profiletab.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public class ProfileTabCircularIconLabelView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ProfileTabCircularIconLabelView f50430b;

    @UiThread
    public ProfileTabCircularIconLabelView_ViewBinding(ProfileTabCircularIconLabelView profileTabCircularIconLabelView, View view) {
        this.f50430b = profileTabCircularIconLabelView;
        profileTabCircularIconLabelView.actionButton = (FloatingActionButton) C0761c.b(view, R.id.circular_icon_image, "field 'actionButton'", FloatingActionButton.class);
        profileTabCircularIconLabelView.labelView = (TextView) C0761c.b(view, R.id.circular_icon_label, "field 'labelView'", TextView.class);
    }

    @CallSuper
    public void unbind() {
        ProfileTabCircularIconLabelView profileTabCircularIconLabelView = this.f50430b;
        if (profileTabCircularIconLabelView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f50430b = null;
        profileTabCircularIconLabelView.actionButton = null;
        profileTabCircularIconLabelView.labelView = null;
    }
}
