package com.tinder.ads;

import com.tinder.domain.recs.model.SwipeMethod;
import com.tinder.recs.view.RecsView;
import com.tinder.recsads.NativeCardListener;
import com.tinder.recsads.model.C16464a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/ads/NativeAdCardLikeListener;", "Lcom/tinder/recsads/NativeCardListener;", "recsView", "Lcom/tinder/recs/view/RecsView;", "(Lcom/tinder/recs/view/RecsView;)V", "onCardMovedToTop", "", "adRec", "Lcom/tinder/recsads/model/AdRec;", "onClickthroughClicked", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class NativeAdCardLikeListener implements NativeCardListener {
    private final RecsView recsView;

    public void onCardMovedToTop(@NotNull C16464a c16464a) {
        C2668g.b(c16464a, "adRec");
    }

    @Inject
    public NativeAdCardLikeListener(@NotNull RecsView recsView) {
        C2668g.b(recsView, "recsView");
        this.recsView = recsView;
    }

    public void onClickthroughClicked(@NotNull C16464a c16464a) {
        C2668g.b(c16464a, "adRec");
        this.recsView.likeRec(c16464a, SwipeMethod.AD_CLICK);
    }
}
