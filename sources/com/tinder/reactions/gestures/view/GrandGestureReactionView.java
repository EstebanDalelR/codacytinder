package com.tinder.reactions.gestures.view;

import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.C0792d;
import com.tinder.reactions.common.C14608a;
import com.tinder.reactions.gestures.viewmodel.C14676f;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0010J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\bR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/tinder/reactions/gestures/view/GrandGestureReactionView;", "Lcom/tinder/reactions/gestures/view/GrandGestureAnimationView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "currentLottieDrawable", "Lcom/airbnb/lottie/LottieDrawable;", "reactionCache", "Lcom/tinder/reactions/common/ReactionCompositionCache;", "getReactionCache", "()Lcom/tinder/reactions/common/ReactionCompositionCache;", "setReactionCache", "(Lcom/tinder/reactions/common/ReactionCompositionCache;)V", "addReactionAnimationListener", "", "listener", "Landroid/animation/Animator$AnimatorListener;", "initializeAnimation", "viewModel", "Lcom/tinder/reactions/gestures/viewmodel/GrandGestureReactionViewModel;", "playReactionAnimation", "removeReactionAnimationListener", "setLottieDrawable", "lottieDrawable", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class GrandGestureReactionView extends GrandGestureAnimationView {
    @Inject
    @NotNull
    /* renamed from: a */
    public C14608a f59379a;
    /* renamed from: b */
    private C0792d f59380b;

    public GrandGestureReactionView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
    }

    @NotNull
    public final C14608a getReactionCache() {
        C14608a c14608a = this.f59379a;
        if (c14608a == null) {
            C2668g.b("reactionCache");
        }
        return c14608a;
    }

    public final void setReactionCache(@NotNull C14608a c14608a) {
        C2668g.b(c14608a, "<set-?>");
        this.f59379a = c14608a;
    }

    /* renamed from: l */
    public final void m68079l() {
        C0792d c0792d = this.f59380b;
        if (c0792d != null) {
            c0792d.h();
        }
    }

    /* renamed from: a */
    public final void m68076a(@NotNull C14676f c14676f, @NotNull C0792d c0792d) {
        C2668g.b(c14676f, "viewModel");
        C2668g.b(c0792d, "lottieDrawable");
        setScaleType(c14676f.m55927c());
        this.f59380b = c0792d;
        setImageDrawable(c0792d);
        c0792d.c(c14676f.m55930f() > 0 ? true : null);
    }

    /* renamed from: a */
    public final void m68075a(@NotNull C14676f c14676f) {
        C2668g.b(c14676f, "viewModel");
        setScaleType(c14676f.m55927c());
        b(c14676f.m55930f() > 0 ? true : null);
    }

    /* renamed from: c */
    public final void m68077c(@NotNull AnimatorListener animatorListener) {
        C2668g.b(animatorListener, "listener");
        C0792d c0792d = this.f59380b;
        if (c0792d != null) {
            c0792d.a(animatorListener);
        }
    }

    /* renamed from: d */
    public final void m68078d(@NotNull AnimatorListener animatorListener) {
        C2668g.b(animatorListener, "listener");
        C0792d c0792d = this.f59380b;
        if (c0792d != null) {
            c0792d.b(animatorListener);
        }
    }
}
