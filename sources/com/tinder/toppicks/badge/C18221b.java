package com.tinder.toppicks.badge;

import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.discovery.p235d.C11140a;
import com.tinder.discovery.p235d.C11140a.C8891a;
import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.injection.qualifiers.DefaultDateTimeProvider;
import com.tinder.domain.toppicks.repo.TopPicksApplicationRepository;
import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/toppicks/badge/TopPicksBadgeTrigger;", "Lcom/tinder/discovery/trigger/DiscoveryTabBadgeTrigger;", "topPicksApplicationRepository", "Lcom/tinder/domain/toppicks/repo/TopPicksApplicationRepository;", "dateTimeProvider", "Lkotlin/Function0;", "Lorg/joda/time/DateTime;", "topPicksConfig", "Lcom/tinder/domain/config/TopPicksConfig;", "segmentAppearRelay", "Lio/reactivex/Observable;", "", "badgeOwnerAdapter", "Lcom/tinder/discovery/trigger/DiscoveryTabBadgeTrigger$BadgeOwnerAdapter;", "(Lcom/tinder/domain/toppicks/repo/TopPicksApplicationRepository;Lkotlin/jvm/functions/Function0;Lcom/tinder/domain/config/TopPicksConfig;Lio/reactivex/Observable;Lcom/tinder/discovery/trigger/DiscoveryTabBadgeTrigger$BadgeOwnerAdapter;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "onCancelled", "", "run", "toppicks_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.badge.b */
public final class C18221b extends C11140a {
    /* renamed from: a */
    private Disposable f56479a;
    /* renamed from: b */
    private final TopPicksApplicationRepository f56480b;
    /* renamed from: c */
    private final Function0<DateTime> f56481c;
    /* renamed from: d */
    private final TopPicksConfig f56482d;
    /* renamed from: e */
    private final C3959e<Boolean> f56483e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "test", "(Ljava/lang/Long;)Z"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.badge.b$a */
    static final class C16982a<T> implements Predicate<Long> {
        /* renamed from: a */
        public static final C16982a f52379a = new C16982a();

        C16982a() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m62748a((Long) obj);
        }

        /* renamed from: a */
        public final boolean m62748a(@NotNull Long l) {
            C2668g.b(l, "it");
            return l.longValue() != 0 ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "apply", "(Ljava/lang/Long;)Z"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.badge.b$b */
    static final class C16983b<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C18221b f52380a;

        C16983b(C18221b c18221b) {
            this.f52380a = c18221b;
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(m62749a((Long) obj));
        }

        /* renamed from: a */
        public final boolean m62749a(@NotNull Long l) {
            C2668g.b(l, "it");
            return ((DateTime) this.f52380a.f56481c.invoke()).d(l.longValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "shouldShow", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/Observable;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.badge.b$c */
    static final class C16985c<T, R> implements Function<T, ObservableSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C18221b f52382a;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "test", "(Ljava/lang/Boolean;)Z"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.toppicks.badge.b$c$1 */
        static final class C169841<T> implements Predicate<Boolean> {
            /* renamed from: a */
            public static final C169841 f52381a = new C169841();

            C169841() {
            }

            public /* synthetic */ boolean test(Object obj) {
                return m62750a((Boolean) obj);
            }

            /* renamed from: a */
            public final boolean m62750a(@NotNull Boolean bool) {
                C2668g.b(bool, "it");
                return bool.booleanValue() ^ 1;
            }
        }

        C16985c(C18221b c18221b) {
            this.f52382a = c18221b;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62751a((Boolean) obj);
        }

        /* renamed from: a */
        public final C3959e<Boolean> m62751a(@NotNull Boolean bool) {
            C2668g.b(bool, "shouldShow");
            if (bool.booleanValue() != null) {
                return this.f52382a.f56483e.skipWhile(C169841.f52381a);
            }
            return C3959e.just(Boolean.valueOf(null));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "shouldShow", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.badge.b$d */
    static final class C16986d<T> implements Consumer<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C18221b f52383a;

        C16986d(C18221b c18221b) {
            this.f52383a = c18221b;
        }

        public /* synthetic */ void accept(Object obj) {
            m62752a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m62752a(Boolean bool) {
            C2668g.a(bool, "shouldShow");
            if (bool.booleanValue() != null) {
                this.f52383a.a(true);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.badge.b$e */
    static final class C16987e<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16987e f52384a = new C16987e();

        C16987e() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62753a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62753a(Throwable th) {
            C0001a.c(th, "error retrieving top picks badge trigger", new Object[0]);
        }
    }

    public C18221b(@NotNull TopPicksApplicationRepository topPicksApplicationRepository, @NotNull @DefaultDateTimeProvider Function0<DateTime> function0, @NotNull TopPicksConfig topPicksConfig, @NotNull C3959e<Boolean> c3959e, @NotNull C8891a c8891a) {
        C2668g.b(topPicksApplicationRepository, "topPicksApplicationRepository");
        C2668g.b(function0, "dateTimeProvider");
        C2668g.b(topPicksConfig, "topPicksConfig");
        C2668g.b(c3959e, "segmentAppearRelay");
        C2668g.b(c8891a, "badgeOwnerAdapter");
        super(DiscoverySegment.TOP_PICKS, c8891a);
        this.f56480b = topPicksApplicationRepository;
        this.f56481c = function0;
        this.f56482d = topPicksConfig;
        this.f56483e = c3959e;
    }

    public void u_() {
        if (this.f56482d.isEnabled()) {
            this.f56479a = C3959e.just(Long.valueOf(this.f56480b.getNotificationScheduleTime())).subscribeOn(C15756a.m59010b()).filter(C16982a.f52379a).map(new C16983b(this)).switchMap(new C16985c(this)).firstOrError().a(C15674a.m58830a()).a(new C16986d(this), C16987e.f52384a);
        }
    }

    /* renamed from: d */
    public void m66046d() {
        Disposable disposable = this.f56479a;
        if (disposable != null) {
            disposable.dispose();
        }
    }
}
