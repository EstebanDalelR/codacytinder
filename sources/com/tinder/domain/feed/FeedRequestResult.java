package com.tinder.domain.feed;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tinder/domain/feed/FeedRequestResult;", "", "hasMoreItems", "", "fetchedItems", "", "Lcom/tinder/domain/feed/FetchedItem;", "(ZLjava/util/List;)V", "getFetchedItems", "()Ljava/util/List;", "getHasMoreItems", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class FeedRequestResult {
    @NotNull
    private final List<FetchedItem> fetchedItems;
    private final boolean hasMoreItems;

    @NotNull
    public static /* synthetic */ FeedRequestResult copy$default(FeedRequestResult feedRequestResult, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = feedRequestResult.hasMoreItems;
        }
        if ((i & 2) != 0) {
            list = feedRequestResult.fetchedItems;
        }
        return feedRequestResult.copy(z, list);
    }

    public final boolean component1() {
        return this.hasMoreItems;
    }

    @NotNull
    public final List<FetchedItem> component2() {
        return this.fetchedItems;
    }

    @NotNull
    public final FeedRequestResult copy(boolean z, @NotNull List<FetchedItem> list) {
        C2668g.b(list, "fetchedItems");
        return new FeedRequestResult(z, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FeedRequestResult) {
            FeedRequestResult feedRequestResult = (FeedRequestResult) obj;
            return (this.hasMoreItems == feedRequestResult.hasMoreItems ? 1 : null) != null && C2668g.a(this.fetchedItems, feedRequestResult.fetchedItems);
        }
    }

    public int hashCode() {
        int i = this.hasMoreItems;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        List list = this.fetchedItems;
        return i + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FeedRequestResult(hasMoreItems=");
        stringBuilder.append(this.hasMoreItems);
        stringBuilder.append(", fetchedItems=");
        stringBuilder.append(this.fetchedItems);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public FeedRequestResult(boolean z, @NotNull List<FetchedItem> list) {
        C2668g.b(list, "fetchedItems");
        this.hasMoreItems = z;
        this.fetchedItems = list;
    }

    public final boolean getHasMoreItems() {
        return this.hasMoreItems;
    }

    @NotNull
    public final List<FetchedItem> getFetchedItems() {
        return this.fetchedItems;
    }
}
