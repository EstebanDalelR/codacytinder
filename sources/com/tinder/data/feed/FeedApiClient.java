package com.tinder.data.feed;

import com.tinder.api.TinderApi;
import com.tinder.api.model.activityfeed.ActivityFeedResponse;
import com.tinder.api.model.activityfeed.ApiActivityCommentMetaData;
import com.tinder.api.model.activityfeed.ApiActivityFeed;
import com.tinder.api.model.activityfeed.FeedCommentRequest;
import com.tinder.api.model.activityfeed.FeedCommentResponse;
import com.tinder.data.adapter.p208a.C10727b;
import com.tinder.domain.feed.ActivityFeedComment;
import com.tinder.domain.feed.ActivityFeedItem;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/tinder/data/feed/FeedApiClient;", "", "tinderApi", "Lcom/tinder/api/TinderApi;", "adapter", "Lcom/tinder/data/adapter/activityfeed/ActivityFeedItemApiAdapter;", "(Lcom/tinder/api/TinderApi;Lcom/tinder/data/adapter/activityfeed/ActivityFeedItemApiAdapter;)V", "loadActivityFeed", "Lrx/Single;", "Lcom/tinder/data/feed/FeedApiClient$Result;", "direction", "Lcom/tinder/data/feed/FeedApiClient$Direction;", "nextToken", "", "eventTypes", "", "limit", "", "(Lcom/tinder/data/feed/FeedApiClient$Direction;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;)Lrx/Single;", "sendFeedComment", "Lcom/tinder/domain/feed/ActivityFeedComment;", "item", "Lcom/tinder/domain/feed/ActivityFeedItem;", "Direction", "Result", "data_release"}, k = 1, mv = {1, 1, 10})
public final class FeedApiClient {
    /* renamed from: a */
    private final TinderApi f30505a;
    /* renamed from: b */
    private final C10727b f30506b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/tinder/data/feed/FeedApiClient$Direction;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "RECENT", "PAST", "data_release"}, k = 1, mv = {1, 1, 10})
    public enum Direction {
        ;
        
        @NotNull
        private final String key;

        protected Direction(String str) {
            C2668g.b(str, "key");
            this.key = str;
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J@\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/tinder/data/feed/FeedApiClient$Result;", "", "activityFeedItems", "", "Lcom/tinder/domain/feed/ActivityFeedItem;", "nextToken", "", "pollInterval", "", "isLastPage", "", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Z)V", "getActivityFeedItems", "()Ljava/util/List;", "()Z", "getNextToken", "()Ljava/lang/String;", "getPollInterval", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Z)Lcom/tinder/data/feed/FeedApiClient$Result;", "equals", "other", "hashCode", "toString", "data_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.FeedApiClient$a */
    public static final class C8652a {
        @NotNull
        /* renamed from: a */
        private final List<ActivityFeedItem> f30501a;
        @Nullable
        /* renamed from: b */
        private final String f30502b;
        @Nullable
        /* renamed from: c */
        private final Integer f30503c;
        /* renamed from: d */
        private final boolean f30504d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8652a) {
                C8652a c8652a = (C8652a) obj;
                if (C2668g.a(this.f30501a, c8652a.f30501a) && C2668g.a(this.f30502b, c8652a.f30502b) && C2668g.a(this.f30503c, c8652a.f30503c)) {
                    if ((this.f30504d == c8652a.f30504d ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            List list = this.f30501a;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            String str = this.f30502b;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            Integer num = this.f30503c;
            if (num != null) {
                i = num.hashCode();
            }
            hashCode = (hashCode + i) * 31;
            i = this.f30504d;
            if (i != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Result(activityFeedItems=");
            stringBuilder.append(this.f30501a);
            stringBuilder.append(", nextToken=");
            stringBuilder.append(this.f30502b);
            stringBuilder.append(", pollInterval=");
            stringBuilder.append(this.f30503c);
            stringBuilder.append(", isLastPage=");
            stringBuilder.append(this.f30504d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8652a(@NotNull List<ActivityFeedItem> list, @Nullable String str, @Nullable Integer num, boolean z) {
            C2668g.b(list, "activityFeedItems");
            this.f30501a = list;
            this.f30502b = str;
            this.f30503c = num;
            this.f30504d = z;
        }

        @NotNull
        /* renamed from: a */
        public final List<ActivityFeedItem> m36887a() {
            return this.f30501a;
        }

        @Nullable
        /* renamed from: b */
        public final String m36888b() {
            return this.f30502b;
        }

        @Nullable
        /* renamed from: c */
        public final Integer m36889c() {
            return this.f30503c;
        }

        /* renamed from: d */
        public final boolean m36890d() {
            return this.f30504d;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/data/feed/FeedApiClient$Result;", "response", "Lcom/tinder/api/model/activityfeed/ActivityFeedResponse;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.FeedApiClient$b */
    static final class C12868b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ FeedApiClient f41318a;
        /* renamed from: b */
        final /* synthetic */ Direction f41319b;

        C12868b(FeedApiClient feedApiClient, Direction direction) {
            this.f41318a = feedApiClient;
            this.f41319b = direction;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50510a((ActivityFeedResponse) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C8652a m50510a(ActivityFeedResponse activityFeedResponse) {
            List activityFeedItems;
            boolean z;
            Integer noMore;
            ApiActivityFeed activityFeed = activityFeedResponse.getActivityFeed();
            if (activityFeed != null) {
                activityFeedItems = activityFeed.getActivityFeedItems();
                if (activityFeedItems != null) {
                    activityFeedItems = this.f41318a.f30506b.a(activityFeedItems);
                    z = true;
                    if (this.f41319b == Direction.PAST) {
                        noMore = activityFeedResponse.getNoMore();
                        if (noMore == null) {
                            if (noMore.intValue() == 1) {
                                C2668g.a(activityFeedItems, "items");
                                return new C8652a(activityFeedItems, activityFeedResponse.getNextToken(), activityFeedResponse.getPollInterval(), z);
                            }
                        }
                    }
                    z = false;
                    C2668g.a(activityFeedItems, "items");
                    return new C8652a(activityFeedItems, activityFeedResponse.getNextToken(), activityFeedResponse.getPollInterval(), z);
                }
            }
            activityFeedItems = C19301m.a();
            activityFeedItems = this.f41318a.f30506b.a(activityFeedItems);
            z = true;
            if (this.f41319b == Direction.PAST) {
                noMore = activityFeedResponse.getNoMore();
                if (noMore == null) {
                    if (noMore.intValue() == 1) {
                        C2668g.a(activityFeedItems, "items");
                        return new C8652a(activityFeedItems, activityFeedResponse.getNextToken(), activityFeedResponse.getPollInterval(), z);
                    }
                }
            }
            z = false;
            C2668g.a(activityFeedItems, "items");
            return new C8652a(activityFeedItems, activityFeedResponse.getNextToken(), activityFeedResponse.getPollInterval(), z);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/api/model/activityfeed/FeedCommentRequest;", "feedItem", "Lcom/tinder/domain/feed/ActivityFeedItem;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.FeedApiClient$c */
    static final class C12869c<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C12869c f41320a = new C12869c();

        C12869c() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m50511a((ActivityFeedItem) obj);
        }

        @NotNull
        /* renamed from: a */
        public final FeedCommentRequest m50511a(ActivityFeedItem activityFeedItem) {
            ActivityFeedComment activityFeedComment = (ActivityFeedComment) C19301m.f(activityFeedItem.getComments());
            String carouselItemId = activityFeedComment.getMetadata().getCarouselItemId();
            return new FeedCommentRequest(activityFeedItem.getId(), activityFeedItem.getActivityEvent().getTimestamp(), activityFeedComment.getMessage(), (((CharSequence) carouselItemId).length() == 0 ? 1 : null) != null ? null : new ApiActivityCommentMetaData(carouselItemId));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Single;", "Lcom/tinder/api/model/activityfeed/FeedCommentResponse;", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/api/model/activityfeed/FeedCommentRequest;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.FeedApiClient$d */
    static final class C12870d<T, R> implements Func1<T, Single<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ FeedApiClient f41321a;

        C12870d(FeedApiClient feedApiClient) {
            this.f41321a = feedApiClient;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50512a((FeedCommentRequest) obj);
        }

        /* renamed from: a */
        public final Single<FeedCommentResponse> m50512a(FeedCommentRequest feedCommentRequest) {
            return this.f41321a.f30505a.sendFeedItemComment(feedCommentRequest);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/feed/ActivityFeedComment;", "it", "Lcom/tinder/api/model/activityfeed/FeedCommentResponse;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.FeedApiClient$e */
    static final class C12871e<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C12871e f41322a = new C12871e();

        C12871e() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m50513a((FeedCommentResponse) obj);
        }

        @NotNull
        /* renamed from: a */
        public final ActivityFeedComment m50513a(FeedCommentResponse feedCommentResponse) {
            return C8653b.m36898a(feedCommentResponse.getData().getComment());
        }
    }

    @Inject
    public FeedApiClient(@NotNull TinderApi tinderApi, @NotNull C10727b c10727b) {
        C2668g.b(tinderApi, "tinderApi");
        C2668g.b(c10727b, "adapter");
        this.f30505a = tinderApi;
        this.f30506b = c10727b;
    }

    @NotNull
    /* renamed from: a */
    public final Single<C8652a> m36893a(@NotNull Direction direction, @Nullable String str, @Nullable Long l, @Nullable Integer num) {
        C2668g.b(direction, "direction");
        direction = this.f30505a.activityFeed(direction.getKey(), str, l, num).d((Func1) new C12868b(this, direction));
        C2668g.a(direction, "tinderApi.activityFeed(d…isLastPage)\n            }");
        return direction;
    }

    @NotNull
    /* renamed from: a */
    public final Single<ActivityFeedComment> m36894a(@NotNull ActivityFeedItem activityFeedItem) {
        C2668g.b(activityFeedItem, "item");
        activityFeedItem = Single.a(activityFeedItem).d(C12869c.f41320a).a(new C12870d(this)).d(C12871e.f41322a);
        C2668g.a(activityFeedItem, "Single.just(item)\n      …tyFeedComment()\n        }");
        return activityFeedItem;
    }
}
