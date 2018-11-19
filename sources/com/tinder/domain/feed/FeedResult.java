package com.tinder.domain.feed;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tinder/domain/feed/FeedResult;", "", "items", "", "Lcom/tinder/domain/feed/ActivityFeedItem;", "hasMoreItems", "", "(Ljava/util/List;Z)V", "getHasMoreItems", "()Z", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class FeedResult {
    private final boolean hasMoreItems;
    @NotNull
    private final List<ActivityFeedItem> items;

    @NotNull
    public static /* synthetic */ FeedResult copy$default(FeedResult feedResult, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = feedResult.items;
        }
        if ((i & 2) != 0) {
            z = feedResult.hasMoreItems;
        }
        return feedResult.copy(list, z);
    }

    @NotNull
    public final List<ActivityFeedItem> component1() {
        return this.items;
    }

    public final boolean component2() {
        return this.hasMoreItems;
    }

    @NotNull
    public final FeedResult copy(@NotNull List<ActivityFeedItem> list, boolean z) {
        C2668g.b(list, "items");
        return new FeedResult(list, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FeedResult) {
            FeedResult feedResult = (FeedResult) obj;
            if (C2668g.a(this.items, feedResult.items)) {
                if ((this.hasMoreItems == feedResult.hasMoreItems ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        List list = this.items;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        int i = this.hasMoreItems;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FeedResult(items=");
        stringBuilder.append(this.items);
        stringBuilder.append(", hasMoreItems=");
        stringBuilder.append(this.hasMoreItems);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public FeedResult(@NotNull List<ActivityFeedItem> list, boolean z) {
        C2668g.b(list, "items");
        this.items = list;
        this.hasMoreItems = z;
    }

    @NotNull
    public final List<ActivityFeedItem> getItems() {
        return this.items;
    }

    public final boolean getHasMoreItems() {
        return this.hasMoreItems;
    }
}
