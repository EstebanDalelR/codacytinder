package com.tinder.recs.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bumptech.glide.C0994i;
import com.facebook.ads.AdChoicesView;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAd.Image;
import com.tinder.R;
import com.tinder.ads.presenter.FanAdPresenter;
import com.tinder.ads.source.fan.FanAd;
import com.tinder.recs.component.RecsViewComponentProvider;
import com.tinder.recsads.view.DispatchTouchDownListenerMediaView;
import com.tinder.recsads.view.DispatchTouchDownListenerTextView;
import com.tinder.recsads.view.RedGradientFillButtonView;
import java.util.Arrays;
import javax.inject.Inject;

public class FanAdView extends LinearLayout {
    private static final int SCREEN_SIZE_TO_MAX_AD_SIZE_RATIO = 3;
    @BindView(2131361840)
    ViewGroup adChoicesContainer;
    @Nullable
    private String adChoicesUrl;
    @Nullable
    private FanAd fanAd;
    @Inject
    FanAdPresenter fanAdPresenter;
    @BindDimen(2131165760)
    int materialTouchDelegateSize;
    private final MediaViewListener mediaViewListener = new C164112();
    @BindView(2131362459)
    TextView nativeAdBody;
    @BindView(2131362458)
    RedGradientFillButtonView nativeAdCallToAction;
    @BindView(2131362461)
    LinearLayout nativeAdContainer;
    @BindView(2131362463)
    ImageView nativeAdIcon;
    @BindView(2131362460)
    DispatchTouchDownListenerMediaView nativeAdMediaView;
    @BindView(2131362462)
    TextView nativeAdSponsorLabel;
    @BindView(2131362464)
    TextView nativeAdSponsorName;
    @BindView(2131362465)
    DispatchTouchDownListenerTextView nativeAdTitle;

    /* renamed from: com.tinder.recs.view.FanAdView$2 */
    class C164112 implements MediaViewListener {
        public void onEnterFullscreen(MediaView mediaView) {
        }

        public void onExitFullscreen(MediaView mediaView) {
        }

        public void onFullscreenBackground(MediaView mediaView) {
        }

        public void onFullscreenForeground(MediaView mediaView) {
        }

        C164112() {
        }

        public void onVolumeChange(MediaView mediaView, float f) {
            FanAdView.this.fanAdPresenter.sendAdToggleAudioEvent(FanAdView.this.fanAd);
        }

        public void onPause(MediaView mediaView) {
            FanAdView.this.fanAdPresenter.sendAdSelectEvent(FanAdView.this.fanAd, 1);
        }

        public void onPlay(MediaView mediaView) {
            FanAdView.this.fanAdPresenter.sendAdPlayEvent(FanAdView.this.fanAd);
        }

        public void onComplete(MediaView mediaView) {
            FanAdView.this.fanAdPresenter.sendAdCompleteEvent(FanAdView.this.fanAd);
        }
    }

    public FanAdView(Context context) {
        super(context);
        inflate(context, R.layout.rec_ad_fan, this);
        ButterKnife.a(this);
        ((RecsViewComponentProvider) context).getRecsViewComponent().inject(this);
    }

    public void bindFanAd(@NonNull FanAd fanAd) {
        this.fanAd = fanAd;
        fanAd = fanAd.getNativeAd();
        addAdChoicesView(fanAd);
        this.adChoicesUrl = fanAd.getAdChoicesLinkUrl();
    }

    public void viewNativeAd() {
        this.fanAdPresenter.sendAdViewEvent(this.fanAd);
        this.nativeAdCallToAction.m61912b();
    }

    public void showNativeAd() {
        NativeAd nativeAd = this.fanAd.getNativeAd();
        resizeNativeAdViewHeight(this.nativeAdMediaView, nativeAd.getAdCoverImage());
        if (nativeAd.getAdSocialContext() != null) {
            this.nativeAdTitle.setText(nativeAd.getAdSocialContext());
        } else {
            this.nativeAdTitle.setText(nativeAd.getAdTitle());
        }
        this.nativeAdBody.setText(nativeAd.getAdRawBody());
        this.nativeAdCallToAction.setText(nativeAd.getAdCallToAction());
        Image adIcon = nativeAd.getAdIcon();
        this.nativeAdMediaView.setNativeAd(nativeAd);
        if (adIcon != null) {
            C0994i.b(getContext()).a(adIcon.getUrl()).a(this.nativeAdIcon);
        }
        this.nativeAdSponsorName.setText(nativeAd.getAdTitle());
        nativeAd.registerViewForInteraction(this.nativeAdContainer, Arrays.asList(new View[]{this.nativeAdTitle, this.nativeAdCallToAction, this.nativeAdMediaView, this.nativeAdIcon}));
        registerDispatchTouchEventListeners();
        this.nativeAdMediaView.setListener(this.mediaViewListener);
        expandSponsoredTouchDelegate();
    }

    private void registerDispatchTouchEventListeners() {
        this.nativeAdMediaView.setOnDispatchTouchEventListener(new FanAdView$$Lambda$0(this));
        this.nativeAdTitle.setOnDispatchTouchEventListener(new FanAdView$$Lambda$1(this));
        this.nativeAdCallToAction.setOnDispatchTouchEventListener(new FanAdView$$Lambda$2(this));
    }

    final /* synthetic */ void lambda$registerDispatchTouchEventListeners$0$FanAdView() {
        this.fanAdPresenter.sendAdSelectEvent(this.fanAd, 4);
    }

    final /* synthetic */ void lambda$registerDispatchTouchEventListeners$1$FanAdView() {
        this.fanAdPresenter.sendAdSelectEvent(this.fanAd, 5);
    }

    final /* synthetic */ void lambda$registerDispatchTouchEventListeners$2$FanAdView() {
        this.fanAdPresenter.sendAdSelectEvent(this.fanAd, 7);
    }

    private void resizeNativeAdViewHeight(@NonNull final View view, @Nullable final Image image) {
        if (image != null) {
            if (getWidth() != 0) {
                setNativeAdViewLayoutParameters(view, image);
            } else {
                getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        FanAdView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        FanAdView.this.setNativeAdViewLayoutParameters(view, image);
                    }
                });
            }
        }
    }

    private void setNativeAdViewLayoutParameters(@NonNull View view, @NonNull Image image) {
        int width = image.getWidth();
        image = image.getHeight();
        int height = getRootView().getHeight();
        int width2 = getWidth();
        view.setLayoutParams(new LayoutParams(width2, Math.min((int) ((((double) width2) / ((double) width)) * ((double) image)), height / 3)));
    }

    private void expandSponsoredTouchDelegate() {
        ((View) this.nativeAdSponsorLabel.getParent()).post(new FanAdView$$Lambda$3(this));
    }

    final /* synthetic */ void lambda$expandSponsoredTouchDelegate$3$FanAdView() {
        Rect rect = new Rect();
        this.nativeAdSponsorLabel.getHitRect(rect);
        rect.bottom = rect.top + this.materialTouchDelegateSize;
        ((View) this.nativeAdSponsorLabel.getParent()).setTouchDelegate(new TouchDelegate(rect, this.nativeAdSponsorLabel));
    }

    private void addAdChoicesView(NativeAd nativeAd) {
        this.adChoicesContainer.removeAllViews();
        this.adChoicesContainer.addView(new AdChoicesView(getContext(), nativeAd, true));
    }

    @OnClick({2131362462})
    void clickSponsorLabel() {
        openAdChoices();
    }

    private void openAdChoices() {
        this.fanAdPresenter.sendAdSelectEvent(this.fanAd, 6);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.adChoicesUrl));
        if (!getContext().getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
            getContext().startActivity(intent);
        }
    }
}
