package com.tinder.profile.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public class BasicInfoShareRecView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private BasicInfoShareRecView f50199b;

    @UiThread
    public BasicInfoShareRecView_ViewBinding(BasicInfoShareRecView basicInfoShareRecView, View view) {
        this.f50199b = basicInfoShareRecView;
        basicInfoShareRecView.spinner = (ProgressBar) C0761c.b(view, R.id.spinner, "field 'spinner'", ProgressBar.class);
        basicInfoShareRecView.share = (ImageView) C0761c.b(view, R.id.share_icon, "field 'share'", ImageView.class);
    }

    @CallSuper
    public void unbind() {
        BasicInfoShareRecView basicInfoShareRecView = this.f50199b;
        if (basicInfoShareRecView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f50199b = null;
        basicInfoShareRecView.spinner = null;
        basicInfoShareRecView.share = null;
    }
}
