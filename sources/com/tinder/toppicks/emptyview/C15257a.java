package com.tinder.toppicks.emptyview;

import com.tinder.domain.common.model.Photo;
import com.tinder.domain.injection.qualifiers.DefaultDateTimeProvider;
import com.tinder.domain.meta.model.CurrentUser;
import com.tinder.domain.meta.usecase.ObserveCurrentUser;
import com.tinder.domain.toppicks.TopPicksLoadingStatus;
import com.tinder.domain.toppicks.TopPicksLoadingStatusProvider;
import com.tinder.domain.toppicks.model.TopPicksSession;
import com.tinder.domain.toppicks.repo.TopPicksSessionRepository;
import com.tinder.domain.toppicks.usecase.ResetTopPickSession;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.recs.domain.model.CustomRecEngineResetReason.RetryOnError;
import com.tinder.toppicks.emptyview.TopPicksEmptyView.Page;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0016\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\nH\u0002J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0006\u0010\u001c\u001a\u00020\u0013J\b\u0010\u0002\u001a\u00020\u0013H\u0002J\b\u0010\u001d\u001a\u00020\u0013H\u0002J\b\u0010\u001e\u001a\u00020\u0013H\u0002J\u000e\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010 \u001a\u00020\u0013R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/tinder/toppicks/emptyview/TopPicksEmptyPresenter;", "", "observeCurrentUser", "Lcom/tinder/domain/meta/usecase/ObserveCurrentUser;", "topPicksLoadingStatusProvider", "Lcom/tinder/domain/toppicks/TopPicksLoadingStatusProvider;", "resetTopPickSession", "Lcom/tinder/domain/toppicks/usecase/ResetTopPickSession;", "dateTimeProvider", "Lkotlin/Function0;", "Lorg/joda/time/DateTime;", "topPicksSessionRepository", "Lcom/tinder/domain/toppicks/repo/TopPicksSessionRepository;", "(Lcom/tinder/domain/meta/usecase/ObserveCurrentUser;Lcom/tinder/domain/toppicks/TopPicksLoadingStatusProvider;Lcom/tinder/domain/toppicks/usecase/ResetTopPickSession;Lkotlin/jvm/functions/Function0;Lcom/tinder/domain/toppicks/repo/TopPicksSessionRepository;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "target", "Lcom/tinder/toppicks/emptyview/TopPicksEmptyViewTarget;", "bindPhoto", "", "photos", "", "Lcom/tinder/domain/common/model/Photo;", "bindRefreshTime", "refreshTime", "bindStatus", "status", "Lcom/tinder/domain/toppicks/TopPicksLoadingStatus;", "dropTarget", "observeTopPicksLoadingStatus", "observeTopPicksSessionRefreshTime", "takeTarget", "tryAgain", "toppicks_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.emptyview.a */
public final class C15257a {
    /* renamed from: a */
    private TopPicksEmptyViewTarget f47366a;
    /* renamed from: b */
    private C17356a f47367b = new C17356a();
    /* renamed from: c */
    private final ObserveCurrentUser f47368c;
    /* renamed from: d */
    private final TopPicksLoadingStatusProvider f47369d;
    /* renamed from: e */
    private final ResetTopPickSession f47370e;
    /* renamed from: f */
    private final Function0<DateTime> f47371f;
    /* renamed from: g */
    private final TopPicksSessionRepository f47372g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/meta/model/CurrentUser;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.emptyview.a$a */
    static final class C17016a<T> implements Consumer<CurrentUser> {
        /* renamed from: a */
        final /* synthetic */ C15257a f52446a;

        C17016a(C15257a c15257a) {
            this.f52446a = c15257a;
        }

        public /* synthetic */ void accept(Object obj) {
            m62798a((CurrentUser) obj);
        }

        /* renamed from: a */
        public final void m62798a(CurrentUser currentUser) {
            C15257a c15257a = this.f52446a;
            List photos = currentUser.photos();
            C2668g.a(photos, "it.photos()");
            c15257a.m57352a(photos);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.emptyview.a$b */
    static final class C17017b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17017b f52447a = new C17017b();

        C17017b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62799a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62799a(Throwable th) {
            C0001a.c(th, "Error observing current user.", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.emptyview.a$c */
    static final class C17018c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17018c f52448a = new C17018c();

        C17018c() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62800a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62800a(Throwable th) {
            C0001a.c(th, "Error observing loading status", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lorg/joda/time/DateTime;", "it", "Lcom/tinder/domain/toppicks/model/TopPicksSession;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.emptyview.a$d */
    static final class C17019d<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C17019d f52449a = new C17019d();

        C17019d() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62801a((TopPicksSession) obj);
        }

        @NotNull
        /* renamed from: a */
        public final DateTime m62801a(@NotNull TopPicksSession topPicksSession) {
            C2668g.b(topPicksSession, "it");
            return topPicksSession.getRefreshTime();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.emptyview.a$e */
    static final class C17020e<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17020e f52450a = new C17020e();

        C17020e() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62802a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62802a(Throwable th) {
            C0001a.c(th, "Error observing session", new Object[0]);
        }
    }

    @Inject
    public C15257a(@NotNull ObserveCurrentUser observeCurrentUser, @NotNull TopPicksLoadingStatusProvider topPicksLoadingStatusProvider, @NotNull ResetTopPickSession resetTopPickSession, @NotNull @DefaultDateTimeProvider Function0<DateTime> function0, @NotNull TopPicksSessionRepository topPicksSessionRepository) {
        C2668g.b(observeCurrentUser, "observeCurrentUser");
        C2668g.b(topPicksLoadingStatusProvider, "topPicksLoadingStatusProvider");
        C2668g.b(resetTopPickSession, "resetTopPickSession");
        C2668g.b(function0, "dateTimeProvider");
        C2668g.b(topPicksSessionRepository, "topPicksSessionRepository");
        this.f47368c = observeCurrentUser;
        this.f47369d = topPicksLoadingStatusProvider;
        this.f47370e = resetTopPickSession;
        this.f47371f = function0;
        this.f47372g = topPicksSessionRepository;
    }

    /* renamed from: a */
    public final void m57358a(@NotNull TopPicksEmptyViewTarget topPicksEmptyViewTarget) {
        C2668g.b(topPicksEmptyViewTarget, "target");
        this.f47366a = topPicksEmptyViewTarget;
        m57354c();
        m57355d();
        m57356e();
    }

    /* renamed from: a */
    public final void m57357a() {
        this.f47367b.m63446a();
        this.f47366a = (TopPicksEmptyViewTarget) null;
    }

    /* renamed from: b */
    public final void m57359b() {
        this.f47370e.execute(RetryOnError.INSTANCE);
    }

    /* renamed from: c */
    private final void m57354c() {
        this.f47367b.add(RxJavaInteropExtKt.toV2Observable(this.f47368c.execute()).subscribeOn(C15756a.m59010b()).observeOn(C15674a.m58830a()).subscribe(new C17016a(this), C17017b.f52447a));
    }

    /* renamed from: d */
    private final void m57355d() {
        this.f47367b.add(this.f47369d.observeLoadingStatus().distinctUntilChanged().subscribeOn(C15756a.m59010b()).observeOn(C15674a.m58830a()).subscribe(new C17021c(new TopPicksEmptyPresenter$observeTopPicksLoadingStatus$1(this)), C17018c.f52448a));
    }

    /* renamed from: e */
    private final void m57356e() {
        this.f47367b.add(this.f47372g.observeTopPicksSession().b(C15756a.m59010b()).f(C17019d.f52449a).d().a(C15674a.m58830a()).a(new C17021c(new TopPicksEmptyPresenter$observeTopPicksSessionRefreshTime$2(this)), C17020e.f52450a));
    }

    /* renamed from: a */
    private final void m57353a(DateTime dateTime) {
        long millis = dateTime.getMillis() - ((DateTime) this.f47371f.invoke()).getMillis();
        dateTime = this.f47366a;
        if (dateTime != null) {
            dateTime.setCountdownTime(millis);
        }
    }

    /* renamed from: a */
    private final void m57348a(TopPicksLoadingStatus topPicksLoadingStatus) {
        switch (C15258b.f47373a[topPicksLoadingStatus.ordinal()]) {
            case 1:
                topPicksLoadingStatus = this.f47366a;
                if (topPicksLoadingStatus != null) {
                    topPicksLoadingStatus.showPage(Page.EMPTY_VIEW);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
                topPicksLoadingStatus = this.f47366a;
                if (topPicksLoadingStatus != null) {
                    topPicksLoadingStatus.showPage(Page.LOADING);
                    return;
                }
                return;
            case 5:
            case 6:
                topPicksLoadingStatus = this.f47366a;
                if (topPicksLoadingStatus != null) {
                    topPicksLoadingStatus.showPage(Page.ERROR);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private final void m57352a(List<? extends Photo> list) {
        Photo photo = (Photo) C19299w.m68831g((List) list);
        if (photo != null) {
            TopPicksEmptyViewTarget topPicksEmptyViewTarget = this.f47366a;
            if (topPicksEmptyViewTarget != null) {
                list = photo.url();
                C2668g.a(list, "it.url()");
                topPicksEmptyViewTarget.setProfileImage(list);
            }
        }
    }
}
