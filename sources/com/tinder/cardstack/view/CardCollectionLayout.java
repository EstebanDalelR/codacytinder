package com.tinder.cardstack.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.util.AttributeSet;
import android.view.View;
import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.p180a.C8361a;
import com.tinder.cardstack.view.CardViewHolder.Factory;
import java.util.List;
import p000a.p001a.C0001a;

public abstract class CardCollectionLayout extends RecyclerView {
    /* renamed from: a */
    private C10507a f43514a;

    /* renamed from: a */
    protected abstract void mo11333a(int i, int i2);

    /* renamed from: a */
    public abstract void mo11330a(@NonNull View view, @NonNull CardDecorationListener cardDecorationListener);

    /* renamed from: b */
    public abstract void mo11331b(@NonNull View view, @NonNull CardDecorationListener cardDecorationListener);

    public abstract void setOnPreSwipeListener(@NonNull OnPreSwipeListener onPreSwipeListener);

    public CardCollectionLayout(Context context) {
        this(context, null);
    }

    public CardCollectionLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setAdapterInternal(new C10507a());
    }

    @NonNull
    public C10507a getAdapter() {
        return (C10507a) super.getAdapter();
    }

    public void setAdapter(@NonNull Adapter adapter) {
        if (adapter instanceof C10507a) {
            setAdapterInternal((C10507a) adapter);
            return;
        }
        throw new IllegalArgumentException("CardCollectionLayout only supports CardViewAdapter");
    }

    private void setAdapterInternal(C10507a c10507a) {
        this.f43514a = c10507a;
        super.setAdapter(c10507a);
    }

    public void setCardStackViewHolderFactory(Factory<CardViewHolder<C8395a>, C8395a> factory) {
        this.f43514a.m42470a((Factory) factory);
    }

    /* renamed from: a */
    public void m53199a(int i, @NonNull List<C8395a> list) {
        if (m53192a(i)) {
            mo11333a(i, list.size());
            this.f43514a.m42469a(i, (List) list);
            return;
        }
        m53195d(i);
    }

    /* renamed from: a */
    public void m53198a(int i, @NonNull C8395a c8395a) {
        if (m53192a(i)) {
            mo11333a(i, 1);
            this.f43514a.m42468a(i, c8395a);
            return;
        }
        m53195d(i);
    }

    /* renamed from: a */
    public void m53197a(int i, @Nullable C8361a c8361a) {
        if (m53193b(i)) {
            this.f43514a.m42467a(i).setDisappearingAnimation(c8361a);
            this.f43514a.m42471b(i);
            return;
        }
        m53194c(i);
    }

    /* renamed from: a */
    public void m53201a(@NonNull List<C8395a> list) {
        m53204e();
        m53199a(0, (List) list);
    }

    /* renamed from: d */
    public void m53203d() {
        this.f43514a.notifyItemChanged(0);
    }

    /* renamed from: e */
    public void m53204e() {
        this.f43514a.m42474f();
    }

    @Nullable
    /* renamed from: f */
    public C8395a m53205f() {
        return this.f43514a.m42472d();
    }

    /* renamed from: a */
    private boolean m53192a(int i) {
        return i >= 0 && i <= this.f43514a.getItemCount();
    }

    /* renamed from: b */
    private boolean m53193b(int i) {
        return i >= 0 && i < this.f43514a.getItemCount();
    }

    /* renamed from: c */
    private void m53194c(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Removing card from invalid position, position:");
        stringBuilder.append(i);
        stringBuilder.append(", itemCount:");
        stringBuilder.append(this.f43514a.getItemCount());
        C0001a.f(stringBuilder.toString(), new Object[0]);
    }

    /* renamed from: d */
    private void m53195d(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Inserting card at invalid position, position:");
        stringBuilder.append(i);
        stringBuilder.append(", itemCount:");
        stringBuilder.append(this.f43514a.getItemCount());
        C0001a.f(stringBuilder.toString(), new Object[0]);
    }
}
