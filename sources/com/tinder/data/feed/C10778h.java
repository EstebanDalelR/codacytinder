package com.tinder.data.feed;

import android.content.SharedPreferences;
import com.tinder.api.ManagerWebServices;
import com.tinder.common.logger.Logger;
import com.tinder.data.feed.FeedApiClient.C8652a;
import com.tinder.data.feed.FeedApiClient.Direction;
import com.tinder.domain.feed.ActivityFeedComment;
import com.tinder.domain.feed.ActivityFeedComment.State;
import com.tinder.domain.feed.ActivityFeedItem;
import com.tinder.domain.feed.FeedCarouselItemSelectedRepository;
import com.tinder.domain.feed.FeedRangeRepository;
import com.tinder.domain.feed.FeedRepository;
import com.tinder.domain.feed.FeedRequestResult;
import com.tinder.domain.feed.FeedResult;
import com.tinder.domain.feed.FetchedItem;
import com.tinder.domain.feed.UnexpectedEmptyListException;
import com.tinder.domain.match.provider.UnMatchProvider;
import com.tinder.domain.tracker.ListItemViewDurationRepository;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.Observable;
import rx.Single;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.schedulers.Schedulers;
import rx.subjects.C19785a;
import rx.subjects.C19786b;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\\BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010,\u001a\u00020+H\u0016J0\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00102\u001a\u00020\"2\b\u00103\u001a\u0004\u0018\u00010\"2\u0006\u00104\u001a\u00020 H\u0002J\u000e\u00105\u001a\b\u0012\u0004\u0012\u0002060*H\u0016J\b\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u000208H\u0016J\u0010\u0010:\u001a\u0002082\u0006\u0010;\u001a\u00020\"H\u0016J\u0010\u0010<\u001a\u00020.2\u0006\u0010=\u001a\u00020\"H\u0016J\u0010\u0010>\u001a\u00020.2\u0006\u0010=\u001a\u00020\"H\u0002J\n\u0010?\u001a\u0004\u0018\u00010\"H\u0002J\u000e\u0010@\u001a\b\u0012\u0004\u0012\u0002060*H\u0016J\u000e\u0010A\u001a\b\u0012\u0004\u0012\u0002060*H\u0016J\u0010\u0010B\u001a\u0002062\u0006\u0010C\u001a\u00020DH\u0002J*\u0010E\u001a\u00020.2\f\u0010F\u001a\b\u0012\u0004\u0012\u000201002\b\u00102\u001a\u0004\u0018\u00010\"2\b\u00103\u001a\u0004\u0018\u00010\"H\u0002J\b\u0010G\u001a\u00020.H\u0002J\u000e\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001b0IH\u0016J\u000e\u0010J\u001a\b\u0012\u0004\u0012\u00020 0IH\u0016J\b\u0010K\u001a\u00020.H\u0002J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0*H\u0002J\u000e\u0010L\u001a\b\u0012\u0004\u0012\u00020$0*H\u0016J\u0016\u0010M\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010N\u001a\u000201H\u0002J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\"0*H\u0002J\u000e\u0010O\u001a\b\u0012\u0004\u0012\u00020P0*H\u0002J\u001c\u0010Q\u001a\b\u0012\u0004\u0012\u000201002\f\u0010/\u001a\b\u0012\u0004\u0012\u00020100H\u0002J\u0016\u0010R\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020100H\u0016J\u0016\u0010S\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010;\u001a\u00020\"H\u0016J\u0016\u0010T\u001a\b\u0012\u0004\u0012\u0002010*2\u0006\u0010U\u001a\u000201H\u0002J(\u0010V\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u000201002\b\u00103\u001a\u0004\u0018\u00010\"2\u0006\u00104\u001a\u00020 H\u0002J\u0012\u0010W\u001a\u00020.2\b\u00102\u001a\u0004\u0018\u00010\"H\u0002J\u0010\u0010X\u001a\u0002082\u0006\u0010N\u001a\u000201H\u0002J\u0017\u0010Y\u001a\u00020.2\b\u0010Z\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0002\u0010[R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000RN\u0010\u001c\u001aB\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001b0\u001b\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001b0\u001b \u001e* \u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001b0\u001b\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001b0\u001b\u0018\u00010\u001d0\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000RN\u0010\u001f\u001aB\u0012\f\u0012\n \u001e*\u0004\u0018\u00010 0 \u0012\f\u0012\n \u001e*\u0004\u0018\u00010 0  \u001e* \u0012\f\u0012\n \u001e*\u0004\u0018\u00010 0 \u0012\f\u0012\n \u001e*\u0004\u0018\u00010 0 \u0018\u00010\u001d0\u001dX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0004\n\u0002\u0010%R\u0010\u0010&\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000¨\u0006]"}, d2 = {"Lcom/tinder/data/feed/FeedDataRepository;", "Lcom/tinder/domain/feed/FeedRepository;", "Lcom/tinder/data/feed/DebuggableFeedDataRepository;", "client", "Lcom/tinder/data/feed/FeedApiClient;", "feedCarouselItemSelectedRepository", "Lcom/tinder/domain/feed/FeedCarouselItemSelectedRepository;", "listItemViewDurationRepository", "Lcom/tinder/domain/tracker/ListItemViewDurationRepository;", "feedRangeRepository", "Lcom/tinder/domain/feed/FeedRangeRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "unMatchProvider", "Lcom/tinder/domain/match/provider/UnMatchProvider;", "feedEventTypeMaskProvider", "Lcom/tinder/data/feed/FeedEventTypeMaskProvider;", "logger", "Lcom/tinder/common/logger/Logger;", "(Lcom/tinder/data/feed/FeedApiClient;Lcom/tinder/domain/feed/FeedCarouselItemSelectedRepository;Lcom/tinder/domain/tracker/ListItemViewDurationRepository;Lcom/tinder/domain/feed/FeedRangeRepository;Landroid/content/SharedPreferences;Lcom/tinder/domain/match/provider/UnMatchProvider;Lcom/tinder/data/feed/FeedEventTypeMaskProvider;Lcom/tinder/common/logger/Logger;)V", "eventTypeMask", "", "getEventTypeMask", "()J", "eventTypeMask$delegate", "Lkotlin/Lazy;", "feed", "Lcom/tinder/domain/feed/FeedResult;", "feedSubject", "Lrx/subjects/SerializedSubject;", "kotlin.jvm.PlatformType", "newItemsSubject", "", "pastToken", "", "pollInterval", "", "Ljava/lang/Integer;", "recentToken", "unMatchSubscription", "Lrx/Subscription;", "addComment", "Lrx/Single;", "Lcom/tinder/domain/feed/ActivityFeedComment;", "comment", "appendFeedItems", "", "items", "", "Lcom/tinder/domain/feed/ActivityFeedItem;", "token", "nextToken", "lastPage", "checkNewItems", "Lcom/tinder/domain/feed/FeedRequestResult;", "checkNewItemsOnColdStart", "Lrx/Completable;", "clear", "deleteFailedComment", "feedItemId", "deleteFeedItemsByMatchId", "matchId", "deleteFeedItemsByMatchIdInternal", "getRecentTokenFromSharedPreferences", "loadFeed", "loadNextFeedPage", "mapToResult", "result", "Lcom/tinder/data/feed/FeedApiClient$Result;", "notifyNewItems", "activityFeedItems", "notifyNoNewItems", "observeFeed", "Lrx/Observable;", "observeNewItemsAvailable", "observeUnMatch", "pollIntervalSeconds", "processComment", "feedItem", "recentTokenOrEmpty", "Lcom/tinder/data/feed/FeedDataRepository$Token;", "removeDuplicates", "replaceFeedItems", "retryFailedComment", "sendComment", "item", "setFeedItems", "setRecentTokenToSharedPreferences", "updateFeedItem", "updatePollInterval", "interval", "(Ljava/lang/Integer;)V", "Token", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.feed.h */
public final class C10778h implements DebuggableFeedDataRepository, FeedRepository {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f35190a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(C10778h.class), "eventTypeMask", "getEventTypeMask()J"))};
    /* renamed from: b */
    private Integer f35191b;
    /* renamed from: c */
    private String f35192c;
    /* renamed from: d */
    private String f35193d;
    /* renamed from: e */
    private FeedResult f35194e = new FeedResult(C19301m.a(), true);
    /* renamed from: f */
    private final C19786b<FeedResult, FeedResult> f35195f = C19785a.w().B();
    /* renamed from: g */
    private final C19786b<Boolean, Boolean> f35196g = C19785a.f(Boolean.valueOf(null)).B();
    /* renamed from: h */
    private Subscription f35197h;
    /* renamed from: i */
    private final Lazy f35198i = C18451c.a((Function0) new FeedDataRepository$eventTypeMask$2(this));
    /* renamed from: j */
    private final FeedApiClient f35199j;
    /* renamed from: k */
    private final FeedCarouselItemSelectedRepository f35200k;
    /* renamed from: l */
    private final ListItemViewDurationRepository f35201l;
    /* renamed from: m */
    private final FeedRangeRepository f35202m;
    /* renamed from: n */
    private final SharedPreferences f35203n;
    /* renamed from: o */
    private final UnMatchProvider f35204o;
    /* renamed from: p */
    private final C8660k f35205p;
    /* renamed from: q */
    private final Logger f35206q;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/data/feed/FeedDataRepository$Token;", "", "()V", "EmptyToken", "StringToken", "Lcom/tinder/data/feed/FeedDataRepository$Token$StringToken;", "Lcom/tinder/data/feed/FeedDataRepository$Token$EmptyToken;", "data_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.h$a */
    public static abstract class C8655a {

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/data/feed/FeedDataRepository$Token$EmptyToken;", "Lcom/tinder/data/feed/FeedDataRepository$Token;", "()V", "data_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.data.feed.h$a$a */
        public static final class C10776a extends C8655a {
            /* renamed from: a */
            public static final C10776a f35188a = new C10776a();

            private C10776a() {
                super();
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/data/feed/FeedDataRepository$Token$StringToken;", "Lcom/tinder/data/feed/FeedDataRepository$Token;", "token", "", "(Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.data.feed.h$a$b */
        public static final class C10777b extends C8655a {
            @NotNull
            /* renamed from: a */
            private final String f35189a;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C10777b) {
                        if (C2668g.a(this.f35189a, ((C10777b) obj).f35189a)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                String str = this.f35189a;
                return str != null ? str.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("StringToken(token=");
                stringBuilder.append(this.f35189a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public C10777b(@NotNull String str) {
                C2668g.b(str, ManagerWebServices.PARAM_TOKEN);
                super();
                this.f35189a = str;
            }

            @NotNull
            /* renamed from: a */
            public final String m43190a() {
                return this.f35189a;
            }
        }

        private C8655a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.h$o */
    static final class C8656o<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C10778h f30507a;

        C8656o(C10778h c10778h) {
            this.f30507a = c10778h;
        }

        public /* synthetic */ Object call() {
            return m36928a();
        }

        @NotNull
        /* renamed from: a */
        public final String m36928a() {
            String j;
            synchronized (this.f30507a) {
                j = this.f30507a.f35192c;
                if (j == null) {
                    throw new IllegalStateException("pastToken must be set".toString());
                }
            }
            return j;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.h$p */
    static final class C8657p<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C10778h f30508a;

        C8657p(C10778h c10778h) {
            this.f30508a = c10778h;
        }

        public /* synthetic */ Object call() {
            return Integer.valueOf(m36929a());
        }

        /* renamed from: a */
        public final int m36929a() {
            Integer e = this.f30508a.f35191b;
            return e != null ? e.intValue() : 60;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.h$r */
    static final class C8658r<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C10778h f30509a;

        C8658r(C10778h c10778h) {
            this.f30509a = c10778h;
        }

        public /* synthetic */ Object call() {
            return m36930a();
        }

        @NotNull
        /* renamed from: a */
        public final String m36930a() {
            String d;
            synchronized (this.f30509a) {
                d = this.f30509a.f35193d;
                if (d == null) {
                    throw new IllegalStateException("recentToken must be set".toString());
                }
            }
            return d;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/data/feed/FeedDataRepository$Token;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.h$s */
    static final class C8659s<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C10778h f30510a;

        C8659s(C10778h c10778h) {
            this.f30510a = c10778h;
        }

        public /* synthetic */ Object call() {
            return m36931a();
        }

        @NotNull
        /* renamed from: a */
        public final C8655a m36931a() {
            C8655a c8655a;
            synchronized (this.f30510a) {
                String d = this.f30510a.f35193d;
                if (d == null) {
                    d = this.f30510a.m43225g();
                }
                if (d == null) {
                    c8655a = C10776a.f35188a;
                } else {
                    c8655a = new C10777b(d);
                }
            }
            return c8655a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/domain/feed/ActivityFeedComment;", "it", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.h$b */
    static final class C12875b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C12875b f41327a = new C12875b();

        C12875b() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m50523a((ActivityFeedComment) obj);
        }

        @NotNull
        /* renamed from: a */
        public final ActivityFeedComment m50523a(ActivityFeedComment activityFeedComment) {
            return ActivityFeedComment.copy$default(activityFeedComment, null, null, 0, null, State.PENDING, 15, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/feed/ActivityFeedItem;", "pendingComment", "Lcom/tinder/domain/feed/ActivityFeedComment;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.h$c */
    static final class C12876c<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C10778h f41328a;

        C12876c(C10778h c10778h) {
            this.f41328a = c10778h;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50524a((ActivityFeedComment) obj);
        }

        @NotNull
        /* renamed from: a */
        public final ActivityFeedItem m50524a(ActivityFeedComment activityFeedComment) {
            for (ActivityFeedItem activityFeedItem : this.f41328a.f35194e.getItems()) {
                if (C2668g.a(activityFeedItem.getId(), activityFeedComment.getActivityFeedItemId())) {
                    return ActivityFeedItem.copy$default(activityFeedItem, null, null, null, C19301m.a(activityFeedComment), null, null, null, 119, null);
                }
            }
            throw ((Throwable) new NoSuchElementException("Collection contains no element matching the predicate."));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Single;", "Lcom/tinder/domain/feed/ActivityFeedComment;", "feedItem", "Lcom/tinder/domain/feed/ActivityFeedItem;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.h$d */
    static final class C12877d<T, R> implements Func1<T, Single<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C10778h f41329a;

        C12877d(C10778h c10778h) {
            this.f41329a = c10778h;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50525a((ActivityFeedItem) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Single<ActivityFeedComment> m50525a(ActivityFeedItem activityFeedItem) {
            C10778h c10778h = this.f41329a;
            C2668g.a(activityFeedItem, "feedItem");
            return c10778h.m43196a(activityFeedItem);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Single;", "Lcom/tinder/domain/feed/FeedRequestResult;", "kotlin.jvm.PlatformType", "token", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.h$e */
    static final class C12878e<T, R> implements Func1<T, Single<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C10778h f41330a;

        C12878e(C10778h c10778h) {
            this.f41330a = c10778h;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50526a((String) obj);
        }

        /* renamed from: a */
        public final Single<FeedRequestResult> m50526a(final String str) {
            return this.f41330a.f35199j.m36893a(Direction.RECENT, str, Long.valueOf(this.f41330a.m43191a()), null).d(new Action1<C8652a>() {
                public /* synthetic */ void call(Object obj) {
                    m53380a((C8652a) obj);
                }

                /* renamed from: a */
                public final void m53380a(C8652a c8652a) {
                    this.f41330a.m43204a(c8652a.m36889c());
                    this.f41330a.m43206a(c8652a.m36887a(), str, c8652a.m36888b());
                }
            }).d(new C12891i(new FeedDataRepository$checkNewItems$1$2(this.f41330a)));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "token", "Lcom/tinder/data/feed/FeedDataRepository$Token;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.h$f */
    static final class C12879f<T, R> implements Func1<C8655a, Completable> {
        /* renamed from: a */
        final /* synthetic */ C10778h f41331a;

        C12879f(C10778h c10778h) {
            this.f41331a = c10778h;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50527a((C8655a) obj);
        }

        /* renamed from: a */
        public final Completable m50527a(C8655a c8655a) {
            if (C2668g.a(c8655a, C10776a.f35188a)) {
                c8655a = this.f41331a.f35199j.m36893a(Direction.PAST, null, Long.valueOf(this.f41331a.m43191a()), Integer.valueOf(1));
            } else if (c8655a instanceof C10777b) {
                c8655a = this.f41331a.f35199j.m36893a(Direction.RECENT, ((C10777b) c8655a).m43190a(), Long.valueOf(this.f41331a.m43191a()), Integer.valueOf(1));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return c8655a.d(new Action1<C8652a>() {
                public /* synthetic */ void call(Object obj) {
                    m53381a((C8652a) obj);
                }

                /* renamed from: a */
                public final void m53381a(C8652a c8652a) {
                    this.f41331a.m43204a(c8652a.m36889c());
                    this.f41331a.m43206a(c8652a.m36887a(), this.f41331a.f35193d, c8652a.m36888b());
                }
            }).b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/feed/ActivityFeedItem;", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.h$h */
    static final class C12880h<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C10778h f41332a;
        /* renamed from: b */
        final /* synthetic */ String f41333b;

        C12880h(C10778h c10778h, String str) {
            this.f41332a = c10778h;
            this.f41333b = str;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50528a((String) obj);
        }

        @NotNull
        /* renamed from: a */
        public final ActivityFeedItem m50528a(String str) {
            for (ActivityFeedItem activityFeedItem : this.f41332a.f35194e.getItems()) {
                Object obj;
                if (C2668g.a(activityFeedItem.getId(), this.f41333b) && ((ActivityFeedComment) C19301m.f(activityFeedItem.getComments())).getState() == State.FAILED) {
                    obj = 1;
                    continue;
                } else {
                    obj = null;
                    continue;
                }
                if (obj != null) {
                    return activityFeedItem;
                }
            }
            throw ((Throwable) new NoSuchElementException("Collection contains no element matching the predicate."));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/domain/feed/ActivityFeedItem;", "feedItem", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.h$i */
    static final class C12881i<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C12881i f41334a = new C12881i();

        C12881i() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m50529a((ActivityFeedItem) obj);
        }

        @NotNull
        /* renamed from: a */
        public final ActivityFeedItem m50529a(ActivityFeedItem activityFeedItem) {
            Collection arrayList = new ArrayList();
            for (Object next : activityFeedItem.getComments()) {
                if ((((ActivityFeedComment) next).getState() != State.FAILED ? 1 : null) != null) {
                    arrayList.add(next);
                }
            }
            return ActivityFeedItem.copy$default(activityFeedItem, null, null, null, (List) arrayList, null, null, null, 119, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "it", "Lcom/tinder/domain/feed/ActivityFeedItem;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.h$j */
    static final class C12882j<T, R> implements Func1<ActivityFeedItem, Completable> {
        /* renamed from: a */
        final /* synthetic */ C10778h f41335a;

        C12882j(C10778h c10778h) {
            this.f41335a = c10778h;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50530a((ActivityFeedItem) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Completable m50530a(ActivityFeedItem activityFeedItem) {
            C10778h c10778h = this.f41335a;
            C2668g.a(activityFeedItem, "it");
            return c10778h.m43216c(activityFeedItem);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Single;", "Lcom/tinder/domain/feed/FeedRequestResult;", "kotlin.jvm.PlatformType", "token", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.h$l */
    static final class C12883l<T, R> implements Func1<T, Single<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C10778h f41336a;

        C12883l(C10778h c10778h) {
            this.f41336a = c10778h;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50531a((String) obj);
        }

        /* renamed from: a */
        public final Single<FeedRequestResult> m50531a(final String str) {
            return this.f41336a.f35199j.m36893a(Direction.PAST, str, Long.valueOf(this.f41336a.m43191a()), null).d(new Action1<C8652a>() {
                public /* synthetic */ void call(Object obj) {
                    m53383a((C8652a) obj);
                }

                /* renamed from: a */
                public final void m53383a(C8652a c8652a) {
                    this.f41336a.m43204a(c8652a.m36889c());
                    C10778h c10778h = this.f41336a;
                    List a = c8652a.m36887a();
                    String str = str;
                    C2668g.a(str, ManagerWebServices.PARAM_TOKEN);
                    c10778h.m43207a(a, str, c8652a.m36888b(), c8652a.m36890d());
                    if (c8652a.m36887a().isEmpty() && c8652a.m36890d() == null) {
                        throw ((Throwable) new UnexpectedEmptyListException());
                    }
                }
            }).d(new C12891i(new FeedDataRepository$loadNextFeedPage$1$2(this.f41336a)));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Single;", "Lcom/tinder/domain/feed/ActivityFeedComment;", "kotlin.jvm.PlatformType", "processedItem", "Lcom/tinder/domain/feed/ActivityFeedItem;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.h$q */
    static final class C12885q<T, R> implements Func1<T, Single<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C10778h f41338a;

        C12885q(C10778h c10778h) {
            this.f41338a = c10778h;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50533a((ActivityFeedItem) obj);
        }

        /* renamed from: a */
        public final Single<ActivityFeedComment> m50533a(final ActivityFeedItem activityFeedItem) {
            C10778h c10778h = this.f41338a;
            C2668g.a(activityFeedItem, "processedItem");
            return c10778h.m43216c(activityFeedItem).b(new Func0<ActivityFeedComment>() {
                public /* synthetic */ Object call() {
                    return m50532a();
                }

                @NotNull
                /* renamed from: a */
                public final ActivityFeedComment m50532a() {
                    return (ActivityFeedComment) C19301m.f(activityFeedItem.getComments());
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/feed/ActivityFeedItem;", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.h$t */
    static final class C12886t<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C10778h f41339a;
        /* renamed from: b */
        final /* synthetic */ String f41340b;

        C12886t(C10778h c10778h, String str) {
            this.f41339a = c10778h;
            this.f41340b = str;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50534a((String) obj);
        }

        @NotNull
        /* renamed from: a */
        public final ActivityFeedItem m50534a(String str) {
            for (ActivityFeedItem activityFeedItem : this.f41339a.f35194e.getItems()) {
                Object obj;
                if (C2668g.a(activityFeedItem.getId(), this.f41340b) && ((ActivityFeedComment) C19301m.f(activityFeedItem.getComments())).getState() == State.FAILED) {
                    obj = 1;
                    continue;
                } else {
                    obj = null;
                    continue;
                }
                if (obj != null) {
                    return activityFeedItem;
                }
            }
            throw ((Throwable) new NoSuchElementException("Collection contains no element matching the predicate."));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/domain/feed/ActivityFeedItem;", "feedItem", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.h$u */
    static final class C12887u<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C12887u f41341a = new C12887u();

        C12887u() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m50535a((ActivityFeedItem) obj);
        }

        @NotNull
        /* renamed from: a */
        public final ActivityFeedItem m50535a(ActivityFeedItem activityFeedItem) {
            Iterable<ActivityFeedComment> comments = activityFeedItem.getComments();
            Collection arrayList = new ArrayList(C19301m.a(comments, 10));
            for (ActivityFeedComment copy$default : comments) {
                arrayList.add(ActivityFeedComment.copy$default(copy$default, null, null, 0, null, State.PENDING, 15, null));
            }
            return ActivityFeedItem.copy$default(activityFeedItem, null, null, null, (List) arrayList, null, null, null, 119, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Single;", "Lcom/tinder/domain/feed/ActivityFeedComment;", "feedItem", "Lcom/tinder/domain/feed/ActivityFeedItem;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.h$v */
    static final class C12888v<T, R> implements Func1<T, Single<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C10778h f41342a;

        C12888v(C10778h c10778h) {
            this.f41342a = c10778h;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50536a((ActivityFeedItem) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Single<ActivityFeedComment> m50536a(ActivityFeedItem activityFeedItem) {
            C10778h c10778h = this.f41342a;
            C2668g.a(activityFeedItem, "feedItem");
            return c10778h.m43196a(activityFeedItem);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/feed/ActivityFeedItem;", "it", "Lcom/tinder/domain/feed/ActivityFeedComment;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.h$w */
    static final class C12889w<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ ActivityFeedItem f41343a;

        C12889w(ActivityFeedItem activityFeedItem) {
            this.f41343a = activityFeedItem;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50537a((ActivityFeedComment) obj);
        }

        @NotNull
        /* renamed from: a */
        public final ActivityFeedItem m50537a(ActivityFeedComment activityFeedComment) {
            return ActivityFeedItem.copy$default(this.f41343a, null, null, null, C19301m.a(activityFeedComment), null, null, null, 119, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/feed/ActivityFeedItem;", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.h$x */
    static final class C12890x<T, R> implements Func1<Throwable, ActivityFeedItem> {
        /* renamed from: a */
        final /* synthetic */ C10778h f41344a;
        /* renamed from: b */
        final /* synthetic */ ActivityFeedItem f41345b;

        C12890x(C10778h c10778h, ActivityFeedItem activityFeedItem) {
            this.f41344a = c10778h;
            this.f41345b = activityFeedItem;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50538a((Throwable) obj);
        }

        @NotNull
        /* renamed from: a */
        public final ActivityFeedItem m50538a(Throwable th) {
            Logger g = this.f41344a.f35206q;
            C2668g.a(th, "error");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to send feed comment for id=");
            stringBuilder.append(this.f41345b.getId());
            g.warn(th, stringBuilder.toString());
            ActivityFeedItem activityFeedItem = this.f41345b;
            Iterable<ActivityFeedComment> comments = this.f41345b.getComments();
            Collection arrayList = new ArrayList(C19301m.a(comments, 10));
            for (ActivityFeedComment copy$default : comments) {
                arrayList.add(ActivityFeedComment.copy$default(copy$default, null, null, 0, null, State.FAILED, 15, null));
            }
            return ActivityFeedItem.copy$default(activityFeedItem, null, null, null, (List) arrayList, null, null, null, 119, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.h$g */
    static final class C13812g implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10778h f43823a;

        C13812g(C10778h c10778h) {
            this.f43823a = c10778h;
        }

        public final void call() {
            this.f43823a.m43208a(C19301m.a(), null, false);
            this.f43823a.m43214b(null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "result", "Lcom/tinder/data/feed/FeedApiClient$Result;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.h$k */
    static final class C13813k<T> implements Action1<C8652a> {
        /* renamed from: a */
        final /* synthetic */ C10778h f43824a;

        C13813k(C10778h c10778h) {
            this.f43824a = c10778h;
        }

        public /* synthetic */ void call(Object obj) {
            m53382a((C8652a) obj);
        }

        /* renamed from: a */
        public final void m53382a(C8652a c8652a) {
            this.f43824a.m43204a(c8652a.m36889c());
            this.f43824a.m43208a(c8652a.m36887a(), c8652a.m36888b(), c8652a.m36890d());
            this.f43824a.m43217c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "matchId", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.h$m */
    static final class C13815m<T> implements Action1<String> {
        /* renamed from: a */
        final /* synthetic */ C10778h f43827a;

        C13815m(C10778h c10778h) {
            this.f43827a = c10778h;
        }

        public /* synthetic */ void call(Object obj) {
            m53384a((String) obj);
        }

        /* renamed from: a */
        public final void m53384a(String str) {
            C10778h c10778h = this.f43827a;
            C2668g.a(str, "matchId");
            c10778h.m43205a(str);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.h$n */
    static final class C13816n<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C10778h f43828a;

        C13816n(C10778h c10778h) {
            this.f43828a = c10778h;
        }

        public /* synthetic */ void call(Object obj) {
            m53385a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53385a(Throwable th) {
            Logger g = this.f43828a.f35206q;
            C2668g.a(th, "e");
            g.error(th, "Failed to observe unmatch");
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.h$y */
    static final class C13817y implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10778h f43829a;
        /* renamed from: b */
        final /* synthetic */ ActivityFeedItem f43830b;

        C13817y(C10778h c10778h, ActivityFeedItem activityFeedItem) {
            this.f43829a = c10778h;
            this.f43830b = activityFeedItem;
        }

        public final void call() {
            FeedResult f;
            synchronized (this.f43829a) {
                f = this.f43829a.f35194e;
                Iterable<Object> items = this.f43829a.f35194e.getItems();
                Collection arrayList = new ArrayList(C19301m.a(items, 10));
                for (Object obj : items) {
                    Object obj2;
                    if (C2668g.a(obj2.getId(), this.f43830b.getId())) {
                        obj2 = this.f43830b;
                    }
                    arrayList.add(obj2);
                }
                f = FeedResult.copy$default(f, (List) arrayList, false, 2, null);
                this.f43829a.f35194e = f;
            }
            this.f43829a.f35195f.onNext(f);
        }
    }

    /* renamed from: a */
    private final long m43191a() {
        Lazy lazy = this.f35198i;
        KProperty kProperty = f35190a[0];
        return ((Number) lazy.getValue()).longValue();
    }

    @Inject
    public C10778h(@NotNull FeedApiClient feedApiClient, @NotNull FeedCarouselItemSelectedRepository feedCarouselItemSelectedRepository, @NotNull ListItemViewDurationRepository listItemViewDurationRepository, @NotNull FeedRangeRepository feedRangeRepository, @NotNull SharedPreferences sharedPreferences, @NotNull UnMatchProvider unMatchProvider, @NotNull C8660k c8660k, @NotNull Logger logger) {
        C2668g.b(feedApiClient, "client");
        C2668g.b(feedCarouselItemSelectedRepository, "feedCarouselItemSelectedRepository");
        C2668g.b(listItemViewDurationRepository, "listItemViewDurationRepository");
        C2668g.b(feedRangeRepository, "feedRangeRepository");
        C2668g.b(sharedPreferences, "sharedPreferences");
        C2668g.b(unMatchProvider, "unMatchProvider");
        C2668g.b(c8660k, "feedEventTypeMaskProvider");
        C2668g.b(logger, "logger");
        this.f35199j = feedApiClient;
        this.f35200k = feedCarouselItemSelectedRepository;
        this.f35201l = listItemViewDurationRepository;
        this.f35202m = feedRangeRepository;
        this.f35203n = sharedPreferences;
        this.f35204o = unMatchProvider;
        this.f35205p = c8660k;
        this.f35206q = logger;
        m43212b();
    }

    @NotNull
    public Single<FeedRequestResult> loadFeed() {
        Single<FeedRequestResult> d = this.f35199j.m36893a(Direction.PAST, null, Long.valueOf(m43191a()), null).d(new C13813k(this)).d(new C12891i(new FeedDataRepository$loadFeed$2(this)));
        C2668g.a(d, "client.loadActivityFeed(… }.map(this::mapToResult)");
        return d;
    }

    @NotNull
    public Single<FeedRequestResult> loadNextFeedPage() {
        Single<FeedRequestResult> a = m43223f().a(new C12883l(this));
        C2668g.a(a, "pastToken().flatMap { to…s::mapToResult)\n        }");
        return a;
    }

    @NotNull
    public Completable checkNewItemsOnColdStart() {
        Completable c = m43221e().c(new C12879f(this));
        C2668g.a(c, "recentTokenOrEmpty().fla…toCompletable()\n        }");
        return c;
    }

    @NotNull
    public Single<FeedRequestResult> checkNewItems() {
        Single<FeedRequestResult> a = m43219d().a(new C12878e(this));
        C2668g.a(a, "recentToken().flatMap { …s::mapToResult)\n        }");
        return a;
    }

    @NotNull
    public Observable<Boolean> observeNewItemsAvailable() {
        Observable<Boolean> g = this.f35196g.e().g();
        C2668g.a(g, "newItemsSubject.asObserv…().distinctUntilChanged()");
        return g;
    }

    @NotNull
    public Observable<FeedResult> observeFeed() {
        Observable<FeedResult> e = this.f35195f.e();
        C2668g.a(e, "feedSubject.asObservable()");
        return e;
    }

    @NotNull
    public Single<Integer> pollIntervalSeconds() {
        Single<Integer> a = Single.a(new C8657p(this));
        C2668g.a(a, "Single.fromCallable {\n  …LL_INTERVAL_SECONDS\n    }");
        return a;
    }

    @NotNull
    public Completable clear() {
        Completable a = Completable.a(new C13812g(this)).a(RxJavaInteropExtKt.toV1Completable(this.f35200k.clear())).a(this.f35201l.clear()).a(this.f35202m.clear());
        C2668g.a(a, "Completable.fromAction {…dRangeRepository.clear())");
        return a;
    }

    @NotNull
    public Single<ActivityFeedComment> addComment(@NotNull ActivityFeedComment activityFeedComment) {
        C2668g.b(activityFeedComment, "comment");
        activityFeedComment = Single.a(activityFeedComment).d(C12875b.f41327a).d(new C12876c(this)).a(new C12877d(this));
        C2668g.a(activityFeedComment, "Single.just(comment)\n   …t(feedItem)\n            }");
        return activityFeedComment;
    }

    @NotNull
    public Single<ActivityFeedComment> retryFailedComment(@NotNull String str) {
        C2668g.b(str, "feedItemId");
        str = Single.a(str).d(new C12886t(this, str)).d(C12887u.f41341a).a(new C12888v(this));
        C2668g.a(str, "Single.just(feedItemId)\n…t(feedItem)\n            }");
        return str;
    }

    @NotNull
    public Completable deleteFailedComment(@NotNull String str) {
        C2668g.b(str, "feedItemId");
        str = Single.a(str).d(new C12880h(this, str)).d(C12881i.f41334a).c(new C12882j(this));
        C2668g.a(str, "Single.just(feedItemId)\n…eedItem(it)\n            }");
        return str;
    }

    public void replaceFeedItems(@NotNull List<ActivityFeedItem> list) {
        C2668g.b(list, "items");
        synchronized (this) {
            list = FeedResult.copy$default(this.f35194e, list, false, 2, null);
            this.f35194e = list;
        }
        this.f35195f.onNext(list);
    }

    public void deleteFeedItemsByMatchId(@NotNull String str) {
        C2668g.b(str, "matchId");
        m43205a(str);
    }

    /* renamed from: a */
    private final void m43205a(String str) {
        synchronized (this) {
            Collection arrayList = new ArrayList();
            for (Object next : this.f35194e.getItems()) {
                if ((C2668g.a(((ActivityFeedItem) next).getMatchId(), str) ^ 1) != 0) {
                    arrayList.add(next);
                }
            }
            str = FeedResult.copy$default(this.f35194e, (List) arrayList, false, 2, null);
            this.f35194e = str;
        }
        this.f35195f.onNext(str);
    }

    /* renamed from: b */
    private final void m43212b() {
        this.f35197h = this.f35204o.observeUnMatch().a(Schedulers.io()).a(new C13815m(this), new C13816n(this));
    }

    /* renamed from: a */
    private final FeedRequestResult m43192a(C8652a c8652a) {
        boolean d = c8652a.m36890d() ^ 1;
        Iterable<ActivityFeedItem> a = c8652a.m36887a();
        Collection arrayList = new ArrayList(C19301m.a(a, 10));
        for (ActivityFeedItem activityFeedItem : a) {
            arrayList.add(new FetchedItem(activityFeedItem.getId(), activityFeedItem.getActivityId(), activityFeedItem.getUserInfo().getUserId()));
        }
        return new FeedRequestResult(d, (List) arrayList);
    }

    /* renamed from: a */
    private final Single<ActivityFeedComment> m43196a(ActivityFeedItem activityFeedItem) {
        activityFeedItem = m43216c(activityFeedItem).b(m43211b(activityFeedItem)).a(new C12885q(this));
        C2668g.a(activityFeedItem, "updateFeedItem(feedItem)…          }\n            }");
        return activityFeedItem;
    }

    /* renamed from: b */
    private final Single<ActivityFeedItem> m43211b(ActivityFeedItem activityFeedItem) {
        activityFeedItem = this.f35199j.m36894a(activityFeedItem).d(new C12889w(activityFeedItem)).e(new C12890x(this, activityFeedItem));
        C2668g.a(activityFeedItem, "client.sendFeedComment(i…         })\n            }");
        return activityFeedItem;
    }

    /* renamed from: a */
    private final void m43204a(Integer num) {
        if (num != null) {
            this.f35191b = Integer.valueOf(num.intValue());
        }
    }

    /* renamed from: a */
    private final void m43206a(List<ActivityFeedItem> list, String str, String str2) {
        synchronized (this) {
            if (C2668g.a(this.f35193d, str)) {
                this.f35193d = str2;
                str = C15813i.f49016a;
            } else {
                list = new StringBuilder();
                list.append("recentToken ");
                list.append(this.f35193d);
                list.append(" does not match token ");
                list.append(str);
                throw ((Throwable) new IllegalStateException(list.toString().toString()));
            }
        }
        if ((list.isEmpty() ^ 1) != null) {
            this.f35196g.onNext(Boolean.valueOf(true));
        }
    }

    /* renamed from: c */
    private final void m43217c() {
        this.f35196g.onNext(Boolean.valueOf(false));
    }

    /* renamed from: a */
    private final void m43208a(List<ActivityFeedItem> list, String str, boolean z) {
        synchronized (this) {
            this.f35192c = str;
            this.f35193d = str;
            m43214b(this.f35193d);
            this.f35194e = new FeedResult(list, z ^ 1);
            list = C15813i.f49016a;
        }
        this.f35195f.onNext(this.f35194e);
    }

    /* renamed from: c */
    private final Completable m43216c(ActivityFeedItem activityFeedItem) {
        activityFeedItem = Completable.a(new C13817y(this, activityFeedItem));
        C2668g.a(activityFeedItem, "Completable.fromAction {…onNext(updatedFeed)\n    }");
        return activityFeedItem;
    }

    /* renamed from: a */
    private final void m43207a(List<ActivityFeedItem> list, String str, String str2, boolean z) {
        synchronized (this) {
            if (C2668g.a(this.f35192c, str)) {
                this.f35192c = str2;
                list = this.f35194e.copy(m43194a(C19301m.b(this.f35194e.getItems(), list)), z ^ 1);
                this.f35194e = list;
            } else {
                list = new StringBuilder();
                list.append("pastToken ");
                list.append(this.f35192c);
                list.append(" does not match token ");
                list.append(str);
                throw ((Throwable) new IllegalStateException(list.toString().toString()));
            }
        }
        this.f35195f.onNext(list);
    }

    /* renamed from: d */
    private final Single<String> m43219d() {
        Single<String> a = Single.a(new C8658r(this));
        C2668g.a(a, "Single.fromCallable {\n  …e set\" })\n        }\n    }");
        return a;
    }

    /* renamed from: e */
    private final Single<C8655a> m43221e() {
        Single<C8655a> a = Single.a(new C8659s(this));
        C2668g.a(a, "Single.fromCallable {\n  …        }\n        }\n    }");
        return a;
    }

    /* renamed from: f */
    private final Single<String> m43223f() {
        Single<String> a = Single.a(new C8656o(this));
        C2668g.a(a, "Single.fromCallable {\n  …e set\" })\n        }\n    }");
        return a;
    }

    /* renamed from: a */
    private final List<ActivityFeedItem> m43194a(List<ActivityFeedItem> list) {
        Iterable iterable = list;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (hashSet.add(((ActivityFeedItem) next).getId())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private final void m43214b(String str) {
        this.f35203n.edit().putString("FEED_RECENT_TOKEN", str).apply();
    }

    /* renamed from: g */
    private final String m43225g() {
        return this.f35203n.getString("FEED_RECENT_TOKEN", null);
    }
}
