package com.tinder.cardstack.cardstack;

import android.graphics.Canvas;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.cardstack.cardstack.p187a.C10493b;
import com.tinder.cardstack.cardstack.p187a.C8393d;
import com.tinder.cardstack.model.SwipeDirection;
import com.tinder.cardstack.swipe.C10500a;
import com.tinder.cardstack.swipe.C10502c;
import com.tinder.cardstack.swipe.C8397b;
import com.tinder.cardstack.swipe.C8401d;
import com.tinder.cardstack.swipe.C8402e;
import com.tinder.cardstack.swipe.CardAnimation;
import com.tinder.cardstack.swipe.CardAnimator;
import com.tinder.cardstack.view.CardDecorationListener;
import com.tinder.cardstack.view.CardStackLayout;
import com.tinder.cardstack.view.CardStackLayout.CardRewindAnimationStateListener;
import com.tinder.cardstack.view.CardStackLayout.OnCardPairStateChangeListener;
import com.tinder.cardstack.view.CardStackLayout.OnTopCardMovedListener;
import com.tinder.cardstack.view.OnChildAttachStateChangePostLayoutListeners;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CardStackSwipeHelper {
    /* renamed from: a */
    private static final String f29771a = "CardStackSwipeHelper";
    @NonNull
    /* renamed from: b */
    private final RecyclerView f29772b;
    @NonNull
    /* renamed from: c */
    private final C10502c f29773c;
    @NonNull
    /* renamed from: d */
    private final C8401d f29774d;
    @NonNull
    /* renamed from: e */
    private final CardAnimator f29775e = new CardAnimator();
    @NonNull
    /* renamed from: f */
    private final C10487b f29776f;
    @NonNull
    /* renamed from: g */
    private final C10493b f29777g;
    @NonNull
    /* renamed from: h */
    private final C10497d f29778h;
    @NonNull
    /* renamed from: i */
    private final C10494a f29779i;

    public interface OnPreSwipeListener {
        boolean onPreSwipe(int i, @NonNull SwipeDirection swipeDirection);
    }

    /* renamed from: com.tinder.cardstack.cardstack.CardStackSwipeHelper$b */
    public static class C10487b implements CardDecorationListener {
        /* renamed from: a */
        private List<CardDecorationListener> f34111a = new ArrayList();
        /* renamed from: b */
        private Map<View, List<CardDecorationListener>> f34112b = new HashMap();

        public void onDecorationDraw(@NonNull Canvas canvas, @NonNull View view, @NonNull ViewGroup viewGroup, float f, float f2, float f3, @NonNull SwipeDirection swipeDirection, boolean z, boolean z2) {
            for (CardDecorationListener a : this.f34111a) {
                m42384a(a, canvas, view, viewGroup, f, f2, f3, swipeDirection, z, z2);
            }
            View view2 = view;
            for (CardDecorationListener a2 : m42381a(view2)) {
                m42384a(a2, canvas, view2, viewGroup, f, f2, f3, swipeDirection, z, z2);
            }
        }

        public void onDecorationDrawOver(@NonNull Canvas canvas, @NonNull View view, @NonNull ViewGroup viewGroup, float f, float f2, float f3, @NonNull SwipeDirection swipeDirection, boolean z, boolean z2) {
            for (CardDecorationListener b : this.f34111a) {
                m42387b(b, canvas, view, viewGroup, f, f2, f3, swipeDirection, z, z2);
            }
            View view2 = view;
            for (CardDecorationListener b2 : m42381a(view2)) {
                m42387b(b2, canvas, view2, viewGroup, f, f2, f3, swipeDirection, z, z2);
            }
        }

        /* renamed from: a */
        private void m42382a(@NonNull View view, @NonNull CardDecorationListener cardDecorationListener) {
            if (!this.f34112b.containsKey(view)) {
                this.f34112b.put(view, new ArrayList(4));
            }
            ((List) this.f34112b.get(view)).add(cardDecorationListener);
        }

        /* renamed from: b */
        private void m42385b(@NonNull View view, @NonNull CardDecorationListener cardDecorationListener) {
            if (this.f34112b.containsKey(view)) {
                List list = (List) this.f34112b.get(view);
                list.remove(cardDecorationListener);
                if (list.isEmpty() != null) {
                    this.f34112b.remove(view);
                }
            }
        }

        /* renamed from: a */
        private List<CardDecorationListener> m42381a(@NonNull View view) {
            if (this.f34112b.containsKey(view)) {
                return Collections.unmodifiableList((List) this.f34112b.get(view));
            }
            return Collections.emptyList();
        }

        /* renamed from: a */
        private void m42384a(@NonNull CardDecorationListener cardDecorationListener, @NonNull Canvas canvas, @NonNull View view, @NonNull ViewGroup viewGroup, float f, float f2, float f3, @NonNull SwipeDirection swipeDirection, boolean z, boolean z2) {
            int save = canvas.save();
            cardDecorationListener.onDecorationDraw(canvas, view, viewGroup, f, f2, f3, swipeDirection, z, z2);
            canvas.restoreToCount(save);
        }

        /* renamed from: b */
        private void m42387b(@NonNull CardDecorationListener cardDecorationListener, @NonNull Canvas canvas, @NonNull View view, @NonNull ViewGroup viewGroup, float f, float f2, float f3, @NonNull SwipeDirection swipeDirection, boolean z, boolean z2) {
            int save = canvas.save();
            cardDecorationListener.onDecorationDrawOver(canvas, view, viewGroup, f, f2, f3, swipeDirection, z, z2);
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: com.tinder.cardstack.cardstack.CardStackSwipeHelper$a */
    private class C12647a extends C10495b {
        /* renamed from: a */
        final /* synthetic */ CardStackSwipeHelper f40783a;

        C12647a(CardStackSwipeHelper cardStackSwipeHelper, @NonNull CardAnimator cardAnimator) {
            this.f40783a = cardStackSwipeHelper;
            super(cardAnimator);
        }

        @Nullable
        /* renamed from: a */
        C8402e mo10994a() {
            return this.f40783a.f29773c.m42460b();
        }

        @Nullable
        /* renamed from: a */
        ViewHolder mo10993a(@NonNull View view) {
            return this.f40783a.f29772b.findContainingViewHolder(view);
        }

        @NonNull
        /* renamed from: b */
        RecyclerView mo10996b() {
            return this.f40783a.f29772b;
        }

        /* renamed from: a */
        void mo10995a(boolean z) {
            this.f40783a.f29773c.m42459a(z);
        }
    }

    /* renamed from: com.tinder.cardstack.cardstack.CardStackSwipeHelper$c */
    private class C12648c extends C10500a {
        /* renamed from: a */
        final /* synthetic */ CardStackSwipeHelper f40784a;

        C12648c(CardStackSwipeHelper cardStackSwipeHelper, @NonNull CardAnimator cardAnimator) {
            this.f40784a = cardStackSwipeHelper;
            super(cardAnimator);
        }

        @Nullable
        /* renamed from: a */
        protected C8402e mo10999a() {
            return this.f40784a.f29773c.m42460b();
        }

        /* renamed from: a */
        protected float mo10997a(@NonNull View view, float f, float f2) {
            return this.f40784a.f29774d.m35850a(view, f, f2);
        }

        @NonNull
        /* renamed from: a */
        protected SwipeDirection mo10998a(float f, float f2) {
            return this.f40784a.f29774d.m35855c(f, f2);
        }
    }

    /* renamed from: com.tinder.cardstack.cardstack.CardStackSwipeHelper$d */
    private class C12649d extends C10502c {
        /* renamed from: a */
        final /* synthetic */ CardStackSwipeHelper f40785a;

        C12649d(CardStackSwipeHelper cardStackSwipeHelper, @NonNull C8401d c8401d, @NonNull CardAnimator cardAnimator, C8397b c8397b) {
            this.f40785a = cardStackSwipeHelper;
            super(c8401d, cardAnimator, c8397b);
        }

        @NonNull
        /* renamed from: a */
        protected RecyclerView mo11000a() {
            return this.f40785a.f29772b;
        }
    }

    public CardStackSwipeHelper(@NonNull CardStackLayout cardStackLayout) {
        this.f29772b = cardStackLayout;
        C8397b c8397b = new C8397b();
        this.f29774d = new C8401d(cardStackLayout.getContext());
        this.f29773c = new C12649d(this, this.f29774d, this.f29775e, c8397b);
        this.f29779i = new C10494a(this.f29775e);
        ItemDecoration c12648c = new C12648c(this, this.f29775e);
        cardStackLayout.addItemDecoration(c12648c);
        cardStackLayout.addOnItemTouchListener(this.f29773c);
        cardStackLayout.setItemAnimator(this.f29779i);
        OnChildAttachStateChangePostLayoutListeners c12647a = new C12647a(this, this.f29775e);
        cardStackLayout.addOnChildAttachStateChangeListener(c12647a);
        cardStackLayout.m54034a(c12647a);
        this.f29776f = new C10487b();
        c12648c.m42438a(this.f29776f);
        this.f29777g = new C10493b(cardStackLayout, new C8393d(), this.f29774d);
        this.f29778h = new C10497d(cardStackLayout, this.f29774d);
    }

    /* renamed from: a */
    public void m35766a(@NonNull OnPreSwipeListener onPreSwipeListener) {
        this.f29773c.m42458a(onPreSwipeListener);
    }

    /* renamed from: a */
    public void m35765a(@NonNull View view, @NonNull CardDecorationListener cardDecorationListener) {
        this.f29776f.m42382a(view, cardDecorationListener);
    }

    /* renamed from: b */
    public void m35772b(@NonNull View view, @NonNull CardDecorationListener cardDecorationListener) {
        this.f29776f.m42385b(view, cardDecorationListener);
    }

    /* renamed from: a */
    public void m35768a(@NonNull OnCardPairStateChangeListener onCardPairStateChangeListener) {
        this.f29777g.m42405a(onCardPairStateChangeListener);
    }

    /* renamed from: b */
    public void m35773b(@NonNull OnCardPairStateChangeListener onCardPairStateChangeListener) {
        this.f29777g.m42406b(onCardPairStateChangeListener);
    }

    /* renamed from: a */
    public void m35767a(@NonNull CardRewindAnimationStateListener cardRewindAnimationStateListener) {
        this.f29779i.m42414a(cardRewindAnimationStateListener);
    }

    /* renamed from: a */
    public void m35764a() {
        this.f29779i.m42413a();
    }

    /* renamed from: b */
    public void m35771b() {
        C8402e b = this.f29773c.m42460b();
        if (b != null) {
            RecyclerView recyclerView = this.f29772b;
            this.f29775e.m35814a(b.m35856a(), recyclerView, b.m35860b());
            this.f29773c.m42459a(false);
        }
        this.f29775e.m35819d();
        this.f29772b.invalidate();
    }

    /* renamed from: c */
    public void m35774c() {
        this.f29775e.m35820e();
        this.f29772b.invalidate();
    }

    /* renamed from: d */
    public void m35775d() {
        this.f29775e.m35821f();
        this.f29772b.invalidate();
    }

    /* renamed from: e */
    public boolean m35776e() {
        boolean g = this.f29775e.m35822g();
        if (g) {
            this.f29773c.m42462c();
            this.f29772b.invalidate();
        }
        return g;
    }

    /* renamed from: a */
    public boolean m35770a(int i, int i2) {
        if (!this.f29775e.m35818c()) {
            return false;
        }
        i2 = (i2 + i) - 1;
        for (CardAnimation a : this.f29775e.m35816b()) {
            int adapterPosition = a.m35783a().getAdapterPosition();
            if (adapterPosition >= i && adapterPosition <= i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m35769a(@NonNull OnTopCardMovedListener onTopCardMovedListener) {
        this.f29778h.m42430a(onTopCardMovedListener);
    }
}
