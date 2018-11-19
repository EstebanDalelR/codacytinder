package com.tinder.fastmatch.analytics;

import com.tinder.api.ManagerWebServices;
import com.tinder.boost.p178a.C10400d;
import com.tinder.domain.fastmatch.provider.FastMatchStatusProvider;
import com.tinder.domain.fastmatch.repository.NewCountRepository;
import com.tinder.etl.event.kk;
import com.tinder.etl.event.kn;
import com.tinder.etl.event.ko;
import com.tinder.etl.event.kt;
import com.tinder.etl.event.ku;
import com.tinder.etl.event.kw;
import com.tinder.fastmatch.FastMatchRecsActivitySource;
import com.tinder.fastmatch.p245c.C9378a;
import com.tinder.fastmatch.view.FastMatchRecsActivity.Source;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u001f B1\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\f\u0010\u001d\u001a\u00020\u001e*\u00020\u0003H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/tinder/fastmatch/analytics/LikesYouListEtlEventsFactory;", "", "source", "Lcom/tinder/fastmatch/view/FastMatchRecsActivity$Source;", "fastMatchStatusProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;", "fastMatchSessionManager", "Lcom/tinder/fastmatch/analytics/FastMatchSessionManager;", "boostInteractor", "Lcom/tinder/boost/interactor/BoostInteractor;", "newCountRepository", "Lcom/tinder/domain/fastmatch/repository/NewCountRepository;", "(Lcom/tinder/fastmatch/view/FastMatchRecsActivity$Source;Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;Lcom/tinder/fastmatch/analytics/FastMatchSessionManager;Lcom/tinder/boost/interactor/BoostInteractor;Lcom/tinder/domain/fastmatch/repository/NewCountRepository;)V", "create", "Lcom/tinder/etl/event/LikesYouListEvent;", "createCommonFields", "Lcom/tinder/fastmatch/analytics/LikesYouListEtlEventsFactory$CommonFields;", "createConnectionFail", "Lcom/tinder/etl/event/LikesYouListConnectionFailEvent;", "createExit", "Lcom/tinder/etl/event/LikesYouListExitEvent;", "createPillChange", "Lcom/tinder/etl/event/LikesYouPillChangeEvent;", "createPillCountCheck", "Lcom/tinder/etl/event/LikesYouPillCountCheckEvent;", "createPillReset", "Lcom/tinder/etl/event/LikesYouPillResetEvent;", "from", "", "getStringValue", "", "CommonFields", "PillResetSource", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class LikesYouListEtlEventsFactory {
    /* renamed from: a */
    private final Source f31438a;
    /* renamed from: b */
    private final FastMatchStatusProvider f31439b;
    /* renamed from: c */
    private final C9372g f31440c;
    /* renamed from: d */
    private final C10400d f31441d;
    /* renamed from: e */
    private final NewCountRepository f31442e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/tinder/fastmatch/analytics/LikesYouListEtlEventsFactory$PillResetSource;", "", "source", "", "(Ljava/lang/String;II)V", "getSource", "()I", "TAP", "PULL_TO_REFRESH", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum PillResetSource {
        ;
        
        private final int source;

        protected PillResetSource(int i) {
            this.source = i;
        }

        public final int getSource() {
            return this.source;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/tinder/fastmatch/analytics/LikesYouListEtlEventsFactory$CommonFields;", "", "likes", "", "swipes", "numAvailable", "source", "", "duration", "(IIILjava/lang/String;I)V", "getDuration", "()I", "getLikes", "getNumAvailable", "getSource", "()Ljava/lang/String;", "getSwipes", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.analytics.LikesYouListEtlEventsFactory$a */
    private static final class C9371a {
        /* renamed from: a */
        private final int f31433a;
        /* renamed from: b */
        private final int f31434b;
        /* renamed from: c */
        private final int f31435c;
        @NotNull
        /* renamed from: d */
        private final String f31436d;
        /* renamed from: e */
        private final int f31437e;

        public C9371a() {
            this(0, 0, 0, null, 0, 31, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9371a) {
                C9371a c9371a = (C9371a) obj;
                if ((this.f31433a == c9371a.f31433a ? 1 : null) != null) {
                    if ((this.f31434b == c9371a.f31434b ? 1 : null) != null) {
                        if ((this.f31435c == c9371a.f31435c ? 1 : null) != null && C2668g.a(this.f31436d, c9371a.f31436d)) {
                            if ((this.f31437e == c9371a.f31437e ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            int i = ((((this.f31433a * 31) + this.f31434b) * 31) + this.f31435c) * 31;
            String str = this.f31436d;
            return ((i + (str != null ? str.hashCode() : 0)) * 31) + this.f31437e;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CommonFields(likes=");
            stringBuilder.append(this.f31433a);
            stringBuilder.append(", swipes=");
            stringBuilder.append(this.f31434b);
            stringBuilder.append(", numAvailable=");
            stringBuilder.append(this.f31435c);
            stringBuilder.append(", source=");
            stringBuilder.append(this.f31436d);
            stringBuilder.append(", duration=");
            stringBuilder.append(this.f31437e);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9371a(int i, int i2, int i3, @NotNull String str, int i4) {
            C2668g.b(str, "source");
            this.f31433a = i;
            this.f31434b = i2;
            this.f31435c = i3;
            this.f31436d = str;
            this.f31437e = i4;
        }

        /* renamed from: a */
        public final int m39233a() {
            return this.f31433a;
        }

        /* renamed from: b */
        public final int m39234b() {
            return this.f31434b;
        }

        /* renamed from: c */
        public final int m39235c() {
            return this.f31435c;
        }

        @NotNull
        /* renamed from: d */
        public final String m39236d() {
            return this.f31436d;
        }

        public /* synthetic */ C9371a(int i, int i2, int i3, String str, int i4, int i5, C15823e c15823e) {
            c15823e = (i5 & 1) != null ? null : i;
            int i6 = (i5 & 2) != 0 ? 0 : i2;
            int i7 = (i5 & 4) != 0 ? 0 : i3;
            if ((i5 & 8) != 0) {
                str = "";
            }
            this(c15823e, i6, i7, str, (i5 & 16) != 0 ? 0 : i4);
        }

        /* renamed from: e */
        public final int m39237e() {
            return this.f31437e;
        }
    }

    @Inject
    public LikesYouListEtlEventsFactory(@NotNull @FastMatchRecsActivitySource Source source, @NotNull FastMatchStatusProvider fastMatchStatusProvider, @NotNull C9372g c9372g, @NotNull C10400d c10400d, @NotNull NewCountRepository newCountRepository) {
        C2668g.b(source, "source");
        C2668g.b(fastMatchStatusProvider, "fastMatchStatusProvider");
        C2668g.b(c9372g, "fastMatchSessionManager");
        C2668g.b(c10400d, "boostInteractor");
        C2668g.b(newCountRepository, "newCountRepository");
        this.f31438a = source;
        this.f31439b = fastMatchStatusProvider;
        this.f31440c = c9372g;
        this.f31441d = c10400d;
        this.f31442e = newCountRepository;
    }

    @NotNull
    /* renamed from: a */
    public final kn m39240a() {
        C9371a f = m39239f();
        kn a = kn.m45592a().m38485a((Number) Integer.valueOf(f.m39235c())).m38486a(f.m39236d()).m38487a();
        C2668g.a(a, "LikesYouListEvent.builde…\n                .build()");
        return a;
    }

    @NotNull
    /* renamed from: b */
    public final kt m39242b() {
        kt a = kt.m45614a().m38495a(Boolean.valueOf(this.f31441d.isUserBoosting())).m38499c(Integer.valueOf(this.f31440c.m39249b())).m38498b(Integer.valueOf(this.f31440c.m39251c())).m38500d(Integer.valueOf(this.f31440c.m39247a())).m38496a((Number) Long.valueOf(this.f31440c.m39263o())).m38502f(Integer.valueOf(this.f31440c.m39265q())).m38501e(Integer.valueOf(this.f31440c.m39264p())).m38497a();
        C2668g.a(a, "LikesYouPillChangeEvent.…\n                .build()");
        return a;
    }

    @NotNull
    /* renamed from: c */
    public final ku m39243c() {
        ku a = ku.m45631a().m38503a(Integer.valueOf(this.f31440c.m39253e())).m38505b(Integer.valueOf(this.f31442e.latestCount())).m38506c(Integer.valueOf(this.f31440c.m39252d())).m38504a();
        C2668g.a(a, "LikesYouPillCountCheckEv…\n                .build()");
        return a;
    }

    @NotNull
    /* renamed from: a */
    public final kw m39241a(@NotNull Number number) {
        C2668g.b(number, ManagerWebServices.PARAM_FROM);
        number = kw.m45641a().m38507a(Boolean.valueOf(this.f31441d.isUserBoosting())).m38510b(Integer.valueOf(this.f31440c.m39251c())).m38511c(Integer.valueOf(this.f31440c.m39247a())).m38508a((Number) Long.valueOf(this.f31440c.m39263o())).m38512d(Integer.valueOf(this.f31440c.m39264p())).m38514f(Integer.valueOf(this.f31440c.m39254f())).m38513e(number).m38509a();
        C2668g.a(number, "LikesYouPillResetEvent.b…\n                .build()");
        return number;
    }

    @NotNull
    /* renamed from: d */
    public final ko m39244d() {
        C9371a f = m39239f();
        ko a = ko.m45599a().m38492c(Integer.valueOf(f.m39235c())).m38489a(f.m39236d()).m38488a((Number) Integer.valueOf(f.m39233a())).m38491b(Integer.valueOf(f.m39234b())).m38493d(Integer.valueOf(f.m39237e())).m38494e(Integer.valueOf(this.f31440c.m39255g())).m38490a();
        C2668g.a(a, "LikesYouListExitEvent.bu…\n                .build()");
        return a;
    }

    @NotNull
    /* renamed from: e */
    public final kk m39245e() {
        kk a = kk.m45589a().m38484a();
        C2668g.a(a, "LikesYouListConnectionFailEvent.builder().build()");
        return a;
    }

    /* renamed from: f */
    private final C9371a m39239f() {
        C9378a h = this.f31440c.m39256h();
        return new C9371a(h.m39275b(), h.m39273a(), this.f31439b.get().getCount(), m39238a(this.f31438a), h.m39276c());
    }

    /* renamed from: a */
    private final String m39238a(@NotNull Source source) {
        switch (source) {
            case PUSH:
                return "Push";
            case MATCH_LIST:
            case MATCH_LIST_EMPTY:
                return "Match List";
            case PLACES:
                return "Places";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
