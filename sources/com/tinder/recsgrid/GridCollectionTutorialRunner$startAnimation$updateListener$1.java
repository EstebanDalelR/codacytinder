package com.tinder.recsgrid;

import android.animation.ValueAnimator;
import com.tinder.base.view.p176a.C8318a;
import com.tinder.cardstack.cardgrid.view.BaseCardCollectionLayout;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "invoke"}, k = 3, mv = {1, 1, 10})
final class GridCollectionTutorialRunner$startAnimation$updateListener$1 extends Lambda implements Function1<ValueAnimator, C15813i> {
    /* renamed from: a */
    final /* synthetic */ float f58326a;
    /* renamed from: b */
    final /* synthetic */ BaseCardCollectionLayout f58327b;

    GridCollectionTutorialRunner$startAnimation$updateListener$1(float f, BaseCardCollectionLayout baseCardCollectionLayout) {
        this.f58326a = f;
        this.f58327b = baseCardCollectionLayout;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m67237a((ValueAnimator) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m67237a(@NotNull ValueAnimator valueAnimator) {
        C2668g.b(valueAnimator, "animation");
        valueAnimator = valueAnimator.getAnimatedValue();
        if (valueAnimator == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
        this.f58327b.dispatchTouchEvent(C8318a.f29598a.a((int) ((Float) valueAnimator).floatValue(), (int) this.f58326a));
    }
}
