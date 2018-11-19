package com.tinder.recs.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.ads.Ad;
import com.tinder.ads.RecsNativeDisplayAd;
import com.tinder.ads.RecsNativeVideoAd;
import com.tinder.ads.TinderAdType;
import com.tinder.ads.source.dfp.BannerDfpAd;
import com.tinder.ads.source.fan.FanAd;
import com.tinder.cardstack.view.CardCollectionLayout;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.recs.model.SwipeMethod;
import com.tinder.recs.card.AdRecCard;
import com.tinder.recs.component.RecsViewComponentProvider;
import com.tinder.recs.model.AdRec;
import com.tinder.recs.presenter.AdRecCardPresenter;
import com.tinder.recs.target.AdRecCardTarget;
import com.tinder.recs.view.nativevideos.NativeAdView;
import com.tinder.recs.view.nativevideos.NativeAdView.OnDfpNativeAdClickListener;
import javax.inject.Inject;

public class AdRecCardView extends RecCardView<AdRecCard> implements AdRecCardTarget {
    @BindView(2131361841)
    FrameLayout adContainer;
    @Nullable
    private AdRec adRec;
    @Inject
    AdRecCardPresenter adRecCardPresenter;
    @Nullable
    View adView;
    private OnDfpNativeAdClickListener dfpNativeAdClickListener = new AdRecCardView$$Lambda$0(this);
    @Inject
    RecsView recsView;

    public AdRecCardView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((RecsViewComponentProvider) context).getRecsViewComponent().inject(this);
    }

    protected void onFinishInflate() {
        ButterKnife.a(this);
        super.onFinishInflate();
    }

    public void onAttachedToCardCollectionLayout(@NonNull CardCollectionLayout cardCollectionLayout) {
        super.onAttachedToCardCollectionLayout(cardCollectionLayout);
        cardCollectionLayout = getAdView();
        if (cardCollectionLayout instanceof FanAdView) {
            ((FanAdView) cardCollectionLayout).showNativeAd();
        }
        cardCollectionLayout = cardStampsDecoration();
        if (cardCollectionLayout != null) {
            cardCollectionLayout.setShowSuperlikeStamp(false);
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Deadshot.take(this, this.adRecCardPresenter);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void bind(AdRecCard adRecCard) {
        super.bind(adRecCard);
        if (this.adView != ((AdRec) adRecCard.getItem()).getAd()) {
            this.adRec = (AdRec) adRecCard.getItem();
            this.adContainer.removeAllViewsInLayout();
            this.adView = createViewForAd(((AdRec) adRecCard.getItem()).getAd());
            this.adContainer.addView(this.adView, new LayoutParams(-1, -1));
        }
    }

    public void onMovedToTop(AdRecCard adRecCard) {
        this.adRecCardPresenter.handleCardMovedToTop(adRecCard);
        adRecCard = getAdView();
        if (adRecCard instanceof FanAdView) {
            ((FanAdView) adRecCard).viewNativeAd();
        } else if (adRecCard instanceof NativeAdView) {
            NativeAdView nativeAdView = (NativeAdView) adRecCard;
            nativeAdView.onMovedTopTop();
            nativeAdView.setOnAdUrlClickListener(this.dfpNativeAdClickListener);
        }
    }

    public void onRemovedFromTop(AdRecCard adRecCard) {
        this.adRecCardPresenter.handleCardRemovedFromTop(adRecCard);
        adRecCard = getAdView();
        if (adRecCard instanceof NativeAdView) {
            NativeAdView nativeAdView = (NativeAdView) adRecCard;
            nativeAdView.onRemovedFromTop();
            nativeAdView.setOnAdUrlClickListener(null);
        }
    }

    public void pause() {
        View adView = getAdView();
        if (adView instanceof DfpAdView) {
            ((DfpAdView) adView).pause();
        } else if (adView instanceof NativeAdView) {
            ((NativeAdView) adView).onPause();
        }
    }

    public void resume() {
        View adView = getAdView();
        if (adView instanceof DfpAdView) {
            ((DfpAdView) adView).resume();
        } else if (adView instanceof NativeAdView) {
            ((NativeAdView) adView).onResume();
        }
    }

    public void destroy() {
        View adView = getAdView();
        if (adView instanceof DfpAdView) {
            ((DfpAdView) adView).destroy();
        }
    }

    public void onCardViewRecycled() {
        super.onCardViewRecycled();
        View adView = getAdView();
        if (adView instanceof NativeAdView) {
            ((NativeAdView) adView).onDestroy();
        }
    }

    private View createViewForAd(@NonNull Ad ad) {
        View fanAdView;
        if (ad instanceof FanAd) {
            fanAdView = new FanAdView(getContext());
            fanAdView.bindFanAd((FanAd) ad);
            return fanAdView;
        } else if (ad instanceof BannerDfpAd) {
            BannerDfpAd bannerDfpAd = (BannerDfpAd) ad;
            fanAdView = new DfpAdView(getContext());
            fanAdView.bindDfpAd(bannerDfpAd);
            return fanAdView;
        } else if (ad.adType() == TinderAdType.REC_NATIVE_VIDEO_DFP) {
            RecsNativeVideoAd recsNativeVideoAd = (RecsNativeVideoAd) ad;
            fanAdView = NativeAdView.create(getContext(), recsNativeVideoAd);
            fanAdView.bindAd(recsNativeVideoAd);
            return fanAdView;
        } else if (ad.adType() == TinderAdType.REC_NATIVE_DISPLAY_DFP) {
            RecsNativeDisplayAd recsNativeDisplayAd = (RecsNativeDisplayAd) ad;
            fanAdView = NativeAdView.create(getContext(), recsNativeDisplayAd);
            fanAdView.bindAd(recsNativeDisplayAd);
            return fanAdView;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Un-configured Ad type ");
            stringBuilder.append(ad.getClass());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    private View getAdView() {
        return this.adContainer.getChildAt(0);
    }

    final /* synthetic */ void lambda$new$0$AdRecCardView() {
        if (this.adRec != null) {
            this.recsView.likeRec(this.adRec, SwipeMethod.AD_CLICK);
        }
    }
}
