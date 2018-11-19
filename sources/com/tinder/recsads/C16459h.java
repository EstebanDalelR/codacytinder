package com.tinder.recsads;

import com.tinder.addy.tracker.AdUrlTracker;
import com.tinder.recsads.model.C16464a;
import com.tinder.recsads.model.C16468f;
import com.tinder.recsads.model.RecsAdTrackingEvent;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/recsads/NativeDfpAdCardTrackImpressionListener;", "Lcom/tinder/recsads/NativeCardListener;", "adUrlTracker", "Lcom/tinder/addy/tracker/AdUrlTracker;", "(Lcom/tinder/addy/tracker/AdUrlTracker;)V", "onCardMovedToTop", "", "adRec", "Lcom/tinder/recsads/model/AdRec;", "onClickthroughClicked", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsads.h */
public final class C16459h implements NativeCardListener {
    /* renamed from: a */
    private final AdUrlTracker f51044a;

    public void onClickthroughClicked(@NotNull C16464a c16464a) {
        C2668g.b(c16464a, "adRec");
    }

    @Inject
    public C16459h(@NotNull AdUrlTracker adUrlTracker) {
        C2668g.b(adUrlTracker, "adUrlTracker");
        this.f51044a = adUrlTracker;
    }

    public void onCardMovedToTop(@NotNull C16464a c16464a) {
        C2668g.b(c16464a, "adRec");
        c16464a = c16464a.m61877c();
        if (c16464a == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.recsads.model.RecsNativeDfpAd");
        }
        C16468f c16468f = (C16468f) c16464a;
        this.f51044a.a(c16468f.getLineItemId(), RecsAdTrackingEvent.IMPRESSION);
        c16468f.getNativeCustomTemplateAd().recordImpression();
    }
}
