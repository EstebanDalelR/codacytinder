package com.tinder.cardstack.view;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.ViewGroup;
import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.view.CardViewHolder.Factory;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tinder.cardstack.view.a */
public class C10507a extends Adapter {
    /* renamed from: a */
    private final List<C8395a> f34164a = new ArrayList();
    /* renamed from: b */
    private Factory<CardViewHolder<C8395a>, C8395a> f34165b;

    public C10507a() {
        setHasStableIds(true);
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (this.f34165b != null) {
            return this.f34165b.createViewHolder(viewGroup, i);
        }
        i = new StringBuilder();
        i.append("onCreateViewHolder() called without providing a ");
        i.append(Factory.class);
        throw new IllegalStateException(i.toString());
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        if (viewHolder instanceof CardViewHolder) {
            ((CardViewHolder) viewHolder).bind((C8395a) this.f34164a.get(i));
        }
    }

    public int getItemViewType(int i) {
        if (this.f34165b != null) {
            return this.f34165b.getViewType((C8395a) this.f34164a.get(i));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("getItemViewType() called without providing a ");
        stringBuilder.append(Factory.class);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public int getItemCount() {
        return this.f34164a.size();
    }

    public long getItemId(int i) {
        if (i >= this.f34164a.size()) {
            return -1;
        }
        return (long) m42467a(i).getItem().hashCode();
    }

    /* renamed from: a */
    public int m42466a(C8395a c8395a) {
        c8395a = c8395a.getId();
        for (int i = 0; i < this.f34164a.size(); i++) {
            if (((C8395a) this.f34164a.get(i)).getId().equals(c8395a)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void m42470a(Factory<CardViewHolder<C8395a>, C8395a> factory) {
        this.f34165b = factory;
    }

    @NonNull
    /* renamed from: a */
    public C8395a m42467a(int i) {
        return (C8395a) this.f34164a.get(i);
    }

    @Nullable
    /* renamed from: d */
    public C8395a m42472d() {
        if (m42473e()) {
            return null;
        }
        return (C8395a) this.f34164a.get(0);
    }

    /* renamed from: e */
    public boolean m42473e() {
        return this.f34164a.isEmpty();
    }

    /* renamed from: b */
    public void m42471b(int i) {
        this.f34164a.remove(i);
        notifyItemRemoved(i);
    }

    /* renamed from: a */
    public void m42468a(int i, C8395a c8395a) {
        this.f34164a.add(i, c8395a);
        notifyItemInserted(i);
    }

    /* renamed from: a */
    public void m42469a(int i, @NonNull List<C8395a> list) {
        this.f34164a.addAll(i, list);
        notifyItemRangeInserted(i, list.size());
    }

    /* renamed from: f */
    public void m42474f() {
        this.f34164a.clear();
        notifyDataSetChanged();
    }

    public void onViewRecycled(ViewHolder viewHolder) {
        if (viewHolder instanceof CardViewHolder) {
            ((CardViewHolder) viewHolder).onCardViewRecycled();
        }
    }
}
