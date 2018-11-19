package com.tinder.feed.view.provider;

import android.support.v7.util.DiffUtil.DiffResult;
import com.tinder.domain.feed.ActivityEventNewMatch;
import com.tinder.domain.feed.ActivityFeedItem;
import com.tinder.domain.feed.InstagramConnect;
import com.tinder.domain.feed.InstagramNewMedia;
import com.tinder.domain.feed.ProfileAddLoop;
import com.tinder.domain.feed.ProfileAddPhoto;
import com.tinder.domain.feed.ProfileChangeAnthem;
import com.tinder.domain.feed.ProfileChangeBio;
import com.tinder.domain.feed.ProfileChangeSchool;
import com.tinder.domain.feed.ProfileChangeWork;
import com.tinder.domain.feed.ProfileSpotifyTopArtist;
import com.tinder.domain.feed.usecase.ObserveFeed;
import com.tinder.domain.meta.usecase.ObserveCurrentUser;
import com.tinder.feed.p249d.C9463c;
import com.tinder.feed.p341b.C11695a;
import com.tinder.feed.view.model.FeedItem;
import com.tinder.p204d.p205a.C8609a;
import java.util.List;
import javax.inject.Inject;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\"B7\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ$\u0010\u0017\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u0012J\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0012R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lcom/tinder/feed/view/provider/FeedItemsProvider;", "", "observeFeed", "Lcom/tinder/domain/feed/usecase/ObserveFeed;", "observeCurrentUser", "Lcom/tinder/domain/meta/usecase/ObserveCurrentUser;", "feedItemsDiffCalculator", "Lcom/tinder/feed/view/provider/FeedItemsDiffCalculator;", "feedItemsBuilder", "Lcom/tinder/feed/provider/FeedItemsBuilder;", "loopsExperimentUtility", "Lcom/tinder/loop/experiment/LoopsExperimentUtility;", "feedExperimentUtility", "Lcom/tinder/feed/experiment/AbTestFeedExperimentUtility;", "(Lcom/tinder/domain/feed/usecase/ObserveFeed;Lcom/tinder/domain/meta/usecase/ObserveCurrentUser;Lcom/tinder/feed/view/provider/FeedItemsDiffCalculator;Lcom/tinder/feed/provider/FeedItemsBuilder;Lcom/tinder/loop/experiment/LoopsExperimentUtility;Lcom/tinder/feed/experiment/AbTestFeedExperimentUtility;)V", "emptyFeedItemsUpdate", "Lcom/tinder/feed/view/provider/FeedItemsProvider$FeedItemsUpdate;", "sharedFeedItemsObservable", "Lrx/Observable;", "getSharedFeedItemsObservable", "()Lrx/Observable;", "sharedFeedItemsObservable$delegate", "Lkotlin/Lazy;", "createFeedItemsUpdate", "oldFeedItems", "", "Lcom/tinder/feed/view/model/FeedItem;", "newFeedItems", "isSupportedItem", "", "item", "Lcom/tinder/domain/feed/ActivityFeedItem;", "observe", "observeList", "FeedItemsUpdate", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.provider.e */
public final class C9545e {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f31927a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(C9545e.class), "sharedFeedItemsObservable", "getSharedFeedItemsObservable()Lrx/Observable;"))};
    /* renamed from: b */
    private final C9544a f31928b = m39825a(C19301m.a(), C19301m.a());
    /* renamed from: c */
    private final Lazy f31929c = C18451c.a((Function0) new FeedItemsProvider$sharedFeedItemsObservable$2(this));
    /* renamed from: d */
    private final ObserveFeed f31930d;
    /* renamed from: e */
    private final ObserveCurrentUser f31931e;
    /* renamed from: f */
    private final C9543c f31932f;
    /* renamed from: g */
    private final C9463c f31933g;
    /* renamed from: h */
    private final C8609a f31934h;
    /* renamed from: i */
    private final C11695a f31935i;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tinder/feed/view/provider/FeedItemsProvider$FeedItemsUpdate;", "", "feedItems", "", "Lcom/tinder/feed/view/model/FeedItem;", "diffResult", "Landroid/support/v7/util/DiffUtil$DiffResult;", "(Ljava/util/List;Landroid/support/v7/util/DiffUtil$DiffResult;)V", "getDiffResult", "()Landroid/support/v7/util/DiffUtil$DiffResult;", "getFeedItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.provider.e$a */
    public static final class C9544a {
        @NotNull
        /* renamed from: a */
        private final List<FeedItem> f31925a;
        @NotNull
        /* renamed from: b */
        private final DiffResult f31926b;

        @NotNull
        /* renamed from: c */
        public final List<FeedItem> m39822c() {
            return this.f31925a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C9544a) {
                    C9544a c9544a = (C9544a) obj;
                    if (C2668g.a(this.f31925a, c9544a.f31925a) && C2668g.a(this.f31926b, c9544a.f31926b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            List list = this.f31925a;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            DiffResult diffResult = this.f31926b;
            if (diffResult != null) {
                i = diffResult.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FeedItemsUpdate(feedItems=");
            stringBuilder.append(this.f31925a);
            stringBuilder.append(", diffResult=");
            stringBuilder.append(this.f31926b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9544a(@NotNull List<? extends FeedItem> list, @NotNull DiffResult diffResult) {
            C2668g.b(list, "feedItems");
            C2668g.b(diffResult, "diffResult");
            this.f31925a = list;
            this.f31926b = diffResult;
        }

        @NotNull
        /* renamed from: a */
        public final List<FeedItem> m39820a() {
            return this.f31925a;
        }

        @NotNull
        /* renamed from: b */
        public final DiffResult m39821b() {
            return this.f31926b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/tinder/feed/view/model/FeedItem;", "it", "Lcom/tinder/feed/view/provider/FeedItemsProvider$FeedItemsUpdate;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.provider.e$b */
    static final class C13295b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C13295b f42147a = new C13295b();

        C13295b() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m51449a((C9544a) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<FeedItem> m51449a(C9544a c9544a) {
            return c9544a.m39820a();
        }
    }

    /* renamed from: c */
    private final Observable<C9544a> m39830c() {
        Lazy lazy = this.f31929c;
        KProperty kProperty = f31927a[0];
        return (Observable) lazy.getValue();
    }

    @Inject
    public C9545e(@NotNull ObserveFeed observeFeed, @NotNull ObserveCurrentUser observeCurrentUser, @NotNull C9543c c9543c, @NotNull C9463c c9463c, @NotNull C8609a c8609a, @NotNull C11695a c11695a) {
        C2668g.b(observeFeed, "observeFeed");
        C2668g.b(observeCurrentUser, "observeCurrentUser");
        C2668g.b(c9543c, "feedItemsDiffCalculator");
        C2668g.b(c9463c, "feedItemsBuilder");
        C2668g.b(c8609a, "loopsExperimentUtility");
        C2668g.b(c11695a, "feedExperimentUtility");
        this.f31930d = observeFeed;
        this.f31931e = observeCurrentUser;
        this.f31932f = c9543c;
        this.f31933g = c9463c;
        this.f31934h = c8609a;
        this.f31935i = c11695a;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<C9544a> m39832a() {
        return m39830c();
    }

    @NotNull
    /* renamed from: b */
    public final Observable<List<FeedItem>> m39833b() {
        Observable<List<FeedItem>> k = m39830c().k(C13295b.f42147a);
        C2668g.a(k, "sharedFeedItemsObservabl…ap { it -> it.feedItems }");
        return k;
    }

    /* renamed from: a */
    private final C9544a m39825a(List<? extends FeedItem> list, List<? extends FeedItem> list2) {
        return new C9544a(list2, this.f31932f.m39819a(list, list2));
    }

    /* renamed from: a */
    private final boolean m39826a(ActivityFeedItem activityFeedItem) {
        activityFeedItem = activityFeedItem.getActivityEvent();
        if (activityFeedItem instanceof InstagramNewMedia) {
            return true;
        }
        if (activityFeedItem instanceof ProfileChangeAnthem) {
            return true;
        }
        if (activityFeedItem instanceof ProfileSpotifyTopArtist) {
            return true;
        }
        if (activityFeedItem instanceof ActivityEventNewMatch) {
            return true;
        }
        if (activityFeedItem instanceof ProfileAddPhoto) {
            return true;
        }
        if (activityFeedItem instanceof InstagramConnect) {
            return true;
        }
        if (activityFeedItem instanceof ProfileAddLoop) {
            return this.f31934h.m36729b();
        }
        if (activityFeedItem instanceof ProfileChangeBio) {
            return this.f31935i.getProfileChangeBioEnabled();
        }
        if (activityFeedItem instanceof ProfileChangeSchool) {
            return this.f31935i.getProfileChangeSchoolEnabled();
        }
        return (activityFeedItem instanceof ProfileChangeWork) != null ? this.f31935i.getProfileChangeWorkEnabled() : false;
    }
}
