package com.tinder.adapters;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.ViewGroup;

/* renamed from: com.tinder.adapters.f */
public abstract class C7966f<I, IVH extends ViewHolder, HVH extends ViewHolder> extends C7294i<I, ViewHolder> {
    /* renamed from: a */
    public abstract IVH m33828a(ViewGroup viewGroup);

    /* renamed from: a */
    public abstract void m33829a(HVH hvh);

    /* renamed from: a */
    public abstract void m33830a(IVH ivh, int i);

    /* renamed from: b */
    public abstract HVH m33831b(ViewGroup viewGroup);

    public int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
                return m33831b(viewGroup);
            case 1:
                return m33828a(viewGroup);
            default:
                throw new IllegalArgumentException("Unknown holder type");
        }
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        if (i > 0) {
            m33830a(viewHolder, i - 1);
        } else {
            m33829a(viewHolder);
        }
    }

    public int getItemCount() {
        return m31188a().size() + 1;
    }
}
