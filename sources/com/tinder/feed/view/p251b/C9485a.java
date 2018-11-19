package com.tinder.feed.view.p251b;

import android.view.ViewGroup;
import com.tinder.feed.p340a.C11681a;
import com.tinder.feed.view.feed.BindableFeedItemView;
import com.tinder.feed.view.feed.C11729a;
import com.tinder.feed.view.feed.C11735j;
import com.tinder.feed.view.feed.C11737l;
import com.tinder.feed.view.feed.C11738m;
import com.tinder.feed.view.feed.C11740o;
import com.tinder.feed.view.feed.C11742q;
import com.tinder.feed.view.feed.C11744s;
import com.tinder.feed.view.feed.C11746u;
import com.tinder.feed.view.feed.C11748w;
import com.tinder.feed.view.feed.C11750y;
import com.tinder.feed.view.feed.aa;
import com.tinder.feed.view.model.C11767j;
import com.tinder.feed.view.model.C13280h;
import com.tinder.feed.view.model.C13281i;
import com.tinder.feed.view.model.C13282k;
import com.tinder.feed.view.model.C13283l;
import com.tinder.feed.view.model.C13284m;
import com.tinder.feed.view.model.C13285n;
import com.tinder.feed.view.model.C13286o;
import com.tinder.feed.view.model.C13287p;
import com.tinder.feed.view.model.C13288q;
import com.tinder.feed.view.model.C13289r;
import com.tinder.feed.view.model.FeedItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ\u0015\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/tinder/feed/view/factory/ActivityFeedItemViewFactory;", "", "()V", "createViewHolder", "Lcom/tinder/feed/adapter/FeedItemViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "", "createViewHolder$Tinder_release", "getViewType", "feedItem", "Lcom/tinder/feed/view/model/FeedItem;", "getViewType$Tinder_release", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.b.a */
public final class C9485a {
    /* renamed from: a */
    public static final C9484a f31802a = new C9484a();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/feed/view/factory/ActivityFeedItemViewFactory$Companion;", "", "()V", "CONNECTED_INSTAGRAM_TYPE", "", "INSTAGRAM_MEDIA_TYPE", "LOADING_TYPE", "NEW_MATCH_EVENT_TYPE", "PROFILE_ADD_LOOP_TYPE", "PROFILE_ADD_PHOTO_TYPE", "PROFILE_CHANGE_BIO_TYPE", "PROFILE_CHANGE_SCHOOL_TYPE", "PROFILE_CHANGE_WORK_TYPE", "SPOTIFY_NEW_ANTHEM_TYPE", "SPOTIFY_NEW_TOP_ARTIST_TYPE", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.b.a$a */
    public static final class C9484a {
        private C9484a() {
        }
    }

    @NotNull
    /* renamed from: a */
    public final C11681a<?> m39664a(@NotNull ViewGroup viewGroup, int i) {
        C2668g.b(viewGroup, "parent");
        viewGroup = viewGroup.getContext();
        if (i != 999) {
            switch (i) {
                case 1:
                    C2668g.a(viewGroup, "context");
                    i = (BindableFeedItemView) new C11735j(viewGroup);
                    break;
                case 2:
                    C2668g.a(viewGroup, "context");
                    i = (BindableFeedItemView) new C11750y(viewGroup);
                    break;
                case 3:
                    C2668g.a(viewGroup, "context");
                    i = (BindableFeedItemView) new aa(viewGroup);
                    break;
                case 4:
                    C2668g.a(viewGroup, "context");
                    i = (BindableFeedItemView) new C11738m(viewGroup);
                    break;
                case 5:
                    C2668g.a(viewGroup, "context");
                    i = (BindableFeedItemView) new C11742q(viewGroup);
                    break;
                case 6:
                    C2668g.a(viewGroup, "context");
                    i = (BindableFeedItemView) new C11729a(viewGroup);
                    break;
                case 7:
                    C2668g.a(viewGroup, "context");
                    i = (BindableFeedItemView) new C11740o(viewGroup);
                    break;
                case 8:
                    C2668g.a(viewGroup, "context");
                    i = (BindableFeedItemView) new C11744s(viewGroup);
                    break;
                case 9:
                    C2668g.a(viewGroup, "context");
                    i = (BindableFeedItemView) new C11748w(viewGroup);
                    break;
                case 10:
                    C2668g.a(viewGroup, "context");
                    i = (BindableFeedItemView) new C11746u(viewGroup);
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown ActivityFeed viewType: ");
                    stringBuilder.append(i);
                    throw ((Throwable) new IllegalArgumentException(stringBuilder.toString()));
            }
        }
        C2668g.a(viewGroup, "context");
        i = (BindableFeedItemView) new C11737l(viewGroup);
        return new C11681a(i);
    }

    /* renamed from: a */
    public final int m39663a(@NotNull FeedItem feedItem) {
        C2668g.b(feedItem, "feedItem");
        if (feedItem instanceof C13281i) {
            return 1;
        }
        if (feedItem instanceof C13289r) {
            return 2;
        }
        if (feedItem instanceof C13288q) {
            return 3;
        }
        if (feedItem instanceof C13282k) {
            return 4;
        }
        if (feedItem instanceof C13284m) {
            return 5;
        }
        if (feedItem instanceof C13280h) {
            return 6;
        }
        if (feedItem instanceof C13283l) {
            return 7;
        }
        if (feedItem instanceof C13285n) {
            return 8;
        }
        if (feedItem instanceof C13287p) {
            return 9;
        }
        if (feedItem instanceof C13286o) {
            return 10;
        }
        if (feedItem instanceof C11767j) {
            return 999;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown ActivityFeed type: ");
        stringBuilder.append(feedItem.toString());
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
