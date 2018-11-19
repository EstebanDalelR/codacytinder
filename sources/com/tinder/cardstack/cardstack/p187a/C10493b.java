package com.tinder.cardstack.cardstack.p187a;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.view.View;
import com.tinder.cardstack.swipe.C8401d;
import com.tinder.cardstack.view.CardStackLayout;
import com.tinder.cardstack.view.CardStackLayout.OnCardPairStateChangeListener;
import com.tinder.cardstack.view.OnChildAttachStateChangePostLayoutListeners;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tinder.cardstack.cardstack.a.b */
public class C10493b implements OnChildAttachStateChangePostLayoutListeners {
    /* renamed from: a */
    private static final String f34125a = "b";
    @NonNull
    /* renamed from: b */
    private final CardStackLayout f34126b;
    @NonNull
    /* renamed from: c */
    private final C8401d f34127c;
    @NonNull
    /* renamed from: d */
    private final List<C10492a> f34128d = new ArrayList();
    @NonNull
    /* renamed from: e */
    private final C8393d f34129e;
    @NonNull
    /* renamed from: f */
    private final List<OnCardPairStateChangeListener> f34130f = new ArrayList();

    public C10493b(@NonNull CardStackLayout cardStackLayout, @NonNull C8393d c8393d, @NonNull C8401d c8401d) {
        this.f34126b = cardStackLayout;
        this.f34129e = c8393d;
        this.f34127c = c8401d;
        cardStackLayout.m54034a((OnChildAttachStateChangePostLayoutListeners) this);
    }

    public void onChildViewAttachedPostLayout(@NonNull View view) {
        int indexOfChild = this.f34126b.indexOfChild(view);
        View childAt = this.f34126b.getChildAt(indexOfChild + 1);
        View childAt2 = this.f34126b.getChildAt(indexOfChild - 1);
        if (childAt != null) {
            m42396a(childAt);
            m42397a(childAt, view);
        }
        if (childAt2 != null && !m42404e(childAt2).isItemRemoved()) {
            m42399b(childAt2);
            m42397a(view, childAt2);
        }
    }

    public void onChildViewDetachedPostLayout(@NonNull View view) {
        m42401c(view);
        m42403d(view);
    }

    /* renamed from: a */
    public void m42405a(@NonNull OnCardPairStateChangeListener onCardPairStateChangeListener) {
        this.f34130f.add(onCardPairStateChangeListener);
    }

    /* renamed from: b */
    public void m42406b(@NonNull OnCardPairStateChangeListener onCardPairStateChangeListener) {
        this.f34130f.remove(onCardPairStateChangeListener);
    }

    /* renamed from: a */
    private void m42397a(@NonNull View view, @NonNull View view2) {
        C10492a c10492a = new C10492a(view2, view, this.f34126b, this.f34127c, this.f34129e);
        this.f34128d.add(c10492a);
        m42400b(c10492a);
    }

    /* renamed from: a */
    private void m42396a(@NonNull View view) {
        Iterator it = this.f34128d.iterator();
        while (it.hasNext()) {
            C10492a c10492a = (C10492a) it.next();
            if (c10492a.m42394b() == view) {
                m42398a(c10492a);
                it.remove();
            }
        }
    }

    /* renamed from: b */
    private void m42399b(@NonNull View view) {
        Iterator it = this.f34128d.iterator();
        while (it.hasNext()) {
            C10492a c10492a = (C10492a) it.next();
            if (c10492a.m42393a() == view) {
                m42398a(c10492a);
                it.remove();
            }
        }
    }

    /* renamed from: c */
    private void m42401c(@NonNull View view) {
        Iterator it = this.f34128d.iterator();
        while (it.hasNext()) {
            C10492a c10492a = (C10492a) it.next();
            if (c10492a.m42393a() == view || c10492a.m42394b() == view) {
                it.remove();
                m42398a(c10492a);
            }
        }
    }

    /* renamed from: a */
    private void m42398a(@NonNull C10492a c10492a) {
        m42402c(c10492a);
        c10492a.m42395c();
    }

    /* renamed from: b */
    private void m42400b(@NonNull C10492a c10492a) {
        for (OnCardPairStateChangeListener onPairCreated : this.f34130f) {
            onPairCreated.onPairCreated(c10492a.m42394b(), c10492a.m42393a());
        }
    }

    /* renamed from: c */
    private void m42402c(@NonNull C10492a c10492a) {
        for (OnCardPairStateChangeListener onPairDestroyed : this.f34130f) {
            onPairDestroyed.onPairDestroyed(c10492a.m42394b(), c10492a.m42393a());
        }
    }

    /* renamed from: d */
    private void m42403d(@NonNull View view) {
        C8392c a = this.f34129e.m35777a(3);
        ViewCompat.g(view, a.f29780a);
        ViewCompat.h(view, a.f29780a);
        ViewCompat.b(view, 0.0f);
        ViewCompat.a(view, 0.0f);
        ViewCompat.j(view, a.f29782c);
        ViewCompat.d(view, 0.0f);
        ViewCompat.f(view, 0.0f);
        ViewCompat.e(view, 0.0f);
    }

    /* renamed from: e */
    private LayoutParams m42404e(@NonNull View view) {
        return (LayoutParams) view.getLayoutParams();
    }
}
