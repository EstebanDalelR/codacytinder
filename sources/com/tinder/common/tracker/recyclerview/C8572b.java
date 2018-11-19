package com.tinder.common.tracker.recyclerview;

import com.tinder.common.tracker.recyclerview.adapter.TrackerAdapter;
import com.tinder.common.tracker.recyclerview.p199b.C10702a;
import com.tinder.common.tracker.recyclerview.p199b.C10703b;
import com.tinder.common.tracker.recyclerview.p199b.C8566c;
import com.tinder.common.tracker.recyclerview.p199b.C8567d;
import com.tinder.common.tracker.recyclerview.p200c.C8573a;
import com.tinder.common.tracker.recyclerview.p200c.C8575e;
import com.tinder.domain.injection.qualifiers.DefaultDateTimeProvider;
import com.tinder.domain.tracker.ListItemViewDurationData;
import com.tinder.domain.tracker.ListItemViewDurationRepository;
import com.tinder.utils.RxUtils;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.Single;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\u000e\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001cJ\u001c\u0010\u001d\u001a\u00020\u0011*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/tinder/common/tracker/recyclerview/RecyclerViewItemViewDurationTracker;", "", "listItemViewDurationRepository", "Lcom/tinder/domain/tracker/ListItemViewDurationRepository;", "listVisibleItemProvider", "Lcom/tinder/common/tracker/recyclerview/provider/ListVisibleItemProvider;", "listItemDurationProvider", "Lcom/tinder/common/tracker/recyclerview/provider/ListItemDurationProvider;", "dateTimeProvider", "Lkotlin/Function0;", "Lorg/joda/time/DateTime;", "(Lcom/tinder/domain/tracker/ListItemViewDurationRepository;Lcom/tinder/common/tracker/recyclerview/provider/ListVisibleItemProvider;Lcom/tinder/common/tracker/recyclerview/provider/ListItemDurationProvider;Lkotlin/jvm/functions/Function0;)V", "visibleItemSubscription", "Lrx/Subscription;", "drop", "", "handleItemNotVisible", "Lcom/tinder/domain/tracker/ListItemViewDurationData;", "currentTimeMs", "", "viewDuration", "handleItemVisible", "handleVisibleItemUpdate", "Lrx/Completable;", "visibleUpdate", "Lcom/tinder/common/tracker/recyclerview/model/ListItemVisibleUpdate;", "take", "adapter", "Lcom/tinder/common/tracker/recyclerview/adapter/TrackerAdapter;", "getDurationDataAtPosition", "position", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.common.tracker.recyclerview.b */
public final class C8572b {
    /* renamed from: a */
    private Subscription f30326a;
    /* renamed from: b */
    private final ListItemViewDurationRepository f30327b;
    /* renamed from: c */
    private final C8575e f30328c;
    /* renamed from: d */
    private final C8573a f30329d;
    /* renamed from: e */
    private final Function0<DateTime> f30330e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/domain/tracker/ListItemViewDurationData;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.tracker.recyclerview.b$a */
    static final class C8565a<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C8572b f30313a;
        /* renamed from: b */
        final /* synthetic */ C8567d f30314b;
        /* renamed from: c */
        final /* synthetic */ long f30315c;
        /* renamed from: d */
        final /* synthetic */ ListItemViewDurationData f30316d;

        C8565a(C8572b c8572b, C8567d c8567d, long j, ListItemViewDurationData listItemViewDurationData) {
            this.f30313a = c8572b;
            this.f30314b = c8567d;
            this.f30315c = j;
            this.f30316d = listItemViewDurationData;
        }

        public /* synthetic */ Object call() {
            return m36566a();
        }

        @NotNull
        /* renamed from: a */
        public final ListItemViewDurationData m36566a() {
            C8567d c8567d = this.f30314b;
            if (c8567d instanceof C10703b) {
                return this.f30313a.m36575a(this.f30315c, this.f30316d);
            }
            if (c8567d instanceof C10702a) {
                return this.f30313a.m36582b(this.f30315c, this.f30316d);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "it", "Lcom/tinder/domain/tracker/ListItemViewDurationData;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.tracker.recyclerview.b$b */
    static final class C12798b<T, R> implements Func1<ListItemViewDurationData, Completable> {
        /* renamed from: a */
        final /* synthetic */ C8572b f41198a;

        C12798b(C8572b c8572b) {
            this.f41198a = c8572b;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50291a((ListItemViewDurationData) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Completable m50291a(ListItemViewDurationData listItemViewDurationData) {
            ListItemViewDurationRepository b = this.f41198a.f30327b;
            String itemId = listItemViewDurationData.getItemId();
            C2668g.a(listItemViewDurationData, "it");
            return b.put(itemId, listItemViewDurationData);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "visibleUpdate", "Lcom/tinder/common/tracker/recyclerview/model/ListItemVisibleUpdate;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.tracker.recyclerview.b$c */
    static final class C12799c<T, R> implements Func1<C8567d, Completable> {
        /* renamed from: a */
        final /* synthetic */ C8572b f41199a;
        /* renamed from: b */
        final /* synthetic */ TrackerAdapter f41200b;

        C12799c(C8572b c8572b, TrackerAdapter trackerAdapter) {
            this.f41199a = c8572b;
            this.f41200b = trackerAdapter;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50292a((C8567d) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Completable m50292a(C8567d c8567d) {
            long millis = ((DateTime) this.f41199a.f30330e.invoke()).getMillis();
            ListItemViewDurationData a = this.f41199a.m36576a(this.f41200b, c8567d.mo9447a(), millis);
            C8572b c8572b = this.f41199a;
            C2668g.a(c8567d, "visibleUpdate");
            return c8572b.m36580a(millis, c8567d, a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/common/tracker/recyclerview/model/ListItemVisibleUpdate;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.tracker.recyclerview.b$d */
    static final class C13777d<T> implements Action1<C8567d> {
        /* renamed from: a */
        public static final C13777d f43770a = new C13777d();

        C13777d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53349a((C8567d) obj);
        }

        /* renamed from: a */
        public final void m53349a(C8567d c8567d) {
            C0001a.a("ListItemVisibleUpdated", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.tracker.recyclerview.b$e */
    static final class C13778e<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13778e f43771a = new C13778e();

        C13778e() {
        }

        public /* synthetic */ void call(Object obj) {
            m53350a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53350a(Throwable th) {
            C0001a.c(th, "Error observing list visible items events", new Object[0]);
        }
    }

    public C8572b(@NotNull ListItemViewDurationRepository listItemViewDurationRepository, @NotNull C8575e c8575e, @NotNull C8573a c8573a, @NotNull @DefaultDateTimeProvider Function0<DateTime> function0) {
        C2668g.b(listItemViewDurationRepository, "listItemViewDurationRepository");
        C2668g.b(c8575e, "listVisibleItemProvider");
        C2668g.b(c8573a, "listItemDurationProvider");
        C2668g.b(function0, "dateTimeProvider");
        this.f30327b = listItemViewDurationRepository;
        this.f30328c = c8575e;
        this.f30329d = c8573a;
        this.f30330e = function0;
    }

    /* renamed from: a */
    public final void m36586a(@NotNull TrackerAdapter trackerAdapter) {
        C2668g.b(trackerAdapter, "adapter");
        RxUtils.b(this.f30326a);
        this.f30326a = this.f30328c.m36590a().i(new C12799c(this, trackerAdapter)).a(C13777d.f43770a, C13778e.f43771a);
    }

    /* renamed from: a */
    public final void m36585a() {
        RxUtils.b(this.f30326a);
    }

    /* renamed from: a */
    private final Completable m36580a(long j, C8567d c8567d, ListItemViewDurationData listItemViewDurationData) {
        j = Single.a(new C8565a(this, c8567d, j, listItemViewDurationData)).c(new C12798b(this));
        C2668g.a(j, "Single.fromCallable {\n  …tory.put(it.itemId, it) }");
        return j;
    }

    /* renamed from: a */
    private final ListItemViewDurationData m36575a(long j, ListItemViewDurationData listItemViewDurationData) {
        return new ListItemViewDurationData(listItemViewDurationData.getItemId(), true, listItemViewDurationData.getFirstVisibleTimeMs(), j, listItemViewDurationData.getLastItemNotVisibleUpdateTimeMs());
    }

    /* renamed from: b */
    private final ListItemViewDurationData m36582b(long j, ListItemViewDurationData listItemViewDurationData) {
        this.f30329d.m36588a(new C8566c(listItemViewDurationData.getItemId(), j - listItemViewDurationData.getLastItemVisibleUpdateTimeMs()));
        return new ListItemViewDurationData(listItemViewDurationData.getItemId(), false, listItemViewDurationData.getFirstVisibleTimeMs(), listItemViewDurationData.getLastItemVisibleUpdateTimeMs(), j);
    }

    /* renamed from: a */
    private final ListItemViewDurationData m36576a(@NotNull TrackerAdapter trackerAdapter, int i, long j) {
        trackerAdapter = trackerAdapter.itemIdAtPosition(i);
        i = this.f30327b.get(trackerAdapter);
        return i != 0 ? i : ListItemViewDurationData.Companion.m37727default(trackerAdapter, j);
    }
}
