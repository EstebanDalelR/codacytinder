package com.tinder.listeners;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;

/* renamed from: com.tinder.listeners.a */
public abstract class C11895a extends OnScrollListener {
    /* renamed from: a */
    public static String f38785a = "a";
    /* renamed from: b */
    private int f38786b = 0;
    /* renamed from: c */
    private boolean f38787c = true;
    /* renamed from: d */
    private int f38788d;
    /* renamed from: e */
    private int f38789e;
    /* renamed from: f */
    private int f38790f;
    /* renamed from: g */
    private int f38791g = 1;
    /* renamed from: h */
    private LinearLayoutManager f38792h;

    /* renamed from: a */
    public abstract void m47900a(int i);

    public C11895a(LinearLayoutManager linearLayoutManager) {
        this.f38792h = linearLayoutManager;
    }

    /* renamed from: a */
    public void m47899a() {
        this.f38786b = 0;
        this.f38791g = 1;
        this.f38787c = true;
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        super.onScrolled(recyclerView, i, i2);
        this.f38789e = recyclerView.getChildCount();
        this.f38790f = this.f38792h.getItemCount();
        this.f38788d = this.f38792h.findFirstVisibleItemPosition();
        if (this.f38787c != null) {
            if (this.f38790f > this.f38786b) {
                this.f38787c = null;
                this.f38786b = this.f38790f;
            }
        } else if (this.f38790f - this.f38789e <= this.f38788d + 5) {
            this.f38791g += 1;
            m47900a(this.f38791g);
            this.f38787c = true;
        }
    }
}
