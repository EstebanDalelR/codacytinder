package com.tinder.profile.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public class ProfileItemView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ProfileItemView f50270b;

    @UiThread
    public ProfileItemView_ViewBinding(ProfileItemView profileItemView, View view) {
        this.f50270b = profileItemView;
        profileItemView.mTextView = (TextView) C0761c.b(view, R.id.profile_item_text, "field 'mTextView'", TextView.class);
        profileItemView.mCheckView = (ImageView) C0761c.b(view, R.id.profile_item_check, "field 'mCheckView'", ImageView.class);
    }

    @CallSuper
    public void unbind() {
        ProfileItemView profileItemView = this.f50270b;
        if (profileItemView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f50270b = null;
        profileItemView.mTextView = null;
        profileItemView.mCheckView = null;
    }
}
