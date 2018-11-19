package com.tinder.crashindicator.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.ManagerWebServices;
import com.tinder.apprating.enums.AppRatingMode;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.gp;
import com.tinder.etl.event.gp.C9096a;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Single;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/crashindicator/analytics/FeedbackAppEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/crashindicator/analytics/FeedbackAppEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "createEvent", "Lrx/Single;", "Lcom/tinder/etl/event/FeedbackAppEvent;", "request", "execute", "", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.crashindicator.analytics.a */
public final class C10711a implements VoidUseCase<C8601a> {
    /* renamed from: a */
    private final C2630h f35070a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\bHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006!"}, d2 = {"Lcom/tinder/crashindicator/analytics/FeedbackAppEventDispatcher$Request;", "", "source", "", "feedbackAction", "feedbackType", "text", "stars", "", "appRatingMode", "Lcom/tinder/apprating/enums/AppRatingMode;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/tinder/apprating/enums/AppRatingMode;)V", "getAppRatingMode", "()Lcom/tinder/apprating/enums/AppRatingMode;", "getFeedbackAction", "()Ljava/lang/String;", "getFeedbackType", "getSource", "getStars", "()I", "getText", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.crashindicator.analytics.a$a */
    public static final class C8601a {
        @NotNull
        /* renamed from: a */
        private final String f30434a;
        @NotNull
        /* renamed from: b */
        private final String f30435b;
        @NotNull
        /* renamed from: c */
        private final String f30436c;
        @NotNull
        /* renamed from: d */
        private final String f30437d;
        /* renamed from: e */
        private final int f30438e;
        @NotNull
        /* renamed from: f */
        private final AppRatingMode f30439f;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8601a) {
                C8601a c8601a = (C8601a) obj;
                if (C2668g.a(this.f30434a, c8601a.f30434a) && C2668g.a(this.f30435b, c8601a.f30435b) && C2668g.a(this.f30436c, c8601a.f30436c) && C2668g.a(this.f30437d, c8601a.f30437d)) {
                    return (this.f30438e == c8601a.f30438e ? 1 : null) != null && C2668g.a(this.f30439f, c8601a.f30439f);
                }
            }
        }

        public int hashCode() {
            String str = this.f30434a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f30435b;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f30436c;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f30437d;
            hashCode = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f30438e) * 31;
            AppRatingMode appRatingMode = this.f30439f;
            if (appRatingMode != null) {
                i = appRatingMode.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(source=");
            stringBuilder.append(this.f30434a);
            stringBuilder.append(", feedbackAction=");
            stringBuilder.append(this.f30435b);
            stringBuilder.append(", feedbackType=");
            stringBuilder.append(this.f30436c);
            stringBuilder.append(", text=");
            stringBuilder.append(this.f30437d);
            stringBuilder.append(", stars=");
            stringBuilder.append(this.f30438e);
            stringBuilder.append(", appRatingMode=");
            stringBuilder.append(this.f30439f);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8601a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull AppRatingMode appRatingMode) {
            C2668g.b(str, "source");
            C2668g.b(str2, "feedbackAction");
            C2668g.b(str3, "feedbackType");
            C2668g.b(str4, ManagerWebServices.PARAM_TEXT);
            C2668g.b(appRatingMode, "appRatingMode");
            this.f30434a = str;
            this.f30435b = str2;
            this.f30436c = str3;
            this.f30437d = str4;
            this.f30438e = i;
            this.f30439f = appRatingMode;
        }

        @NotNull
        /* renamed from: a */
        public final String m36700a() {
            return this.f30434a;
        }

        @NotNull
        /* renamed from: b */
        public final String m36701b() {
            return this.f30435b;
        }

        @NotNull
        /* renamed from: c */
        public final String m36702c() {
            return this.f30436c;
        }

        @NotNull
        /* renamed from: d */
        public final String m36703d() {
            return this.f30437d;
        }

        /* renamed from: e */
        public final int m36704e() {
            return this.f30438e;
        }

        @NotNull
        /* renamed from: f */
        public final AppRatingMode m36705f() {
            return this.f30439f;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/FeedbackAppEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.crashindicator.analytics.a$b */
    static final class C8602b<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C9096a f30440a;

        C8602b(C9096a c9096a) {
            this.f30440a = c9096a;
        }

        public /* synthetic */ Object call() {
            return m36706a();
        }

        /* renamed from: a */
        public final gp m36706a() {
            return this.f30440a.m38309a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/FeedbackAppEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.crashindicator.analytics.a$c */
    static final class C12817c<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C10711a f41224a;

        C12817c(C10711a c10711a) {
            this.f41224a = c10711a;
        }

        public /* synthetic */ Object call(Object obj) {
            m50337a((gp) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m50337a(gp gpVar) {
            this.f41224a.f35070a.a(gpVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.crashindicator.analytics.a$d */
    static final class C13780d implements Action0 {
        /* renamed from: a */
        public static final C13780d f43773a = new C13780d();

        C13780d() {
        }

        public final void call() {
            C0001a.b("FeedbackAppEvent successfully logged.", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.crashindicator.analytics.a$e */
    static final class C13781e<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13781e f43774a = new C13781e();

        C13781e() {
        }

        public /* synthetic */ void call(Object obj) {
            m53352a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53352a(Throwable th) {
            C0001a.c(th, "FeedbackAppEventDispatcher failed.", new Object[0]);
        }
    }

    @Inject
    public C10711a(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f35070a = c2630h;
    }

    public /* synthetic */ void execute(Object obj) {
        m43046a((C8601a) obj);
    }

    /* renamed from: a */
    public void m43046a(@NotNull C8601a c8601a) {
        C2668g.b(c8601a, "request");
        m43045b(c8601a).d(new C12817c(this)).b().b(Schedulers.io()).a(C13780d.f43773a, C13781e.f43774a);
    }

    /* renamed from: b */
    private final Single<gp> m43045b(C8601a c8601a) {
        C9096a b = gp.m45197a().m38311c(c8601a.m36700a()).m38308a(c8601a.m36701b()).m38310b(c8601a.m36702c());
        if (c8601a.m36705f() == AppRatingMode.FEEDBACK) {
            b.m38312d(c8601a.m36703d());
        }
        if (c8601a.m36704e() >= 0) {
            b.m38307a((Number) Integer.valueOf(c8601a.m36704e()));
        }
        c8601a = Single.a((Callable) new C8602b(b));
        C2668g.a(c8601a, "Single.fromCallable { builder.build() }");
        return c8601a;
    }
}
