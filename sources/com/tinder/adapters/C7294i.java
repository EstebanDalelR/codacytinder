package com.tinder.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import java.util.Collections;
import java.util.List;

/* renamed from: com.tinder.adapters.i */
public abstract class C7294i<I, VH extends ViewHolder> extends Adapter<VH> {
    @NonNull
    /* renamed from: a */
    private List<I> f26395a = Collections.emptyList();

    /* renamed from: a */
    public List<I> m31188a() {
        return Collections.unmodifiableList(this.f26395a);
    }

    /* renamed from: a */
    public void m31189a(@NonNull List<I> list) {
        this.f26395a = list;
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public void m31191b(@NonNull List<I> list) {
        if (this.f26395a.isEmpty()) {
            m31189a((List) list);
            return;
        }
        this.f26395a.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public void m31190b() {
        this.f26395a.clear();
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public I m31187a(int i) {
        return m31188a().get(i);
    }
}
