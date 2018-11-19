package com.tinder.recs.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.views.CustomButton;

public class RecsStatusView_ViewBinding implements Unbinder {
    private RecsStatusView target;
    private View view2131363433;

    @UiThread
    public RecsStatusView_ViewBinding(RecsStatusView recsStatusView) {
        this(recsStatusView, recsStatusView);
    }

    @UiThread
    public RecsStatusView_ViewBinding(final RecsStatusView recsStatusView, View view) {
        this.target = recsStatusView;
        recsStatusView.thumbView = (ImageView) C0761c.b(view, R.id.recs_status_thumb, "field 'thumbView'", ImageView.class);
        recsStatusView.ring1 = (ImageView) C0761c.b(view, R.id.recs_status_ring_one, "field 'ring1'", ImageView.class);
        recsStatusView.ring2 = (ImageView) C0761c.b(view, R.id.recs_status_ring_two, "field 'ring2'", ImageView.class);
        recsStatusView.messageView = (TextView) C0761c.b(view, R.id.recs_status_message, "field 'messageView'", TextView.class);
        View a = C0761c.a(view, R.id.recs_settings_view, "field 'settingsButton' and method 'updateDiscoveryPreferences'");
        recsStatusView.settingsButton = (CustomButton) C0761c.c(a, R.id.recs_settings_view, "field 'settingsButton'", CustomButton.class);
        this.view2131363433 = a;
        a.setOnClickListener(new C0759a() {
            public void doClick(View view) {
                recsStatusView.updateDiscoveryPreferences();
            }
        });
        view = view.getContext().getResources();
        recsStatusView.imageSize = view.getDimensionPixelSize(R.dimen.loading_img_container_length);
        recsStatusView.thumbStrokeWidth = view.getDimensionPixelSize(R.dimen.recs_status_thumb_stroke_width);
        recsStatusView.titleFontSize = view.getDimensionPixelSize(R.dimen.text_l);
        recsStatusView.detailFontSize = view.getDimensionPixelSize(R.dimen.text_m);
        recsStatusView.passportAction = view.getString(R.string.radar_passport_action);
        recsStatusView.discoverySettingsAction = view.getString(R.string.discovery_settings);
    }

    @CallSuper
    public void unbind() {
        RecsStatusView recsStatusView = this.target;
        if (recsStatusView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        recsStatusView.thumbView = null;
        recsStatusView.ring1 = null;
        recsStatusView.ring2 = null;
        recsStatusView.messageView = null;
        recsStatusView.settingsButton = null;
        this.view2131363433.setOnClickListener(null);
        this.view2131363433 = null;
    }
}
