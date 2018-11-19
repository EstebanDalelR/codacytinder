package com.tinder.feed.view.provider;

import android.support.v7.util.DiffUtil;
import android.support.v7.util.DiffUtil.Callback;
import android.support.v7.util.DiffUtil.DiffResult;
import com.tinder.feed.view.model.ActivityFeedViewModel;
import com.tinder.feed.view.model.FeedItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\n"}, d2 = {"Lcom/tinder/feed/view/provider/FeedItemsDiffCalculator;", "", "()V", "calculateDiff", "Landroid/support/v7/util/DiffUtil$DiffResult;", "oldFeedItems", "", "Lcom/tinder/feed/view/model/FeedItem;", "newFeedItems", "DiffCallback", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.provider.c */
public final class C9543c {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/feed/view/provider/FeedItemsDiffCalculator$DiffCallback;", "Landroid/support/v7/util/DiffUtil$Callback;", "oldFeedItems", "", "Lcom/tinder/feed/view/model/FeedItem;", "newFeedItems", "(Ljava/util/List;Ljava/util/List;)V", "areCommentsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getChangePayload", "", "getNewListSize", "getOldListSize", "isCarouselItemTheSame", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.provider.c$a */
    public static final class C11768a extends Callback {
        /* renamed from: a */
        private final List<FeedItem> f38475a;
        /* renamed from: b */
        private final List<FeedItem> f38476b;

        public C11768a(@NotNull List<? extends FeedItem> list, @NotNull List<? extends FeedItem> list2) {
            C2668g.b(list, "oldFeedItems");
            C2668g.b(list2, "newFeedItems");
            this.f38475a = list;
            this.f38476b = list2;
        }

        public int getOldListSize() {
            return this.f38475a.size();
        }

        public int getNewListSize() {
            return this.f38476b.size();
        }

        public boolean areItemsTheSame(int i, int i2) {
            return C2668g.a(((FeedItem) this.f38475a.get(i)).getId(), ((FeedItem) this.f38476b.get(i2)).getId());
        }

        public boolean areContentsTheSame(int i, int i2) {
            FeedItem feedItem = (FeedItem) this.f38475a.get(i);
            FeedItem feedItem2 = (FeedItem) this.f38476b.get(i2);
            return m47683b(feedItem, feedItem2) && m47682a(feedItem, feedItem2) != 0;
        }

        @Nullable
        public Object getChangePayload(int i, int i2) {
            FeedItem feedItem = (FeedItem) this.f38475a.get(i);
            FeedItem feedItem2 = (FeedItem) this.f38476b.get(i2);
            if (m47682a(feedItem, feedItem2)) {
                return m47683b(feedItem, feedItem2) == 0 ? "comment" : 0;
            } else {
                return "comment_carousel";
            }
        }

        /* renamed from: a */
        private final boolean m47682a(FeedItem feedItem, FeedItem feedItem2) {
            ActivityFeedViewModel activityFeedViewModel;
            Object obj = null;
            if (!(feedItem instanceof ActivityFeedViewModel)) {
                feedItem = null;
            }
            ActivityFeedViewModel activityFeedViewModel2 = (ActivityFeedViewModel) feedItem;
            if (activityFeedViewModel2 != null) {
                feedItem = activityFeedViewModel2.mo11144f();
                if (feedItem != null) {
                    feedItem = feedItem.m39795g();
                    if (!(feedItem2 instanceof ActivityFeedViewModel)) {
                        feedItem2 = null;
                    }
                    activityFeedViewModel = (ActivityFeedViewModel) feedItem2;
                    if (activityFeedViewModel != null) {
                        feedItem2 = activityFeedViewModel.mo11144f();
                        if (feedItem2 != null) {
                            obj = feedItem2.m39795g();
                        }
                    }
                    return C2668g.a(feedItem, obj);
                }
            }
            feedItem = null;
            if (feedItem2 instanceof ActivityFeedViewModel) {
                feedItem2 = null;
            }
            activityFeedViewModel = (ActivityFeedViewModel) feedItem2;
            if (activityFeedViewModel != null) {
                feedItem2 = activityFeedViewModel.mo11144f();
                if (feedItem2 != null) {
                    obj = feedItem2.m39795g();
                }
            }
            return C2668g.a(feedItem, obj);
        }

        /* renamed from: b */
        private final boolean m47683b(FeedItem feedItem, FeedItem feedItem2) {
            Object obj = null;
            if (!(feedItem instanceof ActivityFeedViewModel)) {
                feedItem = null;
            }
            ActivityFeedViewModel activityFeedViewModel = (ActivityFeedViewModel) feedItem;
            feedItem = activityFeedViewModel != null ? activityFeedViewModel.mo11144f() : null;
            if (!(feedItem2 instanceof ActivityFeedViewModel)) {
                feedItem2 = null;
            }
            ActivityFeedViewModel activityFeedViewModel2 = (ActivityFeedViewModel) feedItem2;
            if (activityFeedViewModel2 != null) {
                obj = activityFeedViewModel2.mo11144f();
            }
            return C2668g.a(feedItem, obj);
        }
    }

    @NotNull
    /* renamed from: a */
    public final DiffResult m39819a(@NotNull List<? extends FeedItem> list, @NotNull List<? extends FeedItem> list2) {
        C2668g.b(list, "oldFeedItems");
        C2668g.b(list2, "newFeedItems");
        list = DiffUtil.calculateDiff(new C11768a(list, list2));
        C2668g.a(list, "DiffUtil.calculateDiff(diffCallback)");
        return list;
    }
}
