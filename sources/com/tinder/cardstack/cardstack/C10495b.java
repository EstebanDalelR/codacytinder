package com.tinder.cardstack.cardstack;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import com.tinder.cardstack.swipe.C8402e;
import com.tinder.cardstack.swipe.CardAnimation;
import com.tinder.cardstack.swipe.CardAnimator;
import com.tinder.cardstack.view.OnChildAttachStateChangePostLayoutListeners;

/* renamed from: com.tinder.cardstack.cardstack.b */
abstract class C10495b implements OnChildAttachStateChangeListener, OnChildAttachStateChangePostLayoutListeners {
    /* renamed from: a */
    private static final String f34136a = "b";
    @NonNull
    /* renamed from: b */
    private final CardAnimator f34137b;

    @Nullable
    /* renamed from: a */
    abstract ViewHolder mo10993a(@NonNull View view);

    @Nullable
    /* renamed from: a */
    abstract C8402e mo10994a();

    /* renamed from: a */
    abstract void mo10995a(boolean z);

    @NonNull
    /* renamed from: b */
    abstract RecyclerView mo10996b();

    public void onChildViewAttachedToWindow(View view) {
    }

    public void onChildViewDetachedPostLayout(View view) {
    }

    C10495b(@NonNull CardAnimator cardAnimator) {
        this.f34137b = cardAnimator;
    }

    public void onChildViewDetachedFromWindow(View view) {
        ViewHolder a = mo10993a(view);
        if (a == null) {
            CardAnimation a2 = this.f34137b.m35812a(view);
            if (a2 != null) {
                a = a2.m35783a();
            }
        }
        if (a != null) {
            C8402e a3 = mo10994a();
            if (a3 == null || a3.m35856a().itemView != view) {
                this.f34137b.m35817b(a);
            } else {
                mo10995a(true);
            }
        }
    }

    public void onChildViewAttachedPostLayout(View view) {
        C8402e a = mo10994a();
        if (a != null && !m42416a(a)) {
            if (!m42417b(a.m35856a().itemView)) {
                m42415a(a, mo10996b());
            }
            mo10995a((boolean) null);
        }
    }

    /* renamed from: b */
    private boolean m42417b(@NonNull View view) {
        boolean z = true;
        if (((LayoutParams) view.getLayoutParams()).isItemRemoved()) {
            return true;
        }
        view = this.f34137b.m35812a(view);
        if (view == null || view.m35802n() == null) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private boolean m42416a(@NonNull C8402e c8402e) {
        RecyclerView b = mo10996b();
        boolean z = true;
        int childCount = b.getChildCount() - 1;
        while (childCount >= 0) {
            View childAt = b.getChildAt(childCount);
            if (((LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                childCount--;
            } else {
                if (childAt != c8402e.m35856a().itemView) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m42415a(@NonNull C8402e c8402e, @NonNull RecyclerView recyclerView) {
        this.f34137b.m35814a(c8402e.m35856a(), recyclerView, c8402e.m35860b());
    }
}
