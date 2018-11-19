package com.tinder.recs.presenter;

import com.tinder.paywall.legacy.GoldPaywallSource;
import com.tinder.paywall.legacy.PaywallTypeSource;
import com.tinder.paywall.legacy.PlusPaywallSource;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.recs.domain.model.RewindReason.ManualUserAction;
import com.tinder.recs.target.RecsTarget;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "canRewind", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
final class RecsPresenter$rewind$1<T> implements Consumer<Boolean> {
    final /* synthetic */ RecsPresenter this$0;

    RecsPresenter$rewind$1(RecsPresenter recsPresenter) {
        this.this$0 = recsPresenter;
    }

    public final void accept(Boolean bool) {
        C2668g.a(bool, "canRewind");
        if (bool.booleanValue() != null) {
            this.this$0.recsEngine.rewindLastSwipe(ManualUserAction.INSTANCE);
        } else if (this.this$0.tinderPlusInteractor.m57121a() == null) {
            if (this.this$0.abTestUtility.isGoldMerchandisingEnabled() != null) {
                bool = C10076o.a((PaywallTypeSource) GoldPaywallSource.REWIND);
            } else {
                bool = C10076o.a((PaywallTypeSource) PlusPaywallSource.GAMEPAD_UNDO);
            }
            RecsTarget target = this.this$0.getTarget();
            C2668g.a(bool, "paywallFlow");
            target.launchPaywall(bool);
        }
    }
}
