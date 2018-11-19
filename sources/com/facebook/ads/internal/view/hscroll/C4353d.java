package com.facebook.ads.internal.view.hscroll;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.facebook.ads.internal.view.hscroll.d */
public class C4353d extends RecyclerView implements OnTouchListener {
    /* renamed from: a */
    protected final int f14282a = m17748a();
    /* renamed from: b */
    protected int f14283b = 0;
    /* renamed from: c */
    private int f14284c = 0;
    /* renamed from: d */
    private boolean f14285d = true;
    /* renamed from: e */
    private boolean f14286e = false;
    /* renamed from: f */
    private LinearLayoutManager f14287f;
    /* renamed from: g */
    private C1610a f14288g;

    /* renamed from: com.facebook.ads.internal.view.hscroll.d$a */
    public interface C1610a {
        /* renamed from: a */
        int mo3973a(int i);
    }

    public C4353d(Context context) {
        super(context);
        setOnTouchListener(this);
    }

    public C4353d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnTouchListener(this);
    }

    public C4353d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOnTouchListener(this);
    }

    /* renamed from: a */
    private int m17748a() {
        return ((int) getContext().getResources().getDisplayMetrics().density) * 10;
    }

    /* renamed from: a */
    private int mo3973a(int i) {
        int i2 = this.f14284c - i;
        i = this.f14288g.mo3973a(i2);
        return i2 > this.f14282a ? m17750a(this.f14283b, i) : i2 < (-this.f14282a) ? m17751b(this.f14283b, i) : this.f14283b;
    }

    /* renamed from: a */
    private int m17750a(int i, int i2) {
        return Math.min(i + i2, getItemCount() - 1);
    }

    /* renamed from: b */
    private int m17751b(int i, int i2) {
        return Math.max(i - i2, 0);
    }

    private int getItemCount() {
        return getAdapter() == null ? 0 : getAdapter().getItemCount();
    }

    /* renamed from: a */
    protected void mo3974a(int i, boolean z) {
        if (getAdapter() != null) {
            this.f14283b = i;
            if (z) {
                smoothScrollToPosition(i);
            } else {
                scrollToPosition(i);
            }
        }
    }

    public int getCurrentPosition() {
        return this.f14283b;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int rawX = (int) motionEvent.getRawX();
        int actionMasked = motionEvent.getActionMasked();
        if (!(actionMasked == 1 || actionMasked == 6 || actionMasked == 3)) {
            if (actionMasked != 4) {
                if (actionMasked == 0 || actionMasked == 5 || (this.f14285d && actionMasked == 2)) {
                    this.f14284c = rawX;
                    if (this.f14285d) {
                        this.f14285d = false;
                    }
                    this.f14286e = true;
                }
                return false;
            }
        }
        if (this.f14286e) {
            mo3974a(mo3973a(rawX), true);
        }
        this.f14285d = true;
        this.f14286e = false;
        return true;
    }

    public void setLayoutManager(LayoutManager layoutManager) {
        if (layoutManager instanceof LinearLayoutManager) {
            super.setLayoutManager(layoutManager);
            this.f14287f = (LinearLayoutManager) layoutManager;
            return;
        }
        throw new IllegalArgumentException("SnapRecyclerView only supports LinearLayoutManager");
    }

    public void setSnapDelegate(C1610a c1610a) {
        this.f14288g = c1610a;
    }
}
