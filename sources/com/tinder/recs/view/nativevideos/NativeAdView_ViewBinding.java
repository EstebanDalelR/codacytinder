package com.tinder.recs.view.nativevideos;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;

public class NativeAdView_ViewBinding implements Unbinder {
    private NativeAdView target;
    private View view2131361855;
    private View view2131361860;
    private View view2131361861;

    @UiThread
    public NativeAdView_ViewBinding(NativeAdView nativeAdView) {
        this(nativeAdView, nativeAdView);
    }

    @UiThread
    public NativeAdView_ViewBinding(final NativeAdView nativeAdView, View view) {
        this.target = nativeAdView;
        View a = C0761c.a(view, R.id.ads_card_play_pause_button, "field 'playPauseButton' and method 'onPlayPauseButtonClick'");
        nativeAdView.playPauseButton = (ImageView) C0761c.c(a, R.id.ads_card_play_pause_button, "field 'playPauseButton'", ImageView.class);
        this.view2131361861 = a;
        a.setOnClickListener(new C0759a() {
            public void doClick(View view) {
                nativeAdView.onPlayPauseButtonClick();
            }
        });
        a = C0761c.a(view, R.id.ads_card_mute_button, "field 'muteButton' and method 'onMuteUnmuteButtonClick'");
        nativeAdView.muteButton = (ImageView) C0761c.c(a, R.id.ads_card_mute_button, "field 'muteButton'", ImageView.class);
        this.view2131361860 = a;
        a.setOnClickListener(new C0759a() {
            public void doClick(View view) {
                nativeAdView.onMuteUnmuteButtonClick();
            }
        });
        nativeAdView.progress = (ProgressBar) C0761c.b(view, R.id.progress_bar, "field 'progress'", ProgressBar.class);
        nativeAdView.contentStub = (ViewStub) C0761c.b(view, R.id.ads_card_stub, "field 'contentStub'", ViewStub.class);
        view = C0761c.a(view, R.id.ads_card_click_through, "method 'onClickThroughViewClick'");
        this.view2131361855 = view;
        view.setOnClickListener(new C0759a() {
            public void doClick(View view) {
                nativeAdView.onClickThroughViewClick();
            }
        });
    }

    @CallSuper
    public void unbind() {
        NativeAdView nativeAdView = this.target;
        if (nativeAdView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        nativeAdView.playPauseButton = null;
        nativeAdView.muteButton = null;
        nativeAdView.progress = null;
        nativeAdView.contentStub = null;
        this.view2131361861.setOnClickListener(null);
        this.view2131361861 = null;
        this.view2131361860.setOnClickListener(null);
        this.view2131361860 = null;
        this.view2131361855.setOnClickListener(null);
        this.view2131361855 = null;
    }
}
