package com.tinder.feed.p340a;

import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.ViewGroup;
import com.tinder.common.tracker.recyclerview.adapter.TrackerAdapter;
import com.tinder.feed.view.model.FeedItem;
import com.tinder.feed.view.p251b.C9485a;
import com.tinder.feed.view.provider.C9545e.C9544a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J*\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u001c\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0010H\u0016J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/tinder/feed/adapter/FeedItemsAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tinder/feed/adapter/FeedItemViewHolder;", "Lcom/tinder/common/tracker/recyclerview/adapter/TrackerAdapter;", "feedItemViewFactory", "Lcom/tinder/feed/view/factory/ActivityFeedItemViewFactory;", "(Lcom/tinder/feed/view/factory/ActivityFeedItemViewFactory;)V", "feedItems", "", "Lcom/tinder/feed/view/model/FeedItem;", "get", "position", "", "getItemCount", "getItemViewType", "itemIdAtPosition", "", "onBindViewHolder", "", "viewHolder", "payloads", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "positionForId", "id", "refresh", "feedItemsUpdate", "Lcom/tinder/feed/view/provider/FeedItemsProvider$FeedItemsUpdate;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.a.b */
public final class C11682b extends Adapter<C11681a<?>> implements TrackerAdapter {
    /* renamed from: a */
    private List<? extends FeedItem> f38179a = C19301m.a();
    /* renamed from: b */
    private final C9485a f38180b;

    public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        m47489a((C11681a) viewHolder, i);
    }

    public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i, List list) {
        m47490a((C11681a) viewHolder, i, list);
    }

    public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m47487a(viewGroup, i);
    }

    @Inject
    public C11682b(@NotNull C9485a c9485a) {
        C2668g.b(c9485a, "feedItemViewFactory");
        this.f38180b = c9485a;
    }

    public int getItemCount() {
        return this.f38179a.size();
    }

    public int getItemViewType(int i) {
        return this.f38180b.m39663a((FeedItem) this.f38179a.get(i));
    }

    @NotNull
    /* renamed from: a */
    public C11681a<?> m47487a(@NotNull ViewGroup viewGroup, int i) {
        C2668g.b(viewGroup, "parent");
        return this.f38180b.m39664a(viewGroup, i);
    }

    /* renamed from: a */
    public void m47489a(@NotNull C11681a<?> c11681a, int i) {
        C2668g.b(c11681a, "viewHolder");
        c11681a.m47485a((FeedItem) this.f38179a.get(i));
    }

    /* renamed from: a */
    public void m47490a(@NotNull C11681a<?> c11681a, int i, @NotNull List<Object> list) {
        C2668g.b(c11681a, "viewHolder");
        C2668g.b(list, "payloads");
        if (list.contains("comment") != null) {
            c11681a.m47486b((FeedItem) this.f38179a.get(i));
        } else {
            m47489a((C11681a) c11681a, i);
        }
    }

    public int positionForId(@NotNull String str) {
        C2668g.b(str, "id");
        int i = 0;
        for (FeedItem id : this.f38179a) {
            if (C2668g.a(id.getId(), str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @NotNull
    public String itemIdAtPosition(int i) {
        return ((FeedItem) this.f38179a.get(i)).getId();
    }

    @NotNull
    /* renamed from: a */
    public final FeedItem m47488a(int i) {
        return (FeedItem) this.f38179a.get(i);
    }

    @UiThread
    /* renamed from: a */
    public final void m47491a(@NotNull C9544a c9544a) {
        C2668g.b(c9544a, "feedItemsUpdate");
        this.f38179a = c9544a.m39820a();
        c9544a.m39821b().dispatchUpdatesTo(this);
    }
}
