package com.tinder.common.view.extension;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import com.tinder.C6250b.C6248a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002¨\u0006\u0005"}, d2 = {"distanceFromEnd", "", "Landroid/support/v7/widget/RecyclerView;", "resolveLinearLayoutManager", "Landroid/support/v7/widget/LinearLayoutManager;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.common.view.extension.e */
public final class C8585e {
    /* renamed from: a */
    public static final int m36610a(@NotNull RecyclerView recyclerView) {
        C2668g.b(recyclerView, "$receiver");
        LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager == null) {
            throw new IllegalStateException("RecyclerView must use a LinearLayoutManager".toString());
        }
        recyclerView = (RecyclerView) recyclerView.findViewById(C6248a.feedList);
        C2668g.a(recyclerView, "feedList");
        recyclerView = recyclerView.getAdapter();
        C2668g.a(recyclerView, "feedList.adapter");
        return (recyclerView.getItemCount() - 1) - linearLayoutManager.findLastVisibleItemPosition();
    }

    @NotNull
    /* renamed from: b */
    public static final LinearLayoutManager m36611b(@NotNull RecyclerView recyclerView) {
        C2668g.b(recyclerView, "$receiver");
        recyclerView = recyclerView.getLayoutManager();
        if (!(recyclerView instanceof LinearLayoutManager)) {
            recyclerView = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView;
        if (linearLayoutManager != null) {
            return linearLayoutManager;
        }
        throw new IllegalStateException("LayoutManager must implement LinearLayoutManager".toString());
    }
}
