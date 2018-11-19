package com.tinder.cardstack.cardstack;

import android.graphics.Canvas;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.cardstack.model.SwipeDirection;
import com.tinder.cardstack.swipe.C8401d;
import com.tinder.cardstack.view.CardDecorationListener;
import com.tinder.cardstack.view.CardStackLayout;
import com.tinder.cardstack.view.CardStackLayout.OnTopCardMovedListener;
import com.tinder.cardstack.view.OnChildAttachStateChangePostLayoutListeners;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p000a.p001a.C0001a;

/* renamed from: com.tinder.cardstack.cardstack.d */
class C10497d implements CardDecorationListener, OnChildAttachStateChangePostLayoutListeners {
    /* renamed from: a */
    private static final String f34139a = "d";
    @NonNull
    /* renamed from: b */
    private final CopyOnWriteArrayList<OnTopCardMovedListener> f34140b = new CopyOnWriteArrayList();
    @Nullable
    /* renamed from: c */
    private View f34141c;
    @NonNull
    /* renamed from: d */
    private final CardStackLayout f34142d;
    @NonNull
    /* renamed from: e */
    private final C8401d f34143e;
    /* renamed from: f */
    private float f34144f;
    /* renamed from: g */
    private float f34145g;
    /* renamed from: h */
    private float f34146h;

    public void onDecorationDraw(@NonNull Canvas canvas, @NonNull View view, @NonNull ViewGroup viewGroup, float f, float f2, float f3, @NonNull SwipeDirection swipeDirection, boolean z, boolean z2) {
    }

    C10497d(@NonNull CardStackLayout cardStackLayout, @NonNull C8401d c8401d) {
        this.f34142d = cardStackLayout;
        this.f34143e = c8401d;
        this.f34142d.m54034a((OnChildAttachStateChangePostLayoutListeners) this);
    }

    public void onChildViewAttachedPostLayout(View view) {
        m42425a(true);
    }

    public void onChildViewDetachedPostLayout(View view) {
        m42425a((boolean) null);
    }

    public void onDecorationDrawOver(@NonNull Canvas canvas, @NonNull View view, @NonNull ViewGroup viewGroup, float f, float f2, float f3, @NonNull SwipeDirection swipeDirection, boolean z, boolean z2) {
        if (this.f34141c != null) {
            if (view == this.f34141c) {
                if (this.f34144f == null && this.f34145g == null && this.f34146h == null && (this.f34144f != f || this.f34145g != f2 || this.f34146h != f3)) {
                    m42427b();
                } else if (f == 0.0f && f2 == 0.0f && f3 == 0.0f && (this.f34144f != f || this.f34145g != f2 || this.f34146h != f3)) {
                    m42429c(false);
                } else if (!(this.f34144f == f && this.f34145g == f2 && this.f34146h == f3)) {
                    m42423a(f, f2, f3, z2);
                }
                this.f34144f = f;
                this.f34145g = f2;
                this.f34146h = f3;
                return;
            }
        }
        C0001a.d("onDecorationDrawOver without a topCard", new Object[0]);
    }

    /* renamed from: a */
    void m42430a(@NonNull OnTopCardMovedListener onTopCardMovedListener) {
        this.f34140b.add(onTopCardMovedListener);
    }

    /* renamed from: a */
    private void m42424a(@NonNull View view) {
        this.f34142d.mo11330a(view, (CardDecorationListener) this);
    }

    /* renamed from: b */
    private void m42428b(@NonNull View view) {
        this.f34142d.mo11331b(view, this);
    }

    /* renamed from: a */
    private void m42425a(boolean z) {
        z = m42426b(z);
        if (this.f34141c != z) {
            if (this.f34141c != null) {
                m42428b(this.f34141c);
                m42429c(true);
                m42422a();
                this.f34141c = null;
            }
            if (z) {
                this.f34141c = z;
                m42424a(this.f34141c);
            }
        }
    }

    @Nullable
    /* renamed from: b */
    private View m42426b(boolean z) {
        int childCount = this.f34142d.getChildCount() - 1;
        View view = null;
        while (childCount >= 0) {
            View childAt = this.f34142d.getChildAt(childCount);
            if (!((LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                return (z && this.f34141c && view == this.f34141c) ? view : childAt;
            } else {
                childCount--;
                view = childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m42422a() {
        this.f34144f = 0.0f;
        this.f34145g = 0.0f;
        this.f34146h = 0.0f;
    }

    /* renamed from: b */
    private void m42427b() {
        Iterator it = this.f34140b.iterator();
        while (it.hasNext()) {
            ((OnTopCardMovedListener) it.next()).onTopCardMoveStarted();
        }
    }

    /* renamed from: c */
    private void m42429c(boolean z) {
        Iterator it = this.f34140b.iterator();
        while (it.hasNext()) {
            ((OnTopCardMovedListener) it.next()).onTopCardMoveEnded(z);
        }
    }

    /* renamed from: a */
    private void m42423a(float f, float f2, float f3, boolean z) {
        SwipeDirection c = this.f34143e.m35855c(f, f2);
        Iterator it = this.f34140b.iterator();
        while (it.hasNext()) {
            ((OnTopCardMovedListener) it.next()).onTopCardMoved(f, f2, f3, this.f34141c, c, z);
        }
    }
}
