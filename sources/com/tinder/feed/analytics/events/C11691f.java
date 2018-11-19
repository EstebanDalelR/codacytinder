package com.tinder.feed.analytics.events;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.gj;
import com.tinder.etl.event.gj.C9088a;
import com.tinder.feed.analytics.SessionDestination;
import com.tinder.feed.analytics.SessionSource;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.Single;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/feed/analytics/events/FeedSessionEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/feed/analytics/events/FeedSessionEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "createEvent", "Lrx/Single;", "Lcom/tinder/etl/event/FeedSessionEvent;", "request", "execute", "", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.events.f */
public final class C11691f implements VoidUseCase<C9438a> {
    /* renamed from: a */
    private final C2630h f38192a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b+\b\b\u0018\u00002\u00020\u0001B\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\t\u00100\u001a\u00020\u000bHÆ\u0003J\t\u00101\u001a\u00020\u000bHÆ\u0003J\t\u00102\u001a\u00020\u000bHÆ\u0003J\t\u00103\u001a\u00020\u0016HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\tHÆ\u0003J\t\u00107\u001a\u00020\u000bHÆ\u0003J\t\u00108\u001a\u00020\u000bHÆ\u0003J\t\u00109\u001a\u00020\u000bHÆ\u0003J\t\u0010:\u001a\u00020\u000bHÆ\u0003J\t\u0010;\u001a\u00020\u000bHÆ\u0003J\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u0016HÆ\u0001J\u0013\u0010=\u001a\u00020\t2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\u000bHÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0011\u0010\u0014\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0011\u0010\u0013\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006A"}, d2 = {"Lcom/tinder/feed/analytics/events/FeedSessionEventDispatcher$Request;", "", "feedSessionId", "", "sessionSource", "Lcom/tinder/feed/analytics/SessionSource;", "destination", "Lcom/tinder/feed/analytics/SessionDestination;", "unseenActivityBadge", "", "numActivitiesViewed", "", "numActivitiesTotal", "numFetches", "numActivitiesFetched", "numOtherIdInActivitiesFetched", "numOtherIdInActivitiesViewed", "positionStart", "positionEnd", "positionMin", "positionMax", "durationInMillis", "", "(Ljava/lang/String;Lcom/tinder/feed/analytics/SessionSource;Lcom/tinder/feed/analytics/SessionDestination;ZIIIIIIIIIIJ)V", "getDestination", "()Lcom/tinder/feed/analytics/SessionDestination;", "getDurationInMillis", "()J", "getFeedSessionId", "()Ljava/lang/String;", "getNumActivitiesFetched", "()I", "getNumActivitiesTotal", "getNumActivitiesViewed", "getNumFetches", "getNumOtherIdInActivitiesFetched", "getNumOtherIdInActivitiesViewed", "getPositionEnd", "getPositionMax", "getPositionMin", "getPositionStart", "getSessionSource", "()Lcom/tinder/feed/analytics/SessionSource;", "getUnseenActivityBadge", "()Z", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.events.f$a */
    public static final class C9438a {
        @NotNull
        /* renamed from: a */
        private final String f31616a;
        @NotNull
        /* renamed from: b */
        private final SessionSource f31617b;
        @NotNull
        /* renamed from: c */
        private final SessionDestination f31618c;
        /* renamed from: d */
        private final boolean f31619d;
        /* renamed from: e */
        private final int f31620e;
        /* renamed from: f */
        private final int f31621f;
        /* renamed from: g */
        private final int f31622g;
        /* renamed from: h */
        private final int f31623h;
        /* renamed from: i */
        private final int f31624i;
        /* renamed from: j */
        private final int f31625j;
        /* renamed from: k */
        private final int f31626k;
        /* renamed from: l */
        private final int f31627l;
        /* renamed from: m */
        private final int f31628m;
        /* renamed from: n */
        private final int f31629n;
        /* renamed from: o */
        private final long f31630o;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9438a) {
                C9438a c9438a = (C9438a) obj;
                if (C2668g.a(this.f31616a, c9438a.f31616a) && C2668g.a(this.f31617b, c9438a.f31617b) && C2668g.a(this.f31618c, c9438a.f31618c)) {
                    if ((this.f31619d == c9438a.f31619d ? 1 : null) != null) {
                        if ((this.f31620e == c9438a.f31620e ? 1 : null) != null) {
                            if ((this.f31621f == c9438a.f31621f ? 1 : null) != null) {
                                if ((this.f31622g == c9438a.f31622g ? 1 : null) != null) {
                                    if ((this.f31623h == c9438a.f31623h ? 1 : null) != null) {
                                        if ((this.f31624i == c9438a.f31624i ? 1 : null) != null) {
                                            if ((this.f31625j == c9438a.f31625j ? 1 : null) != null) {
                                                if ((this.f31626k == c9438a.f31626k ? 1 : null) != null) {
                                                    if ((this.f31627l == c9438a.f31627l ? 1 : null) != null) {
                                                        if ((this.f31628m == c9438a.f31628m ? 1 : null) != null) {
                                                            if ((this.f31629n == c9438a.f31629n ? 1 : null) != null) {
                                                                if ((this.f31630o == c9438a.f31630o ? 1 : null) != null) {
                                                                    return true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            String str = this.f31616a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            SessionSource sessionSource = this.f31617b;
            hashCode = (hashCode + (sessionSource != null ? sessionSource.hashCode() : 0)) * 31;
            SessionDestination sessionDestination = this.f31618c;
            if (sessionDestination != null) {
                i = sessionDestination.hashCode();
            }
            hashCode = (hashCode + i) * 31;
            i = this.f31619d;
            if (i != 0) {
                i = 1;
            }
            hashCode = (((((((((((((((((((((hashCode + i) * 31) + this.f31620e) * 31) + this.f31621f) * 31) + this.f31622g) * 31) + this.f31623h) * 31) + this.f31624i) * 31) + this.f31625j) * 31) + this.f31626k) * 31) + this.f31627l) * 31) + this.f31628m) * 31) + this.f31629n) * 31;
            long j = this.f31630o;
            return hashCode + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(feedSessionId=");
            stringBuilder.append(this.f31616a);
            stringBuilder.append(", sessionSource=");
            stringBuilder.append(this.f31617b);
            stringBuilder.append(", destination=");
            stringBuilder.append(this.f31618c);
            stringBuilder.append(", unseenActivityBadge=");
            stringBuilder.append(this.f31619d);
            stringBuilder.append(", numActivitiesViewed=");
            stringBuilder.append(this.f31620e);
            stringBuilder.append(", numActivitiesTotal=");
            stringBuilder.append(this.f31621f);
            stringBuilder.append(", numFetches=");
            stringBuilder.append(this.f31622g);
            stringBuilder.append(", numActivitiesFetched=");
            stringBuilder.append(this.f31623h);
            stringBuilder.append(", numOtherIdInActivitiesFetched=");
            stringBuilder.append(this.f31624i);
            stringBuilder.append(", numOtherIdInActivitiesViewed=");
            stringBuilder.append(this.f31625j);
            stringBuilder.append(", positionStart=");
            stringBuilder.append(this.f31626k);
            stringBuilder.append(", positionEnd=");
            stringBuilder.append(this.f31627l);
            stringBuilder.append(", positionMin=");
            stringBuilder.append(this.f31628m);
            stringBuilder.append(", positionMax=");
            stringBuilder.append(this.f31629n);
            stringBuilder.append(", durationInMillis=");
            stringBuilder.append(this.f31630o);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9438a(@NotNull String str, @NotNull SessionSource sessionSource, @NotNull SessionDestination sessionDestination, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j) {
            String str2 = str;
            SessionSource sessionSource2 = sessionSource;
            SessionDestination sessionDestination2 = sessionDestination;
            C2668g.b(str2, "feedSessionId");
            C2668g.b(sessionSource2, "sessionSource");
            C2668g.b(sessionDestination2, "destination");
            this.f31616a = str2;
            this.f31617b = sessionSource2;
            this.f31618c = sessionDestination2;
            this.f31619d = z;
            this.f31620e = i;
            this.f31621f = i2;
            this.f31622g = i3;
            this.f31623h = i4;
            this.f31624i = i5;
            this.f31625j = i6;
            this.f31626k = i7;
            this.f31627l = i8;
            this.f31628m = i9;
            this.f31629n = i10;
            this.f31630o = j;
        }

        @NotNull
        /* renamed from: a */
        public final String m39453a() {
            return this.f31616a;
        }

        @NotNull
        /* renamed from: b */
        public final SessionSource m39454b() {
            return this.f31617b;
        }

        @NotNull
        /* renamed from: c */
        public final SessionDestination m39455c() {
            return this.f31618c;
        }

        /* renamed from: d */
        public final boolean m39456d() {
            return this.f31619d;
        }

        /* renamed from: e */
        public final int m39457e() {
            return this.f31620e;
        }

        /* renamed from: f */
        public final int m39458f() {
            return this.f31621f;
        }

        /* renamed from: g */
        public final int m39459g() {
            return this.f31622g;
        }

        /* renamed from: h */
        public final int m39460h() {
            return this.f31623h;
        }

        /* renamed from: i */
        public final int m39461i() {
            return this.f31624i;
        }

        /* renamed from: j */
        public final int m39462j() {
            return this.f31625j;
        }

        /* renamed from: k */
        public final int m39463k() {
            return this.f31626k;
        }

        /* renamed from: l */
        public final int m39464l() {
            return this.f31627l;
        }

        /* renamed from: m */
        public final int m39465m() {
            return this.f31628m;
        }

        /* renamed from: n */
        public final int m39466n() {
            return this.f31629n;
        }

        /* renamed from: o */
        public final long m39467o() {
            return this.f31630o;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "event", "Lcom/tinder/etl/event/FeedSessionEvent;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.events.f$b */
    static final class C13235b<T, R> implements Func1<gj, Completable> {
        /* renamed from: a */
        final /* synthetic */ C11691f f41960a;

        C13235b(C11691f c11691f) {
            this.f41960a = c11691f;
        }

        public /* synthetic */ Object call(Object obj) {
            return m51237a((gj) obj);
        }

        /* renamed from: a */
        public final Completable m51237a(final gj gjVar) {
            return Completable.a(new Action0() {
                public final void call() {
                    this.f41960a.f38192a.a(gjVar);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.events.f$c */
    static final class C13953c implements Action0 {
        /* renamed from: a */
        public static final C13953c f44087a = new C13953c();

        C13953c() {
        }

        public final void call() {
            C0001a.b("FeedSessionEvent successfully logged", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.events.f$d */
    static final class C13954d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13954d f44088a = new C13954d();

        C13954d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53478a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53478a(Throwable th) {
            C0001a.c(th, "Failed to fire FeedSessionEvent", new Object[0]);
        }
    }

    @Inject
    public C11691f(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f38192a = c2630h;
    }

    public /* synthetic */ void execute(Object obj) {
        m47515a((C9438a) obj);
    }

    /* renamed from: a */
    public void m47515a(@NotNull C9438a c9438a) {
        C2668g.b(c9438a, "request");
        m47514b(c9438a).c(new C13235b(this)).a(C13953c.f44087a, C13954d.f44088a);
    }

    /* renamed from: b */
    private final Single<gj> m47514b(C9438a c9438a) {
        C9088a a = gj.m45103a().m38268b(c9438a.m39453a()).m38270c(c9438a.m39454b().getValue()).m38265a(c9438a.m39455c().getValue()).m38271d(Integer.valueOf(c9438a.m39457e())).m38269c((Number) Integer.valueOf(c9438a.m39458f())).m38274g(Integer.valueOf(c9438a.m39459g())).m38267b((Number) Integer.valueOf(c9438a.m39460h())).m38272e(Integer.valueOf(c9438a.m39461i())).m38273f(Integer.valueOf(c9438a.m39462j())).m38264a((Number) Long.valueOf(c9438a.m39467o()));
        if (c9438a.m39463k() != -1) {
            a.m38278k(Integer.valueOf(c9438a.m39463k()));
        }
        if (c9438a.m39464l() != -1) {
            a.m38275h(Integer.valueOf(c9438a.m39464l()));
        }
        if (c9438a.m39465m() != -1) {
            a.m38277j(Integer.valueOf(c9438a.m39465m()));
        }
        if (c9438a.m39466n() != -1) {
            a.m38276i(Integer.valueOf(c9438a.m39466n()));
        }
        if (c9438a.m39454b() == SessionSource.MATCH_LIST) {
            a.m38263a(Boolean.valueOf(c9438a.m39456d()));
        }
        c9438a = Single.a(a.m38266a());
        C2668g.a(c9438a, "Single.just(it)");
        C2668g.a(c9438a, "with(request) {\n        …}.let { Single.just(it) }");
        return c9438a;
    }
}
