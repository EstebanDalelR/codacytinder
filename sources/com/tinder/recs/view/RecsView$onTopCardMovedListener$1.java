package com.tinder.recs.view;

import android.support.v4.view.ViewCompat;
import android.view.View;
import com.tinder.cardstack.model.SwipeDirection;
import com.tinder.cardstack.view.CardStackLayout.OnTopCardMovedListener;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J8\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u001b"}, d2 = {"com/tinder/recs/view/RecsView$onTopCardMovedListener$1", "Lcom/tinder/cardstack/view/CardStackLayout$OnTopCardMovedListener;", "(Lcom/tinder/recs/view/RecsView;)V", "height", "", "getHeight$Tinder_release", "()I", "setHeight$Tinder_release", "(I)V", "width", "getWidth$Tinder_release", "setWidth$Tinder_release", "onTopCardMoveEnded", "", "detached", "", "onTopCardMoveStarted", "onTopCardMoved", "dx", "", "dy", "rot", "view", "Landroid/view/View;", "swipeDirection", "Lcom/tinder/cardstack/model/SwipeDirection;", "isTouch", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsView$onTopCardMovedListener$1 implements OnTopCardMovedListener {
    private int height;
    final /* synthetic */ RecsView this$0;
    private int width;

    RecsView$onTopCardMovedListener$1(RecsView recsView) {
        this.this$0 = recsView;
    }

    public final int getHeight$Tinder_release() {
        return this.height;
    }

    public final void setHeight$Tinder_release(int i) {
        this.height = i;
    }

    public final int getWidth$Tinder_release() {
        return this.width;
    }

    public final void setWidth$Tinder_release(int i) {
        this.width = i;
    }

    public void onTopCardMoveStarted() {
        RecsView.access$setCardStackZIndex$p(this.this$0, ViewCompat.A(this.this$0.getCardStackContainer$Tinder_release()));
        ViewCompat.k(this.this$0.getCardStackContainer$Tinder_release(), 100.0f);
    }

    public void onTopCardMoved(float f, float f2, float f3, @NotNull View view, @NotNull SwipeDirection swipeDirection, boolean z) {
        C2668g.b(view, "view");
        C2668g.b(swipeDirection, "swipeDirection");
        if (z && this.this$0.getAbTestUtility$Tinder_release().newNewExperiment().c() != null) {
            if (this.width == null) {
                this.width = this.this$0.getMeasuredWidth();
            }
            if (this.height == null) {
                this.height = this.this$0.getMeasuredWidth();
            }
            this.this$0.getGamepad$Tinder_release().scaleButton(swipeDirection, Math.abs(swipeDirection == SwipeDirection.UP ? f2 / ((float) this.height) : f / ((float) this.width)));
        }
    }

    public void onTopCardMoveEnded(boolean z) {
        this.this$0.getGamepad$Tinder_release().resetScalableButtons();
        ViewCompat.k(this.this$0.getCardStackContainer$Tinder_release(), RecsView.access$getCardStackZIndex$p(this.this$0));
    }
}
