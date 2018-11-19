package com.tinder.recs.presenter;

import com.tinder.fireboarding.domain.C9566h;
import io.reactivex.functions.BiFunction;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "isSuperLikeEnabled", "", "fireboardingConfig", "Lcom/tinder/fireboarding/domain/FireboardingConfig;", "apply"}, k = 3, mv = {1, 1, 10})
final class TappyUserRecCardPresenter$observeIsSuperlikeEnabled$1<T1, T2, R> implements BiFunction<Boolean, C9566h, C15813i> {
    final /* synthetic */ boolean $isUserRecSuperlikeable;
    final /* synthetic */ TappyUserRecCardPresenter this$0;

    TappyUserRecCardPresenter$observeIsSuperlikeEnabled$1(TappyUserRecCardPresenter tappyUserRecCardPresenter, boolean z) {
        this.this$0 = tappyUserRecCardPresenter;
        this.$isUserRecSuperlikeable = z;
    }

    public /* synthetic */ Object apply(Object obj, Object obj2) {
        apply(((Boolean) obj).booleanValue(), (C9566h) obj2);
        return C15813i.f49016a;
    }

    public final void apply(boolean z, @NotNull C9566h c9566h) {
        C2668g.b(c9566h, "fireboardingConfig");
        if (this.this$0.shouldShowSuperLikeStamp(z, this.$isUserRecSuperlikeable, c9566h.a())) {
            this.this$0.getTarget$Tinder_release().enableSuperLikeStamps();
        } else {
            this.this$0.getTarget$Tinder_release().disableSuperLikeStamps();
        }
    }
}
