package com.tinder.cardstack.swipe;

import android.graphics.Canvas;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.State;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.cardstack.cardstack.C10498f;
import com.tinder.cardstack.model.SwipeDirection;
import com.tinder.cardstack.swipe.CardAnimation.AnimationType;
import com.tinder.cardstack.view.CardDecorationListener;
import java.util.Iterator;

/* renamed from: com.tinder.cardstack.swipe.a */
public abstract class C10500a extends ItemDecoration {
    /* renamed from: a */
    private static CardDecorationListener f34147a = new C104991();
    @NonNull
    /* renamed from: b */
    private final CardAnimator f34148b;
    @NonNull
    /* renamed from: c */
    private CardDecorationListener f34149c = f34147a;

    /* renamed from: com.tinder.cardstack.swipe.a$1 */
    static class C104991 implements CardDecorationListener {
        public void onDecorationDraw(@NonNull Canvas canvas, @NonNull View view, @NonNull ViewGroup viewGroup, float f, float f2, float f3, @NonNull SwipeDirection swipeDirection, boolean z, boolean z2) {
        }

        public void onDecorationDrawOver(@NonNull Canvas canvas, @NonNull View view, @NonNull ViewGroup viewGroup, float f, float f2, float f3, @NonNull SwipeDirection swipeDirection, boolean z, boolean z2) {
        }

        C104991() {
        }
    }

    /* renamed from: a */
    protected abstract float mo10997a(@NonNull View view, float f, float f2);

    @NonNull
    /* renamed from: a */
    protected abstract SwipeDirection mo10998a(float f, float f2);

    @Nullable
    /* renamed from: a */
    protected abstract C8402e mo10999a();

    public C10500a(@NonNull CardAnimator cardAnimator) {
        this.f34148b = cardAnimator;
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, State state) {
        super.onDraw(canvas, recyclerView, state);
        for (CardAnimation cardAnimation : this.f34148b.m35813a()) {
            cardAnimation.m35807s();
            if (cardAnimation.m35797i() == AnimationType.RECOVER) {
                float p;
                View view = cardAnimation.m35783a().itemView;
                if (cardAnimation.m35805q()) {
                    p = cardAnimation.m35804p();
                } else {
                    p = mo10997a(view, cardAnimation.m35795g(), cardAnimation.m35789b().y);
                }
                m42431a(canvas, view, recyclerView, cardAnimation.m35795g(), cardAnimation.m35796h(), p, true, false);
            } else if (cardAnimation instanceof C10498f) {
                m42431a(canvas, cardAnimation.m35783a().itemView, recyclerView, cardAnimation.m35795g(), cardAnimation.m35796h(), ((C10498f) cardAnimation).m35804p(), false, false);
            } else {
                m42432a(canvas, cardAnimation.m35783a().itemView, recyclerView, cardAnimation.m35795g(), cardAnimation.m35796h(), false, false);
            }
            if (cardAnimation.m35805q() && !cardAnimation.m35806r()) {
                cardAnimation.m35790b(false);
            }
        }
        state = mo10999a();
        if (state != null) {
            View view2 = state.m35856a().itemView;
            Canvas canvas2 = canvas;
            RecyclerView recyclerView2 = recyclerView;
            m42431a(canvas2, view2, recyclerView2, state.m35862c(), state.m35863d(), mo10997a(view2, state.m35862c(), state.m35860b().y), false, true);
        }
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, State state) {
        super.onDrawOver(canvas, recyclerView, state);
        Iterator it = this.f34148b.m35813a().iterator();
        CardAnimation cardAnimation;
        do {
            Object obj = 1;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            cardAnimation = (CardAnimation) it.next();
            View view = cardAnimation.m35783a().itemView;
            m42434b(canvas, view, recyclerView, ViewCompat.i(view), ViewCompat.j(view), ViewCompat.n(view), cardAnimation.m35797i() == AnimationType.RECOVER, false);
        } while (!cardAnimation.m35806r());
        C8402e a = mo10999a();
        if (a != null) {
            view = a.m35856a().itemView;
            m42434b(canvas, view, recyclerView, ViewCompat.i(view), ViewCompat.j(view), mo10997a(view, a.m35862c(), a.m35860b().y), false, true);
        }
        if (obj != null) {
            recyclerView.invalidate();
        }
    }

    /* renamed from: a */
    public void m42438a(@NonNull CardDecorationListener cardDecorationListener) {
        this.f34149c = cardDecorationListener;
    }

    /* renamed from: a */
    private void m42432a(@NonNull Canvas canvas, @NonNull View view, @NonNull RecyclerView recyclerView, float f, float f2, boolean z, boolean z2) {
        View view2 = view;
        float f3 = f;
        ViewCompat.a(view2, f3);
        float f4 = f2;
        ViewCompat.b(view2, f4);
        m42433a(canvas, view2, (ViewGroup) recyclerView, f3, f4, ViewCompat.n(view2), z, z2);
    }

    /* renamed from: a */
    private void m42431a(@NonNull Canvas canvas, @NonNull View view, @NonNull RecyclerView recyclerView, float f, float f2, float f3, boolean z, boolean z2) {
        ViewCompat.a(view, f);
        ViewCompat.b(view, f2);
        ViewCompat.d(view, f3);
        m42433a(canvas, view, (ViewGroup) recyclerView, f, f2, f3, z, z2);
    }

    /* renamed from: a */
    private void m42433a(@NonNull Canvas canvas, @NonNull View view, @NonNull ViewGroup viewGroup, float f, float f2, float f3, boolean z, boolean z2) {
        float f4 = f;
        float f5 = f2;
        this.f34149c.onDecorationDraw(canvas, view, viewGroup, f4, f5, f3, mo10998a(f4, f5), z, z2);
    }

    /* renamed from: b */
    private void m42434b(@NonNull Canvas canvas, @NonNull View view, @NonNull ViewGroup viewGroup, float f, float f2, float f3, boolean z, boolean z2) {
        float f4 = f;
        float f5 = f2;
        this.f34149c.onDecorationDrawOver(canvas, view, viewGroup, f4, f5, f3, mo10998a(f4, f5), z, z2);
    }
}
