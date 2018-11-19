package com.tinder.recs.animation;

import android.animation.Animator;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/Animator;", "invoke"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.recs.animation.TappyDefaultRecProfileEntranceAnimationDecorator$startAnimation$2 */
final class C18765x3d992519 extends Lambda implements Function1<Animator, C15813i> {
    final /* synthetic */ TappyDefaultRecProfileEntranceAnimationDecorator this$0;

    C18765x3d992519(TappyDefaultRecProfileEntranceAnimationDecorator tappyDefaultRecProfileEntranceAnimationDecorator) {
        this.this$0 = tappyDefaultRecProfileEntranceAnimationDecorator;
        super(1);
    }

    public final void invoke(@NotNull Animator animator) {
        C2668g.b(animator, "it");
        this.this$0.placeholderImageView.fadeTagView(Long.valueOf(this.this$0.ENTER_ANIMATION_DURATION_MS), Float.valueOf(0.0f));
    }
}
