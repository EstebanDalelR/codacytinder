package com.tinder.recsads.view;

import android.graphics.drawable.Drawable;
import com.tinder.recs.view.tappablecards.TapRegionDetector.TapRegion;
import com.tinder.recs.view.tappablecards.TappableCarouselView.OnTapListener;
import com.tinder.recsads.model.BrandedProfileCardAd;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/tinder/recsads/view/BrandedProfileCardRecCardView$bindCarouselView$1", "Lcom/tinder/recs/view/tappablecards/TappableCarouselView$OnTapListener;", "(Lcom/tinder/recsads/view/BrandedProfileCardRecCardView;Lcom/tinder/recsads/model/BrandedProfileCardAd;)V", "onTap", "", "tapRegion", "Lcom/tinder/recs/view/tappablecards/TapRegionDetector$TapRegion;", "isOverTap", "", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
public final class BrandedProfileCardRecCardView$a implements OnTapListener {
    /* renamed from: a */
    final /* synthetic */ BrandedProfileCardRecCardView f51123a;
    /* renamed from: b */
    final /* synthetic */ BrandedProfileCardAd f51124b;

    BrandedProfileCardRecCardView$a(BrandedProfileCardRecCardView brandedProfileCardRecCardView, BrandedProfileCardAd brandedProfileCardAd) {
        this.f51123a = brandedProfileCardRecCardView;
        this.f51124b = brandedProfileCardAd;
    }

    public void onTap(@NotNull TapRegion tapRegion, boolean z) {
        C2668g.b(tapRegion, "tapRegion");
        if (z) {
            BrandedProfileCardRecCardView.a(this.f51123a).animateOverTap(tapRegion, this.f51123a);
            return;
        }
        switch (C14776a.f46345a[tapRegion.ordinal()]) {
            case 1:
                tapRegion = this.f51123a;
                BrandedProfileCardRecCardView.a(tapRegion, tapRegion.getCurrentImageIndex() - 1);
                tapRegion.getCurrentImageIndex();
                break;
            case 2:
                tapRegion = this.f51123a;
                BrandedProfileCardRecCardView.a(tapRegion, tapRegion.getCurrentImageIndex() + 1);
                break;
            default:
                break;
        }
        BrandedProfileCardRecCardView.a(this.f51123a, (Drawable) this.f51124b.imageDrawables().get(this.f51123a.getCurrentImageIndex()), this.f51123a.getCurrentImageIndex());
    }
}
