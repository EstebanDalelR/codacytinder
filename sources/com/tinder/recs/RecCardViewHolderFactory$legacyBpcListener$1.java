package com.tinder.recs;

import com.tinder.recs.model.AdRec;
import com.tinder.recs.view.RecCardView;
import com.tinder.recsads.V1BrandedProfileCardRecCardView.Listener;
import com.tinder.recsads.model.BrandedProfileCardAd;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"com/tinder/recs/RecCardViewHolderFactory$legacyBpcListener$1", "Lcom/tinder/recsads/V1BrandedProfileCardRecCardView$Listener;", "(Lcom/tinder/recs/RecCardViewHolderFactory;)V", "onCardInfoClicked", "", "adRec", "Lcom/tinder/recs/model/AdRec;", "brandedProfileCardAd", "Lcom/tinder/recsads/model/BrandedProfileCardAd;", "currentPhotoIndex", "", "cardView", "Lcom/tinder/recs/view/RecCardView;", "onCardMovedToTop", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecCardViewHolderFactory$legacyBpcListener$1 implements Listener {
    final /* synthetic */ RecCardViewHolderFactory this$0;

    public void onCardMovedToTop(@NotNull BrandedProfileCardAd brandedProfileCardAd) {
        C2668g.b(brandedProfileCardAd, "brandedProfileCardAd");
    }

    RecCardViewHolderFactory$legacyBpcListener$1(RecCardViewHolderFactory recCardViewHolderFactory) {
        this.this$0 = recCardViewHolderFactory;
    }

    public void onCardInfoClicked(@NotNull AdRec adRec, @NotNull BrandedProfileCardAd brandedProfileCardAd, int i, @NotNull RecCardView<?> recCardView) {
        C2668g.b(adRec, "adRec");
        C2668g.b(brandedProfileCardAd, "brandedProfileCardAd");
        C2668g.b(recCardView, "cardView");
        this.this$0.recsView.onShowProfileClicked(adRec, brandedProfileCardAd, i, recCardView);
    }
}
