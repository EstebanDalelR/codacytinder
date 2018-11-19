package com.tinder.views.grid;

import android.support.v7.widget.RecyclerView.RecyclerListener;
import android.support.v7.widget.RecyclerView.ViewHolder;
import kotlin.Metadata;
import kotlin.TypeCastException;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "viewHolder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "kotlin.jvm.PlatformType", "onViewRecycled"}, k = 3, mv = {1, 1, 10})
final class RefreshableGridRecsView$1 implements RecyclerListener {
    /* renamed from: a */
    public static final RefreshableGridRecsView$1 f52914a = new RefreshableGridRecsView$1();

    RefreshableGridRecsView$1() {
    }

    public final void onViewRecycled(ViewHolder viewHolder) {
        if (viewHolder.itemView instanceof GridUserRecCardView) {
            viewHolder = viewHolder.itemView;
            if (viewHolder == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.views.grid.GridUserRecCardView");
            }
            ((GridUserRecCardView) viewHolder).m66293a();
        }
    }
}
