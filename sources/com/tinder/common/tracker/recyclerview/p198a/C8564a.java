package com.tinder.common.tracker.recyclerview.p198a;

import android.support.v7.widget.RecyclerView;
import com.tinder.common.tracker.recyclerview.adapter.TrackerAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"resolveTrackerAdapter", "Lcom/tinder/common/tracker/recyclerview/adapter/TrackerAdapter;", "Landroid/support/v7/widget/RecyclerView;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.common.tracker.recyclerview.a.a */
public final class C8564a {
    @NotNull
    /* renamed from: a */
    public static final TrackerAdapter m36565a(@NotNull RecyclerView recyclerView) {
        C2668g.b(recyclerView, "$receiver");
        recyclerView = recyclerView.getAdapter();
        if (!(recyclerView instanceof TrackerAdapter)) {
            recyclerView = null;
        }
        TrackerAdapter trackerAdapter = (TrackerAdapter) recyclerView;
        if (trackerAdapter != null) {
            return trackerAdapter;
        }
        throw new IllegalStateException("RecyclerView.adapter must implement TrackerAdapter".toString());
    }
}
