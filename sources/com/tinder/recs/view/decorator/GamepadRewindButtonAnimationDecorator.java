package com.tinder.recs.view.decorator;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.tinder.cardstack.view.CardStackLayout;
import com.tinder.cardstack.view.CardStackLayout.CardRewindAnimationStateListener;
import com.tinder.recs.view.GamepadView;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/recs/view/decorator/GamepadRewindButtonAnimationDecorator;", "Lcom/tinder/cardstack/view/CardStackLayout$CardRewindAnimationStateListener;", "gamepadView", "Lcom/tinder/recs/view/GamepadView;", "cardStackLayout", "Lcom/tinder/cardstack/view/CardStackLayout;", "(Lcom/tinder/recs/view/GamepadView;Lcom/tinder/cardstack/view/CardStackLayout;)V", "getCardStackLayout", "()Lcom/tinder/cardstack/view/CardStackLayout;", "getGamepadView", "()Lcom/tinder/recs/view/GamepadView;", "interpolator", "Landroid/view/animation/Interpolator;", "isAnimationOver", "", "end", "", "onRewindAnimationEnded", "cardView", "Landroid/view/View;", "onRewindAnimationProgress", "progress", "", "onRewindAnimationStarted", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class GamepadRewindButtonAnimationDecorator implements CardRewindAnimationStateListener {
    @NotNull
    private final CardStackLayout cardStackLayout;
    @NotNull
    private final GamepadView gamepadView;
    private final Interpolator interpolator = ((Interpolator) new DecelerateInterpolator());
    private boolean isAnimationOver;

    public GamepadRewindButtonAnimationDecorator(@NotNull GamepadView gamepadView, @NotNull CardStackLayout cardStackLayout) {
        C2668g.b(gamepadView, "gamepadView");
        C2668g.b(cardStackLayout, "cardStackLayout");
        this.gamepadView = gamepadView;
        this.cardStackLayout = cardStackLayout;
    }

    @NotNull
    public final GamepadView getGamepadView() {
        return this.gamepadView;
    }

    @NotNull
    public final CardStackLayout getCardStackLayout() {
        return this.cardStackLayout;
    }

    public void onRewindAnimationStarted(@NotNull View view) {
        C2668g.b(view, "cardView");
        this.isAnimationOver = null;
        this.gamepadView.rewindButtonOnAnimationStart();
    }

    public void onRewindAnimationProgress(@NotNull View view, float f) {
        C2668g.b(view, "cardView");
        this.gamepadView.setRewindButtonRotation(this.interpolator.getInterpolation(f) * -360.0f);
    }

    public void onRewindAnimationEnded(@NotNull View view) {
        C2668g.b(view, "cardView");
        end();
    }

    public final void end() {
        if (!this.isAnimationOver) {
            this.isAnimationOver = true;
            this.cardStackLayout.a();
            this.gamepadView.rewindButtonOnAnimationEnd();
        }
    }
}
