package com.tinder.recs.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;

public class DiscoveryOffView_ViewBinding implements Unbinder {
    private DiscoveryOffView target;
    private View view2131362333;

    @UiThread
    public DiscoveryOffView_ViewBinding(DiscoveryOffView discoveryOffView) {
        this(discoveryOffView, discoveryOffView);
    }

    @UiThread
    public DiscoveryOffView_ViewBinding(final DiscoveryOffView discoveryOffView, View view) {
        this.target = discoveryOffView;
        discoveryOffView.progressBar = (ProgressBar) C0761c.b(view, R.id.discovery_off_progressbar, "field 'progressBar'", ProgressBar.class);
        view = C0761c.a(view, R.id.discovery_off_button, "field 'discoverOff' and method 'onEnableButtonClick'");
        discoveryOffView.discoverOff = (TextView) C0761c.c(view, R.id.discovery_off_button, "field 'discoverOff'", TextView.class);
        this.view2131362333 = view;
        view.setOnClickListener(new C0759a() {
            public void doClick(View view) {
                discoveryOffView.onEnableButtonClick();
            }
        });
    }

    @CallSuper
    public void unbind() {
        DiscoveryOffView discoveryOffView = this.target;
        if (discoveryOffView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        discoveryOffView.progressBar = null;
        discoveryOffView.discoverOff = null;
        this.view2131362333.setOnClickListener(null);
        this.view2131362333 = null;
    }
}
