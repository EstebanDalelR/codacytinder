package com.tinder.cardstack.cardgrid.view;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.support.v7.widget.SimpleItemAnimator;
import com.tinder.cardstack.cardgrid.p183a.C8365a;
import com.tinder.cardstack.view.CardViewHolder;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\"\u0010\u0003\u001a\u00020\u00072\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nH&J<\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J>\u0010\u000b\u001a\u00020\u00072\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nH&J2\u0010\u0016\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016J2\u0010\u0016\u001a\u00020\u00072\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nH&J\u0012\u0010\u001b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\"\u0010\u001b\u001a\u00020\u00072\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nH&J\u0012\u0010\u001c\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0014\u0010\u001c\u001a\u00020\u00072\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\bH&J\b\u0010\u001d\u001a\u00020\u0007H\u0016J\b\u0010\u001e\u001a\u00020\u0007H\u0016¨\u0006\u001f"}, d2 = {"Lcom/tinder/cardstack/cardgrid/view/SimpleCardItemAnimator;", "Landroid/support/v7/widget/SimpleItemAnimator;", "()V", "animateAdd", "", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "", "Lcom/tinder/cardstack/view/CardViewHolder;", "onComplete", "Lkotlin/Function0;", "animateChange", "oldHolder", "newHolder", "fromLeft", "", "fromTop", "toLeft", "toTop", "fromPosition", "Lcom/tinder/cardstack/cardgrid/model/Point;", "toPosition", "animateMove", "fromX", "fromY", "toX", "toY", "animateRemove", "endAnimation", "endAnimations", "runPendingAnimations", "cardstack_release"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.cardstack.cardgrid.view.f */
public abstract class C12646f extends SimpleItemAnimator {
    /* renamed from: a */
    public abstract void mo11311a(@NotNull CardViewHolder<?> cardViewHolder);

    /* renamed from: a */
    public abstract void mo11312a(@NotNull CardViewHolder<?> cardViewHolder, @NotNull C8365a c8365a, @NotNull C8365a c8365a2, @NotNull Function0<C15813i> function0);

    /* renamed from: a */
    public abstract void mo11313a(@NotNull CardViewHolder<?> cardViewHolder, @NotNull CardViewHolder<?> cardViewHolder2, @NotNull C8365a c8365a, @NotNull C8365a c8365a2, @NotNull Function0<C15813i> function0);

    /* renamed from: a */
    public abstract void mo11314a(@NotNull CardViewHolder<?> cardViewHolder, @NotNull Function0<C15813i> function0);

    /* renamed from: b */
    public abstract void mo11315b(@NotNull CardViewHolder<?> cardViewHolder, @NotNull Function0<C15813i> function0);

    public void endAnimations() {
    }

    public void runPendingAnimations() {
    }

    public boolean animateChange(@Nullable ViewHolder viewHolder, @Nullable ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        if (viewHolder == null || !(viewHolder instanceof CardViewHolder) || viewHolder2 == null || !(viewHolder2 instanceof CardViewHolder)) {
            dispatchAnimationFinished(viewHolder);
            dispatchAnimationFinished(viewHolder2);
        } else {
            viewHolder.setIsRecyclable(false);
            viewHolder2.setIsRecyclable(false);
            ViewHolder viewHolder3 = (CardViewHolder) viewHolder;
            CardViewHolder cardViewHolder = (CardViewHolder) viewHolder2;
            C8365a c8365a = new C8365a(i, i2);
            mo11313a(viewHolder3, cardViewHolder, c8365a, new C8365a(i3, i4), (Function0) new SimpleCardItemAnimator$animateChange$1(this, viewHolder, viewHolder2));
        }
        return false;
    }

    public boolean animateAdd(@Nullable ViewHolder viewHolder) {
        if (viewHolder == null || !(viewHolder instanceof CardViewHolder)) {
            dispatchAnimationFinished(viewHolder);
        } else {
            viewHolder.setIsRecyclable(false);
            mo11314a((CardViewHolder) viewHolder, new SimpleCardItemAnimator$animateAdd$1(this, viewHolder));
        }
        return false;
    }

    public boolean animateMove(@Nullable ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        if (viewHolder == null || !(viewHolder instanceof CardViewHolder)) {
            dispatchAnimationFinished(viewHolder);
        } else {
            viewHolder.setIsRecyclable(false);
            mo11312a((CardViewHolder) viewHolder, new C8365a(i, i2), new C8365a(i3, i4), (Function0) new SimpleCardItemAnimator$animateMove$1(this, viewHolder));
        }
        return false;
    }

    public boolean animateRemove(@Nullable ViewHolder viewHolder) {
        if (viewHolder == null || !(viewHolder instanceof CardViewHolder)) {
            dispatchAnimationFinished(viewHolder);
        } else {
            viewHolder.setIsRecyclable(false);
            mo11315b((CardViewHolder) viewHolder, new SimpleCardItemAnimator$animateRemove$1(this, viewHolder));
        }
        return false;
    }

    public void endAnimation(@Nullable ViewHolder viewHolder) {
        if (viewHolder != null && (viewHolder instanceof CardViewHolder)) {
            mo11311a((CardViewHolder) viewHolder);
        }
    }
}
