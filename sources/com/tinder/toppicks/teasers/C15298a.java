package com.tinder.toppicks.teasers;

import com.tinder.domain.toppicks.TopPicksLoadingStatus;
import com.tinder.domain.toppicks.TopPicksLoadingStatusNotifier;
import com.tinder.domain.toppicks.model.TopPickTeaser;
import com.tinder.domain.toppicks.model.TopPicksSession;
import com.tinder.domain.toppicks.repo.TopPicksRepository;
import com.tinder.domain.toppicks.usecase.GetTopPicksRefreshTime;
import com.tinder.domain.toppicks.usecase.UpdateTopPicksSession;
import com.tinder.toppicks.p430a.C15223c;
import io.reactivex.C3956a;
import io.reactivex.C3960g;
import io.reactivex.CompletableSource;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0016\u0010\u0014\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0016\u0010\u0015\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/toppicks/teasers/SyncTopPicksTeasers;", "", "topPicksRepository", "Lcom/tinder/domain/toppicks/repo/TopPicksRepository;", "getTopPicksRefreshTime", "Lcom/tinder/domain/toppicks/usecase/GetTopPicksRefreshTime;", "updateTopPicksSession", "Lcom/tinder/domain/toppicks/usecase/UpdateTopPicksSession;", "sendTopPicksEmptyStateViewEvent", "Lcom/tinder/toppicks/analytics/SendTopPicksEmptyStateViewEvent;", "topPicksLoadingStatusNotifier", "Lcom/tinder/domain/toppicks/TopPicksLoadingStatusNotifier;", "(Lcom/tinder/domain/toppicks/repo/TopPicksRepository;Lcom/tinder/domain/toppicks/usecase/GetTopPicksRefreshTime;Lcom/tinder/domain/toppicks/usecase/UpdateTopPicksSession;Lcom/tinder/toppicks/analytics/SendTopPicksEmptyStateViewEvent;Lcom/tinder/domain/toppicks/TopPicksLoadingStatusNotifier;)V", "execute", "Lio/reactivex/Completable;", "sendTopPicksExhaustedEventIfNecessary", "", "teasers", "", "Lcom/tinder/domain/toppicks/model/TopPickTeaser;", "updateSession", "updateTopPicksStatus", "toppicks_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.teasers.a */
public final class C15298a {
    /* renamed from: a */
    private final TopPicksRepository f47455a;
    /* renamed from: b */
    private final GetTopPicksRefreshTime f47456b;
    /* renamed from: c */
    private final UpdateTopPicksSession f47457c;
    /* renamed from: d */
    private final C15223c f47458d;
    /* renamed from: e */
    private final TopPicksLoadingStatusNotifier f47459e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a0\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "Lcom/tinder/domain/toppicks/model/TopPickTeaser;", "kotlin.jvm.PlatformType", "it", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.teasers.a$a */
    static final class C17112a<T, R> implements Function<T, SingleSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C15298a f52622a;

        C17112a(C15298a c15298a) {
            this.f52622a = c15298a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62982a((List) obj);
        }

        /* renamed from: a */
        public final C3960g<List<TopPickTeaser>> m62982a(@NotNull List<TopPickTeaser> list) {
            C2668g.b(list, "it");
            if (list.isEmpty()) {
                return this.f52622a.f47455a.retrieveFreshTeasers();
            }
            return C3960g.a(list);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lio/reactivex/disposables/Disposable;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.teasers.a$b */
    static final class C17113b<T> implements Consumer<Disposable> {
        /* renamed from: a */
        final /* synthetic */ C15298a f52623a;

        C17113b(C15298a c15298a) {
            this.f52623a = c15298a;
        }

        public /* synthetic */ void accept(Object obj) {
            m62983a((Disposable) obj);
        }

        /* renamed from: a */
        public final void m62983a(Disposable disposable) {
            this.f52623a.f47459e.update(TopPicksLoadingStatus.LOADING_FIRST_TIME);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/tinder/domain/toppicks/model/TopPickTeaser;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.teasers.a$c */
    static final class C17114c<T> implements Consumer<List<? extends TopPickTeaser>> {
        /* renamed from: a */
        final /* synthetic */ C15298a f52624a;

        C17114c(C15298a c15298a) {
            this.f52624a = c15298a;
        }

        public /* synthetic */ void accept(Object obj) {
            m62984a((List) obj);
        }

        /* renamed from: a */
        public final void m62984a(List<TopPickTeaser> list) {
            C15298a c15298a = this.f52624a;
            C2668g.a(list, "it");
            c15298a.m57436c(list);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.teasers.a$d */
    static final class C17115d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C15298a f52625a;

        C17115d(C15298a c15298a) {
            this.f52625a = c15298a;
        }

        public /* synthetic */ void accept(Object obj) {
            m62985a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62985a(Throwable th) {
            this.f52625a.f47459e.update(TopPicksLoadingStatus.ERROR);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "", "Lcom/tinder/domain/toppicks/model/TopPickTeaser;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.teasers.a$e */
    static final class C17116e<T, R> implements Function<List<? extends TopPickTeaser>, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ C15298a f52626a;

        C17116e(C15298a c15298a) {
            this.f52626a = c15298a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62986a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3956a m62986a(@NotNull List<TopPickTeaser> list) {
            C2668g.b(list, "it");
            return this.f52626a.f47455a.saveLocalTeasers(list);
        }
    }

    @Inject
    public C15298a(@NotNull TopPicksRepository topPicksRepository, @NotNull GetTopPicksRefreshTime getTopPicksRefreshTime, @NotNull UpdateTopPicksSession updateTopPicksSession, @NotNull C15223c c15223c, @NotNull TopPicksLoadingStatusNotifier topPicksLoadingStatusNotifier) {
        C2668g.b(topPicksRepository, "topPicksRepository");
        C2668g.b(getTopPicksRefreshTime, "getTopPicksRefreshTime");
        C2668g.b(updateTopPicksSession, "updateTopPicksSession");
        C2668g.b(c15223c, "sendTopPicksEmptyStateViewEvent");
        C2668g.b(topPicksLoadingStatusNotifier, "topPicksLoadingStatusNotifier");
        this.f47455a = topPicksRepository;
        this.f47456b = getTopPicksRefreshTime;
        this.f47457c = updateTopPicksSession;
        this.f47458d = c15223c;
        this.f47459e = topPicksLoadingStatusNotifier;
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m57437a() {
        C3956a e = this.f47455a.observeTeaserRecs().e(new C17112a(this)).e().b(new C17113b(this)).c(new C17114c(this)).a(new C17115d(this)).e(new C17116e(this));
        C2668g.a(e, "topPicksRepository.obser…ry.saveLocalTeasers(it) }");
        return e;
    }

    /* renamed from: a */
    private final void m57433a(List<TopPickTeaser> list) {
        this.f47457c.execute(new TopPicksSession(this.f47456b.execute().getTime(), false, list.isEmpty() ^ 1, false, false, 26, null));
    }

    /* renamed from: b */
    private final void m57435b(List<TopPickTeaser> list) {
        if ((list.isEmpty() ^ 1) == null) {
            this.f47458d.m57290a();
        }
    }

    /* renamed from: c */
    private final void m57436c(List<TopPickTeaser> list) {
        if (this.f47456b.execute().getTime().i()) {
            this.f47459e.update(TopPicksLoadingStatus.ERROR);
            return;
        }
        this.f47459e.update(TopPicksLoadingStatus.SUCCESS);
        m57433a((List) list);
        m57435b((List) list);
    }
}
