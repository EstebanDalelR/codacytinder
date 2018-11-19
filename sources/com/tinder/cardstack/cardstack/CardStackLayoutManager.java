package com.tinder.cardstack.cardstack;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener;
import android.support.v7.widget.RecyclerView.Recycler;
import android.support.v7.widget.RecyclerView.State;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tinder.cardstack.view.CardStackLayout;
import com.tinder.cardstack.view.CardViewHolder;
import com.tinder.cardstack.view.OnChildAttachStateChangePostLayoutListeners;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import p000a.p001a.C0001a;

public class CardStackLayoutManager extends LayoutManager {
    /* renamed from: a */
    private static final String f34102a = "CardStackLayoutManager";
    @NonNull
    /* renamed from: b */
    private final CardStackLayout f34103b;
    @NonNull
    /* renamed from: c */
    private final List<OnChildAttachStateChangePostLayoutListeners> f34104c = new ArrayList();
    @NonNull
    /* renamed from: d */
    private final List<C8391b> f34105d = new ArrayList();
    /* renamed from: e */
    private int f34106e = Integer.MIN_VALUE;
    /* renamed from: f */
    private int f34107f = Integer.MIN_VALUE;
    /* renamed from: g */
    private boolean f34108g;
    @Nullable
    /* renamed from: h */
    private View f34109h = null;
    @NonNull
    /* renamed from: i */
    private OnCardPresentedListener f34110i = C10496c.f34138a;

    public interface OnCardPresentedListener {
        void onCardPresented(@NonNull View view);
    }

    /* renamed from: com.tinder.cardstack.cardstack.CardStackLayoutManager$b */
    private static class C8391b {
        /* renamed from: a */
        private final View f29769a;
        /* renamed from: b */
        private final boolean f29770b;

        C8391b(@NonNull View view, boolean z) {
            this.f29769a = view;
            this.f29770b = z;
        }

        /* renamed from: a */
        boolean m35760a() {
            return this.f29770b;
        }
    }

    /* renamed from: com.tinder.cardstack.cardstack.CardStackLayoutManager$a */
    private class C10486a implements OnChildAttachStateChangeListener {
        /* renamed from: a */
        final /* synthetic */ CardStackLayoutManager f34101a;

        private C10486a(CardStackLayoutManager cardStackLayoutManager) {
            this.f34101a = cardStackLayoutManager;
        }

        public void onChildViewAttachedToWindow(View view) {
            CardViewHolder cardViewHolder = (CardViewHolder) this.f34101a.f34103b.getChildViewHolder(view);
            if (cardViewHolder != null) {
                cardViewHolder.onAttachedToCardCollectionLayout(this.f34101a.f34103b);
            }
            if (this.f34101a.m42380a()) {
                this.f34101a.f34105d.add(new C8391b(view, true));
            } else {
                this.f34101a.m42369b(view);
            }
        }

        public void onChildViewDetachedFromWindow(View view) {
            CardViewHolder cardViewHolder = (CardViewHolder) this.f34101a.f34103b.getChildViewHolder(view);
            if (cardViewHolder != null) {
                cardViewHolder.onCardAtTop(false);
                cardViewHolder.onDetachedFromCardCollectionLayout(this.f34101a.f34103b);
            }
            if (view == this.f34101a.f34109h) {
                this.f34101a.f34109h = null;
            }
            if (this.f34101a.m42380a()) {
                this.f34101a.f34105d.add(new C8391b(view, false));
            } else {
                this.f34101a.m42371c(view);
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m42364a(View view) {
    }

    public CardStackLayoutManager(@NonNull CardStackLayout cardStackLayout) {
        this.f34103b = cardStackLayout;
        this.f34103b.addOnChildAttachStateChangeListener(new C10486a());
        setItemPrefetchEnabled(null);
    }

    /* renamed from: a */
    public void m42378a(@NonNull OnCardPresentedListener onCardPresentedListener) {
        this.f34110i = onCardPresentedListener;
    }

    /* renamed from: a */
    public void m42377a(int i, int i2, int i3, int i4) {
        if (i4 != i2 || i3 != i) {
            this.f34107f = Integer.MIN_VALUE;
            this.f34106e = Integer.MIN_VALUE;
        }
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public void onLayoutChildren(Recycler recycler, State state) {
        this.f34108g = true;
        if (getItemCount() == 0) {
            detachAndScrapAttachedViews(recycler);
            return;
        }
        detachAndScrapAttachedViews(recycler);
        m42363a(recycler, state);
    }

    public void onLayoutCompleted(State state) {
        super.onLayoutCompleted(state);
        this.f34108g = null;
        m42368b();
    }

    /* renamed from: a */
    public boolean m42380a() {
        return this.f34108g;
    }

    /* renamed from: a */
    public void m42379a(@NonNull OnChildAttachStateChangePostLayoutListeners onChildAttachStateChangePostLayoutListeners) {
        this.f34104c.add(onChildAttachStateChangePostLayoutListeners);
    }

    /* renamed from: a */
    private void m42363a(Recycler recycler, State state) {
        state = Math.min(2, getItemCount());
        ArrayDeque arrayDeque = new ArrayDeque(state);
        for (int i = 0; i < state; i++) {
            if (m42373c()) {
                m42362a(recycler);
            }
            View viewForPosition = recycler.getViewForPosition(i);
            measureChildWithMargins(viewForPosition, 0, 0);
            arrayDeque.push(viewForPosition);
            layoutDecorated(viewForPosition, 0, 0, 0 + this.f34106e, 0 + this.f34107f);
        }
        while (arrayDeque.isEmpty() == null) {
            View view = (View) arrayDeque.pop();
            m42376f(view);
            addView(view);
            CardViewHolder cardViewHolder = (CardViewHolder) this.f34103b.getChildViewHolder(view);
            if (!arrayDeque.isEmpty()) {
                cardViewHolder.onCardAtTop(false);
            } else if (view != this.f34109h) {
                cardViewHolder.onCardAtTop(true);
                this.f34109h = view;
                this.f34110i.onCardPresented(view);
            }
        }
    }

    /* renamed from: b */
    private void m42368b() {
        for (C8391b c8391b : this.f34105d) {
            if (c8391b.m35760a()) {
                m42369b(c8391b.f29769a);
            } else {
                m42371c(c8391b.f29769a);
            }
        }
        this.f34105d.clear();
    }

    /* renamed from: b */
    private void m42369b(@NonNull View view) {
        for (OnChildAttachStateChangePostLayoutListeners onChildViewAttachedPostLayout : this.f34104c) {
            onChildViewAttachedPostLayout.onChildViewAttachedPostLayout(view);
        }
    }

    /* renamed from: c */
    private void m42371c(@NonNull View view) {
        for (OnChildAttachStateChangePostLayoutListeners onChildViewDetachedPostLayout : this.f34104c) {
            onChildViewDetachedPostLayout.onChildViewDetachedPostLayout(view);
        }
    }

    /* renamed from: c */
    private boolean m42373c() {
        if (this.f34106e != Integer.MIN_VALUE) {
            if (this.f34107f != Integer.MIN_VALUE) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private void m42362a(Recycler recycler) {
        View viewForPosition = recycler.getViewForPosition(0);
        addView(viewForPosition);
        measureChildWithMargins(viewForPosition, 0, 0);
        this.f34107f = getDecoratedMeasuredHeight(viewForPosition);
        this.f34106e = getDecoratedMeasuredWidth(viewForPosition);
        detachAndScrapView(viewForPosition, recycler);
    }

    /* renamed from: d */
    private void m42374d(View view) {
        Object parent = view.getParent();
        if (parent != null && parent != this.f34103b) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("View has unexpected parent: ParentClassName=");
            stringBuilder.append(m42361a(parent));
            stringBuilder.append(", ViewClassName=");
            stringBuilder.append(m42361a((Object) view));
            C0001a.c(new RuntimeException(stringBuilder.toString()));
        }
    }

    /* renamed from: e */
    private boolean m42375e(View view) {
        view = view.getParent();
        return (view == null || view == this.f34103b) ? null : true;
    }

    /* renamed from: f */
    private void m42376f(View view) {
        if (m42375e(view)) {
            m42374d(view);
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
    }

    /* renamed from: a */
    private String m42361a(@NonNull Object obj) {
        if (obj.getClass() != null) {
            obj = obj.getClass().getCanonicalName();
            if (obj != null) {
                return obj;
            }
        }
        return "NA";
    }
}
