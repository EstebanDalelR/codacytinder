package com.tinder.recs.presenter;

import com.tinder.boost.provider.BoostUpdateProvider$a;
import com.tinder.domain.profile.model.TutorialViewStatus;
import com.tinder.paywall.legacy.BoostPaywallSource;
import com.tinder.paywall.legacy.PaywallFlowSuccessListener;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.recs.presenter.RecsPresenter.WhenMappings;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "status", "Lcom/tinder/domain/profile/model/TutorialViewStatus;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
final class RecsPresenter$handleBoostClick$1<T> implements Consumer<TutorialViewStatus> {
    final /* synthetic */ RecsPresenter this$0;

    RecsPresenter$handleBoostClick$1(RecsPresenter recsPresenter) {
        this.this$0 = recsPresenter;
    }

    public final void accept(TutorialViewStatus tutorialViewStatus) {
        if (tutorialViewStatus == TutorialViewStatus.UNSEEN) {
            tutorialViewStatus = this.this$0.getTarget();
            C10076o a = C10076o.a(BoostPaywallSource.GAMEPAD_BOOST).a(new PaywallFlowSuccessListener() {
                public void handleSuccess() {
                    this.this$0.boostInteractor.i();
                }
            });
            C2668g.a(a, "PaywallFlow.create(Boost…                       })");
            tutorialViewStatus.launchPaywall(a);
            this.this$0.getTarget().enableBoostButton(true);
            return;
        }
        tutorialViewStatus = this.this$0.boostStateProvider.b();
        if (tutorialViewStatus == null) {
            C0001a.d("BoostState was null, race condition with GamepadPresenter", new Object[0]);
            this.this$0.getTarget().enableBoostButton(true);
        } else if (WhenMappings.$EnumSwitchMapping$0[tutorialViewStatus.ordinal()] != 1) {
            this.this$0.activateBoost();
        } else {
            tutorialViewStatus = this.this$0.getTarget();
            BoostUpdateProvider$a f = this.this$0.boostUpdateProvider.f();
            C2668g.a(f, "boostUpdateProvider.currentBoostTick");
            tutorialViewStatus.showBoostUpdateDialog(f);
            this.this$0.getTarget().enableBoostButton(true);
        }
    }
}
