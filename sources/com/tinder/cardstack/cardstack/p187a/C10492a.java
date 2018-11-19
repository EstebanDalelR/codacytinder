package com.tinder.cardstack.cardstack.p187a;

import android.graphics.Canvas;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.cardstack.model.SwipeDirection;
import com.tinder.cardstack.swipe.C8401d;
import com.tinder.cardstack.view.CardDecorationListener;
import com.tinder.cardstack.view.CardStackLayout;
import p000a.p001a.C0001a;

/* renamed from: com.tinder.cardstack.cardstack.a.a */
class C10492a implements CardDecorationListener {
    /* renamed from: a */
    private static final String f34119a = "a";
    @NonNull
    /* renamed from: b */
    private final View f34120b;
    @NonNull
    /* renamed from: c */
    private final View f34121c;
    @NonNull
    /* renamed from: d */
    private final CardStackLayout f34122d;
    @NonNull
    /* renamed from: e */
    private final C8401d f34123e;
    @NonNull
    /* renamed from: f */
    private final C8393d f34124f;

    /* renamed from: a */
    private static float m42388a(float f, float f2, float f3, float f4, float f5) {
        return (((f5 - f3) / (f4 - f2)) * (f - f2)) + f3;
    }

    public void onDecorationDrawOver(@NonNull Canvas canvas, @NonNull View view, @NonNull ViewGroup viewGroup, float f, float f2, float f3, @NonNull SwipeDirection swipeDirection, boolean z, boolean z2) {
    }

    C10492a(@NonNull View view, @NonNull View view2, @NonNull CardStackLayout cardStackLayout, @NonNull C8401d c8401d, @NonNull C8393d c8393d) {
        this.f34120b = view;
        this.f34121c = view2;
        this.f34122d = cardStackLayout;
        this.f34123e = c8401d;
        this.f34124f = c8393d;
        cardStackLayout.mo11330a(view2, (CardDecorationListener) this);
        view = cardStackLayout.indexOfChild(this.f34121c);
        view2 = cardStackLayout.getChildCount();
        cardStackLayout = true;
        if (view == view2 - 1) {
            cardStackLayout = null;
        }
        view = cardStackLayout + 1;
        m42391a(this.f34121c, c8393d.m35777a(cardStackLayout));
        m42391a(this.f34120b, c8393d.m35777a(view));
    }

    @NonNull
    /* renamed from: a */
    View m42393a() {
        return this.f34120b;
    }

    @NonNull
    /* renamed from: b */
    View m42394b() {
        return this.f34121c;
    }

    public void onDecorationDraw(@NonNull Canvas canvas, @NonNull View view, @NonNull ViewGroup viewGroup, float f, float f2, float f3, @NonNull SwipeDirection swipeDirection, boolean z, boolean z2) {
        float min = (float) Math.min(0.0f, Math.sqrt(Math.pow((double) f, 2.0d) + Math.pow((double) f2, 2.0d)) / ((double) this.f34123e.m35848a()));
        m42392a(viewGroup);
        m42389a(min);
        view = this.f34124f.m35777a(1);
        viewGroup = C10492a.m42388a(min, 0.0f, view.f29780a, 1.0f, view.f29781b);
        canvas = C10492a.m42388a(min, 0.0f, view.f29782c, 1.0f, view.f29783d);
        ViewCompat.g(this.f34120b, viewGroup);
        ViewCompat.h(this.f34120b, viewGroup);
        ViewCompat.j(this.f34120b, canvas);
    }

    /* renamed from: c */
    void m42395c() {
        this.f34122d.mo11331b(this.f34121c, this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[low=");
        stringBuilder.append(m42393a().hashCode());
        stringBuilder.append(", high=");
        stringBuilder.append(m42394b().hashCode());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private void m42389a(float f) {
        C8392c a = this.f34124f.m35777a(0);
        ViewCompat.j(this.f34121c, C10492a.m42388a(f, 0.0f, a.f29782c, 1.0f, a.f29783d));
    }

    /* renamed from: a */
    private void m42391a(@NonNull View view, @NonNull C8392c c8392c) {
        m42390a(view, c8392c.f29780a, c8392c.f29780a, c8392c.f29782c);
    }

    /* renamed from: a */
    private void m42390a(@NonNull View view, float f, float f2, float f3) {
        ViewCompat.g(view, f);
        ViewCompat.h(view, f2);
        ViewCompat.j(view, f3);
    }

    /* renamed from: a */
    private void m42392a(@NonNull ViewGroup viewGroup) {
        LayoutParams layoutParams = (LayoutParams) this.f34121c.getLayoutParams();
        if (!(viewGroup.indexOfChild(this.f34120b) > 0 || viewGroup.indexOfChild(this.f34121c) == 1 || viewGroup.indexOfChild(this.f34120b) == 0)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid index:: check Implementation::high=");
            stringBuilder.append(viewGroup.indexOfChild(this.f34121c));
            stringBuilder.append("::low=");
            stringBuilder.append(viewGroup.indexOfChild(this.f34120b));
            stringBuilder.append("::h=");
            stringBuilder.append(this.f34121c.hashCode());
            stringBuilder.append("::l=");
            stringBuilder.append(this.f34120b.hashCode());
            C0001a.d(stringBuilder.toString(), new Object[0]);
        }
        if (layoutParams.isItemRemoved() && viewGroup.indexOfChild(this.f34120b) < 0) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("::high=");
            stringBuilder2.append(viewGroup.indexOfChild(this.f34121c));
            stringBuilder2.append("::low=");
            stringBuilder2.append(viewGroup.indexOfChild(this.f34120b));
            stringBuilder2.append("::childcount=");
            stringBuilder2.append(viewGroup.getChildCount());
            stringBuilder2.append("::h=");
            stringBuilder2.append(this.f34121c.hashCode());
            stringBuilder2.append("::l=");
            stringBuilder2.append(this.f34120b.hashCode());
            C0001a.d(stringBuilder2.toString(), new Object[0]);
        }
    }
}
