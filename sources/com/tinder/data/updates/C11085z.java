package com.tinder.data.updates;

import com.tinder.api.model.updates.Updates;
import com.tinder.api.model.updates.Updates.Boost;
import com.tinder.api.model.updates.Updates.Places;
import com.tinder.api.model.updates.Updates.PollInterval;
import com.tinder.data.adapter.C10738l;
import com.tinder.data.database.C8645h;
import com.tinder.data.updates.p332a.C11035a;
import com.tinder.domain.boost.repository.BoostCursorRepository;
import com.tinder.domain.boost.repository.BoostProfileFacesRepository;
import com.tinder.domain.common.repository.LastActivityDateRepository;
import com.tinder.domain.match.usecase.BlockMatches;
import com.tinder.domain.places.PlacesConfigProvider;
import com.tinder.domain.places.model.PlacesConfig;
import com.tinder.domain.updates.InitialUpdatesStatusProvider;
import com.tinder.domain.updates.InitialUpdatesStatusProvider.Status;
import com.tinder.domain.updates.PollIntervalRepository;
import com.tinder.domain.updates.UpdatesStatusProvider;
import io.reactivex.C3956a;
import io.reactivex.C3957b;
import io.reactivex.C3960g;
import io.reactivex.CompletableSource;
import io.reactivex.CompletableTransformer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.processors.PublishProcessor;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002Bg\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001bJ\b\u0010(\u001a\u00020)H\u0002J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001e0+H\u0016J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020\"0+H\u0016J\u000e\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020/J\u0018\u00100\u001a\u00020)2\u000e\u00101\u001a\n\u0012\u0004\u0012\u000203\u0018\u000102H\u0002J\u0012\u00104\u001a\u00020)2\b\u00105\u001a\u0004\u0018\u000106H\u0002J\u0012\u00107\u001a\u00020)2\b\u00105\u001a\u0004\u0018\u000106H\u0002J\u0012\u00108\u001a\u00020)2\b\u00109\u001a\u0004\u0018\u000103H\u0002J\u0012\u0010:\u001a\u00020)2\b\u0010;\u001a\u0004\u0018\u00010<H\u0002J\u0012\u0010=\u001a\u00020)2\b\u0010>\u001a\u0004\u0018\u00010?H\u0002J\u0010\u0010@\u001a\u00020)2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020$H\u0002R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R2\u0010\u001c\u001a&\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e \u001f*\u0012\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e\u0018\u00010\u001d0\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R2\u0010 \u001a&\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\"0\" \u001f*\u0012\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\"0\"\u0018\u00010!0!X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010#\u001a\u00020$*\u00020%8BX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006D"}, d2 = {"Lcom/tinder/data/updates/UpdatesResponseHandler;", "Lcom/tinder/domain/updates/InitialUpdatesStatusProvider;", "Lcom/tinder/domain/updates/UpdatesStatusProvider;", "matchesHandler", "Lcom/tinder/data/updates/UpdatesResponseMatchesHandler;", "messagesHandler", "Lcom/tinder/data/updates/UpdatesResponseMessagesHandler;", "messageLikesHandler", "Lcom/tinder/data/updates/UpdatesResponseMessageLikesHandler;", "dateTimeApiAdapter", "Lcom/tinder/data/adapter/DateTimeApiAdapter;", "pollIntervalDomainApiAdapter", "Lcom/tinder/data/updates/adapter/PollIntervalDomainApiAdapter;", "lastActivityDateRepository", "Lcom/tinder/domain/common/repository/LastActivityDateRepository;", "pollIntervalRepository", "Lcom/tinder/domain/updates/PollIntervalRepository;", "boostProfileFacesRepository", "Lcom/tinder/domain/boost/repository/BoostProfileFacesRepository;", "boostCursorRepository", "Lcom/tinder/domain/boost/repository/BoostCursorRepository;", "transactionDelegate", "Lcom/tinder/data/database/TransactionDelegate;", "blockMatches", "Lcom/tinder/domain/match/usecase/BlockMatches;", "placesConfigProvider", "Lcom/tinder/domain/places/PlacesConfigProvider;", "(Lcom/tinder/data/updates/UpdatesResponseMatchesHandler;Lcom/tinder/data/updates/UpdatesResponseMessagesHandler;Lcom/tinder/data/updates/UpdatesResponseMessageLikesHandler;Lcom/tinder/data/adapter/DateTimeApiAdapter;Lcom/tinder/data/updates/adapter/PollIntervalDomainApiAdapter;Lcom/tinder/domain/common/repository/LastActivityDateRepository;Lcom/tinder/domain/updates/PollIntervalRepository;Lcom/tinder/domain/boost/repository/BoostProfileFacesRepository;Lcom/tinder/domain/boost/repository/BoostCursorRepository;Lcom/tinder/data/database/TransactionDelegate;Lcom/tinder/domain/match/usecase/BlockMatches;Lcom/tinder/domain/places/PlacesConfigProvider;)V", "initialUpdatesStatusProcessor", "Lio/reactivex/processors/BehaviorProcessor;", "Lcom/tinder/domain/updates/InitialUpdatesStatusProvider$Status;", "kotlin.jvm.PlatformType", "updatesStatusProcessor", "Lio/reactivex/processors/PublishProcessor;", "Lcom/tinder/domain/updates/UpdatesStatusProvider$Status;", "hasData", "", "Lcom/tinder/api/model/updates/Updates;", "getHasData", "(Lcom/tinder/api/model/updates/Updates;)Z", "beginTransaction", "Lio/reactivex/Completable;", "observeInitialUpdatesStatus", "Lio/reactivex/Flowable;", "observeUpdatesStatus", "process", "updatesRequestContext", "Lcom/tinder/data/updates/UpdatesRequestContext;", "updateBlocks", "matchIds", "", "", "updateBoostCursor", "boost", "Lcom/tinder/api/model/updates/Updates$Boost;", "updateBoostProfiles", "updateLastActivityDate", "lastActivityDate", "updatePlaces", "places", "Lcom/tinder/api/model/updates/Updates$Places;", "updatePollInterval", "optionalPollInterval", "Lcom/tinder/api/model/updates/Updates$PollInterval;", "updateUpdateStatus", "wrapWithRollbackableTransaction", "Lio/reactivex/CompletableTransformer;", "isInitialUpdates", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.updates.z */
public final class C11085z implements InitialUpdatesStatusProvider, UpdatesStatusProvider {
    /* renamed from: a */
    private final BehaviorProcessor<Status> f35864a = BehaviorProcessor.q();
    /* renamed from: b */
    private final PublishProcessor<UpdatesStatusProvider.Status> f35865b = PublishProcessor.q();
    /* renamed from: c */
    private final ac f35866c;
    /* renamed from: d */
    private final ai f35867d;
    /* renamed from: e */
    private final af f35868e;
    /* renamed from: f */
    private final C10738l f35869f;
    /* renamed from: g */
    private final C11035a f35870g;
    /* renamed from: h */
    private final LastActivityDateRepository f35871h;
    /* renamed from: i */
    private final PollIntervalRepository f35872i;
    /* renamed from: j */
    private final BoostProfileFacesRepository f35873j;
    /* renamed from: k */
    private final BoostCursorRepository f35874k;
    /* renamed from: l */
    private final C8645h f35875l;
    /* renamed from: m */
    private final BlockMatches f35876m;
    /* renamed from: n */
    private final PlacesConfigProvider f35877n;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.z$a */
    static final class C11075a implements Action {
        /* renamed from: a */
        final /* synthetic */ C11085z f35850a;

        C11075a(C11085z c11085z) {
            this.f35850a = c11085z;
        }

        public final void run() {
            this.f35850a.f35875l.m36876a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lio/reactivex/disposables/Disposable;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.z$b */
    static final class C11076b<T> implements Consumer<Disposable> {
        /* renamed from: a */
        final /* synthetic */ C11085z f35851a;
        /* renamed from: b */
        final /* synthetic */ boolean f35852b;

        C11076b(C11085z c11085z, boolean z) {
            this.f35851a = c11085z;
            this.f35852b = z;
        }

        public /* synthetic */ void accept(Object obj) {
            m43750a((Disposable) obj);
        }

        /* renamed from: a */
        public final void m43750a(Disposable disposable) {
            if (this.f35852b == null) {
                this.f35851a.f35864a.onNext(Status.COMPLETED);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "Lorg/joda/time/DateTime;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.z$c */
    static final class C11077c<T, R> implements Function<DateTime, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ C11085z f35853a;

        C11077c(C11085z c11085z) {
            this.f35853a = c11085z;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43751a((DateTime) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3956a m43751a(@NotNull DateTime dateTime) {
            C2668g.b(dateTime, "it");
            return this.f35853a.f35871h.updateLastActivityDate(dateTime);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.z$d */
    static final class C11078d implements Action {
        /* renamed from: a */
        final /* synthetic */ C11085z f35854a;

        C11078d(C11085z c11085z) {
            this.f35854a = c11085z;
        }

        public final void run() {
            PlacesConfig placesConfig = this.f35854a.f35877n.get();
            if (placesConfig != null) {
                this.f35854a.f35877n.update(PlacesConfig.copy$default(placesConfig, 0, null, true, false, 10, null));
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.z$e */
    static final class C11079e implements Action {
        /* renamed from: a */
        final /* synthetic */ C11085z f35855a;
        /* renamed from: b */
        final /* synthetic */ PollInterval f35856b;

        C11079e(C11085z c11085z, PollInterval pollInterval) {
            this.f35855a = c11085z;
            this.f35856b = pollInterval;
        }

        public final void run() {
            PollInterval pollInterval = this.f35856b;
            if (pollInterval != null) {
                com.tinder.domain.updates.model.PollInterval a = this.f35855a.f35870g.m43704a(pollInterval);
                if (a != null) {
                    this.f35855a.f35872i.updatePollInterval(a);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.z$f */
    static final class C11080f implements Action {
        /* renamed from: a */
        final /* synthetic */ C11085z f35857a;
        /* renamed from: b */
        final /* synthetic */ C8815y f35858b;

        C11080f(C11085z c11085z, C8815y c8815y) {
            this.f35857a = c11085z;
            this.f35858b = c8815y;
        }

        public final void run() {
            this.f35857a.f35865b.onNext(new UpdatesStatusProvider.Status(this.f35858b.m37517b(), this.f35857a.m43762a(this.f35858b.m37518c())));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "kotlin.jvm.PlatformType", "insertions", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.z$g */
    static final class C11084g implements CompletableTransformer {
        /* renamed from: a */
        final /* synthetic */ C11085z f35862a;
        /* renamed from: b */
        final /* synthetic */ boolean f35863b;

        C11084g(C11085z c11085z, boolean z) {
            this.f35862a = c11085z;
            this.f35863b = z;
        }

        public /* synthetic */ CompletableSource apply(C3956a c3956a) {
            return m43753a(c3956a);
        }

        /* renamed from: a */
        public final C3956a m43753a(@NotNull C3956a c3956a) {
            C2668g.b(c3956a, "insertions");
            return C3956a.a(new CompletableSource[]{this.f35862a.m43755a(), c3956a.b(new Action() {
                public final void run() {
                    this.f35862a.f35875l.m36877b();
                    this.f35862a.f35864a.onNext(Status.COMPLETED);
                }
            }).a(new Consumer<Throwable>() {
                public /* synthetic */ void accept(Object obj) {
                    m43752a((Throwable) obj);
                }

                /* renamed from: a */
                public final void m43752a(Throwable th) {
                    Object obj;
                    th = this.f35862a.f35864a;
                    if (this.f35863b) {
                        obj = Status.FAILED;
                    } else {
                        obj = Status.COMPLETED;
                    }
                    th.onNext(obj);
                }
            }).d(new Action() {
                public final void run() {
                    this.f35862a.f35875l.m36878c();
                }
            })});
        }
    }

    @Inject
    public C11085z(@NotNull ac acVar, @NotNull ai aiVar, @NotNull af afVar, @NotNull C10738l c10738l, @NotNull C11035a c11035a, @NotNull LastActivityDateRepository lastActivityDateRepository, @NotNull PollIntervalRepository pollIntervalRepository, @NotNull BoostProfileFacesRepository boostProfileFacesRepository, @NotNull BoostCursorRepository boostCursorRepository, @NotNull C8645h c8645h, @NotNull BlockMatches blockMatches, @NotNull PlacesConfigProvider placesConfigProvider) {
        C2668g.b(acVar, "matchesHandler");
        C2668g.b(aiVar, "messagesHandler");
        C2668g.b(afVar, "messageLikesHandler");
        C2668g.b(c10738l, "dateTimeApiAdapter");
        C2668g.b(c11035a, "pollIntervalDomainApiAdapter");
        C2668g.b(lastActivityDateRepository, "lastActivityDateRepository");
        C2668g.b(pollIntervalRepository, "pollIntervalRepository");
        C2668g.b(boostProfileFacesRepository, "boostProfileFacesRepository");
        C2668g.b(boostCursorRepository, "boostCursorRepository");
        C2668g.b(c8645h, "transactionDelegate");
        C2668g.b(blockMatches, "blockMatches");
        C2668g.b(placesConfigProvider, "placesConfigProvider");
        this.f35866c = acVar;
        this.f35867d = aiVar;
        this.f35868e = afVar;
        this.f35869f = c10738l;
        this.f35870g = c11035a;
        this.f35871h = lastActivityDateRepository;
        this.f35872i = pollIntervalRepository;
        this.f35873j = boostProfileFacesRepository;
        this.f35874k = boostCursorRepository;
        this.f35875l = c8645h;
        this.f35876m = blockMatches;
        this.f35877n = placesConfigProvider;
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m43773a(@NotNull C8815y c8815y) {
        C2668g.b(c8815y, "updatesRequestContext");
        boolean a = c8815y.m37516a();
        Updates c = c8815y.m37518c();
        CompletableSource[] completableSourceArr = new CompletableSource[10];
        ac acVar = this.f35866c;
        List matches = c.matches();
        if (matches == null) {
            matches = C19301m.a();
        }
        completableSourceArr[0] = acVar.m37475a(matches, a);
        ai aiVar = this.f35867d;
        List matches2 = c.matches();
        if (matches2 == null) {
            matches2 = C19301m.a();
        }
        completableSourceArr[1] = aiVar.m37481a(matches2, a, a);
        completableSourceArr[2] = m43760a(c.blocks());
        af afVar = this.f35868e;
        matches2 = c.likedMessages();
        if (matches2 == null) {
            matches2 = C19301m.a();
        }
        completableSourceArr[3] = afVar.m37477a(matches2, a);
        completableSourceArr[4] = m43756a(c.boost());
        completableSourceArr[5] = m43765b(c.boost());
        completableSourceArr[6] = m43757a(c.places());
        completableSourceArr[7] = m43759a(c.lastActivityDate());
        completableSourceArr[8] = m43758a(c.pollInterval());
        completableSourceArr[9] = m43766b(c8815y);
        c8815y = C3956a.a(completableSourceArr).b(new C11076b(this, a)).a(m43754a(a));
        C2668g.a(c8815y, "Completable.concatArray(…action(isInitialUpdates))");
        return c8815y;
    }

    @NotNull
    public C3957b<Status> observeInitialUpdatesStatus() {
        C3957b<Status> j = this.f35864a.g().d().j();
        C2668g.a(j, "initialUpdatesStatusProc…  .onBackpressureLatest()");
        return j;
    }

    @NotNull
    public C3957b<UpdatesStatusProvider.Status> observeUpdatesStatus() {
        C3957b<UpdatesStatusProvider.Status> j = this.f35865b.g().d().j();
        C2668g.a(j, "updatesStatusProcessor\n …  .onBackpressureLatest()");
        return j;
    }

    /* renamed from: a */
    private final C3956a m43760a(List<String> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                return this.f35876m.execute((List) list);
            }
        }
        list = C3956a.a();
        C2668g.a(list, "Completable.complete()");
        return list;
    }

    /* renamed from: a */
    private final C3956a m43756a(Boost boost) {
        boost = boost != null ? boost.profiles() : null;
        if (boost == null) {
            boost = C19301m.a();
        }
        if (boost.isEmpty()) {
            boost = C3956a.a();
            C2668g.a(boost, "Completable.complete()");
            return boost;
        }
        boost = this.f35873j.addProfileUrls(boost).c();
        C2668g.a(boost, "boostProfileFacesReposit…         .toCompletable()");
        return boost;
    }

    /* renamed from: b */
    private final C3956a m43765b(Boost boost) {
        if (boost != null) {
            boost = boost.boostCursor();
            if (boost != null) {
                BoostCursorRepository boostCursorRepository = this.f35874k;
                C2668g.a(boost, "boostCursor");
                return boostCursorRepository.setBoostCursor(boost);
            }
        }
        boost = C3956a.a();
        C2668g.a(boost, "Completable.complete()");
        return boost;
    }

    /* renamed from: a */
    private final C3956a m43757a(Places places) {
        if (C2668g.a(places != null ? places.hasNew() : null, Boolean.valueOf(true)) != null) {
            places = C3956a.a((Action) new C11078d(this));
            C2668g.a(places, "Completable.fromAction {…          }\n            }");
            return places;
        }
        places = C3956a.a();
        C2668g.a(places, "Completable.complete()");
        return places;
    }

    /* renamed from: a */
    private final C3956a m43759a(String str) {
        if (str == null) {
            str = C3956a.a();
            C2668g.a(str, "Completable.complete()");
            return str;
        }
        str = C3960g.a(str).e(new aa(new UpdatesResponseHandler$updateLastActivityDate$1(this.f35869f))).d(new C11077c(this));
        C2668g.a(str, "Single.just(lastActivity…ate(it)\n                }");
        return str;
    }

    /* renamed from: a */
    private final C3956a m43758a(PollInterval pollInterval) {
        pollInterval = C3956a.a(new C11079e(this, pollInterval));
        C2668g.a(pollInterval, "Completable.fromAction {…inPollInterval)\n        }");
        return pollInterval;
    }

    /* renamed from: b */
    private final C3956a m43766b(C8815y c8815y) {
        c8815y = C3956a.a(new C11080f(this, c8815y));
        C2668g.a(c8815y, "Completable.fromAction {…              )\n        }");
        return c8815y;
    }

    /* renamed from: a */
    private final C3956a m43755a() {
        C3956a a = C3956a.a(new C11075a(this));
        C2668g.a(a, "Completable.fromAction {…gate.beginTransaction() }");
        return a;
    }

    /* renamed from: a */
    private final CompletableTransformer m43754a(boolean z) {
        return new C11084g(this, z);
    }

    /* renamed from: a */
    private final boolean m43762a(@NotNull Updates updates) {
        List blocks = updates.blocks();
        if ((blocks != null ? blocks.isEmpty() ^ 1 : 0) == 0 && updates.boost() == null) {
            blocks = updates.likedMessages();
            if ((blocks != null ? blocks.isEmpty() ^ 1 : 0) == 0) {
                updates = updates.matches();
                if ((updates != null ? ((Collection) updates).isEmpty() ^ 1 : null) == null) {
                    return false;
                }
            }
        }
        return true;
    }
}
