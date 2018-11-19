package com.tinder.fastmatch.view;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public final class FastMatchRecsToolbarView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private FastMatchRecsToolbarView f38144b;

    @UiThread
    public FastMatchRecsToolbarView_ViewBinding(FastMatchRecsToolbarView fastMatchRecsToolbarView, View view) {
        this.f38144b = fastMatchRecsToolbarView;
        fastMatchRecsToolbarView.toolbarTextView = (TextView) C0761c.b(view, R.id.fast_match_toolbar_title, "field 'toolbarTextView'", TextView.class);
    }

    public void unbind() {
        FastMatchRecsToolbarView fastMatchRecsToolbarView = this.f38144b;
        if (fastMatchRecsToolbarView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f38144b = null;
        fastMatchRecsToolbarView.toolbarTextView = null;
    }
}
