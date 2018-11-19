package com.tinder.data.recs;

import com.tinder.domain.recs.RecsApiClient;
import com.tinder.domain.recs.RecsEngine.ResetReason;
import com.tinder.domain.recs.RecsRepository;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.Rec$Source;
import com.tinder.domain.recs.model.RecsUpdate;
import com.tinder.domain.recs.model.RecsUpdate.Rewind.Reason;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.util.ConnectivityProvider;
import com.tinder.util.ConnectivityProvider.NoInternetConnectionException;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Completable;
import rx.Observable;
import rx.Single;
import rx.functions.Action0;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000eH\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000eH\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u000eH\u0016J\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0016\u0010\"\u001a\u00020\u00122\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150$H\u0016J\u0010\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020'H\u0016J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010&\u001a\u00020)H\u0016J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020)H\u0016J>\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u001e\u0010,\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150$\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170-2\u0006\u0010&\u001a\u00020)H\u0016J\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020)H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/tinder/data/recs/RecsDataRepository;", "Lcom/tinder/domain/recs/RecsRepository;", "recsDataStore", "Lcom/tinder/data/recs/RecsDataStore;", "recsApiClient", "Lcom/tinder/domain/recs/RecsApiClient;", "connectivityProvider", "Lcom/tinder/util/ConnectivityProvider;", "recSource", "Lcom/tinder/domain/recs/model/Rec$Source;", "(Lcom/tinder/data/recs/RecsDataStore;Lcom/tinder/domain/recs/RecsApiClient;Lcom/tinder/util/ConnectivityProvider;Lcom/tinder/domain/recs/model/Rec$Source;)V", "getRecSource", "()Lcom/tinder/domain/recs/model/Rec$Source;", "cancelRewind", "Lrx/Single;", "Lcom/tinder/domain/recs/model/Swipe;", "swipe", "clearCache", "Lrx/Completable;", "insertRec", "rec", "Lcom/tinder/domain/recs/model/Rec;", "position", "", "loadAndCacheRecsFromNetwork", "Lcom/tinder/data/recs/RecsFetchResults;", "loadRecs", "loadRecsFromNetwork", "observeRecsUpdates", "Lrx/Observable;", "Lcom/tinder/domain/recs/model/RecsUpdate;", "sinceRecsUpdate", "processSwipe", "removeRec", "removeRecs", "recs", "", "resetNetworkState", "reason", "Lcom/tinder/domain/recs/RecsEngine$ResetReason;", "rewindLastSwipe", "Lcom/tinder/domain/recs/model/RecsUpdate$Rewind$Reason;", "rewindSwipeToPositionZero", "rewindSwipeToSelectedPosition", "positionSelector", "Lkotlin/Function2;", "rewindSwipeToSwipedPosition", "engine_release"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.data.recs.h */
public abstract class C10991h implements RecsRepository {
    /* renamed from: a */
    private final C10992i f35718a;
    /* renamed from: b */
    private final RecsApiClient f35719b;
    /* renamed from: c */
    private final ConnectivityProvider f35720c;
    @NotNull
    /* renamed from: d */
    private final Rec$Source f35721d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/domain/recs/model/Swipe;", "call"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.data.recs.h$a */
    static final class C8777a<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C10991h f30831a;
        /* renamed from: b */
        final /* synthetic */ Swipe f30832b;

        C8777a(C10991h c10991h, Swipe swipe) {
            this.f30831a = c10991h;
            this.f30832b = swipe;
        }

        public /* synthetic */ Object call() {
            return m37384a();
        }

        @NotNull
        /* renamed from: a */
        public final Swipe m37384a() {
            return this.f30831a.f35718a.m43635b(this.f30832b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/data/recs/RecsFetchResults;", "call"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.data.recs.h$f */
    static final class C8778f<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C10991h f30833a;

        C8778f(C10991h c10991h) {
            this.f30833a = c10991h;
        }

        public /* synthetic */ Object call() {
            return m37385a();
        }

        @NotNull
        /* renamed from: a */
        public final C8786k m37385a() {
            return this.f30833a.f35718a.m43626a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/domain/recs/model/Swipe;", "call"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.data.recs.h$h */
    static final class C8779h<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C10991h f30834a;
        /* renamed from: b */
        final /* synthetic */ Swipe f30835b;

        C8779h(C10991h c10991h, Swipe swipe) {
            this.f30834a = c10991h;
            this.f30835b = swipe;
        }

        public /* synthetic */ Object call() {
            return m37386a();
        }

        @NotNull
        /* renamed from: a */
        public final Swipe m37386a() {
            return this.f30834a.f35718a.m43628a(this.f30835b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/domain/recs/model/Swipe;", "call"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.data.recs.h$l */
    static final class C8780l<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C10991h f30836a;
        /* renamed from: b */
        final /* synthetic */ Reason f30837b;

        C8780l(C10991h c10991h, Reason reason) {
            this.f30836a = c10991h;
            this.f30837b = reason;
        }

        public /* synthetic */ Object call() {
            return m37387a();
        }

        @NotNull
        /* renamed from: a */
        public final Swipe m37387a() {
            return this.f30836a.f35718a.m43627a(this.f30837b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/domain/recs/model/Swipe;", "call"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.data.recs.h$m */
    static final class C8781m<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C10991h f30838a;
        /* renamed from: b */
        final /* synthetic */ Swipe f30839b;
        /* renamed from: c */
        final /* synthetic */ Reason f30840c;

        C8781m(C10991h c10991h, Swipe swipe, Reason reason) {
            this.f30838a = c10991h;
            this.f30839b = swipe;
            this.f30840c = reason;
        }

        public /* synthetic */ Object call() {
            return m37388a();
        }

        @NotNull
        /* renamed from: a */
        public final Swipe m37388a() {
            return this.f30838a.f35718a.m43629a(this.f30839b, this.f30840c);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/domain/recs/model/Swipe;", "call"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.data.recs.h$n */
    static final class C8782n<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C10991h f30841a;
        /* renamed from: b */
        final /* synthetic */ Swipe f30842b;
        /* renamed from: c */
        final /* synthetic */ Function2 f30843c;
        /* renamed from: d */
        final /* synthetic */ Reason f30844d;

        C8782n(C10991h c10991h, Swipe swipe, Function2 function2, Reason reason) {
            this.f30841a = c10991h;
            this.f30842b = swipe;
            this.f30843c = function2;
            this.f30844d = reason;
        }

        public /* synthetic */ Object call() {
            return m37389a();
        }

        @NotNull
        /* renamed from: a */
        public final Swipe m37389a() {
            return this.f30841a.f35718a.m43630a(this.f30842b, this.f30843c, this.f30844d);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/domain/recs/model/Swipe;", "call"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.data.recs.h$o */
    static final class C8783o<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C10991h f30845a;
        /* renamed from: b */
        final /* synthetic */ Swipe f30846b;
        /* renamed from: c */
        final /* synthetic */ Reason f30847c;

        C8783o(C10991h c10991h, Swipe swipe, Reason reason) {
            this.f30845a = c10991h;
            this.f30846b = swipe;
            this.f30847c = reason;
        }

        public /* synthetic */ Object call() {
            return m37390a();
        }

        @NotNull
        /* renamed from: a */
        public final Swipe m37390a() {
            return this.f30845a.f35718a.m43636b(this.f30846b, this.f30847c);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Single;", "Lcom/tinder/data/recs/RecsFetchResults;", "it", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.data.recs.h$d */
    static final class C13101d<T, R> implements Func1<T, Single<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C10991h f41723a;

        C13101d(C10991h c10991h) {
            this.f41723a = c10991h;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50958a((C8786k) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Single<C8786k> m50958a(C8786k c8786k) {
            C10991h c10991h = this.f41723a;
            C2668g.a(c8786k, "it");
            return c10991h.cacheRecs(c8786k);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/data/recs/RecsFetchResults;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.data.recs.h$e */
    static final class C13102e<T, R> implements Func1<C8786k, Boolean> {
        /* renamed from: a */
        public static final C13102e f41724a = new C13102e();

        C13102e() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m50959a((C8786k) obj));
        }

        /* renamed from: a */
        public final boolean m50959a(C8786k c8786k) {
            return c8786k.m37394a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.data.recs.h$b */
    static final class C13877b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10991h f43995a;

        C13877b(C10991h c10991h) {
            this.f43995a = c10991h;
        }

        public final void call() {
            this.f43995a.f35718a.m43637b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.data.recs.h$c */
    static final class C13878c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10991h f43996a;
        /* renamed from: b */
        final /* synthetic */ Rec f43997b;
        /* renamed from: c */
        final /* synthetic */ int f43998c;

        C13878c(C10991h c10991h, Rec rec, int i) {
            this.f43996a = c10991h;
            this.f43997b = rec;
            this.f43998c = i;
        }

        public final void call() {
            this.f43996a.f35718a.m43633a(this.f43997b, this.f43998c);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.data.recs.h$g */
    static final class C13879g implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10991h f43999a;

        C13879g(C10991h c10991h) {
            this.f43999a = c10991h;
        }

        public final void call() {
            if (!this.f43999a.f35720c.a()) {
                throw new NoInternetConnectionException();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.data.recs.h$i */
    static final class C13880i implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10991h f44000a;
        /* renamed from: b */
        final /* synthetic */ Rec f44001b;

        C13880i(C10991h c10991h, Rec rec) {
            this.f44000a = c10991h;
            this.f44001b = rec;
        }

        public final void call() {
            this.f44000a.f35718a.m43632a(this.f44001b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.data.recs.h$j */
    static final class C13881j implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10991h f44002a;
        /* renamed from: b */
        final /* synthetic */ List f44003b;

        C13881j(C10991h c10991h, List list) {
            this.f44002a = c10991h;
            this.f44003b = list;
        }

        public final void call() {
            this.f44002a.f35718a.m43638b(this.f44003b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.data.recs.h$k */
    static final class C13882k implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10991h f44004a;
        /* renamed from: b */
        final /* synthetic */ ResetReason f44005b;

        C13882k(C10991h c10991h, ResetReason resetReason) {
            this.f44004a = c10991h;
            this.f44005b = resetReason;
        }

        public final void call() {
            this.f44004a.f35719b.reset(this.f44005b);
        }
    }

    public C10991h(@NotNull C10992i c10992i, @NotNull RecsApiClient recsApiClient, @NotNull ConnectivityProvider connectivityProvider, @NotNull Rec$Source rec$Source) {
        C2668g.b(c10992i, "recsDataStore");
        C2668g.b(recsApiClient, "recsApiClient");
        C2668g.b(connectivityProvider, "connectivityProvider");
        C2668g.b(rec$Source, "recSource");
        this.f35718a = c10992i;
        this.f35719b = recsApiClient;
        this.f35720c = connectivityProvider;
        this.f35721d = rec$Source;
    }

    @NotNull
    public Rec$Source getRecSource() {
        return this.f35721d;
    }

    @NotNull
    public Observable<RecsUpdate> observeRecsUpdates(@Nullable RecsUpdate recsUpdate) {
        return this.f35718a.m43631a(recsUpdate);
    }

    @NotNull
    public Single<C8786k> loadRecs() {
        Single<C8786k> a = Single.a(Single.a(new C8778f(this)), loadAndCacheRecsFromNetwork()).g(C13102e.f41724a).a();
        C2668g.a(a, "Single.concat(recsFromCa…}\n            .toSingle()");
        return a;
    }

    @NotNull
    public Single<C8786k> loadRecsFromNetwork() {
        Single<C8786k> a = this.f35719b.loadRecs().a(new C13879g(this));
        C2668g.a(a, "recsApiClient\n          …          }\n            }");
        return a;
    }

    @NotNull
    public Single<C8786k> loadAndCacheRecsFromNetwork() {
        Single<C8786k> a = loadRecsFromNetwork().a(new C13101d(this));
        C2668g.a(a, "loadRecsFromNetwork().fl…ap { this.cacheRecs(it) }");
        return a;
    }

    @NotNull
    public Completable clearCache() {
        Completable a = Completable.a(new C13877b(this));
        C2668g.a(a, "Completable.fromAction { recsDataStore.clear() }");
        return a;
    }

    @NotNull
    public Completable resetNetworkState(@NotNull ResetReason resetReason) {
        C2668g.b(resetReason, "reason");
        resetReason = Completable.a(new C13882k(this, resetReason));
        C2668g.a(resetReason, "Completable.fromAction {…ApiClient.reset(reason) }");
        return resetReason;
    }

    @NotNull
    public Single<Swipe> processSwipe(@NotNull Swipe swipe) {
        C2668g.b(swipe, "swipe");
        swipe = Single.a(new C8779h(this, swipe));
        C2668g.a(swipe, "Single.fromCallable { re…ore.consumeSwipe(swipe) }");
        return swipe;
    }

    @NotNull
    public Single<Swipe> rewindLastSwipe(@NotNull Reason reason) {
        C2668g.b(reason, "reason");
        reason = Single.a(new C8780l(this, reason));
        C2668g.a(reason, "Single.fromCallable { re…FromRewindStack(reason) }");
        return reason;
    }

    @NotNull
    public Single<Swipe> rewindSwipeToPositionZero(@NotNull Swipe swipe, @NotNull Reason reason) {
        C2668g.b(swipe, "swipe");
        C2668g.b(reason, "reason");
        swipe = Single.a(new C8781m(this, swipe, reason));
        C2668g.a(swipe, "Single.fromCallable { re…tionZero(swipe, reason) }");
        return swipe;
    }

    @NotNull
    public Single<Swipe> rewindSwipeToSwipedPosition(@NotNull Swipe swipe, @NotNull Reason reason) {
        C2668g.b(swipe, "swipe");
        C2668g.b(reason, "reason");
        swipe = Single.a(new C8783o(this, swipe, reason));
        C2668g.a(swipe, "Single.fromCallable { re…Position(swipe, reason) }");
        return swipe;
    }

    @NotNull
    public Single<Swipe> rewindSwipeToSelectedPosition(@NotNull Swipe swipe, @NotNull Function2<? super List<? extends Rec>, ? super Integer, Integer> function2, @NotNull Reason reason) {
        C2668g.b(swipe, "swipe");
        C2668g.b(function2, "positionSelector");
        C2668g.b(reason, "reason");
        swipe = Single.a(new C8782n(this, swipe, function2, reason));
        C2668g.a(swipe, "Single.fromCallable {\n  …lector, reason)\n        }");
        return swipe;
    }

    @NotNull
    public Single<Swipe> cancelRewind(@NotNull Swipe swipe) {
        C2668g.b(swipe, "swipe");
        swipe = Single.a(new C8777a(this, swipe));
        C2668g.a(swipe, "Single.fromCallable { re…ore.cancelRewind(swipe) }");
        return swipe;
    }

    @NotNull
    public Completable insertRec(@NotNull Rec rec, int i) {
        C2668g.b(rec, "rec");
        rec = Completable.a(new C13878c(this, rec, i));
        C2668g.a(rec, "Completable.fromAction {…ingleRec(rec, position) }");
        return rec;
    }

    @NotNull
    public Completable removeRec(@NotNull Rec rec) {
        C2668g.b(rec, "rec");
        rec = Completable.a(new C13880i(this, rec));
        C2668g.a(rec, "Completable.fromAction {…re.removeSingleRec(rec) }");
        return rec;
    }

    @NotNull
    public Completable removeRecs(@NotNull List<? extends Rec> list) {
        C2668g.b(list, "recs");
        list = Completable.a(new C13881j(this, list));
        C2668g.a(list, "Completable.fromAction {…aStore.removeRecs(recs) }");
        return list;
    }
}
