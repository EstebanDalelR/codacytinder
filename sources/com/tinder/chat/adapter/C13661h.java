package com.tinder.chat.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView.ItemAnimator.ItemHolderInfo;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import com.tinder.chat.view.message.InboundTextMessageView;
import com.tinder.chat.view.message.bh;
import com.tinder.typingindicator.p434a.C15313c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.ae;
import kotlin.jvm.internal.C15829m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016J(\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u001e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J\u0018\u0010\u001a\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\b\u0010\u001d\u001a\u00020\u0018H\u0016J\b\u0010\u001e\u001a\u00020\nH\u0016J\u0012\u0010\u001f\u001a\u00020\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0016J(\u0010 \u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0002J\f\u0010$\u001a\u00020\u0018*\u00020\bH\u0002J\f\u0010%\u001a\u00020\u0018*\u00020&H\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/tinder/chat/adapter/TypingIndicatorMessageMorphItemAnimator;", "Landroid/support/v7/widget/DefaultItemAnimator;", "transitionAnimation", "Lcom/tinder/typingindicator/animator/TypingIndicatorToMessageTransitionAnimation;", "(Lcom/tinder/typingindicator/animator/TypingIndicatorToMessageTransitionAnimation;)V", "animatorMap", "", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Landroid/animation/ValueAnimator;", "animateAdd", "", "holder", "animateChange", "oldHolder", "newHolder", "preInfo", "Landroid/support/v7/widget/RecyclerView$ItemAnimator$ItemHolderInfo;", "postInfo", "canReuseUpdatedViewHolder", "viewHolder", "payloads", "", "", "cancelAllAnimatorsAndRemoveListeners", "", "cancelExistingAnimatorsAndRemoveListeners", "dispatchChangesFinished", "endAnimation", "item", "endAnimations", "isRunning", "onAnimationFinished", "setupNewAnimator", "typingIndicatorView", "Landroid/view/View;", "messageView", "cancelAndRemoveAllListeners", "removeListeners", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.adapter.h */
public final class C13661h extends DefaultItemAnimator {
    /* renamed from: a */
    private final Map<ViewHolder, ValueAnimator> f43518a = ((Map) new LinkedHashMap());
    /* renamed from: b */
    private final C15313c f43519b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/tinder/chat/adapter/TypingIndicatorMessageMorphItemAnimator$setupNewAnimator$newAnimatorListener$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/chat/adapter/TypingIndicatorMessageMorphItemAnimator;Landroid/support/v7/widget/RecyclerView$ViewHolder;Landroid/support/v7/widget/RecyclerView$ViewHolder;Landroid/view/View;Landroid/view/View;)V", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "animator", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.adapter.h$a */
    public static final class C8413a extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C13661h f29855a;
        /* renamed from: b */
        final /* synthetic */ ViewHolder f29856b;
        /* renamed from: c */
        final /* synthetic */ ViewHolder f29857c;
        /* renamed from: d */
        final /* synthetic */ View f29858d;
        /* renamed from: e */
        final /* synthetic */ View f29859e;

        C8413a(C13661h c13661h, ViewHolder viewHolder, ViewHolder viewHolder2, View view, View view2) {
            this.f29855a = c13661h;
            this.f29856b = viewHolder;
            this.f29857c = viewHolder2;
            this.f29858d = view;
            this.f29859e = view2;
        }

        public void onAnimationEnd(@NotNull Animator animator) {
            C2668g.b(animator, "animator");
            this.f29855a.m53215b(this.f29856b, this.f29857c);
            this.f29855a.m53210a(animator);
        }

        public void onAnimationCancel(@Nullable Animator animator) {
            this.f29855a.f43519b.a(this.f29858d, this.f29859e);
        }
    }

    @Inject
    public C13661h(@NotNull C15313c c15313c) {
        C2668g.b(c15313c, "transitionAnimation");
        this.f43519b = c15313c;
    }

    public boolean canReuseUpdatedViewHolder(@NotNull ViewHolder viewHolder, @NotNull List<Object> list) {
        C2668g.b(viewHolder, "viewHolder");
        C2668g.b(list, "payloads");
        return list.contains("TYPING_INDICATOR") ^ 1;
    }

    public boolean isRunning() {
        if (!super.isRunning()) {
            if (this.f43518a.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public void endAnimation(@NotNull ViewHolder viewHolder) {
        C2668g.b(viewHolder, "item");
        super.endAnimation(viewHolder);
        ValueAnimator valueAnimator = (ValueAnimator) this.f43518a.get(viewHolder);
        if (valueAnimator != null) {
            m53211a(valueAnimator);
        }
    }

    public void endAnimations() {
        super.endAnimations();
        m53209a();
    }

    public void onAnimationFinished(@Nullable ViewHolder viewHolder) {
        super.onAnimationFinished(viewHolder);
        Map map = this.f43518a;
        if (map == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
        }
        C15829m.g(map).remove(viewHolder);
    }

    public boolean animateAdd(@Nullable ViewHolder viewHolder) {
        if (viewHolder instanceof C10518c) {
            View view = viewHolder.itemView;
            if (view instanceof bh) {
                m53209a();
                this.f43519b.a(((bh) view).getTypingIndicatorView$Tinder_release());
            }
        }
        return super.animateAdd(viewHolder);
    }

    public boolean animateChange(@NotNull ViewHolder viewHolder, @NotNull ViewHolder viewHolder2, @NotNull ItemHolderInfo itemHolderInfo, @NotNull ItemHolderInfo itemHolderInfo2) {
        C2668g.b(viewHolder, "oldHolder");
        C2668g.b(viewHolder2, "newHolder");
        C2668g.b(itemHolderInfo, "preInfo");
        C2668g.b(itemHolderInfo2, "postInfo");
        View view = viewHolder.itemView;
        View view2 = viewHolder2.itemView;
        if (!(view instanceof bh) || !(view2 instanceof InboundTextMessageView)) {
            return super.animateChange(viewHolder, viewHolder2, itemHolderInfo, itemHolderInfo2);
        }
        itemHolderInfo = ((bh) view).getTypingIndicatorView$Tinder_release();
        itemHolderInfo2 = ((InboundTextMessageView) view2).getTextMessageContentView$Tinder_release();
        m53212a(viewHolder, viewHolder2);
        itemHolderInfo = m53207a(viewHolder, viewHolder2, (View) itemHolderInfo, (View) itemHolderInfo2);
        this.f43518a.put(viewHolder, itemHolderInfo);
        this.f43518a.put(viewHolder2, itemHolderInfo);
        itemHolderInfo.start();
        return true;
    }

    /* renamed from: a */
    private final void m53212a(ViewHolder viewHolder, ViewHolder viewHolder2) {
        ValueAnimator valueAnimator = (ValueAnimator) this.f43518a.get(viewHolder);
        if (valueAnimator != null) {
            m53211a(valueAnimator);
        }
        valueAnimator = (ValueAnimator) this.f43518a.get(viewHolder2);
        if (valueAnimator != null) {
            m53211a(valueAnimator);
        }
    }

    /* renamed from: a */
    private final ValueAnimator m53207a(ViewHolder viewHolder, ViewHolder viewHolder2, View view, View view2) {
        return this.f43519b.a(view, view2, new C8413a(this, viewHolder, viewHolder2, view, view2));
    }

    /* renamed from: b */
    private final void m53215b(ViewHolder viewHolder, ViewHolder viewHolder2) {
        dispatchChangeFinished(viewHolder, true);
        dispatchChangeFinished(viewHolder2, false);
        this.f43518a.remove(viewHolder);
        this.f43518a.remove(viewHolder2);
    }

    /* renamed from: a */
    private final void m53211a(@NotNull ValueAnimator valueAnimator) {
        valueAnimator.cancel();
        m53210a((Animator) valueAnimator);
    }

    /* renamed from: a */
    private final void m53210a(@NotNull Animator animator) {
        animator.removeAllListeners();
        if (!(animator instanceof ValueAnimator)) {
            animator = null;
        }
        ValueAnimator valueAnimator = (ValueAnimator) animator;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
    }

    /* renamed from: a */
    private final void m53209a() {
        for (ValueAnimator a : ae.b(this.f43518a).values()) {
            m53211a(a);
        }
    }
}
