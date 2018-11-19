package com.tinder.dialogs;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;

public class DiscoveryToolTip_ViewBinding implements Unbinder {
    /* renamed from: b */
    private DiscoveryToolTip f35957b;
    /* renamed from: c */
    private View f35958c;

    @UiThread
    public DiscoveryToolTip_ViewBinding(final DiscoveryToolTip discoveryToolTip, View view) {
        this.f35957b = discoveryToolTip;
        discoveryToolTip.mToolTipTextView = (TextView) C0761c.b(view, R.id.discovery_tool_tip_text, "field 'mToolTipTextView'", TextView.class);
        discoveryToolTip.mToolTipTextIcon = (TextView) C0761c.b(view, R.id.discovery_tool_tip_text_icon, "field 'mToolTipTextIcon'", TextView.class);
        discoveryToolTip.mToolTipIcon = (ImageView) C0761c.b(view, R.id.discovery_tool_tip_icon, "field 'mToolTipIcon'", ImageView.class);
        View a = C0761c.a(view, R.id.discovery_tool_tip, "method 'onClickDismissDialog'");
        this.f35958c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ DiscoveryToolTip_ViewBinding f35956b;

            public void doClick(View view) {
                discoveryToolTip.onClickDismissDialog();
            }
        });
        view = view.getContext().getResources();
        discoveryToolTip.socialToolTipText = view.getString(R.string.group_tool_tip_text);
        discoveryToolTip.selectToolTipText = view.getString(R.string.tinder_select_tool_tip_text);
    }

    @CallSuper
    public void unbind() {
        DiscoveryToolTip discoveryToolTip = this.f35957b;
        if (discoveryToolTip == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f35957b = null;
        discoveryToolTip.mToolTipTextView = null;
        discoveryToolTip.mToolTipTextIcon = null;
        discoveryToolTip.mToolTipIcon = null;
        this.f35958c.setOnClickListener(null);
        this.f35958c = null;
    }
}
