package com.tinder.cardstack.swipe;

import android.graphics.PointF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import com.tinder.cardstack.swipe.CardAnimation.AnimationType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000a.p001a.C0001a;

public class CardAnimator {
    /* renamed from: a */
    private static final String f29808a = "CardAnimator";
    /* renamed from: b */
    private State f29809b = State.ACTIVE;
    @NonNull
    /* renamed from: c */
    private List<CardAnimation> f29810c = new ArrayList();
    @NonNull
    /* renamed from: d */
    private List<CardAnimation> f29811d = new ArrayList();

    private enum State {
        PAUSED,
        ACTIVE
    }

    @NonNull
    /* renamed from: a */
    List<CardAnimation> m35813a() {
        return Collections.unmodifiableList(this.f29810c);
    }

    /* renamed from: b */
    public List<CardAnimation> m35816b() {
        return Collections.unmodifiableList(this.f29811d);
    }

    /* renamed from: a */
    public void m35815a(@NonNull CardAnimation cardAnimation) {
        if (this.f29809b == State.PAUSED) {
            cardAnimation = new StringBuilder();
            cardAnimation.append("addActiveAnimation called in paused state::");
            cardAnimation.append(this.f29809b);
            C0001a.d(cardAnimation.toString(), new Object[0]);
        } else if (m35811a(cardAnimation.m35783a()) != null) {
            C0001a.d("Animation already exists for a view::Check implementation", new Object[0]);
        } else {
            this.f29810c.add(cardAnimation);
        }
    }

    /* renamed from: c */
    public boolean m35818c() {
        return this.f29809b == State.PAUSED;
    }

    @Nullable
    /* renamed from: a */
    public CardAnimation m35812a(@Nullable View view) {
        for (CardAnimation cardAnimation : this.f29810c) {
            if (cardAnimation.m35783a().itemView == view) {
                return cardAnimation;
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: a */
    public CardAnimation m35811a(@NonNull ViewHolder viewHolder) {
        for (CardAnimation cardAnimation : this.f29810c) {
            if (cardAnimation.m35783a().itemView == viewHolder.itemView) {
                return cardAnimation;
            }
        }
        return null;
    }

    /* renamed from: b */
    public void m35817b(@NonNull ViewHolder viewHolder) {
        Iterator it = this.f29810c.iterator();
        while (it.hasNext()) {
            CardAnimation cardAnimation = (CardAnimation) it.next();
            if (cardAnimation.m35783a() == viewHolder) {
                it.remove();
                if (cardAnimation.m35806r()) {
                    cardAnimation.m35800l();
                }
            }
        }
        it = this.f29811d.iterator();
        while (it.hasNext()) {
            cardAnimation = (CardAnimation) it.next();
            if (cardAnimation.m35783a() == viewHolder) {
                it.remove();
                cardAnimation.m35800l();
            }
        }
    }

    /* renamed from: a */
    public void m35814a(@NonNull ViewHolder viewHolder, @NonNull RecyclerView recyclerView, @NonNull PointF pointF) {
        View view = viewHolder.itemView;
        ViewHolder viewHolder2 = viewHolder;
        CardAnimation cardAnimation = new CardAnimation(viewHolder2, AnimationType.RECOVER, pointF, ViewCompat.i(view), ViewCompat.j(view), 0.0f, 0.0f);
        m35815a(cardAnimation);
        cardAnimation.m35799k();
        recyclerView.invalidate();
    }

    /* renamed from: d */
    public void m35819d() {
        if (this.f29809b == State.PAUSED) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pauseAnimations called in Paused State::");
            stringBuilder.append(this.f29809b);
            C0001a.d(stringBuilder.toString(), new Object[0]);
            return;
        }
        this.f29809b = State.PAUSED;
        Iterator it = this.f29810c.iterator();
        while (it.hasNext()) {
            CardAnimation cardAnimation = (CardAnimation) it.next();
            if (!cardAnimation.m35802n()) {
                CardAnimation m = cardAnimation.m35801m();
                it.remove();
                if (cardAnimation.m35806r()) {
                    cardAnimation.m35800l();
                }
                m35808b(m);
            }
        }
    }

    /* renamed from: e */
    public void m35820e() {
        if (this.f29809b != State.PAUSED) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Called resumePausedAnimations in Active state:");
            stringBuilder.append(this.f29809b);
            C0001a.d(stringBuilder.toString(), new Object[0]);
            return;
        }
        this.f29809b = State.ACTIVE;
        for (CardAnimation cardAnimation : this.f29811d) {
            m35815a(cardAnimation);
            cardAnimation.m35799k();
        }
        m35810i();
    }

    /* renamed from: f */
    public void m35821f() {
        if (this.f29809b != State.PAUSED) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Called revertPausedAnimations in when not in paused state:");
            stringBuilder.append(this.f29809b);
            C0001a.d(stringBuilder.toString(), new Object[0]);
            return;
        }
        this.f29809b = State.ACTIVE;
        for (CardAnimation cardAnimation : this.f29811d) {
            float c = cardAnimation.m35791c();
            float d = cardAnimation.m35792d();
            double pow = Math.pow((double) c, 2.0d) + Math.pow((double) d, 2.0d);
            long o = (long) ((((double) cardAnimation.m35803o()) * Math.sqrt(pow)) / Math.sqrt(Math.pow((double) (c - cardAnimation.m35793e()), 2.0d) + Math.pow((double) (d - cardAnimation.m35794f()), 2.0d)));
            CardAnimation cardAnimation2 = new CardAnimation(cardAnimation.m35783a(), AnimationType.RECOVER, cardAnimation.m35789b(), c, d, 0.0f, 0.0f);
            cardAnimation2.m35784a(o);
            m35815a(cardAnimation2);
            cardAnimation2.m35799k();
        }
        m35810i();
    }

    /* renamed from: g */
    public boolean m35822g() {
        CardAnimation h = m35809h();
        if (h == null) {
            return false;
        }
        View view = h.m35783a().itemView;
        PointF b = h.m35789b();
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (translationX == 0.0f && translationY == 0.0f) {
            return false;
        }
        ViewHolder a = h.m35783a();
        m35817b(a);
        CardAnimation cardAnimation = new CardAnimation(a, AnimationType.RECOVER, b, translationX, translationY, 0.0f, 0.0f);
        m35815a(cardAnimation);
        cardAnimation.m35799k();
        return true;
    }

    @Nullable
    /* renamed from: h */
    private CardAnimation m35809h() {
        CardAnimation cardAnimation = null;
        for (CardAnimation cardAnimation2 : this.f29810c) {
            if (cardAnimation2.m35783a().getAdapterPosition() != -1) {
                if (!cardAnimation2.m35802n()) {
                    if (cardAnimation == null || cardAnimation2.m35783a().getAdapterPosition() < cardAnimation.m35783a().getAdapterPosition()) {
                        cardAnimation = cardAnimation2;
                    }
                }
            }
        }
        return cardAnimation;
    }

    /* renamed from: b */
    private void m35808b(@NonNull CardAnimation cardAnimation) {
        if (this.f29809b != State.PAUSED) {
            cardAnimation = new StringBuilder();
            cardAnimation.append("addPausedAnimation called in Active state::");
            cardAnimation.append(this.f29809b);
            C0001a.d(cardAnimation.toString(), new Object[0]);
            return;
        }
        this.f29811d.add(cardAnimation);
    }

    /* renamed from: i */
    private void m35810i() {
        this.f29811d.clear();
    }
}
