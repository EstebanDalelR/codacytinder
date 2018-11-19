package com.tinder.reactions.navigation.view;

import com.airbnb.lottie.C0792d;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "lottieDrawable", "Lcom/airbnb/lottie/LottieDrawable;", "invoke"}, k = 3, mv = {1, 1, 10})
final class ReactionLoadingLottieAnimationView$cacheDrawable$1 extends Lambda implements Function1<C0792d, C15813i> {
    /* renamed from: a */
    final /* synthetic */ ReactionLoadingLottieAnimationView f58257a;

    ReactionLoadingLottieAnimationView$cacheDrawable$1(ReactionLoadingLottieAnimationView reactionLoadingLottieAnimationView) {
        this.f58257a = reactionLoadingLottieAnimationView;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m67194a((C0792d) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m67194a(@NotNull C0792d c0792d) {
        C2668g.b(c0792d, "lottieDrawable");
        this.f58257a.setImageDrawable(c0792d);
        c0792d.c(true);
        this.f58257a.f58258a.onSuccess(c0792d);
    }
}
