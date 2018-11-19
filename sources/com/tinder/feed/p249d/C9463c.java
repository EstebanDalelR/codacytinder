package com.tinder.feed.p249d;

import com.tinder.domain.feed.ActivityFeedItem;
import com.tinder.domain.meta.model.CurrentUser;
import com.tinder.feed.view.model.C9537a;
import com.tinder.feed.view.model.FeedItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/feed/provider/FeedItemsBuilder;", "", "activityFeedViewModelMapper", "Lcom/tinder/feed/view/model/ActivityFeedViewModelMapper;", "(Lcom/tinder/feed/view/model/ActivityFeedViewModelMapper;)V", "build", "", "Lcom/tinder/feed/view/model/FeedItem;", "feedItems", "Lcom/tinder/domain/feed/ActivityFeedItem;", "currentUser", "Lcom/tinder/domain/meta/model/CurrentUser;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.d.c */
public final class C9463c {
    /* renamed from: a */
    private final C9537a f31722a;

    @Inject
    public C9463c(@NotNull C9537a c9537a) {
        C2668g.b(c9537a, "activityFeedViewModelMapper");
        this.f31722a = c9537a;
    }

    @NotNull
    /* renamed from: a */
    public final List<FeedItem> m39567a(@NotNull List<ActivityFeedItem> list, @NotNull CurrentUser currentUser) {
        C2668g.b(list, "feedItems");
        C2668g.b(currentUser, "currentUser");
        Iterable<ActivityFeedItem> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (ActivityFeedItem a : iterable) {
            arrayList.add(this.f31722a.m39800a(a, currentUser));
        }
        return (List) arrayList;
    }
}
