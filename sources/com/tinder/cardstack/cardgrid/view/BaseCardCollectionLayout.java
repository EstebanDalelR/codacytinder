package com.tinder.cardstack.cardgrid.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ChildDrawingOrderCallback;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener;
import android.support.v7.widget.RecyclerView.OnItemTouchListener;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.support.v7.widget.RecyclerView.State;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.facebook.ads.AdError;
import com.tinder.cardstack.C8362a.C8359a;
import com.tinder.cardstack.cardgrid.animation.CardAnimationEngine;
import com.tinder.cardstack.cardgrid.animation.CardAnimationEngine.Renderer;
import com.tinder.cardstack.cardgrid.animation.animator.CardPropertyAnimator;
import com.tinder.cardstack.cardgrid.animation.animator.CardPropertyAnimator.OnCompleteListener;
import com.tinder.cardstack.cardgrid.animation.p184a.C8368a;
import com.tinder.cardstack.cardgrid.animation.p184a.C8371b.C10461c;
import com.tinder.cardstack.cardgrid.animation.p184a.C8371b.C10462d;
import com.tinder.cardstack.cardgrid.animation.p184a.C8371b.C10463e;
import com.tinder.cardstack.cardgrid.p183a.C8365a;
import com.tinder.cardstack.cardgrid.selection.CardViewHolderSelector;
import com.tinder.cardstack.cardgrid.selection.CardViewHolderSelector.CardViewHolderFinder;
import com.tinder.cardstack.cardgrid.selection.p185a.C8375a;
import com.tinder.cardstack.cardgrid.swipe.SwipeGestureDetector;
import com.tinder.cardstack.cardgrid.swipe.SwipeGestureDetector.ClickActionRecognizer;
import com.tinder.cardstack.cardgrid.swipe.SwipeGestureDetector.OnGestureListener;
import com.tinder.cardstack.cardgrid.swipe.SwipeGestureDetector.SwipeActionRecognizer;
import com.tinder.cardstack.cardgrid.swipe.SwipeGestureDetector.TouchInterceptPredicate;
import com.tinder.cardstack.cardgrid.swipe.p186a.C8378a;
import com.tinder.cardstack.cardgrid.view.C10482b.C8384a;
import com.tinder.cardstack.cardgrid.view.C10485g.C8388a;
import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.model.SwipeDirection;
import com.tinder.cardstack.p180a.C8361a;
import com.tinder.cardstack.p182b.C8363a;
import com.tinder.cardstack.view.CardCollectionLayout;
import com.tinder.cardstack.view.CardDecorationListener;
import com.tinder.cardstack.view.CardViewHolder;
import com.tinder.cardstack.view.OnPreSwipeListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.C15811g;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.collections.ab;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.p458a.C19062a;
import kotlin.ranges.C19068g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000 22\u00020\u0001:\u000b/0123456789B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0014\u0010 \u001a\u00020\u001b2\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\"H\u0002J\u0018\u0010#\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010$\u001a\u00020\u001b2\n\u0010%\u001a\u0006\u0012\u0002\b\u00030&J\u000e\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020)J\u0010\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u0015H\u0016J\u001c\u0010,\u001a\u00020\u00112\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\"2\u0006\u0010-\u001a\u00020.H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00060\u000fR\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00060\u0013R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout;", "Lcom/tinder/cardstack/view/CardCollectionLayout;", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "cardAnimationEngine", "Lcom/tinder/cardstack/cardgrid/animation/CardAnimationEngine;", "cardDragSessionDetector", "Lcom/tinder/cardstack/cardgrid/view/CardDragSessionDetector;", "cardViewHolderSelector", "Lcom/tinder/cardstack/cardgrid/selection/CardViewHolderSelector;", "childDrawingOrderCallbackTracker", "Lcom/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout$ChildDrawingOrderCallbackTracker;", "isScrolling", "", "itemDecoration", "Lcom/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout$ItemDecoration;", "onPreSwipeListener", "Lcom/tinder/cardstack/view/OnPreSwipeListener;", "swipeDirectionRecognizer", "Lcom/tinder/cardstack/cardgrid/view/SwipeDirectionRecognizer;", "swipeGestureDetector", "Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector;", "addCardDecorationListener", "", "view", "Landroid/view/View;", "cardDecorationListener", "Lcom/tinder/cardstack/view/CardDecorationListener;", "applyReverseAnimation", "cardViewHolder", "Lcom/tinder/cardstack/view/CardViewHolder;", "removeCardDecorationListener", "revertAnimatingCard", "card", "Lcom/tinder/cardstack/model/Card;", "setDragSessionListener", "dragSessionListener", "Lcom/tinder/cardstack/cardgrid/view/DragSessionListener;", "setOnPreSwipeListener", "preSwipeListener", "shouldSwipe", "swipeDirection", "Lcom/tinder/cardstack/model/SwipeDirection;", "CardRenderer", "CardViewHolderFinder", "ChildDrawingOrderCallbackTracker", "Companion", "ItemAnimator", "ItemDecoration", "OnChildAttachStateChangeListener", "OnGestureListener", "OnItemTouchListener", "ScrollListener", "Swipe", "cardstack_release"}, k = 1, mv = {1, 1, 9})
public abstract class BaseCardCollectionLayout extends CardCollectionLayout {
    /* renamed from: a */
    public static final C8381d f45102a = new C8381d();
    /* renamed from: k */
    private static final float f45103k = 0.25f;
    /* renamed from: l */
    private static final float f45104l = 8.0f;
    /* renamed from: m */
    private static final float f45105m = (Math.max(C8363a.m35601b(), C8363a.m35600a()) * 1.2f);
    /* renamed from: b */
    private final SwipeGestureDetector f45106b;
    /* renamed from: c */
    private final CardAnimationEngine f45107c;
    /* renamed from: d */
    private final CardViewHolderSelector f45108d;
    /* renamed from: e */
    private final SwipeDirectionRecognizer f45109e;
    /* renamed from: f */
    private final C10477f f45110f;
    /* renamed from: g */
    private final C10471c f45111g;
    /* renamed from: h */
    private final C8383a f45112h;
    /* renamed from: i */
    private OnPreSwipeListener f45113i;
    /* renamed from: j */
    private boolean f45114j;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout$Companion;", "", "()V", "MIN_PIXELS_FOR_CLICK", "", "getMIN_PIXELS_FOR_CLICK", "()F", "PERCENT_WIDTH_TO_DRAG", "getPERCENT_WIDTH_TO_DRAG", "SWIPE_DISTANCE", "getSWIPE_DISTANCE", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.cardstack.cardgrid.view.BaseCardCollectionLayout$d */
    public static final class C8381d {
        private C8381d() {
        }

        /* renamed from: a */
        private final float m35734a() {
            return BaseCardCollectionLayout.f45103k;
        }

        /* renamed from: b */
        private final float m35736b() {
            return BaseCardCollectionLayout.f45104l;
        }

        /* renamed from: c */
        private final float m35738c() {
            return BaseCardCollectionLayout.f45105m;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout$Swipe;", "", "cardViewHolder", "Lcom/tinder/cardstack/view/CardViewHolder;", "swipeDirection", "Lcom/tinder/cardstack/model/SwipeDirection;", "(Lcom/tinder/cardstack/view/CardViewHolder;Lcom/tinder/cardstack/model/SwipeDirection;)V", "getCardViewHolder", "()Lcom/tinder/cardstack/view/CardViewHolder;", "getSwipeDirection", "()Lcom/tinder/cardstack/model/SwipeDirection;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.cardstack.cardgrid.view.BaseCardCollectionLayout$k */
    private static final class C8382k {
        @NotNull
        /* renamed from: a */
        private final CardViewHolder<?> f29755a;
        @NotNull
        /* renamed from: b */
        private final SwipeDirection f29756b;

        @NotNull
        /* renamed from: a */
        public final CardViewHolder<?> m35740a() {
            return this.f29755a;
        }

        @NotNull
        /* renamed from: b */
        public final SwipeDirection m35741b() {
            return this.f29756b;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C8382k) {
                    C8382k c8382k = (C8382k) obj;
                    if (C2668g.a(this.f29755a, c8382k.f29755a) && C2668g.a(this.f29756b, c8382k.f29756b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            CardViewHolder cardViewHolder = this.f29755a;
            int i = 0;
            int hashCode = (cardViewHolder != null ? cardViewHolder.hashCode() : 0) * 31;
            SwipeDirection swipeDirection = this.f29756b;
            if (swipeDirection != null) {
                i = swipeDirection.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Swipe(cardViewHolder=");
            stringBuilder.append(this.f29755a);
            stringBuilder.append(", swipeDirection=");
            stringBuilder.append(this.f29756b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8382k(@NotNull CardViewHolder<?> cardViewHolder, @NotNull SwipeDirection swipeDirection) {
            C2668g.b(cardViewHolder, "cardViewHolder");
            C2668g.b(swipeDirection, "swipeDirection");
            this.f29755a = cardViewHolder;
            this.f29756b = swipeDirection;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout$CardRenderer;", "Lcom/tinder/cardstack/cardgrid/animation/CardAnimationEngine$Renderer;", "(Lcom/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout;)V", "render", "", "cardViewHolder", "Lcom/tinder/cardstack/view/CardViewHolder;", "cardProperty", "Lcom/tinder/cardstack/cardgrid/animation/model/CardProperty;", "requestUpdate", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.cardstack.cardgrid.view.BaseCardCollectionLayout$a */
    private final class C10469a implements Renderer {
        /* renamed from: a */
        final /* synthetic */ BaseCardCollectionLayout f34076a;

        public C10469a(BaseCardCollectionLayout baseCardCollectionLayout) {
            this.f34076a = baseCardCollectionLayout;
        }

        public void render(@NotNull CardViewHolder<?> cardViewHolder, @NotNull C8368a c8368a) {
            C2668g.b(cardViewHolder, "cardViewHolder");
            C2668g.b(c8368a, "cardProperty");
            C8365a f = c8368a.m35638f();
            c8368a = c8368a.m35640h();
            float h = f.m35614h();
            float i = f.m35615i();
            cardViewHolder = cardViewHolder.itemView;
            ViewCompat.a(cardViewHolder, h);
            ViewCompat.b(cardViewHolder, i);
            ViewCompat.d(cardViewHolder, c8368a);
        }

        public void requestUpdate() {
            this.f34076a.invalidate();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J.\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f¨\u0006\u0010"}, d2 = {"Lcom/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout$CardViewHolderFinder;", "Lcom/tinder/cardstack/cardgrid/selection/CardViewHolderSelector$CardViewHolderFinder;", "(Lcom/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout;)V", "findCardViewHolder", "Lcom/tinder/cardstack/view/CardViewHolder;", "position", "Lcom/tinder/cardstack/cardgrid/model/Point;", "hitTest", "", "child", "Landroid/view/View;", "x", "", "y", "left", "top", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.cardstack.cardgrid.view.BaseCardCollectionLayout$b */
    private final class C10470b implements CardViewHolderFinder {
        /* renamed from: a */
        final /* synthetic */ BaseCardCollectionLayout f34077a;

        public C10470b(BaseCardCollectionLayout baseCardCollectionLayout) {
            this.f34077a = baseCardCollectionLayout;
        }

        @Nullable
        public CardViewHolder<?> findCardViewHolder(@NotNull C8365a c8365a) {
            C2668g.b(c8365a, "position");
            float h = c8365a.m35614h();
            c8365a = c8365a.m35615i();
            Iterable a = C19068g.a(this.f34077a.getChildCount() - 1, 0);
            Collection arrayList = new ArrayList(C19301m.a(a, 10));
            Iterator it = a.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((Number) this.f34077a.f45111g.m42343a().get(((ab) it).b())).intValue()));
            }
            for (Number intValue : (List) arrayList) {
                View childAt = this.f34077a.getChildAt(intValue.intValue());
                ViewHolder findContainingViewHolder = this.f34077a.findContainingViewHolder(childAt);
                if (!(findContainingViewHolder instanceof CardViewHolder)) {
                    findContainingViewHolder = null;
                }
                CardViewHolder cardViewHolder = (CardViewHolder) findContainingViewHolder;
                if (cardViewHolder != null) {
                    C2668g.a(childAt, "view");
                    if (m42338a(childAt, h, c8365a, childAt.getX(), childAt.getY())) {
                        CardPropertyAnimator a2 = this.f34077a.f45107c.m35622a(cardViewHolder);
                        if (!(a2.m35688c() instanceof C10462d)) {
                            if (!(a2.m35688c() instanceof C10461c)) {
                                if (!(a2.m35688c() instanceof C10463e)) {
                                    return cardViewHolder;
                                }
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
            return null;
        }

        /* renamed from: a */
        public final boolean m42338a(@NotNull View view, float f, float f2, float f3, float f4) {
            C2668g.b(view, "child");
            return (f < f3 || f > f3 + ((float) view.getWidth()) || f2 < f4 || f2 > f4 + ((float) view.getHeight())) ? null : true;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0002J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0006\u0010\u0011\u001a\u00020\u0012J\u0012\u0010\u0013\u001a\u00020\u00122\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0015J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0005H\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout$ChildDrawingOrderCallbackTracker;", "Landroid/support/v7/widget/RecyclerView$ChildDrawingOrderCallback;", "(Lcom/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout;)V", "childDrawingOrder", "", "", "getChildDrawingOrder$cardstack_release", "()Ljava/util/List;", "selectedViewHolders", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "isAnimating", "", "viewHolder", "isSelected", "onGetChildDrawingOrder", "childCount", "index", "resetIfNeeded", "", "trackSelected", "cardViewHolder", "Lcom/tinder/cardstack/view/CardViewHolder;", "updateDrawingOrder", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.cardstack.cardgrid.view.BaseCardCollectionLayout$c */
    private final class C10471c implements ChildDrawingOrderCallback {
        /* renamed from: a */
        final /* synthetic */ BaseCardCollectionLayout f34078a;
        @NotNull
        /* renamed from: b */
        private final List<Integer> f34079b = ((List) new ArrayList());
        /* renamed from: c */
        private final List<ViewHolder> f34080c = ((List) new ArrayList());

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 1, 9})
        /* renamed from: com.tinder.cardstack.cardgrid.view.BaseCardCollectionLayout$c$a */
        public static final class C8379a<T> implements Comparator<T> {
            /* renamed from: a */
            final /* synthetic */ C10471c f29753a;

            public C8379a(C10471c c10471c) {
                this.f29753a = c10471c;
            }

            public final int compare(T t, T t2) {
                Pair pair = (Pair) t;
                CardAnimationEngine a = this.f29753a.f34078a.f45107c;
                t = pair.a();
                if (t == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.cardstack.view.CardViewHolder<*>");
                }
                t = a.m35622a((CardViewHolder) t).m35688c();
                int i = 0;
                t = t instanceof C10462d ? 3 : (t instanceof C10461c) != null ? 2 : null;
                Comparable valueOf = Integer.valueOf(t);
                Pair pair2 = (Pair) t2;
                a = this.f29753a.f34078a.f45107c;
                t2 = pair2.a();
                if (t2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.cardstack.view.CardViewHolder<*>");
                }
                t2 = a.m35622a((CardViewHolder) t2).m35688c();
                if (t2 instanceof C10462d) {
                    i = 3;
                } else if ((t2 instanceof C10461c) != null) {
                    i = 2;
                }
                return C19062a.a(valueOf, Integer.valueOf(i));
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 1, 9})
        /* renamed from: com.tinder.cardstack.cardgrid.view.BaseCardCollectionLayout$c$b */
        public static final class C8380b<T> implements Comparator<T> {
            /* renamed from: a */
            final /* synthetic */ C10471c f29754a;

            public C8380b(C10471c c10471c) {
                this.f29754a = c10471c;
            }

            public final int compare(T t, T t2) {
                return C19062a.a(Integer.valueOf(-this.f29754a.f34080c.indexOf(((Pair) t).a())), Integer.valueOf(-this.f29754a.f34080c.indexOf(((Pair) t2).a())));
            }
        }

        public C10471c(BaseCardCollectionLayout baseCardCollectionLayout) {
            this.f34078a = baseCardCollectionLayout;
        }

        @NotNull
        /* renamed from: a */
        public final List<Integer> m42343a() {
            return this.f34079b;
        }

        public int onGetChildDrawingOrder(int i, int i2) {
            if (i2 == 0) {
                m42340a(i);
            }
            return ((Number) this.f34079b.get(i2)).intValue();
        }

        /* renamed from: a */
        public final void m42344a(@NotNull CardViewHolder<?> cardViewHolder) {
            C2668g.b(cardViewHolder, "cardViewHolder");
            if (!this.f34080c.contains(cardViewHolder)) {
                this.f34080c.add(cardViewHolder);
            }
        }

        /* renamed from: b */
        public final void m42345b() {
            if (this.f34078a.f45107c.m35623a().isEmpty()) {
                if (this.f34078a.f45108d.m35693a().isEmpty()) {
                    this.f34080c.clear();
                }
            }
        }

        /* renamed from: a */
        private final void m42340a(int i) {
            this.f34079b.clear();
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            for (i--; i >= 0; i--) {
                ViewHolder childViewHolder = this.f34078a.getChildViewHolder(this.f34078a.getChildAt(i));
                C2668g.a(childViewHolder, "viewHolder");
                if (m42341a(childViewHolder)) {
                    arrayList.add(C15811g.a(childViewHolder, Integer.valueOf(i)));
                } else if (m42342b(childViewHolder)) {
                    arrayList2.add(C15811g.a(childViewHolder, Integer.valueOf(i)));
                } else {
                    this.f34079b.add(0, Integer.valueOf(i));
                }
            }
            if (arrayList2.size() > 1) {
                C19301m.a(arrayList2, (Comparator) new C8379a(this));
            }
            if (arrayList.size() > 1) {
                C19301m.a(arrayList, (Comparator) new C8380b(this));
            }
            for (Pair b : C19301m.b(arrayList2, arrayList)) {
                this.f34079b.add(this.f34079b.size(), b.b());
            }
        }

        /* renamed from: a */
        private final boolean m42341a(ViewHolder viewHolder) {
            for (Object next : this.f34080c) {
                if (C2668g.a((ViewHolder) next, viewHolder)) {
                    break;
                }
            }
            Object next2 = null;
            return next2 != null ? true : null;
        }

        /* renamed from: b */
        private final boolean m42342b(ViewHolder viewHolder) {
            for (Object next : this.f34078a.f45107c.m35623a()) {
                if (C2668g.a(((CardPropertyAnimator) next).m35691e(), viewHolder)) {
                    break;
                }
            }
            Object next2 = null;
            return next2 != null ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002J&\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0016\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016JX\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0002JX\u0010%\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0002J\u0016\u0010&\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007R6\u0010\u0003\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004j\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006`\bX\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout$ItemDecoration;", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "(Lcom/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout;)V", "viewCardDecorationListeners", "Ljava/util/HashMap;", "Landroid/view/View;", "", "Lcom/tinder/cardstack/view/CardDecorationListener;", "Lkotlin/collections/HashMap;", "addCardDecorationListener", "", "view", "cardDecorationListener", "getCardDecorationListenersForView", "", "onDraw", "optionalCanvas", "Landroid/graphics/Canvas;", "optionalParent", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "onDrawOver", "pushOnDecorationDrawOverUpdates", "listener", "canvas", "parent", "Landroid/view/ViewGroup;", "dx", "", "dy", "rotation", "swipeDirection", "Lcom/tinder/cardstack/model/SwipeDirection;", "isReverting", "", "isTouch", "pushOnDecorationDrawUpdates", "removeCardDecorationListener", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.cardstack.cardgrid.view.BaseCardCollectionLayout$f */
    private final class C10477f extends ItemDecoration {
        /* renamed from: a */
        final /* synthetic */ BaseCardCollectionLayout f34086a;
        /* renamed from: b */
        private final HashMap<View, List<CardDecorationListener>> f34087b = new HashMap();

        public C10477f(BaseCardCollectionLayout baseCardCollectionLayout) {
            this.f34086a = baseCardCollectionLayout;
        }

        /* renamed from: a */
        public final void m42349a(@NotNull View view, @NotNull CardDecorationListener cardDecorationListener) {
            C2668g.b(view, "view");
            C2668g.b(cardDecorationListener, "cardDecorationListener");
            if (!this.f34087b.containsKey(view)) {
                this.f34087b.put(view, new ArrayList());
            }
            view = this.f34087b.get(view);
            if (view == null) {
                C2668g.a();
            }
            ((List) view).add(cardDecorationListener);
        }

        /* renamed from: b */
        public final void m42350b(@NotNull View view, @NotNull CardDecorationListener cardDecorationListener) {
            C2668g.b(view, "view");
            C2668g.b(cardDecorationListener, "cardDecorationListener");
            if (this.f34087b.containsKey(view)) {
                List list = (List) this.f34087b.get(view);
                if (list == null) {
                    C2668g.a();
                }
                list.remove(cardDecorationListener);
                if (list.isEmpty() != null) {
                    this.f34087b.remove(view);
                }
            }
        }

        public void onDraw(@Nullable Canvas canvas, @Nullable RecyclerView recyclerView, @Nullable State state) {
            this.f34086a.f45107c.m35627c();
            super.onDraw(canvas, recyclerView, state);
            if (canvas != null && recyclerView != null) {
                for (CardPropertyAnimator cardPropertyAnimator : r11.f34086a.f45107c.m35623a()) {
                    if (!(cardPropertyAnimator.m35688c() instanceof C10463e)) {
                        View view = cardPropertyAnimator.m35691e().itemView;
                        C8368a a = r11.f34086a.f45107c.m35621a(cardPropertyAnimator);
                        C8365a f = a.m35638f();
                        float h = a.m35640h();
                        float h2 = f.m35614h();
                        float i = f.m35615i();
                        SwipeDirection a2 = r11.f34086a.f45109e.m35742a(f);
                        C2668g.a(view, "view");
                        Iterator it = m42346a(view).iterator();
                        while (it.hasNext()) {
                            Iterator it2 = it;
                            View view2 = view;
                            m42347a((CardDecorationListener) it.next(), canvas, view, recyclerView, h2, i, h, a2, false, false);
                            it = it2;
                            view = view2;
                        }
                    }
                }
            }
        }

        public void onDrawOver(@Nullable Canvas canvas, @Nullable RecyclerView recyclerView, @Nullable State state) {
            C10477f c10477f = this;
            super.onDrawOver(canvas, recyclerView, state);
            if (canvas != null && recyclerView != null) {
                for (CardPropertyAnimator cardPropertyAnimator : c10477f.f34086a.f45107c.m35623a()) {
                    if (!(cardPropertyAnimator.m35688c() instanceof C10463e)) {
                        View view = cardPropertyAnimator.m35691e().itemView;
                        C8368a a = c10477f.f34086a.f45107c.m35621a(cardPropertyAnimator);
                        C8365a f = a.m35638f();
                        float h = a.m35640h();
                        float h2 = f.m35614h();
                        float i = f.m35615i();
                        SwipeDirection a2 = c10477f.f34086a.f45109e.m35742a(f);
                        C2668g.a(view, "view");
                        Iterator it = m42346a(view).iterator();
                        while (it.hasNext()) {
                            Iterator it2 = it;
                            View view2 = view;
                            m42348b((CardDecorationListener) it.next(), canvas, view, recyclerView, h2, i, h, a2, false, false);
                            it = it2;
                            view = view2;
                        }
                    }
                }
                c10477f.f34086a.f45107c.m35628d();
                c10477f.f34086a.f45111g.m42345b();
            }
        }

        /* renamed from: a */
        private final List<CardDecorationListener> m42346a(View view) {
            if (!this.f34087b.containsKey(view)) {
                return C19301m.a();
            }
            view = this.f34087b.get(view);
            if (view == null) {
                C2668g.a();
            }
            C2668g.a(view, "viewCardDecorationListeners[view]!!");
            return C19301m.l((Iterable) view);
        }

        /* renamed from: a */
        private final void m42347a(CardDecorationListener cardDecorationListener, Canvas canvas, View view, ViewGroup viewGroup, float f, float f2, float f3, SwipeDirection swipeDirection, boolean z, boolean z2) {
            int save = canvas.save();
            cardDecorationListener.onDecorationDraw(canvas, view, viewGroup, f, f2, f3, swipeDirection, z, z2);
            canvas.restoreToCount(save);
        }

        /* renamed from: b */
        private final void m42348b(CardDecorationListener cardDecorationListener, Canvas canvas, View view, ViewGroup viewGroup, float f, float f2, float f3, SwipeDirection swipeDirection, boolean z, boolean z2) {
            int save = canvas.save();
            cardDecorationListener.onDecorationDrawOver(canvas, view, viewGroup, f, f2, f3, swipeDirection, z, z2);
            canvas.restoreToCount(save);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout$OnChildAttachStateChangeListener;", "Landroid/support/v7/widget/RecyclerView$OnChildAttachStateChangeListener;", "(Lcom/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout;)V", "onChildViewAttachedToWindow", "", "view", "Landroid/view/View;", "onChildViewDetachedFromWindow", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.cardstack.cardgrid.view.BaseCardCollectionLayout$g */
    private final class C10478g implements OnChildAttachStateChangeListener {
        /* renamed from: a */
        final /* synthetic */ BaseCardCollectionLayout f34088a;

        public C10478g(BaseCardCollectionLayout baseCardCollectionLayout) {
            this.f34088a = baseCardCollectionLayout;
        }

        public void onChildViewAttachedToWindow(@Nullable View view) {
            view = this.f34088a.findContainingViewHolder(view);
            if (!(view instanceof CardViewHolder)) {
                view = null;
            }
            CardViewHolder cardViewHolder = (CardViewHolder) view;
            if (cardViewHolder != null) {
                cardViewHolder.onAttachedToCardCollectionLayout(this.f34088a);
                this.f34088a.f45107c.m35626b(cardViewHolder);
            }
        }

        public void onChildViewDetachedFromWindow(@Nullable View view) {
            view = this.f34088a.findContainingViewHolder(view);
            if (!(view instanceof CardViewHolder)) {
                view = null;
            }
            CardViewHolder cardViewHolder = (CardViewHolder) view;
            if (cardViewHolder != null) {
                cardViewHolder.onDetachedFromCardCollectionLayout(this.f34088a);
                this.f34088a.f45107c.m35626b(cardViewHolder);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout$OnGestureListener;", "Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$OnGestureListener;", "(Lcom/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout;)V", "pendingSwipes", "", "Lcom/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout$Swipe;", "dispatchSwipesIfNeeded", "", "enqueueSwipe", "swipe", "onClick", "pointer", "Lcom/tinder/cardstack/cardgrid/swipe/model/Pointer;", "onMove", "onRecover", "onSwipe", "swipeDirection", "Lcom/tinder/cardstack/model/SwipeDirection;", "updateAllowParentTouchIntercept", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.cardstack.cardgrid.view.BaseCardCollectionLayout$h */
    private final class C10479h implements OnGestureListener {
        /* renamed from: a */
        final /* synthetic */ BaseCardCollectionLayout f34089a;
        /* renamed from: b */
        private final List<C8382k> f34090b = ((List) new ArrayList());

        public C10479h(BaseCardCollectionLayout baseCardCollectionLayout) {
            this.f34089a = baseCardCollectionLayout;
        }

        public void onMove(@NotNull C8378a c8378a) {
            C2668g.b(c8378a, "pointer");
            m42353b();
            this.f34089a.f45112h.m35743a(c8378a.m35726a());
            C8375a a = this.f34089a.f45108d.m35692a(c8378a);
            if (a != null) {
                CardViewHolder c = a.m35699c();
                C8365a d = a.m35700d();
                C8378a e = a.m35701e();
                C8365a f = a.m35702f();
                this.f34089a.f45111g.m42344a(c);
                if ((C2668g.a(c8378a, e) ^ 1) == 0) {
                    this.f34089a.f45107c.m35622a(c).m35683a(d, c8378a.m35729c().m35606a(f));
                }
            }
        }

        public void onSwipe(@NotNull C8378a c8378a, @NotNull SwipeDirection swipeDirection) {
            C2668g.b(c8378a, "pointer");
            C2668g.b(swipeDirection, "swipeDirection");
            m42353b();
            this.f34089a.f45112h.m35745b(c8378a.m35726a());
            C8375a b = this.f34089a.f45108d.m35694b(c8378a);
            if (b != null) {
                CardViewHolder c = b.m35699c();
                C8365a d = b.m35700d();
                C8378a e = b.m35701e();
                int i = 1;
                if (e == null || (C2668g.a(c8378a, e) ^ 1) == 0) {
                    i = 0;
                }
                if (i == 0) {
                    c8378a = c8378a.m35730d();
                    if (c8378a == null) {
                        C2668g.a();
                    }
                    this.f34089a.f45107c.m35622a(c).m35684a(c8378a.m35611d().m35605a(BaseCardCollectionLayout.f45102a.m35738c()), d, (long) ((BaseCardCollectionLayout.f45102a.m35738c() / c8378a.m35604a()) * ((float) AdError.NETWORK_ERROR_CODE)));
                    m42352a(new C8382k(c, swipeDirection));
                    m42351a();
                }
            }
        }

        public void onClick(@NotNull C8378a c8378a) {
            C2668g.b(c8378a, "pointer");
            m42353b();
            this.f34089a.f45112h.m35745b(c8378a.m35726a());
            C8375a b = this.f34089a.f45108d.m35694b(c8378a);
            if (b != null) {
                CardViewHolder c = b.m35699c();
                C8378a e = b.m35701e();
                c8378a = (e == null || (C2668g.a(c8378a, e) ^ 1) == null) ? null : true;
                if (c8378a == null) {
                    CardPropertyAnimator.m35671a(this.f34089a.f45107c.m35622a(c), null, 1, null);
                    m42351a();
                }
            }
        }

        public void onRecover(@NotNull C8378a c8378a) {
            C2668g.b(c8378a, "pointer");
            m42353b();
            this.f34089a.f45112h.m35745b(c8378a.m35726a());
            C8375a b = this.f34089a.f45108d.m35694b(c8378a);
            if (b != null) {
                CardViewHolder c = b.m35699c();
                C8378a e = b.m35701e();
                c8378a = (e == null || (C2668g.a(c8378a, e) ^ 1) == null) ? null : true;
                if (c8378a == null) {
                    CardPropertyAnimator.m35671a(this.f34089a.f45107c.m35622a(c), null, 1, null);
                    m42351a();
                }
            }
        }

        /* renamed from: a */
        private final void m42352a(C8382k c8382k) {
            this.f34090b.add(c8382k);
        }

        /* renamed from: a */
        private final void m42351a() {
            if (this.f34089a.f45108d.m35693a().isEmpty()) {
                for (C8382k c8382k : this.f34090b) {
                    CardViewHolder a = c8382k.m35740a();
                    if (!this.f34089a.m54016a(a, c8382k.m35741b())) {
                        CardPropertyAnimator.m35671a(this.f34089a.f45107c.m35622a(a), null, 1, null);
                    }
                }
                this.f34090b.clear();
            }
        }

        /* renamed from: b */
        private final void m42353b() {
            if (this.f34089a.f45108d.m35693a().isEmpty()) {
                this.f34089a.requestDisallowInterceptTouchEvent(false);
            } else {
                this.f34089a.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\u001c\u0010\f\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\r"}, d2 = {"Lcom/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout$OnItemTouchListener;", "Landroid/support/v7/widget/RecyclerView$OnItemTouchListener;", "(Lcom/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout;)V", "onInterceptTouchEvent", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "event", "Landroid/view/MotionEvent;", "onRequestDisallowInterceptTouchEvent", "", "disallowIntercept", "onTouchEvent", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.cardstack.cardgrid.view.BaseCardCollectionLayout$i */
    private final class C10480i implements OnItemTouchListener {
        /* renamed from: a */
        final /* synthetic */ BaseCardCollectionLayout f34091a;

        public void onRequestDisallowInterceptTouchEvent(boolean z) {
        }

        public C10480i(BaseCardCollectionLayout baseCardCollectionLayout) {
            this.f34091a = baseCardCollectionLayout;
        }

        public boolean onInterceptTouchEvent(@Nullable RecyclerView recyclerView, @Nullable MotionEvent motionEvent) {
            if (this.f34091a.f45114j == null && motionEvent != null) {
                return this.f34091a.f45106b.m35720a(motionEvent);
            }
            return false;
        }

        public void onTouchEvent(@Nullable RecyclerView recyclerView, @Nullable MotionEvent motionEvent) {
            if (motionEvent != null) {
                this.f34091a.f45106b.m35722b(motionEvent);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout$ScrollListener;", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "(Lcom/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout;)V", "onScrollStateChanged", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.cardstack.cardgrid.view.BaseCardCollectionLayout$j */
    private final class C10481j extends OnScrollListener {
        /* renamed from: a */
        final /* synthetic */ BaseCardCollectionLayout f34092a;

        public C10481j(BaseCardCollectionLayout baseCardCollectionLayout) {
            this.f34092a = baseCardCollectionLayout;
        }

        public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
            C2668g.b(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            this.f34092a.f45114j = i != 0;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016J>\u0010\u000b\u001a\u00020\u00062\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016J2\u0010\u0011\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016J\"\u0010\u0012\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016J\u0014\u0010\u0013\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout$ItemAnimator;", "Lcom/tinder/cardstack/cardgrid/view/SimpleCardItemAnimator;", "(Lcom/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout;)V", "tempRec", "Landroid/graphics/Rect;", "animateAdd", "", "holder", "Lcom/tinder/cardstack/view/CardViewHolder;", "onComplete", "Lkotlin/Function0;", "animateChange", "oldHolder", "newHolder", "fromPosition", "Lcom/tinder/cardstack/cardgrid/model/Point;", "toPosition", "animateMove", "animateRemove", "endAnimation", "endAnimations", "getRelativePosition", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "point", "isRunning", "", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.cardstack.cardgrid.view.BaseCardCollectionLayout$e */
    private final class C13659e extends C12646f {
        /* renamed from: a */
        final /* synthetic */ BaseCardCollectionLayout f43503a;
        /* renamed from: b */
        private Rect f43504b = new Rect();

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout$ItemAnimator$animateAdd$1", "Lcom/tinder/cardstack/cardgrid/animation/animator/CardPropertyAnimator$OnCompleteListener;", "(Lkotlin/jvm/functions/Function0;)V", "onComplete", "", "cardstack_release"}, k = 1, mv = {1, 1, 9})
        /* renamed from: com.tinder.cardstack.cardgrid.view.BaseCardCollectionLayout$e$a */
        public static final class C10472a implements OnCompleteListener {
            /* renamed from: a */
            final /* synthetic */ Function0 f34081a;

            C10472a(Function0 function0) {
                this.f34081a = function0;
            }

            public void onComplete() {
                this.f34081a.invoke();
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout$ItemAnimator$animateAdd$2", "Lcom/tinder/cardstack/cardgrid/animation/animator/CardPropertyAnimator$OnCompleteListener;", "(Lkotlin/jvm/functions/Function0;)V", "onComplete", "", "cardstack_release"}, k = 1, mv = {1, 1, 9})
        /* renamed from: com.tinder.cardstack.cardgrid.view.BaseCardCollectionLayout$e$b */
        public static final class C10473b implements OnCompleteListener {
            /* renamed from: a */
            final /* synthetic */ Function0 f34082a;

            C10473b(Function0 function0) {
                this.f34082a = function0;
            }

            public void onComplete() {
                this.f34082a.invoke();
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout$ItemAnimator$animateMove$1", "Lcom/tinder/cardstack/cardgrid/animation/animator/CardPropertyAnimator$OnCompleteListener;", "(Lkotlin/jvm/functions/Function0;)V", "onComplete", "", "cardstack_release"}, k = 1, mv = {1, 1, 9})
        /* renamed from: com.tinder.cardstack.cardgrid.view.BaseCardCollectionLayout$e$c */
        public static final class C10474c implements OnCompleteListener {
            /* renamed from: a */
            final /* synthetic */ Function0 f34083a;

            C10474c(Function0 function0) {
                this.f34083a = function0;
            }

            public void onComplete() {
                this.f34083a.invoke();
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout$ItemAnimator$animateRemove$1", "Lcom/tinder/cardstack/cardgrid/animation/animator/CardPropertyAnimator$OnCompleteListener;", "(Lkotlin/jvm/functions/Function0;)V", "onComplete", "", "cardstack_release"}, k = 1, mv = {1, 1, 9})
        /* renamed from: com.tinder.cardstack.cardgrid.view.BaseCardCollectionLayout$e$d */
        public static final class C10475d implements OnCompleteListener {
            /* renamed from: a */
            final /* synthetic */ Function0 f34084a;

            C10475d(Function0 function0) {
                this.f34084a = function0;
            }

            public void onComplete() {
                this.f34084a.invoke();
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout$ItemAnimator$animateRemove$2", "Lcom/tinder/cardstack/cardgrid/animation/animator/CardPropertyAnimator$OnCompleteListener;", "(Lkotlin/jvm/functions/Function0;)V", "onComplete", "", "cardstack_release"}, k = 1, mv = {1, 1, 9})
        /* renamed from: com.tinder.cardstack.cardgrid.view.BaseCardCollectionLayout$e$e */
        public static final class C10476e implements OnCompleteListener {
            /* renamed from: a */
            final /* synthetic */ Function0 f34085a;

            C10476e(Function0 function0) {
                this.f34085a = function0;
            }

            public void onComplete() {
                this.f34085a.invoke();
            }
        }

        public C13659e(BaseCardCollectionLayout baseCardCollectionLayout) {
            this.f43503a = baseCardCollectionLayout;
        }

        /* renamed from: a */
        public void mo11313a(@NotNull CardViewHolder<?> cardViewHolder, @NotNull CardViewHolder<?> cardViewHolder2, @NotNull C8365a c8365a, @NotNull C8365a c8365a2, @NotNull Function0<C15813i> function0) {
            C2668g.b(cardViewHolder, "oldHolder");
            C2668g.b(cardViewHolder2, "newHolder");
            C2668g.b(c8365a, "fromPosition");
            C2668g.b(c8365a2, "toPosition");
            C2668g.b(function0, "onComplete");
            function0.invoke();
        }

        /* renamed from: a */
        public void mo11314a(@NotNull CardViewHolder<?> cardViewHolder, @NotNull Function0<C15813i> function0) {
            C2668g.b(cardViewHolder, "holder");
            C2668g.b(function0, "onComplete");
            CardPropertyAnimator a = this.f43503a.f45107c.m35622a((CardViewHolder) cardViewHolder);
            cardViewHolder = cardViewHolder.getAppearingAnimation();
            if (cardViewHolder == null) {
                function0.invoke();
                return;
            }
            if (C2668g.a(a.m35681a(), CardPropertyAnimator.State.RUNNING)) {
                if (a.m35688c() instanceof C10461c) {
                    a.m35685a((OnCompleteListener) new C10472a(function0));
                    return;
                }
                a.m35686b();
            }
            a.m35687b(new C8365a(cardViewHolder.startX(), cardViewHolder.startY()), C8365a.f29697a.m35602a());
            a.m35685a((OnCompleteListener) new C10473b(function0));
        }

        /* renamed from: a */
        public void mo11312a(@NotNull CardViewHolder<?> cardViewHolder, @NotNull C8365a c8365a, @NotNull C8365a c8365a2, @NotNull Function0<C15813i> function0) {
            C2668g.b(cardViewHolder, "holder");
            C2668g.b(c8365a, "fromPosition");
            C2668g.b(c8365a2, "toPosition");
            C2668g.b(function0, "onComplete");
            ViewHolder viewHolder = cardViewHolder;
            c8365a = m53182a(viewHolder, c8365a);
            c8365a2 = m53182a(viewHolder, c8365a2);
            CardPropertyAnimator a = this.f43503a.f45107c.m35622a((CardViewHolder) cardViewHolder);
            a.m35686b();
            cardViewHolder = C8368a.f29706a.m35630a(cardViewHolder);
            if (a.m35688c() instanceof C10461c) {
                a.m35687b(c8365a.m35606a(cardViewHolder.m35633a()), c8365a2);
            } else {
                a.m35689c(c8365a.m35606a(cardViewHolder.m35633a()), c8365a2);
            }
            a.m35685a((OnCompleteListener) new C10474c(function0));
        }

        /* renamed from: b */
        public void mo11315b(@NotNull CardViewHolder<?> cardViewHolder, @NotNull Function0<C15813i> function0) {
            C2668g.b(cardViewHolder, "holder");
            C2668g.b(function0, "onComplete");
            CardPropertyAnimator a = this.f43503a.f45107c.m35622a((CardViewHolder) cardViewHolder);
            C8361a disappearingAnimation = cardViewHolder.getDisappearingAnimation();
            if (disappearingAnimation == null) {
                function0.invoke();
                return;
            }
            if (C2668g.a(a.m35681a(), CardPropertyAnimator.State.RUNNING)) {
                if (a.m35688c() instanceof C10462d) {
                    a.m35685a((OnCompleteListener) new C10475d(function0));
                    return;
                }
                a.m35686b();
            }
            cardViewHolder = C8368a.f29706a.m35630a(cardViewHolder);
            a.m35684a(new C8365a(disappearingAnimation.endX(), disappearingAnimation.endY()), new C8365a(cardViewHolder.m35636c() / 2.0f, cardViewHolder.m35635b() * 0.4f), (long) disappearingAnimation.durationMilli());
            a.m35685a((OnCompleteListener) new C10476e(function0));
        }

        public boolean isRunning() {
            return this.f43503a.f45107c.m35623a().isEmpty() ^ 1;
        }

        /* renamed from: a */
        public void mo11311a(@NotNull CardViewHolder<?> cardViewHolder) {
            C2668g.b(cardViewHolder, "holder");
            this.f43503a.f45107c.m35626b(cardViewHolder);
        }

        public void endAnimations() {
            this.f43503a.f45107c.m35625b();
        }

        /* renamed from: a */
        private final C8365a m53182a(ViewHolder viewHolder, C8365a c8365a) {
            this.f43504b.left = (int) c8365a.m35612e();
            this.f43504b.top = (int) c8365a.m35613f();
            this.f43503a.offsetRectIntoDescendantCoords(viewHolder.itemView, this.f43504b);
            return new C8365a(this.f43504b.left, this.f43504b.top);
        }
    }

    public BaseCardCollectionLayout(@NotNull Context context) {
        C2668g.b(context, "ctx");
        this(context, null);
    }

    public BaseCardCollectionLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "ctx");
        super(context, attributeSet);
        this.f45107c = new CardAnimationEngine();
        this.f45109e = new SwipeDirectionRecognizer();
        this.f45110f = new C10477f(this);
        this.f45111g = new C10471c(this);
        this.f45112h = new C8383a();
        addItemDecoration((ItemDecoration) this.f45110f);
        addOnItemTouchListener((OnItemTouchListener) new C10480i(this));
        addOnChildAttachStateChangeListener((OnChildAttachStateChangeListener) new C10478g(this));
        setChildDrawingOrderCallback((ChildDrawingOrderCallback) this.f45111g);
        addOnScrollListener((OnScrollListener) new C10481j(this));
        setItemAnimator((ItemAnimator) new C13659e(this));
        context = C8363a.m35601b();
        attributeSet = getContext();
        C2668g.a(attributeSet, "context");
        attributeSet = attributeSet.getResources().getDimension(C8359a.fling_escape_velocity_dp);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        context *= f45102a.m35734a();
        TouchInterceptPredicate c10484d = new C10484d();
        SwipeActionRecognizer c10485g = new C10485g(new C8388a(attributeSet * ((float) 6), context, context / ((float) 3)), this.f45109e);
        float c = f45102a.m35736b();
        C2668g.a(viewConfiguration, "viewConfiguration");
        this.f45106b = new SwipeGestureDetector(c10484d, c10485g, (ClickActionRecognizer) new C10482b(new C8384a(Math.max(c, (float) (viewConfiguration.getScaledTouchSlop() / 2)))));
        this.f45106b.m35719a((OnGestureListener) new C10479h(this));
        this.f45107c.m35624a((Renderer) new C10469a(this));
        this.f45108d = new CardViewHolderSelector((CardViewHolderFinder) new C10470b(this));
    }

    public void setOnPreSwipeListener(@NotNull OnPreSwipeListener onPreSwipeListener) {
        C2668g.b(onPreSwipeListener, "preSwipeListener");
        this.f45113i = onPreSwipeListener;
    }

    /* renamed from: a */
    public void mo11330a(@NotNull View view, @NotNull CardDecorationListener cardDecorationListener) {
        C2668g.b(view, "view");
        C2668g.b(cardDecorationListener, "cardDecorationListener");
        this.f45110f.m42349a(view, cardDecorationListener);
    }

    /* renamed from: b */
    public void mo11331b(@NotNull View view, @NotNull CardDecorationListener cardDecorationListener) {
        C2668g.b(view, "view");
        C2668g.b(cardDecorationListener, "cardDecorationListener");
        this.f45110f.m42350b(view, cardDecorationListener);
    }

    public final void setDragSessionListener(@NotNull DragSessionListener dragSessionListener) {
        C2668g.b(dragSessionListener, "dragSessionListener");
        this.f45112h.m35744a(dragSessionListener);
    }

    /* renamed from: a */
    public final void m54026a(@NotNull C8395a<?> c8395a) {
        C2668g.b(c8395a, "card");
        c8395a = getAdapter().m42466a((C8395a) c8395a);
        if (c8395a != -1) {
            c8395a = findViewHolderForAdapterPosition(c8395a);
            if (c8395a == null) {
                return;
            }
            if (c8395a == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.cardstack.view.CardViewHolder<*>");
            }
            m54014a((CardViewHolder) c8395a);
        }
    }

    /* renamed from: a */
    private final void m54014a(CardViewHolder<?> cardViewHolder) {
        View view = cardViewHolder.itemView;
        C2668g.a(view, "cardViewHolder.itemView");
        float translationX = view.getTranslationX();
        View view2 = cardViewHolder.itemView;
        C2668g.a(view2, "cardViewHolder.itemView");
        this.f45107c.m35622a((CardViewHolder) cardViewHolder).m35687b(new C8365a(translationX, view2.getTranslationY()), new C8365a(0, 0));
    }

    /* renamed from: a */
    private final boolean m54016a(CardViewHolder<?> cardViewHolder, SwipeDirection swipeDirection) {
        boolean z = false;
        if (cardViewHolder.getAdapterPosition() < 0) {
            return false;
        }
        cardViewHolder = getAdapter().m42467a(cardViewHolder.getAdapterPosition());
        OnPreSwipeListener onPreSwipeListener = this.f45113i;
        if (onPreSwipeListener != null) {
            z = onPreSwipeListener.onPreSwipe(cardViewHolder, swipeDirection);
        }
        return z;
    }
}
