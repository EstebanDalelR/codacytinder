package com.tinder.recs.view;

import com.tinder.fireboarding.domain.Level;
import com.tinder.fireboarding.view.FireboardingViewContainer.C9568a;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/tinder/recs/view/RecsView$onFireboardingRecCardViewReadyForAnimation$1$2"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.recs.view.RecsView$onFireboardingRecCardViewReadyForAnimation$$inlined$let$lambda$2 */
final class C18771xcac5927d extends Lambda implements Function0<C15813i> {
    final /* synthetic */ C9568a $animationParams$inlined;
    final /* synthetic */ Level $level$inlined;
    final /* synthetic */ RecsView this$0;

    C18771xcac5927d(RecsView recsView, C9568a c9568a, Level level) {
        this.this$0 = recsView;
        this.$animationParams$inlined = c9568a;
        this.$level$inlined = level;
        super(0);
    }

    public final void invoke() {
        this.this$0.getPresenter$Tinder_release().onFireboardingRecCardAnimationComplete(this.$level$inlined);
    }
}
