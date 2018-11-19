package com.tinder.recs.view;

import android.animation.Animator.AnimatorListener;
import android.graphics.Canvas;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.cardstack.model.SwipeDirection;
import com.tinder.cardstack.view.CardDecorationListener;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B'\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007JP\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0016JP\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0016J\r\u0010\u001d\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u001eJ\u0015\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b J\u0015\u0010!\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\tH\u0000¢\u0006\u0002\b\"J\u000e\u0010#\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\tJ\u0018\u0010$\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0015H\u0002R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/tinder/recs/view/RecCardStampsDecoration;", "Lcom/tinder/cardstack/view/CardDecorationListener;", "stampPass", "Landroid/view/View;", "stampLike", "stampSuperLike", "stampOops", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "enabled", "", "isStampOopsAnimating", "showOopsStamp", "showSuperlikeStamp", "onDecorationDraw", "", "c", "Landroid/graphics/Canvas;", "view", "parent", "Landroid/view/ViewGroup;", "dx", "", "dy", "rotation", "swipeDirection", "Lcom/tinder/cardstack/model/SwipeDirection;", "isReverting", "isTouch", "onDecorationDrawOver", "resetStamps", "resetStamps$recs_cards_release", "setEnabled", "setEnabled$recs_cards_release", "setShowOopsStamp", "setShowOopsStamp$recs_cards_release", "setShowSuperlikeStamp", "setVisibility", "alpha", "recs-cards_release"}, k = 1, mv = {1, 1, 10})
public final class RecCardStampsDecoration implements CardDecorationListener {
    private boolean enabled = true;
    private boolean isStampOopsAnimating;
    private boolean showOopsStamp;
    private boolean showSuperlikeStamp = true;
    private final View stampLike;
    private final View stampOops;
    private final View stampPass;
    private final View stampSuperLike;

    @Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[SwipeDirection.values().length];

        static {
            $EnumSwitchMapping$0[SwipeDirection.LEFT.ordinal()] = 1;
            $EnumSwitchMapping$0[SwipeDirection.RIGHT.ordinal()] = 2;
            $EnumSwitchMapping$0[SwipeDirection.UP.ordinal()] = 3;
        }
    }

    public void onDecorationDraw(@NotNull Canvas canvas, @NotNull View view, @NotNull ViewGroup viewGroup, float f, float f2, float f3, @NotNull SwipeDirection swipeDirection, boolean z, boolean z2) {
        C2668g.b(canvas, "c");
        C2668g.b(view, "view");
        C2668g.b(viewGroup, "parent");
        C2668g.b(swipeDirection, "swipeDirection");
    }

    public RecCardStampsDecoration(@NotNull View view, @NotNull View view2, @NotNull View view3, @NotNull View view4) {
        C2668g.b(view, "stampPass");
        C2668g.b(view2, "stampLike");
        C2668g.b(view3, "stampSuperLike");
        C2668g.b(view4, "stampOops");
        this.stampPass = view;
        this.stampLike = view2;
        this.stampSuperLike = view3;
        this.stampOops = view4;
    }

    public void onDecorationDrawOver(@NotNull Canvas canvas, @NotNull View view, @NotNull ViewGroup viewGroup, float f, float f2, float f3, @NotNull SwipeDirection swipeDirection, boolean z, boolean z2) {
        C2668g.b(canvas, "c");
        C2668g.b(view, "view");
        C2668g.b(viewGroup, "parent");
        C2668g.b(swipeDirection, "swipeDirection");
        if (this.enabled != null) {
            if (this.showOopsStamp == null || !z) {
                canvas = (float) 3;
                f = Math.min(1.0f, (Math.abs(f) * canvas) / ((float) view.getWidth()));
                switch (WhenMappings.$EnumSwitchMapping$0[swipeDirection.ordinal()]) {
                    case 1:
                        setVisibility(this.stampPass, f);
                        setVisibility(this.stampLike, 0.0f);
                        setVisibility(this.stampSuperLike, 0.0f);
                        break;
                    case 2:
                        setVisibility(this.stampLike, f);
                        setVisibility(this.stampPass, 0.0f);
                        setVisibility(this.stampSuperLike, 0.0f);
                        break;
                    case 3:
                        if (this.showSuperlikeStamp != null) {
                            setVisibility(this.stampSuperLike, Math.min(1.0f, (canvas * Math.abs(f2)) / ((float) view.getHeight())));
                            setVisibility(this.stampPass, 0.0f);
                            setVisibility(this.stampLike, 0.0f);
                            break;
                        }
                        return;
                    default:
                        resetStamps$recs_cards_release();
                        break;
                }
            }
            setVisibility(this.stampPass, 0.0f);
            setVisibility(this.stampLike, 0.0f);
            setVisibility(this.stampSuperLike, 0.0f);
            canvas = Math.min(1.0f, (Math.abs(f) * 1061158912) / ((float) view.getWidth()));
            if (this.isStampOopsAnimating == null) {
                ViewCompat.c(this.stampOops, ((float) 1) - canvas);
            }
            if (f == 0.0f && f2 == 0.0f && this.isStampOopsAnimating == null) {
                this.showOopsStamp = null;
                this.isStampOopsAnimating = true;
                this.stampOops.animate().alpha(0.0f).withLayer().setDuration((long) 125).setStartDelay((long) 25).setListener((AnimatorListener) new RecCardStampsDecoration$onDecorationDrawOver$1(this));
            }
        }
    }

    public final void setEnabled$recs_cards_release(boolean z) {
        this.enabled = z;
    }

    public final void setShowOopsStamp$recs_cards_release(boolean z) {
        this.showOopsStamp = z;
    }

    public final void setShowSuperlikeStamp(boolean z) {
        this.showSuperlikeStamp = z;
    }

    public final void resetStamps$recs_cards_release() {
        this.showOopsStamp = false;
        this.enabled = true;
        if (this.isStampOopsAnimating) {
            ViewCompat.m(this.stampOops).b();
        }
        this.isStampOopsAnimating = false;
        setVisibility(this.stampPass, 0.0f);
        setVisibility(this.stampLike, 0.0f);
        setVisibility(this.stampSuperLike, 0.0f);
        setVisibility(this.stampOops, 0.0f);
    }

    private final void setVisibility(View view, float f) {
        if (ViewCompat.e(view) != f) {
            ViewCompat.c(view, f);
        }
    }
}
