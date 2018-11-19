package com.tinder.reactions.gestures.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\f\u001a\u00020\rH\u0014J\u0006\u0010\u000e\u001a\u00020\rR\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/tinder/reactions/gestures/view/GrandGestureInstructionTextView;", "Landroid/widget/TextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "fadeInFadeOut", "Landroid/animation/AnimatorSet;", "fadeInFadeOutListener", "com/tinder/reactions/gestures/view/GrandGestureInstructionTextView$fadeInFadeOutListener$1", "Lcom/tinder/reactions/gestures/view/GrandGestureInstructionTextView$fadeInFadeOutListener$1;", "onDetachedFromWindow", "", "show", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class GrandGestureInstructionTextView extends TextView {
    /* renamed from: a */
    private final AnimatorSet f46243a;
    /* renamed from: b */
    private final C14667a f46244b = new C14667a(this);

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/tinder/reactions/gestures/view/GrandGestureInstructionTextView$fadeInFadeOutListener$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/reactions/gestures/view/GrandGestureInstructionTextView;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.view.GrandGestureInstructionTextView$a */
    public static final class C14667a extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ GrandGestureInstructionTextView f46242a;

        C14667a(GrandGestureInstructionTextView grandGestureInstructionTextView) {
            this.f46242a = grandGestureInstructionTextView;
        }

        public void onAnimationStart(@NotNull Animator animator) {
            C2668g.b(animator, "animation");
            this.f46242a.setVisibility(0);
        }

        public void onAnimationEnd(@NotNull Animator animator) {
            C2668g.b(animator, "animation");
            this.f46242a.setVisibility(8);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GrandGestureInstructionTextView(@org.jetbrains.annotations.NotNull android.content.Context r4, @org.jetbrains.annotations.Nullable android.util.AttributeSet r5) {
        /*
        r3 = this;
        r0 = "context";
        kotlin.jvm.internal.C2668g.b(r4, r0);
        r3.<init>(r4, r5);
        r5 = new com.tinder.reactions.gestures.view.GrandGestureInstructionTextView$a;
        r5.<init>(r3);
        r3.f46244b = r5;
        r5 = com.tinder.utils.CustomFont.Font.MEDIUM;
        r5 = r5.getFontResource();
        r4 = android.support.v4.content.res.C0441a.a(r4, r5);
        r3.setTypeface(r4);
        r4 = "alpha";
        r5 = 2;
        r0 = new float[r5];
        r0 = {0, 1065353216};
        r4 = android.animation.ObjectAnimator.ofFloat(r3, r4, r0);
        r0 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        r4 = r4.setDuration(r0);
        r2 = "alpha";
        r5 = new float[r5];
        r5 = {1065353216, 0};
        r5 = android.animation.ObjectAnimator.ofFloat(r3, r2, r5);
        r5 = r5.setDuration(r0);
        r0 = "fadeOut";
        kotlin.jvm.internal.C2668g.a(r5, r0);
        r0 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
        r5.setStartDelay(r0);
        r0 = new android.animation.AnimatorSet;
        r0.<init>();
        r3.f46243a = r0;
        r0 = r3.f46243a;
        r5 = (android.animation.Animator) r5;
        r5 = r0.play(r5);
        r4 = (android.animation.Animator) r4;
        r5.after(r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.reactions.gestures.view.GrandGestureInstructionTextView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: a */
    public final void m55908a() {
        if (getVisibility() == 8 || getAlpha() <= 0.0f) {
            this.f46243a.cancel();
            this.f46243a.addListener(this.f46244b);
            this.f46243a.start();
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46243a.removeAllListeners();
    }
}
