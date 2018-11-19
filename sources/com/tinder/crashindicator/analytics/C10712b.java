package com.tinder.crashindicator.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.gr;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/crashindicator/analytics/FeedbackSessionEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/crashindicator/analytics/FeedbackSessionEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "createEvent", "Lrx/Single;", "Lcom/tinder/etl/event/FeedbackSessionEvent;", "request", "execute", "", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.crashindicator.analytics.b */
public final class C10712b implements VoidUseCase<C8603a> {
    /* renamed from: a */
    private final C2630h f35071a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/tinder/crashindicator/analytics/FeedbackSessionEventDispatcher$Request;", "", "source", "", "feedbackType", "durationInMillis", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "getDurationInMillis", "()J", "getFeedbackType", "()Ljava/lang/String;", "getSource", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.crashindicator.analytics.b$a */
    public static final class C8603a {
        @NotNull
        /* renamed from: a */
        private final String f30441a;
        @NotNull
        /* renamed from: b */
        private final String f30442b;
        /* renamed from: c */
        private final long f30443c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8603a) {
                C8603a c8603a = (C8603a) obj;
                if (C2668g.a(this.f30441a, c8603a.f30441a) && C2668g.a(this.f30442b, c8603a.f30442b)) {
                    if ((this.f30443c == c8603a.f30443c ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            String str = this.f30441a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f30442b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            hashCode = (hashCode + i) * 31;
            long j = this.f30443c;
            return hashCode + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(source=");
            stringBuilder.append(this.f30441a);
            stringBuilder.append(", feedbackType=");
            stringBuilder.append(this.f30442b);
            stringBuilder.append(", durationInMillis=");
            stringBuilder.append(this.f30443c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8603a(@NotNull String str, @NotNull String str2, long j) {
            C2668g.b(str, "source");
            C2668g.b(str2, "feedbackType");
            this.f30441a = str;
            this.f30442b = str2;
            this.f30443c = j;
        }

        @NotNull
        /* renamed from: a */
        public final String m36707a() {
            return this.f30441a;
        }

        @NotNull
        /* renamed from: b */
        public final String m36708b() {
            return this.f30442b;
        }

        /* renamed from: c */
        public final long m36709c() {
            return this.f30443c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/FeedbackSessionEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.crashindicator.analytics.b$b */
    static final class C8604b<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ gr f30444a;

        C8604b(gr grVar) {
            this.f30444a = grVar;
        }

        public /* synthetic */ Object call() {
            return m36710a();
        }

        /* renamed from: a */
        public final gr m36710a() {
            return this.f30444a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/FeedbackSessionEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.crashindicator.analytics.b$c */
    static final class C12818c<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C10712b f41225a;

        C12818c(C10712b c10712b) {
            this.f41225a = c10712b;
        }

        public /* synthetic */ Object call(Object obj) {
            m50338a((gr) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m50338a(gr grVar) {
            this.f41225a.f35071a.a(grVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.crashindicator.analytics.b$d */
    static final class C13782d implements Action0 {
        /* renamed from: a */
        public static final C13782d f43775a = new C13782d();

        C13782d() {
        }

        public final void call() {
            C0001a.b("FeedbackSessionEvent successfully logged.", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.crashindicator.analytics.b$e */
    static final class C13783e<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13783e f43776a = new C13783e();

        C13783e() {
        }

        public /* synthetic */ void call(Object obj) {
            m53353a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53353a(Throwable th) {
            C0001a.c(th, "FeedbackSessionEventDispatcher failed.", new Object[0]);
        }
    }

    @Inject
    public C10712b(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f35071a = c2630h;
    }

    public /* synthetic */ void execute(Object obj) {
        m43049a((C8603a) obj);
    }

    /* renamed from: a */
    public void m43049a(@NotNull C8603a c8603a) {
        C2668g.b(c8603a, "request");
        m43048b(c8603a).d(new C12818c(this)).b().b(Schedulers.io()).a(C13782d.f43775a, C13783e.f43776a);
    }

    /* renamed from: b */
    private final Single<gr> m43048b(C8603a c8603a) {
        c8603a = Single.a(new C8604b(gr.m45210a().m38316b(c8603a.m36707a()).m38314a(c8603a.m36708b()).m38313a((Number) Long.valueOf(c8603a.m36709c())).m38315a()));
        C2668g.a(c8603a, "Single.fromCallable { event }");
        return c8603a;
    }
}
